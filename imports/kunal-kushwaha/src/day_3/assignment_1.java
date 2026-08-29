package day_3;

import java.util.Scanner;

public class assignment_1 {

    public static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double areaRectangle(double length, double width) {
        return length * width;
    }

    public static double areaIsoscelesTriangle(double base, double leg) {
        double height = Math.sqrt((leg * leg) - ((base * base) / 4.0));
        return 0.5 * base * height;
    }

    public static double areaParallelogram(double base, double height) {
        return base * height;
    }

    public static double areaRhombus(double diagonal1, double diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }

    public static double areaEquilateralTriangle(double side) {
        return (Math.sqrt(3) / 4.0) * side * side;
    }

    public static double perimeterCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double perimeterEquilateralTriangle(double side) {
        return 3 * side;
    }

    public static double perimeterParallelogram(double sideA, double sideB) {
        return 2 * (sideA + sideB);
    }

    public static double perimeterRectangle(double length, double width) {
        return 2 * (length + width);
    }

    public static double perimeterSquare(double side) {
        return 4 * side;
    }

    public static double perimeterRhombus(double side) {
        return 4 * side;
    }

    public static double volumeCone(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public static double volumePrism(double baseArea, double height) {
        return baseArea * height;
    }

    public static double volumeCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static double volumeSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double volumePyramid(double baseArea, double height) {
        return (1.0 / 3.0) * baseArea * height;
    }

    public static double curvedSurfaceAreaCylinder(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }

    public static double totalSurfaceAreaCube(double side) {
        return 6 * side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a geometric calculation:");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Triangle");
        System.out.println("3. Area of Rectangle");
        System.out.println("4. Area of Isosceles Triangle");
        System.out.println("5. Area of Parallelogram");
        System.out.println("6. Area of Rhombus");
        System.out.println("7. Area of Equilateral Triangle");
        System.out.println("8. Perimeter of Circle");
        System.out.println("9. Perimeter of Equilateral Triangle");
        System.out.println("10. Perimeter of Parallelogram");
        System.out.println("11. Perimeter of Rectangle");
        System.out.println("12. Perimeter of Square");
        System.out.println("13. Perimeter of Rhombus");
        System.out.println("14. Volume of Cone");
        System.out.println("15. Volume of Prism");
        System.out.println("16. Volume of Cylinder");
        System.out.println("17. Volume of Sphere");
        System.out.println("18. Volume of Pyramid");
        System.out.println("19. Curved Surface Area of Cylinder");
        System.out.println("20. Total Surface Area of Cube");
        System.out.print("\nEnter your choice (1-20): ");

        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                result = areaCircle(scanner.nextDouble());
                System.out.printf("Area of Circle: %.4f\n", result);
                break;
            case 2:
                System.out.print("Enter base: ");
                double b2 = scanner.nextDouble();
                System.out.print("Enter height: ");
                double h2 = scanner.nextDouble();
                result = areaTriangle(b2, h2);
                System.out.printf("Area of Triangle: %.4f\n", result);
                break;
            case 3:
                System.out.print("Enter length: ");
                double l3 = scanner.nextDouble();
                System.out.print("Enter width: ");
                double w3 = scanner.nextDouble();
                result = areaRectangle(l3, w3);
                System.out.printf("Area of Rectangle: %.4f\n", result);
                break;
            case 4:
                System.out.print("Enter base: ");
                double b4 = scanner.nextDouble();
                System.out.print("Enter equal leg length: ");
                double leg4 = scanner.nextDouble();
                result = areaIsoscelesTriangle(b4, leg4);
                System.out.printf("Area of Isosceles Triangle: %.4f\n", result);
                break;
            case 5:
                System.out.print("Enter base: ");
                double b5 = scanner.nextDouble();
                System.out.print("Enter height: ");
                double h5 = scanner.nextDouble();
                result = areaParallelogram(b5, h5);
                System.out.printf("Area of Parallelogram: %.4f\n", result);
                break;
            case 6:
                System.out.print("Enter diagonal 1: ");
                double d1_6 = scanner.nextDouble();
                System.out.print("Enter diagonal 2: ");
                double d2_6 = scanner.nextDouble();
                result = areaRhombus(d1_6, d2_6);
                System.out.printf("Area of Rhombus: %.4f\n", result);
                break;
            case 7:
                System.out.print("Enter side: ");
                result = areaEquilateralTriangle(scanner.nextDouble());
                System.out.printf("Area of Equilateral Triangle: %.4f\n", result);
                break;
            case 8:
                System.out.print("Enter radius: ");
                result = perimeterCircle(scanner.nextDouble());
                System.out.printf("Perimeter of Circle: %.4f\n", result);
                break;
            case 9:
                System.out.print("Enter side: ");
                result = perimeterEquilateralTriangle(scanner.nextDouble());
                System.out.printf("Perimeter of Equilateral Triangle: %.4f\n", result);
                break;
            case 10:
                System.out.print("Enter side A: ");
                double sa10 = scanner.nextDouble();
                System.out.print("Enter side B: ");
                double sb10 = scanner.nextDouble();
                result = perimeterParallelogram(sa10, sb10);
                System.out.printf("Perimeter of Parallelogram: %.4f\n", result);
                break;
            case 11:
                System.out.print("Enter length: ");
                double l11 = scanner.nextDouble();
                System.out.print("Enter width: ");
                double w11 = scanner.nextDouble();
                result = perimeterRectangle(l11, w11);
                System.out.printf("Perimeter of Rectangle: %.4f\n", result);
                break;
            case 12:
                System.out.print("Enter side: ");
                result = perimeterSquare(scanner.nextDouble());
                System.out.printf("Perimeter of Square: %.4f\n", result);
                break;
            case 13:
                System.out.print("Enter side: ");
                result = perimeterRhombus(scanner.nextDouble());
                System.out.printf("Perimeter of Rhombus: %.4f\n", result);
                break;
            case 14:
                System.out.print("Enter radius: ");
                double r14 = scanner.nextDouble();
                System.out.print("Enter height: ");
                double h14 = scanner.nextDouble();
                result = volumeCone(r14, h14);
                System.out.printf("Volume of Cone: %.4f\n", result);
                break;
            case 15:
                System.out.print("Enter base area: ");
                double ba15 = scanner.nextDouble();
                System.out.print("Enter height: ");
                double h15 = scanner.nextDouble();
                result = volumePrism(ba15, h15);
                System.out.printf("Volume of Prism: %.4f\n", result);
                break;
            case 16:
                System.out.print("Enter radius: ");
                double r16 = scanner.nextDouble();
                System.out.print("Enter height: ");
                double h16 = scanner.nextDouble();
                result = volumeCylinder(r16, h16);
                System.out.printf("Volume of Cylinder: %.4f\n", result);
                break;
            case 17:
                System.out.print("Enter radius: ");
                result = volumeSphere(scanner.nextDouble());
                System.out.printf("Volume of Sphere: %.4f\n", result);
                break;
            case 18:
                System.out.print("Enter base area: ");
                double ba18 = scanner.nextDouble();
                System.out.print("Enter height: ");
                double h18 = scanner.nextDouble();
                result = volumePyramid(ba18, h18);
                System.out.printf("Volume of Pyramid: %.4f\n", result);
                break;
            case 19:
                System.out.print("Enter radius: ");
                double r19 = scanner.nextDouble();
                System.out.print("Enter height: ");
                double h19 = scanner.nextDouble();
                result = curvedSurfaceAreaCylinder(r19, h19);
                System.out.printf("Curved Surface Area of Cylinder: %.4f\n", result);
                break;
            case 20:
                System.out.print("Enter side: ");
                result = totalSurfaceAreaCube(scanner.nextDouble());
                System.out.printf("Total Surface Area of Cube: %.4f\n", result);
                break;
            default:
                System.out.println("Invalid choice selection.");
        }

        scanner.close();
    }
}