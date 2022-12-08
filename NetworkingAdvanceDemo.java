package advanceJava;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingAdvanceDemo {
    public static void main(String[] args) throws UnknownHostException {
        String url = "www.youtube.com";

        InetAddress inetAddress = Inet4Address.getByName(url);

        if (inetAddress != null){
            System.out.println("Connection established");
        } else {
            System.out.println("Failed");
        }

        //getAddress() method in Array Format
        System.out.println("Address: " + Arrays.toString(inetAddress.getAddress()));

        //getHostAddress() method
        System.out.println("Host Address: " + inetAddress.getHostAddress());

        //isAnyLocalAddress() method
        System.out.println("isAnyLocalAddress : " + inetAddress.isAnyLocalAddress());
        //isLinkLocalAddress() method
        System.out.println("isLinkLocalAddress : " + inetAddress.isLinkLocalAddress());

        //hashCode() method
        System.out.println("hashCode : " + inetAddress.hashCode());

    }
}
