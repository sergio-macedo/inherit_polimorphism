package course;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + "data:");
            System.out.print("Rectangle or circle (r/c) ?");
            char c = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (c == 'r') {
                System.out.print("type the width");
                double width = sc.nextDouble();
                System.out.print("type the height");
                double height = sc.nextDouble();
                Shape rectangle = new Rectangle(color, width, height);
                list.add(rectangle);
            } else {
                System.out.print("type the radius");
                double radius = sc.nextDouble();
                Shape circle = new Circle(color, radius);
                list.add(circle);
            }


        }

        System.out.println("SHAPE OF AREAS");
        for (Shape sh : list) {
            System.out.println(sh.area());
        }

        sc.close();
    }
}
