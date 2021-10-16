public class Head {
    String hair_color;
    int number_of_teeth;

    Head(String hair_color, int number_of_teeth){
        setNumber_of_teeth(number_of_teeth);
        setHair_color(hair_color);
    }
    public String getHairColor(){
        return hair_color;
    }
    public int getNumber_of_teeth(){
        return number_of_teeth;
    }
    public void setHair_color(String hair_color){
        this.hair_color = hair_color;
    }
    public void setNumber_of_teeth(int number_of_teeth){
        this.number_of_teeth = number_of_teeth;
    }
}
