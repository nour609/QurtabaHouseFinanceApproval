package ca.qurtuba.app001membersapprovalletter.service;

import ca.qurtuba.app001membersapprovalletter.domain.Member.MemberResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class MemberServiceTest {

    private MemberService memberService = mock();

    @Test
    public void getAllMembersTest(){
        MemberResponse memberResponse = new MemberResponse();
        memberResponse.setNumbersOfMember(80);
        memberResponse.setMembersParticipatedWithinQ1(80 / 4);

        when(memberService.getAllMembers()).thenReturn(memberResponse);

        MemberResponse response = memberService.getAllMembers();
        Assertions.assertNotNull(response);
        Assertions.assertEquals(80, response.getNumbersOfMember());
        Assertions.assertEquals(20, response.getMembersParticipatedWithinQ1());
    }
}
