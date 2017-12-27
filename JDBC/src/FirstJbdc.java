
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstJbdc {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        ArtistManager manager = new ArtistManager();

        while (true) {
            System.out.println("avaiable commands are: add, all, findbyid, findbyname, delete, update and exit.");
            String s = sc.next();

            try {
                switch (s) {
                    case "add": {
                        System.out.println("Please enter id:");
                        int id = sc.nextInt();
                        System.out.println("Please enter firstname:");
                        String firstname = sc.next();
                        System.out.println("Please enter lastname:");
                        String lastname = sc.next();
                        System.out.println("Please enter age:");
                        int age = sc.nextInt();
                        manager.AddArtist(new Artist(id, firstname, lastname, age));
                        System.out.println("new artist added");
                    }
                    break;
                    case "insert":
                        manager.InsertArtists();
                        break;
                    case "all":
                        manager.ShowArtists();
                        break;
                    case "findbyid": {
                        System.out.println("Please enter id:");
                        int id = sc.nextInt();
                        Artist artist = manager.FindById(id);
                        if (artist == null) {
                            System.out.println("there is no artist with this id");
                        } else {
                            System.out.println(artist);
                        }

                    }
                    break;
                    case "findbyname": {
                        System.out.println("Please enter name:");
                        String name = sc.next();
                        ArrayList<Artist> artists = manager.FindByName(name);
                        System.out.println(artists);
                    }
                    break;
                    case "delete": {
                        System.out.println("Please enter id:");
                        int id = sc.nextInt();
                        manager.DeleteById(id);
                        System.out.println("deleted");
                    }
                    break;
                    case "exit":
                        return;

                    case "update": {
                        System.out.println("Please enter id:");
                        int id = sc.nextInt();
                        Artist artist = manager.FindById(id);
                        System.out.println("Firstname: " + artist.firstname + " ,Lastname: " + artist.lastname + " ,Age: " + artist.age);
                        System.out.println("enter first name:");
                        artist.firstname = sc.next();
                        System.out.println("enter last name:");
                        artist.lastname = sc.next();
                        System.out.println("enter age:");
                        artist.age = sc.nextInt();
                        
                        manager.UpdateArtist(artist);
                        System.out.println("updated");
                    }
                    break;
                    default:
                        System.out.println("avaiable commands are: insert, add, all, findbyid, findbyname, delete, update and exit.");
                        break;
                }
            } catch (SQLException ex) {
                System.out.println("error happened");
                System.out.println(ex.getMessage());
            }
        }
    }
}
