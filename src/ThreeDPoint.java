public class ThreeDPoint extends Point{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z){
        super(label, x, y);
        this.z = z;
    }

    public int getZ(){
        return z;
    }

    public boolean equals(ThreeDPoint point){
        if (getX() == point.getX() && getY() == point.getY() && getZ() == point.getZ()){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Point " + getLabel() + " is at x = " + getX() + ", y = " + getY() + ", z = " + getZ();
    }
}
