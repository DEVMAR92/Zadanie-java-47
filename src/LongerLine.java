public class LongerLine {

    double lineLenght(Line line) {
        return Math.sqrt((line.getEnd().getX() - line.getStart().getX()) * (line.getEnd().getX() - line.getStart().getX())
                + (line.getEnd().getY() - line.getStart().getY()) * (line.getEnd().getY() - line.getStart().getY()));
    }

    Line whichLineLonger(Line line1, Line line2) {
        if (lineLenght(line1) > lineLenght(line2)) {
            return line1;
        } else if (lineLenght(line1) < lineLenght(line2)) {
            return line2;

        }
        return null;
    }
}