package epsi.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
      public static void main (String[]args ) {
          System.out.println("Hello, " + args[1] + "!");
          Arrays.asList(args).forEach(System.out::println);
      }


       }

