package ca.qurtuba.app001membersapprovalletter;

public class Announcement {
    private int quarter;
    private int availableApprovalLetters;

    public Announcement(int quarter, int availableApprovalLetters) {
        this.quarter = quarter;
        this.availableApprovalLetters = availableApprovalLetters;
    }

    public int getQuarter() {
        return quarter;
    }

    public int getAvailableApprovalLetters() {
        return availableApprovalLetters;
    }
}
