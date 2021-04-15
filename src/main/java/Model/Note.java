package Model;

import Model.enums.Categories;

public class Note {
    private String title;
    private String theme;
    private String text;
    private Categories category;


    public Note(String title, String theme, String text, Categories category) {
        this.title = title;
        this.theme = theme;
        this.text = text;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void printNote() {
        System.out.println("----- " + title + " -----");
        System.out.println("Theme: " + theme);
        System.out.println("Note: " + text);
    }

    public Categories getCategory() {
        return category;
    }
}
