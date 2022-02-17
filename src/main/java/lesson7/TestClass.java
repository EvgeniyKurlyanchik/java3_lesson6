package lesson7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;

public class TestClass   {
    int Bflag = 0;
    int Aflag = 0;

    public static void start(Class obj) throws Exception {
        TestClass tc = new TestClass();

        Method[] methods = obj.getDeclaredMethods();
        ArrayList<Method> arr = new ArrayList<>();
        for (Method m: methods) {
            if(m.isAnnotationPresent(BeforeSuite.class)){
                tc.Bflag++;
            }
            if(m.isAnnotationPresent(AfterSuite.class)){
                tc.Aflag++;
            }
        }
        if ((tc.Aflag | tc.Bflag) > 1) throw new RuntimeException();

        for (Method m : methods) {

            if (m.isAnnotationPresent(BeforeSuite.class)) {
                m.invoke(null);
            }

            if (m.isAnnotationPresent(Test.class)) {
                arr.add(m);
            }
        }


        arr.sort(Comparator.comparingInt(o -> o.getAnnotation(Test.class).priority()));

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print("Приоритет: " + arr.get(i).getAnnotation(Test.class).priority() + " Тест: ");
            arr.get(i).invoke(null);

        }

        for (Method m : methods) {
            if (m.isAnnotationPresent( AfterSuite.class)) {
                m.invoke(null);
            }
        }
    }
}