import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = "/home/renataqq/IdeaProjects/Java/task15/file.txt";
        File file = new File(path);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строчку: ");
        String txt = in.nextLine();
        in.close();
        try (FileOutputStream output = new FileOutputStream(file)) {
            System.out.println("Файл откыт");
            byte[] buf = txt.getBytes();
            output.write(buf,0,buf.length);
            output.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Записали");
    }
}

class Main2 {
    public static void main(String[] args) {
        String path = "/home/renataqq/IdeaProjects/Java/task15/file.txt";
        File file = new File(path);

        try (FileInputStream input = new FileInputStream(file)) {

            System.out.println("Файл откыт");
            int i=-1;
            while((i=input.read())!=-1) System.out.print((char)i);
            input.close();
            System.out.println("\n");
            System.out.println("Прочитали файл");
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Main3 {
    public static void main(String[] args) {
        String path = "/home/renataqq/IdeaProjects/Java/task15/file.txt";
        File file = new File(path);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строчку: ");
        String txt = in.nextLine();

        try {
            System.out.println("Файл откыт");
            FileWriter fstream1 = new FileWriter(path);
            BufferedWriter out1 = new BufferedWriter(fstream1);
            out1.write("");
            out1.close();

            FileOutputStream output = new FileOutputStream(file);
            byte[] buf = txt.getBytes();
            output.write(buf,0,buf.length);
            output.close();
            System.out.println("/home/renataqq/IdeaProjects/Java/task15/file.txt");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Main4 {
    public static void main(String[] args) {
        String path = "/home/renataqq/IdeaProjects/Java/task15/file.txt";
        File file = new File(path);
        Scanner in = new Scanner(System.in);
        System.out.println("Добавим строчку: ");
        String txt = in.nextLine();

        try {
            FileWriter fw = new FileWriter(path,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            System.out.println("Файл откыт");

            out.println(txt);
            out.close();

            System.out.println("А вот мы и добавили");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
