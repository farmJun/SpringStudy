package study.core.singleton;

public class SingletonServiceTest {

    private static final SingletonServiceTest instance= new SingletonServiceTest();

    public static SingletonServiceTest getInstance(){
        return instance;
    }

    private SingletonServiceTest(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
