package task24;

import java.util.regex.Pattern;

class IP {
    public boolean task(String str) {
        String ip = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$";
        return Pattern.matches(ip,str);
    }
}

public class Main {
    public static void main(String[] args) {
        IP ip = new IP();
        boolean r;

        r = ip.task("192.168.8.1");
        System.out.println(r);
        r = ip.task("255.255.255.0");
        System.out.println(r);
        r = ip.task("256.0.0.-1");
        System.out.println(r);
        r = ip.task("1.2.3.4");
        System.out.println(r);
    }
}
