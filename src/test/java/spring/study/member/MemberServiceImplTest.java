package spring.study.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MemberServiceImplTest {

	@Test
	@DisplayName("회원을 저장할 수 있다.")
	public void saveMemberTest() {
		//given
		MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());
		Member member = new Member();
		member.setId(1L);
		member.setName("테스트");
		member.setGrade(Grade.BASIC);
		
		//when
		memberService.join(member);
		
		//then
		Member findMember = memberService.findMember(member.getId());
		Assertions.assertNotNull(findMember);
	}

}
