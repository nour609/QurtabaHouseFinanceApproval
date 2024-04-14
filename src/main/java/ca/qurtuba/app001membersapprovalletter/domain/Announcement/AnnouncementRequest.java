package ca.qurtuba.app001membersapprovalletter.domain.Announcement;

public class AnnouncementRequest {

    private String title = "THis is Title";
    private String date = "THis is Date";
    private String path = "This is Path";

    public AnnouncementRequest(String title, String date, String path){
        this.title = title;
        this.date = date;
        this.path = path;
    }

    public AnnouncementRequest(String title, String date){
        this.title = title;
        this.date = date;
    }

    public AnnouncementRequest() {
    }

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


}