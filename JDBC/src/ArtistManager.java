
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ArtistManager {

    Connection myConn;
    Statement mySmt;
    ResultSet myRs;

    public ArtistManager() throws SQLException {
        myConn = DriverManager.getConnection("jdbc:derby://localhost:1527/Star ", "Eli", "ghorbaghe");
    }

    public void InsertArtists() throws SQLException {
        mySmt = myConn.createStatement();

        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (1,'Tom','Hanks', 61)");
        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (2,'Meryl','Streep',68)");
        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (3,'Leila','Hatami', 45)");

        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (4,'Brad','Pitt', 53)");
        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (5,'Angelina ','Jolie', 42)");
        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (6,'Will','Smith', 49)");

        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (7,'Travis','Fimmel', 38)");
        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (8,'Clive','Standen', 36)");
        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (9,'Alexander','Ludwig', 25)");

        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (10,'Katheryn ','Winnick', 39)");
        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (11,'Nikolaj','Coster', 47)");
        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (12,'Kit','Harington', 30)");

        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (13,'Emilia ','Clarke', 23)");
        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (14,'Sophie','Turner', 24)");
        mySmt.executeUpdate("INSERT INTO artist (id,firstname,lastname,age)  Values (15,'Aidan','Gillen', 37)");

    }

    public void ShowArtists() throws SQLException {
        mySmt = myConn.createStatement();
        myRs = mySmt.executeQuery("select * from artist");

        while (myRs.next()) {
            System.out.println(myRs.getInt("id") + " " + myRs.getString("firstname") + " " + myRs.getString("lastname")+ " " + myRs.getInt("age"));
        }
    }

    public Artist FindById(int Id) throws SQLException {
        mySmt = myConn.createStatement();
        myRs = mySmt.executeQuery("select * from artist where id=" + Id);

        if (myRs.next()) {
            int id = myRs.getInt("id");
            String firstname = myRs.getString("firstname");
            String lastname = myRs.getString("lastname");
            int age = myRs.getInt("age");

            Artist artist = new Artist(id, firstname, lastname, age);
            return artist;
        }

        return null;
    }

    public void DeleteById(int Id) throws SQLException {
        mySmt = myConn.createStatement();
        mySmt.executeUpdate("delete from artist where Id =" + Id);
    }

    public ArrayList<Artist> FindByName(String name) throws SQLException {
        mySmt = myConn.createStatement();
        myRs = mySmt.executeQuery("select * from artist where firstname like '%+" + name + "%' or lastname like '%" + name + "%'");

        ArrayList<Artist> result = new ArrayList<>();

        while (myRs.next()) {
            int Id = myRs.getInt("id");
            String firstname = myRs.getString("firstname");
            String lastname = myRs.getString("lastname");
            int age = myRs.getInt("age");

            Artist artist = new Artist(Id, firstname, lastname, age);

            result.add(artist);
        }

        return result;
    }

    public void AddArtist(Artist artist) throws SQLException {
        mySmt = myConn.createStatement();
        mySmt.executeUpdate("insert into artist (id, firstname, lastname, age) values ("
                + artist.Id + ", '" + artist.firstname + "', '" + artist.lastname + "', " + artist.age + ")");
    }

    public boolean UpdateArtist(Artist artist) throws SQLException {
        mySmt = myConn.createStatement();
        mySmt.executeUpdate("update artist set firstname='" + artist.firstname + "', lastname='" + artist.lastname + "', age=" + artist.age + " where id=" + artist.Id);
        return true;
    }
}
