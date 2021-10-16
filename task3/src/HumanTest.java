import java.util.Scanner;
public class HumanTest {
    public static void main(String[] args) {
        String hair_color;
        int number_of_teeth;
        String nails_color;
        boolean rings;
        int size;
        boolean broken;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цвет волос: ");
        hair_color = scan.next();
        System.out.println("Введите количество зубов: ");
        number_of_teeth = scan.nextInt();
        System.out.println("Введите цвет ногтей: ");
        nails_color = scan.next();
        System.out.println("Есть ли кольца? true/false: ");
        rings = scan.nextBoolean();
        System.out.println("Введите размер ноги: ");
        size = scan.nextInt();
        System.out.println("Ломали ли когда-нибудь кости на ногах? true/false: ");
        broken = scan.nextBoolean();

        Human hm = new Human(new Hand(nails_color, rings), new Head(hair_color, number_of_teeth), new Leg(size, broken));
        Head h = new Head(hair_color, number_of_teeth);
        System.out.println(h.getNumber_of_teeth() + " " + h.getHairColor());
        Hand ha = new Hand(nails_color, rings);
        System.out.println(ha.getNailsColor() + " " + ha.getRings());
        Leg l = new Leg(size, broken);
        System.out.println(l.getSize() + " " + l.isBroken());
    }
}
