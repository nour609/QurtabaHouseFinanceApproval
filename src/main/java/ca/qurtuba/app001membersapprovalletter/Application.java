package ca.qurtuba.app001membersapprovalletter;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<User> users;
    private List<Announcement> announcements;

    public Application() {
        this.users = new ArrayList<>();
        this.announcements = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addAnnouncement(Announcement announcement) {
        announcements.add(announcement);
    }

    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public void displayAnnouncements() {
        System.out.println("Quarterly Announcements:");
        for (Announcement announcement : announcements) {
            System.out.println("Quarter " + announcement.getQuarter() + ": " + announcement.getAvailableApprovalLetters() + " approval letters available.");
        }
    }

    public void submitParticipation(User user, int quarter) {
        // Implement participation submission logic here
    }

    public void performRandomSelection(int quarter) {
        // Implement random selection logic here
    }

    public void notifySelectedMembers() {
        // Implement notification logic here
    }
}
