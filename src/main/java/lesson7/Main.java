package lesson7;

public class Main {

    public static void main(String[] args) {
        Class cs = Test1.class;
        try {
            TestClass.start(cs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}