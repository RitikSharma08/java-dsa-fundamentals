import java.util.*;

public class MinimumClicks {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int numPages = sc.nextInt(); // Number of web pages
            int[][] links = new int[numPages][]; // Array of links from each web page

            for (int i = 0; i < numPages; i++) {
                int numLinks = sc.nextInt(); // Number of links from this web page
                links[i] = new int[numLinks];

                for (int j = 0; j < numLinks; j++) {
                    links[i][j] = sc.nextInt(); // The linked web page number
                }
            }

            int startPage = sc.nextInt(); // Starting web page number
            int endPage = sc.nextInt(); // Ending web page number

            int minClicks = minClicksToReachEndPage(startPage, endPage, links);

            System.out.println(minClicks);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input");
            System.exit(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid page number");
            System.exit(1);
        }
    }

    private static int minClicksToReachEndPage(int startPage, int endPage, int[][] links) {
        if (startPage == endPage) {
            return 0;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(startPage);

        int[] visited = new int[links.length];
        visited[startPage] = 1;

        int clicks = 0;
        while (!queue.isEmpty()) {
            int currentPage = queue.poll();

            for (int linkedPage : links[currentPage]) {
                if (visited[linkedPage] == 0) {
                    visited[linkedPage] = 1;
                    queue.add(linkedPage);

                    if (linkedPage == endPage) {
                        return clicks + 1;
                    }
                }
            }

            clicks++;
        }

        return -1;
    }
}

