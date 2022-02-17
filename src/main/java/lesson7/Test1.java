package lesson7;

public class Test1 {

    @BeforeSuite
    public static void before(){
        System.out.println("Before");
    }


    public static void NotTest(){

        System.out.println("NotTest");
    }


    @Test (priority = 7)
    public static void addTest1(){

        System.out.println("test 1");
    }

    @Test (priority = 10)
    public static void addTest2(){

        System.out.println("test 2");
    }

    @Test (priority = 9)
    public static void addTest3(){

        System.out.println("test 3");
    }

    @Test (priority = 9)
    public static void addTest4(){

        System.out.println("test 4");
    }
    @Test (priority = 5)
    public static void addTest5(){

        System.out.println("test 5");
    }
    @Test (priority = 4)
    public static void addTest6(){

        System.out.println("test 6");
    }
    @AfterSuite
    public static void after(){
        System.out.println("After");
    }
    @Test (priority = 6)
    public static void addTest7(){

        System.out.println("test 7");
    }

}