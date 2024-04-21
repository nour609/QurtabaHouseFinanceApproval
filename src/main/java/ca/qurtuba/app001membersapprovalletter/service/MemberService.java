package ca.qurtuba.app001membersapprovalletter.service;
import ca.qurtuba.app001membersapprovalletter.domain.Member.MemberResponse;


import org.springframework.stereotype.Service;

@Service
public class  MemberService implements IMemberService{

    @Override
    public MemberResponse getAllMembers() {
        MemberResponse memberResponse = new MemberResponse();
        int numberOfMembers = 300;
        memberResponse.setNumbersOfMember(numberOfMembers);
        memberResponse.setMembersParticipatedWithinQ1(numberOfMembers / 4);
        memberResponse.setMembersParticipatedWithinQ2(numberOfMembers / 3);
        memberResponse.setMembersParticipatedWithinQ3(numberOfMembers / 2);
        memberResponse.setMembersParticipatedWithinQ4(numberOfMembers /2 + 1);
        return memberResponse;

    }

    @Override
    public MemberResponse getMembersData(){
        MemberResponse memberResponse = new MemberResponse();
        memberResponse.setNumbersOfMember(300);

        return memberResponse;
    }
}

/*
 memberResponse.getMembersParticipatedWithinQ1(memberResponse.getNumbersOfMember() / 4);
 memberResponse.getMembersParticipatedWithinQ2(memberResponse.getNumbersOfMember() / 3);
 memberResponse.getMembersParticipatedWithinQ3(memberResponse.getNumbersOfMember() / 2);
 memberResponse.getMembersParticipatedWithinQ4(memberResponse.getNumbersOfMember() - memberResponse.getMembersParticipatedWithinQ1() - memberResponse.getMembersParticipatedWithinQ2() + 1);*/
