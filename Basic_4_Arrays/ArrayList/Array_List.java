// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.ArrayList;

import java.util.ArrayList;

public class Array_List
{
    public static void main(final String[] args) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);
        System.out.println(list.size());
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        list.add(20);
        System.out.println(list);
        System.out.println(list.size());
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("*****************");
        System.out.println(list.get(2));
        System.out.println(list.get(0));
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
    }
}
