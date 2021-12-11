package task21;

import java.util.ArrayList;
import java.util.Arrays;

class metro {
    ArrayList<String> lines;

    public metro() {
        lines = new ArrayList<>(Arrays.asList("Zamoskworetskaya", "Tagansko_Krasnopresneskaya", "Kalininskaya",
                                              "Serpukhovsko-Timiryaztvskaya", "Lyublinskaya", "Arbatsko-Pokrovskaya",
                                              "Sokolnicheskaya", "Koltsevaya", "Kaluzsko-Rizhskaya", "Filyovskaya"));
    }

        public void printLines(boolean a) {
            if (a==true)// выведем четные номера
            for (int i=0; i<lines.size();i+=2) System.out.println(lines.get(i));

            else for (int i = 1; i < lines.size();i+=2) System.out.println(lines.get(i));
    }
}

public class Main {
    public static void main(String[] args) {
        metro m = new metro();
        m.printLines(false);
    }
}