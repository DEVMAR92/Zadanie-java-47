public class Line {
    Point start;
    Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    void showInfo(Point startPoint, Point endPoint) {
        System.out.println("Punkt początkowy: " + startPoint.getX() + ", " + startPoint.getY() + "\nPunkt końcowy: "
                + endPoint.getX() + ", " + endPoint.getY() + "\n");
    }

}
