package day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warm_up {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0,0,0,0));
        System.out.println(list);

        int count = 0;
        for (Integer each : list){
            if (each == 0){
                count++;
            }
        }

        list.removeAll(Arrays.asList(0));


        for (int i = 0; i  < 7; i++){
            list.add(0);
        }

        System.out.println(list);
        System.out.println(count);



    }
}
