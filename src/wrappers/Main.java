package wrappers;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Field[] fields = WrapperTest.class.getFields();
        System.out.println(Arrays.toString(fields));
    }
}
