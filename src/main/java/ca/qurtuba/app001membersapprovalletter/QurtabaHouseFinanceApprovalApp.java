package ca.qurtuba.app001membersapprovalletter;

public class QurtabaHouseFinanceApprovalApp {
    public static void main(String[] args) {
        Application app = new Application();

        // Adding users
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        app.addUser(user1);
        app.addUser(user2);

        // Adding announcements
        Announcement announcement1 = new Announcement(1, 5);
        Announcement announcement2 = new Announcement(2, 7);
        app.addAnnouncement(announcement1);
        app.addAnnouncement(announcement2);

        // Example usage
        User authenticatedUser = app.authenticateUser("user1", "password1");
        if (authenticatedUser != null) {
            System.out.println("Authentication successful. Welcome, " + authenticatedUser.getUsername() + ".");
        } else {
            System.out.println("Authentication failed. Invalid username or password.");
        }

        app.displayAnnouncements();

        // Example participation submission
        app.submitParticipation(authenticatedUser, 2);

        // Example random selection
        app.performRandomSelection(2);

        // Example notification
        app.notifySelectedMembers();
    }
}
