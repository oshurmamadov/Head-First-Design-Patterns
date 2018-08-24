package adapter.enumeration;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class IteratorEnumerationClient {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Enumeration enumeration = new IteratorEnumerationAdapter(list.iterator());

        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
