package maktab.practice5.number1;

import java.util.ArrayList;
import java.util.List;

public class practice1 {
    public ArrayList<Integer> practice(ArrayList<Integer> arrayLists){
        int i;
        for(i = 0; i < arrayLists.size() ; i += 2)
            if (arrayLists.get(i).intValue() < arrayLists.get(i+1).intValue()) {
                arrayLists.remove(i);
                arrayLists.remove(i+1);
            }
            if (i - 1 == arrayLists.size())
                arrayLists.remove(i);
            return arrayLists;
    }
}

