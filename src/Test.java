import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Line firstLine = new Line();
        Line secondLine = new Line();
        LongerLine longerLine = new LongerLine();
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj parametry punktów pierwszego odcinka:");
        firstLine.getStartPoint().setCoordinates(input.nextDouble());
        firstLine.getEndPoint().setCoordinates(input.nextDouble());
        firstLine.showInfo();
        System.out.println("Podaj parametry punktów drugiego odcinka:");
        secondLine.getStartPoint().setCoordinates(input.nextDouble());
        secondLine.getEndPoint().setCoordinates(input.nextDouble());
        secondLine.showInfo();
        input.close();
        double firstLineLenght = longerLine.lineLenght(firstLine);
        System.out.println("Długość pierwszego odcinka wynosi: " + firstLineLenght);
        double secondLineLenght = longerLine.lineLenght(secondLine);
        System.out.println("\nDługość drugiego odcinka wynosi: " + secondLineLenght);
        longerLine.whichLineLonger(firstLine, secondLine);


    }
}
