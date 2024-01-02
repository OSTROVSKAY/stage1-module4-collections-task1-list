package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {

        ListComparator comparator = new ListComparator();

        sourceList.sort(comparator);

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        int a1 = Integer.parseInt(a);

        int res1 = 5 * a1 * a1 + 3;

        int b1 = Integer.parseInt(b);

        int res2 = 5 * b1 * b1 + 3;

        if ( res1 < res2 ) {

            return -1;

        } else if( res1 > res2) {

            return 1;

        } else   {

            return -1;

        }

    }
}
