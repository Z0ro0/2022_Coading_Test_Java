import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");

        names.stream()//오리지널 스트림 변환
                .distinct()//중간 처리 ==> 중복 제거
                .forEach(n -> System.out.println(n));// 최종 처리
        System.out.println();

        names.stream()
                .filter(n -> n.startsWith("신"))//중간 처리
                .forEach(n -> System.out.println(n));
    }
}
