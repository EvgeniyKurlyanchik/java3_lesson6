package ru.gb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import lesson6.MyClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestMassArrayAfter4 {
    public static Stream<Arguments> dataForAfter4(){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{2,3,4,5,6},new int[]{5,6}));
        list.add(Arguments.arguments(new int[]{2,3,4,5,6,4},new int[]{ }));
        list.add(Arguments.arguments(new int[]{4,5,6,3,1,0},new int[]{5,6,3,1,0}));
        return list.stream();
    }
    @ParameterizedTest
    @MethodSource("dataForAfter4")
    public void massTestArrayAfter4( int[] in,int[] out){
        Assertions.assertArrayEquals(out, MyClass.arrayAfter4(in));
    }
}
