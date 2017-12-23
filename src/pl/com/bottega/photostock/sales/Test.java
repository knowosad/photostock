package pl.com.bottega.photostock.sales;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by freszczypior on 2017-12-09.
 */
public class Test {

    static void add(Collection<String> c, String s){
        s=s+"xxx";
        c.add(s);
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        String s = "ala";
        add(l, s);
        add(l, s);
        add(l, s);
        System.out.println(l);
    }

}
