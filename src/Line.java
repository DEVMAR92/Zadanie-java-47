public class Line {

    private Point startPoint = new Point();
    private Point endPoint = new Point();

    Line() {

    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {

        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    void showInfo() {
        System.out.println("Punkt początkowy: " + startPoint.getCoordinates() + "\nPunkt końcowy: " + endPoint.getCoordinates() + "\n");
    }

}
