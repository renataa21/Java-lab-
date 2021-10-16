public class Leg {
    int size;
    boolean broken;

    Leg(int size, boolean broken){
        setSize(size);
        setBroken(broken);
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
