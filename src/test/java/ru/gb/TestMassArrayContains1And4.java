package ru.gb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import lesson6.MyClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestMassArrayContains1And4 {
    public static Stream<Arguments> dataForContains1And4() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 1, 1, 4, 4, 1, 4, 4}, true));
        list.add(Arguments.arguments(new int[]{1, 1, 1, 1, 1, 1, 1}, false));
        list.add(Arguments.arguments(new int[]{4, 4, 4, 4}, false));
        list.add(Arguments.arguments(new int[]{14, 41, 11, 44, 114}, false));
        return list.stream();
    }

    @MethodSource("dataForContains1And4")
    public void massTestArrayContains1And4(int[] in, boolean flag) {
        Assertions.assertEquals(flag, MyClass.arrayContains1And4(in));
    }
}
