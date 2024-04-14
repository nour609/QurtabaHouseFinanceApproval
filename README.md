# Qurtaba House Finance Approval App

## Description
The Qurtaba House Finance Approval App is a Java application designed to facilitate the process of obtaining approval letters for financing a house. The app allows Qurtaba members to participate in quarterly competitions to obtain approval letters announced by Qurtaba for each quarter.

## Features
- **User Authentication**: Members can log in using their credentials to access the application.
- **Quarterly Announcement Display**: The application displays the announcementRequest of the number of approval letters available for financing a house for each quarter.
- **Participation Submission**: Members can submit their participation for a specific quarter by entering their membership ID.
- **Random Selection**: The system performs a random selection of members from the pool of participants to allocate approval letters.
- **Notification**: Notifies selected members about the approval of their application for financing.

## How to Use
1. **Compile**: Compile the Java source code files.
   ```
   javac QurtabaHouseFinanceApprovalApp.java
   ```
2. **Run**: Run the main class file.
   ```
   java QurtabaHouseFinanceApprovalApp
   ```
3. **Follow on-screen instructions**: Follow the on-screen instructions to interact with the application.
   
## Example
```java
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
```

## Jira
https://team.atlassian.com/project/IIOOXBVQ-2/updates

## Conflunce
https://teamtechforce.atlassian.net/wiki/spaces/SD/pages

## Bitbucket
https://bitbucket.org/liked-tech-software/app001-members-approval-letter/src/main/

## GitHub
https://github.com/nour609/QurtabaHouseFinanceApproval

## Post man
https://www.postman.com/nour609


## Contributors
Nour Alden Alhaddad
https://github.com/

## License
This project is open source. Anyone can use it to select members who participate in competitions based on various factors to be taken into consideration, such as seniority, submission time, desire, etc.
