package ru.gb;

import lesson6.MyClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArray {
    @Test
    public void test1ArrayAfter4(){
      int [] in =new int[]{1, 2 ,4 ,4, 2, 3, 4 ,1 ,7 } ;
      int[] out = new int[]{1,7};
        Assertions.assertArrayEquals(out, MyClass.arrayAfter4(in));


    }
    @Test
    public void test2ArrayAfter4(){
        int [] in =new int[]{1 ,2 ,4 ,1 ,7, 5, 3, 2 } ;
        int[] out = new int[]{1, 7,5 ,3, 2};
        Assertions.assertArrayEquals(out, MyClass.arrayAfter4(in));


    }
    @Test
    public void test3ArrayAfter4(){
        int [] in =new int[]{1 ,2 ,4  } ;
        int[] out = new int[]{ };
        Assertions.assertArrayEquals(out, MyClass.arrayAfter4(in));


    }
    @Test
    public void test4ArrayAfter4(){
        int [] in =new int[]{1 ,2 ,5 ,1 ,7, 5, 3, 2 } ;
        Assertions.assertThrows(RuntimeException.class, ()-> {
            MyClass.arrayAfter4(in);
        });

    }
    @Test
    public  void test1ArrayContains1And4(){
      int []in = new int[]{1, 1, 1, 4, 4, 1, 4, 4 };
       Assertions.assertTrue(MyClass.arrayContains1And4(in));
    }
    @Test
    public  void test2ArrayContains1And4(){
        int []in = new int[]{1 ,4, 4, 1, 1, 4 ,3};
        Assertions.assertFalse(MyClass.arrayContains1And4(in));
    }
}
