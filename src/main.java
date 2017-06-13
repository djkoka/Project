import java.util.Arrays;

/**
 * Created by Nata on 06.06.2017.
 */
public class main {
    private static String[] args;

    public static void main(String[] args) {
        argsPars(args);
    }

    private static void argsPars(String[] args) {
        main.args = args;
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println(Arrays.toString(args));
    }
}
