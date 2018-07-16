public class LongerLine {

    double lineLenght(Line line) {
        if (line.getStartPoint().getCoordinates() < line.getEndPoint().getCoordinates()) {
            return line.getEndPoint().getCoordinates() - line.getStartPoint().getCoordinates();
        } else {
            return line.getStartPoint().getCoordinates() - line.getEndPoint().getCoordinates();

        }
    }

    void whichLineLonger(Line line1, Line line2) {
        if (lineLenght(line1) > lineLenght(line2)) {
            System.out.println("\nOdcinek Pierwszy jest większy");
        } else
            System.out.println("\nOdcinek Drugi jest większy");

    }
}
