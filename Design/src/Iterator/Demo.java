package Iterator;

import java.util.ArrayList;

/**
 * 迭代器模式
 */
public class Demo {
    public static void main(String[] args){
        NameIterator nameIterator = new NameIterator();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("ys");
        strings.add("dlh");
        strings.add("syy");
        strings.add("zjx");

        for (int i =0;nameIterator.hasNext(strings,i);i++){
            System.out.println(nameIterator.next(strings,i));
        }
    }
}
