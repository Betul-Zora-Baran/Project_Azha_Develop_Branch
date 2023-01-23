package Elena;

public class TC_107_Elena {

    public static void main(String[] args) {

        int i = 100;
        double d = 123.00;
        float f = 105.00F;
        long l = 1000;

        /** byte -> short -> int -> long -> float -> double
        */


        l = i; // from bigger to smaller is doable
        d = f;
        //f = d;  // from smaller to bigger not possible without the casting
        f = (float)d;  // is doable with down casting
       // i = l;
       // i = d;
        d = i;
       // i = f;
        f = i;
       // I = l;













    }



}
