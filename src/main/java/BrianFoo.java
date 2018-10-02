import input.InputUtils;

/**
 * Created by gp2746me on 10/2/2018.
 */
public class BrianFoo {
    public static void main(String[] args) {
        // Brian was here
        int myInt = InputUtils.intInput("Give me the number");
        System.out.println("You gave me a " + myInt);
    }
}
