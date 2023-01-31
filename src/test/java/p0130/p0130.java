package p0130;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.exam.p0130.Solution;

public class p0130 {

    @ParameterizedTest
    @MethodSource("test1")
    void add(int x, int n){
        Solution solution = new Solution();

        long[] sl = solution.solution1(x, n);

        for (long l : sl) {
            System.out.println(l);
        }
    }

    private static Stream<Arguments> test1(){
        return Stream.of(
            Arguments.of(-4,2)
        );
    }

    @ParameterizedTest
    @MethodSource("test2")
    void convert(String x){
        Solution solution = new Solution();

        System.out.println(solution.solution2(x));

    }

    private static Stream<Arguments> test2(){
        return Stream.of(
            Arguments.of("-123")
        );
    }

    @ParameterizedTest
    @MethodSource("test3")
    void desc(long x){
        Solution solution = new Solution();

        System.out.println(solution.solution3(x));

    }

    private static Stream<Arguments> test3(){
        return Stream.of(
            Arguments.of(18372)
        );
    }
}
