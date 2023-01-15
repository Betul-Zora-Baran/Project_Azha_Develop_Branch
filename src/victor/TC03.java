package victor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TC03 {

    public static void main(String[] args) {

        String str = "hello";

        String[] arr = {"Wooden", "Spoon"};

        ArrayList<String> list = new ArrayList<>();
        list.add(str);
        list.add(Arrays.toString(arr));

        LinkedList<List> linkedList = new LinkedList<>();
        linkedList.add(list);


        System.out.println("str = " + str);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println(linkedList);


    }


}
