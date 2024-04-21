package ca.qurtuba.app001membersapprovalletter.service;

import ca.qurtuba.app001membersapprovalletter.domain.Member.MemberResponse;

public interface IMemberService {
    MemberResponse getAllMembers();
    MemberResponse getMembersData();
}
