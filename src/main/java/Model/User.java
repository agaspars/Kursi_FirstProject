package Model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String job;
    private int age;
    //Lists
    private static List<Note> allNotes = new ArrayList<>();
    private List<Note> userNotes = new ArrayList<>();

    public User(String firstName, String lastName, String email, int Age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = Age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Note> getAllNotes() {
        return allNotes;
    }

    public static void setAllNotes(List<Note> allNotes) {
        User.allNotes = allNotes;
    }

    public List<Note> getUserNotes() {
        return userNotes;
    }

    public void setUserNotes(List<Note> userNotes) {
        this.userNotes = userNotes;
    }

    public void printFullInfo() {
        System.out.println("-------------------------");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("-------------------------");
    }

    public void addNote(Note note) {
        allNotes.add(note);
        userNotes.add(note);
    }

    public void printUserNotes(User a) {
        for (int i = 0; i < userNotes.size(); i++) {
            System.out.println(userNotes.get(i).getText() + "\n" + userNotes.get(i).getCategory() + "\n");
        }
    }

    public void printAllNotes() {
        for (int i = 0; i < allNotes.size(); i++) {
            System.out.println(allNotes.get(i).getText());
        }

    }
}
