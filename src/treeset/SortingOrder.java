package treeset;

import com.suseela.Main;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortingOrder implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        Integer i1=(Integer)o1;
        Integer i2=(Integer)o2;
       /* if(i1<i2)
        {
            return -1;
        }
        else if(i1>i2)
        {
            return +1;
        }else {
            return 0;
        }*/
       return  -i1.compareTo(i2);
    }

   /* @Override
    public Comparator<Integer> reversed() {
        return null;
    }
*/
}
