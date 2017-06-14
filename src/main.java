import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Nata on 06.06.2017.
 */
public class main {
    private static String[] args;

    public static void main(String[] args) {
        sort(args);
        argsPars(args);
    }

    private static void sort(String[] args) {

        for (int j = 0; j < args.length; j++) {
            for (int i = j + 1; i < args.length; i++) {
                if (args[i].compareTo(args[j]) < 0) {
                    String t = args[j];
                    args[j] = args[i];
                    args[i] = t;
                }
            }
//            System.out.println(args[j]);
        }
//        Arrays.sort(args);
    }

    private static void argsPars(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
