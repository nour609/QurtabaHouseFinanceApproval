package ca.qurtuba.app001membersapprovalletter.service;
import ca.qurtuba.app001membersapprovalletter.domain.Member.MemberResponse;


import org.springframework.stereotype.Service;

@Service
public class  MemberService implements MemberService {

    @Override
    public MemberResponse getAllMembers() {
        MemberResponse memberResponse = new MemberResponse();
        memberResponse.setNumbersOfMember(300);
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
