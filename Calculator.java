/**
 * A Basic Arithmetic Calculator in Java
 *
 * This program demonstrates object-oriented programming by using
 * a class with methods to perform addition, subtraction,
 * multiplication, division, and modulo operations on integers.
 *
 * Created as part of Java learning module.
 */

  public Calculator(){
  }

  public int add(int a, int b){
    int sumOfInts = a + b;

    return sumOfInts;
  }

  public int subtract(int a, int b){
    int diffOfInts = a - b;

    return diffOfInts;
  }

  public int multiply(int a, int b){
    int prodOfInts = a * b;

    return prodOfInts;
  }

  public int divide(int a, int b){
    int divisionOfInts = a / b;

    return divisionOfInts;
  }

  public int modulo(int a, int b){
    int moduloOfInts = a % b;

    return moduloOfInts;
  }

public static void main(String [] args){
  Calculator myCalculator = new Calculator();

  System.out.println(myCalculator.add(5,7));
  System.out.println(myCalculator.subtract(45, 11));
  }
}
  
