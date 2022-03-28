public class Point {
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y){
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String getLabel(){
        return label;
    }

    public boolean equals(Point point){
        if (getX() == point.getX() && getY() == point.getY()){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }
}
