package ca.qurtuba.app001membersapprovalletter.domain;

public class Announcement {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getURL() {
        return path;
    }

    public void setURL(String URL) {
        this.path = URL;
    }

    public String title;
    public String date;
    public String path;



    public Announcement() {
    }
}