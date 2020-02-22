package com.company;

/*

0914 Exception Catch Group
1. There are three exceptions sequentially inherited from Exception:
2.class Exception1 extends Exception
3.class Exception2 extends Exception1
4. class Exception3 extends Exception2
5. There is a method that is described as follows:
public static void method1 () throws Exception1, Exception2, Exception3
6. Write a catch that will catch all three Exception1, Exception2 and Exception3
Requirements:
1. The main method should call method1.
2. The main method should catch the exception Exception1.
3. The main method should catch the exception Exception2.
4. The main method should catch the exception Exception3.
5. Do not modify method1.

 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        }
        catch (Exception3 e1){

        }
        catch (Exception2 e2){

        }
        catch (Exception1 e3){}
    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }
}
class Exception1 extends Exception {}
class Exception2 extends Exception1{}
class Exception3 extends Exception2{}




