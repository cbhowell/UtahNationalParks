package utahNationalParks;

import edu.princeton.cs.algs4.*;

/**
 * Represents a graph function class that performs various operations an edge weighted graph. This class can
 * return the distance between two vertices, the path shortest path between two vertices. This class can also
 * display a verbose description of the distance between two vertices, as well as a verbose description of the
 * shortest path between two vertices. In this particular implementation the verbose output describes the distances
 * or shortest path between National Parks in Utah.
 *
 */
public class GraphFunctions {
    private final ST<Integer, String> st;
    private final EdgeWeightedDigraph g;

    GraphFunctions() {
        In in = new In("src/utahNationalParks/resources/graphs/K5Graph.txt");
        g = new EdgeWeightedDigraph(in);
        st = new ST<>();

        st.put(0, "Arches National Park");
        st.put(1, "Bryce National Park");
        st.put(2, "Canyonlands National Park");
        st.put(3, "Capitol Reef National Park");
        st.put(4, "Zion National Park");
    }


    public static void main(String[] args) {

        //Testing
       int start;
        int dest;


        for(int i = 0; i < 40; i++) {
            start = StdRandom.uniform(5);
            dest = StdRandom.uniform(5);
            System.out.println("Start: " + start + " Destination: " + dest);

            GraphFunctions gf = new GraphFunctions();
            System.out.println("Distance from " + start + " to " + dest + ": " + gf.distanceTo(start, dest) + " miles");
            System.out.println("Distance Verbose: " + gf.distanceVerbose(start, dest));
            System.out.println("Get Path Verbose: " + gf.getPathVerbose(start, dest));
            System.out.println("*********************************************");
        }
    }





    /**
     * Returns a verbose description of the shortest path between two national parks. For example, if you are trying to
     * get from park A to park C, then this method would return the following:
     * <p>
     * A to B 133 miles
     * B to C 174 miles
     *
     * @param start an int value representing the starting location
     * @param dest  an int value representing the destination location
     * @return a <code>StringBuilder</code> comprising the verbose phrase.
     */
    public StringBuilder getPathVerbose(int start, int dest) {
        StringBuilder sb = new StringBuilder();
        Queue<String> q = new Queue<>();
        String s1;
        char c1, c2;

        pathTo(start, dest).forEach(e -> q.enqueue(e.toString()));

        for (String ignored : q) {
            s1 = q.dequeue();
            c1 = s1.charAt(0);
            c2 = s1.charAt(3);
            sb.append(st.get(Character.getNumericValue(c1))).append("    -->    ")
                    .append(st.get(Character.getNumericValue(c2))).append(" ").append("(").append((int) distanceTo(Character.getNumericValue(c1), Character.getNumericValue(c2)))
                    .append(" miles )");
            sb.append("\n");
        }
        return sb;
    }





    /**
     * Private helper method that returns the shortest path between two national parks. This method uses Dijkstra's
     * shortest path algorithm.
     *
     * @param start an int value representing the starting location
     * @param dest  an int value representing the destination location
     * @return an iterable comprising the shortest path
     */
    private Iterable<DirectedEdge> pathTo(int start, int dest) {
        DijkstraSP sp = new DijkstraSP(g, start);
        return sp.pathTo(dest);
    }





    /**
     * This method returns a verbose distance. For example, instead of returning just the numeric value of the distance,
     * it returns a sentence or phrase such as "A National Park to B National Park 122.0 miles".
     *
     * @param start an int value representing the starting location
     * @param dest  an int value representing the destination location
     * @return a <code>StringBuilder</code> containing the verbose phrase describing the distance between two national parks.
     */
    public StringBuilder distanceVerbose(int start, int dest) {
        StringBuilder sb = new StringBuilder();
        sb.append(st.get(start)).append("    -->    ").append(st.get(dest)).append(" (").append(distanceTo(start, dest)).append(" miles)");
        return sb;
    }





    /**
     * This method returns the distance between two national parks. The national parks are represented by int values
     * between 0 to 4 inclusive. This method accepts an int value representing the starting location, and another
     * int value representing the destination location. It then returns a double value representing the shortest
     * distance between the starting location and the destination location.
     *
     * @param start int value representing the starting location
     * @param dest  int value representing the destination locaton
     * @return a double value representing the distance, in miles, between the starting location and destination location
     */
    public double distanceTo(int start, int dest) {
        DijkstraSP sp = new DijkstraSP(g, start);
        return sp.distTo(dest);
    }
}

