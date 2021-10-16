import java.lang.*;

public class TestDish {
    public static void main(String[] args) {
        Dish cup1 = new Cup("Red","big", "tea", true, false, 90 );
        Dish plate1 = new Plate("Blue", "middle", 0.4d, "Plastic",  false);
        System.out.println(cup1);
        System.out.println(plate1);
        cup1.Shape();
        plate1.Name();
    }
}
