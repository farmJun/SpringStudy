package study.core.member;

public interface MemoryService {
    void join(Member member);

    Member findMember(Long memberId);
}
