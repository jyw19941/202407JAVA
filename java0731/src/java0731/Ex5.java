package java0731;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
	public static void main(String [] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김길동", Member.FEMALE, 20),
				new Member("박길동", Member.FEMALE, 45),
				new Member("최길동", Member.MALE, 27)
				);
		//전체 평균나이
		double avg = list.stream().mapToInt(Member::getAge).average().orElse(0);
		System.out.println(avg);
		// 남자 평균나이
		double maleavg = list.stream()
				.filter(x->x.getSex() ==Member.MALE)
				.mapToInt(a->a.getAge())
				.average().orElse(0);
		System.out.println(maleavg);
	}
	
}
