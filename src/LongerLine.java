public class LongerLine {

    double lineLenght(Line line) {
        return Math.sqrt((line.end.getX() - line.start.getX()) * (line.end.getX() - line.start.getX())
                + (line.end.getY() - line.start.getY()) * (line.end.getY() - line.start.getY()));
    }

    void whichLineLonger(Line line1, Line line2) {
        if (lineLenght(line1) > lineLenght(line2)) {
            System.out.println("\nOdcinek Pierwszy jest większy");
        } else if (lineLenght(line1) < lineLenght(line2)) {
            System.out.println("\nOdcinek Drugi jest większy");
        }else System.out.println("\nOdcinki są sobie równe");
    }
}
