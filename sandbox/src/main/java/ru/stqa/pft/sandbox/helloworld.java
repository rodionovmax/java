package ru.stqa.pft.sandbox;

public class helloworld {

  public static void main(String[] args) {
   hello("world");
   hello("Max");

   double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + "=" + area(l));

    double x = 6;
    double y = 9;
    System.out.println("Площадь прямоугольника со сторонами " + x + " и " + y + " = " + area(x,y));
  }


  public static void hello(String smt){
//    String smt = "world";
    System.out.println("Hello " + smt);
  }

  public static double area(double len){
    return len*len;
  }

  public static double area(double a, double b){
    return a * b;
  }
}
