import Model.Note;
import Model.User;
import Model.enums.Categories;

import java.util.ArrayList;
import java.util.List;

public class JavaCode {
    public static void main(String[] args)
    {
        User Andrew = new User("Andrew", "Gaspar", "andrejs.gaspars@gmail.com",17);
        Andrew.addNote(new Note("Andrew Note 1", "Andrew's frist note from list", "This is Andrew's first note from list", Categories.Study));
        Andrew.addNote(new Note("Andrew Note 2", "Andrew's second note from list", "This is Andrew's second note from list", Categories.Business));

        User dmitrij = new User("Dima", "Java", "dima@inbox.lv", 19);
        dmitrij.addNote(new Note("Dmitrij Note 1", "Dima's first note from list", "This is Dima's first note from list", Categories.Journey));
        dmitrij.addNote(new Note("Dmitrij Note 2", "Dima's second note from list", "This is Dima's second note from list", Categories.Work));

        User artemis = new User("Artemis", "Popov", "artemij@gmail.com", 15);
        artemis.addNote(new Note("Artemis Note 1", "Artemis' first note from list", "This is Artemis' first note from list", Categories.Work));


        System.out.println("------------------------------------");
        System.out.println("All notes: ");
        Andrew.printAllNotes();
        System.out.println("------------------------------------");

        System.out.println("\n");

        System.out.println("------------------------------------");
        System.out.println("Andrew's notes:");
        Andrew.printUserNotes(Andrew);
        System.out.println("------------------------------------");

    }

}
