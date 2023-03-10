package study.core.discount;

import study.core.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
