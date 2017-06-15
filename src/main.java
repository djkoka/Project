import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Nata on 06.06.2017.
 */
public class main {
    private static String[] args;

    public static void main(String[] args) {
        String s="This article is about sets of vertices connected by edges. For graphs of mathematical functions, see Graph of a function. For other uses, see Graph (disambiguation).\n" +
                "\n" +
                "A drawing of a labeled graph on 6 vertices and 7 edges.\n" +
                "In mathematics, and more specifically in graph theory, a graph is a structure amounting to a set of objects in which some pairs of the objects are in some sense \"related\". The objects correspond to mathematical abstractions called vertices (also called nodes or points) and each of the related pairs of vertices is called an edge (also called an arc or line).[1] Typically, a graph is depicted in diagrammatic form as a set of dots for the vertices, joined by lines or curves for the edges. Graphs are one of the objects of study in discrete mathematics.\n" +
                "\n" +
                "The edges may be directed or undirected. For example, if the vertices represent people at a party, and there is an edge between two people if they shake hands, then this graph is undirected because any person A can shake hands with a person B only if B also shakes hands with A. In contrast, if any edge from a person A to a person B corresponds to A's admiring B, then this graph is directed, because admiration is not necessarily reciprocated. The former type of graph is called an undirected graph and the edges are called undirected edges while the latter type of graph is called a directed graph and the edges are called directed edges.\n" +
                "\n" +
                "Graphs are the basic subject studied by graph theory. The word \"graph\" was first used in this sense by J. J. Sylvester in 1878";
        sort(s.split(" "));
        argsPars(sort(s.split(" ")));
    }

    private static String[] sort(String[] args) {

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
        return args;
    }

    private static void argsPars(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
