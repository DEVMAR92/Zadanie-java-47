import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Point startPoint1 = new Point();
        Point endPoint1 = new Point();

        Point startPoint2 = new Point();
        Point endPoint2 = new Point();

        Line firstLine = new Line(startPoint1, endPoint1);
        Line secondLine = new Line(startPoint2, endPoint2);

        LongerLine longerLine = new LongerLine();

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj parametry początku pierwszego odcinka:");

        firstLine.start.setX(input.nextDouble());
        firstLine.start.setY(input.nextDouble());

        System.out.println("Podaj parametry końca pierwszego odcinka:");

        firstLine.end.setX(input.nextDouble());
        firstLine.end.setY(input.nextDouble());

        firstLine.showInfo(startPoint1, endPoint1);

        System.out.println("Podaj parametry poczatku drugiego odcinka:");

        secondLine.start.setX(input.nextDouble());
        secondLine.start.setY(input.nextDouble());

        System.out.println("Podaj parametry końca drugiego odcinka:");

        secondLine.end.setX(input.nextDouble());
        secondLine.end.setY(input.nextDouble());

        input.close();

        secondLine.showInfo(startPoint2, endPoint2);
        firstLine.showInfo(startPoint1, endPoint1);

        double firstLineLenght = longerLine.lineLenght(firstLine);
        System.out.println(firstLineLenght);

        double secondLineLenght = longerLine.lineLenght(secondLine);
        System.out.println(secondLineLenght);

        longerLine.whichLineLonger(firstLine, secondLine);

    }
}