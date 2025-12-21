import java.util.*;

public class VaccinationTime {

    public static int getMinVaccinationTime(int m1, int m2, int N, int[] villages) {
        Arrays.sort(villages);
        int totalM1 = 0;
        int totalM2 = 0;

        // Calculate the total time for each center separately
        for (int i = 0; i < N; i++) {
            totalM1 += villages[i] * m1;
            totalM2 += villages[i] * m2;
        }

        // Find the minimum time required by choosing the center with maximum time
        return Math.max(totalM1, totalM2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m1 = scanner.nextInt(); // Average time for vaccination at the first centre
        int m2 = scanner.nextInt(); // Average time for vaccination at the second centre
        int N = scanner.nextInt(); // Number of villages
        int[] villages = new int[N]; // Array to store population of each village

        for (int i = 0; i < N; i++) {
            villages[i] = scanner.nextInt();
        }

        int result = getMinVaccinationTime(m1, m2, N, villages);
        System.out.println(result);

        scanner.close();
    }
}
