package Elena;

import java.util.Arrays;

public class TC106_Elena {

public enum Colors{
    BLACK,
    WHITE,
    GREY,
    PINK,
    YELLOW,
    GREEN,
    ORANGE,
    RED,
    PURPLE
}
    public static void main(String[] args) {

    Colors colors = Colors.GREEN;
        System.out.println(Arrays.toString(Colors.values()));

    }
}
