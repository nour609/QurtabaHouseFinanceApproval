package ca.qurtuba.app001membersapprovalletter.domain.Member;

public class MemberResponse {

    int NumbersOfMembers ;
    int MembersParticipatedWithinQ1 ;
    int MembersParticipatedWithinQ2 ;
    int MembersParticipatedWithinQ3 ;
    int MembersParticipatedWithinQ4 ;

/*
    int NumbersOfMembers = 300;
    int MembersParticipatedWithinQ1 = NumbersOfMembers / 4;
    int MembersParticipatedWithinQ2 = NumbersOfMembers / 3;
    int MembersParticipatedWithinQ3 = NumbersOfMembers / 2;
    int MembersParticipatedWithinQ4 = NumbersOfMembers - MembersParticipatedWithinQ1 - MembersParticipatedWithinQ3 + 1;
*/

    public int getNumbersOfMember() {
        return NumbersOfMembers;
    }
    public void setNumbersOfMember(int numbersOfMember) {
        this.NumbersOfMembers =numbersOfMember;
    }


    public int getMembersParticipatedWithinQ1() {
        return MembersParticipatedWithinQ1;
    }
    public void setMembersParticipatedWithinQ1(int membersParticipatedWithinQ1) {
        this.MembersParticipatedWithinQ1 = membersParticipatedWithinQ1;
    }



    public int getMembersParticipatedWithinQ2() {
        return MembersParticipatedWithinQ2;
    }
    public void setMembersParticipatedWithinQ2(int membersParticipatedWithinQ2) {
        this.MembersParticipatedWithinQ2 = membersParticipatedWithinQ2;
    }



    public int getMembersParticipatedWithinQ3() {
        return MembersParticipatedWithinQ3;
    }
    public void setMembersParticipatedWithinQ3(int membersParticipatedWithinQ3) {
        this.MembersParticipatedWithinQ3 = membersParticipatedWithinQ3;
    }



    public int getMembersParticipatedWithinQ4() {
        return MembersParticipatedWithinQ4;
    }
    public void setMembersParticipatedWithinQ4(int membersParticipatedWithinQ4) {
        this.MembersParticipatedWithinQ4 = membersParticipatedWithinQ4;
    }


}
