public class Hand {
    String nails_color;
    boolean rings;

    Hand(String nails_color, boolean rings){
        setNails_color(nails_color);
        setRings(rings);
    }
    public String getNailsColor(){
        return nails_color;
    }
    public boolean getRings(){
        return rings;
    }
    public void setNails_color(String nails_color){
        this.nails_color = nails_color;
    }
    public void setRings(boolean rings){
        this.rings = rings;
    }
}
