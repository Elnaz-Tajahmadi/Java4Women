
public class Artist {
    public int Id;
    public String firstname;
    public String lastname;
    public int age;

    public Artist(int Id, String firstname, String lastname, int age) {
        this.Id = Id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Artist{" + "Id=" + Id + ", firstname=" + firstname + ", lastnsme=" + lastname + ", age=" + age + '}';
    }
    
    
}
