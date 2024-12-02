import java.util.Scanner;

public class Main3 {
    public static void   main(String[] args) {

//        3. Создайте программу, которая вычисляет площадь, периметр и
//        длину диагонали квадрата со стороной a, которую ваша
//        программа должна считать из пользовательского ввода с помощью класса Scanner.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи сторону а квадрата: ");
        int a = scanner.nextInt();

        Square square = new Square(a);

        System.out.println("Периметр = " + square.getPerimeter());
        System.out.println("Площадь = " + square.getArea());
        System.out.println("Длина диагонали = " + square.getDiagonalLength());
    }
}

class Square {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getPerimeter() {
        return a * 4;
    }

    public int getArea() {
        return a * a;
    }
    public double getDiagonalLength() {
        return Math.sqrt(a * a + a * a);
    }
}
