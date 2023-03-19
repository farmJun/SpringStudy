package study.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.core.AppConfig;
import study.core.member.MemberService;

public class SingletonTest {

    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너")
    void pureContainer(){
        AppConfig appConfig = new AppConfig();

        MemberService memberService1 = appConfig.memberService();
        MemberService memberService2 = appConfig.memberService();

        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        Assertions.assertThat(memberService1).isNotSameAs(memberService2);
    }


    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    void singletonServiceTest(){
        SingletonServiceTest singletonServiceTest1 = SingletonServiceTest.getInstance();
        SingletonServiceTest singletonServiceTest2 = SingletonServiceTest.getInstance();

        System.out.println("singletonServiceTest1 = " + singletonServiceTest1);
        System.out.println("singletonServiceTest2 = " + singletonServiceTest2);

        Assertions.assertThat(singletonServiceTest1).isSameAs(singletonServiceTest1);
    }
}

