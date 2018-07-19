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
        startPoint1.setX(input.nextDouble());
        startPoint1.setY(input.nextDouble());
        firstLine.setStart(startPoint1);
        System.out.println("Podaj parametry końca pierwszego odcinka:");
        endPoint1.setX(input.nextDouble());
        endPoint1.setY(input.nextDouble());
        firstLine.setEnd(endPoint1);
        firstLine.showInfo();
        System.out.println("Podaj parametry poczatku drugiego odcinka:");
        startPoint2.setX(input.nextDouble());
        startPoint2.setY(input.nextDouble());
        secondLine.setStart(startPoint2);
        System.out.println("Podaj parametry końca drugiego odcinka:");
        endPoint2.setX(input.nextDouble());
        endPoint2.setY(input.nextDouble());
        secondLine.setEnd(endPoint2);
        input.close();

        secondLine.showInfo();
        firstLine.showInfo();

        double firstLineLenght = longerLine.lineLenght(firstLine);
        System.out.println(firstLineLenght);

        double secondLineLenght = longerLine.lineLenght(secondLine);
        System.out.println(secondLineLenght);

        Line line3 = longerLine.whichLineLonger(firstLine, secondLine);

        System.out.println("Dłuższy odcinek to ten o punktach:");
        line3.showInfo();


    }
}