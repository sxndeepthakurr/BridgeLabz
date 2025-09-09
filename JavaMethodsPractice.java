import java.util.*;
public class JavaMethodsPractice {
    // 1. Simple Interest
    public static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    // 2. Handshakes
    public static int handshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    // 3. Rounds in Triangle
    public static double rounds(double a, double b, double c) {
        double peri = a + b + c;
        return 5000 / peri;
    }

    // 4. Positive / Negative / Zero
    public static int checkNum(int x) {
        if (x > 0) return 1;
        else if (x < 0) return -1;
        else return 0;
    }

    // 5. Spring Season Check
    public static boolean isSpring(int m, int d) {
        return (m == 3 && d >= 20) || (m == 4) || (m == 5) || (m == 6 && d <= 20);
    }

    // 6. Sum of Natural Numbers
    public static int sumNat(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    // 7. Smallest and Largest
    public static int[] minMax(int x, int y, int z) {
        int min = Math.min(x, Math.min(y, z));
        int max = Math.max(x, Math.max(y, z));
        return new int[]{min, max};
    }

    // 8. Quotient and Remainder
    public static int[] divide(int num, int div) {
        int q = num / div;
        int r = num % div;
        return new int[]{q, r};
    }

    // 9. Chocolate Distribution
    public static int[] chocDivide(int chocs, int kids) {
        return divide(chocs, kids);
    }

    // 10. Wind Chill
    public static double windChill(double t, double w) {
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(w, 0.16);
    }

    // 11. Trig Functions
    public static double[] trig(double deg) {
        double rad = Math.toRadians(deg);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Simple Interest
        System.out.println("Enter P, R, T:");
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        System.out.println("Simple Interest: " + simpleInterest(p, r, t));

        // Handshakes
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        System.out.println("Handshakes: " + handshakes(n));

        // Rounds
        System.out.println("Enter 3 sides of triangle:");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Rounds for 5km: " + rounds(a, b, c));

        // Positive / Negative / Zero
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        System.out.println("Check: " + checkNum(x));

        // Spring Season
        System.out.println("Enter month and day:");
        int m = sc.nextInt(), d = sc.nextInt();
        System.out.println(isSpring(m, d) ? "Spring" : "Not Spring");

        // Sum of Natural Numbers
        System.out.println("Enter n:");
        int sn = sc.nextInt();
        System.out.println("Sum: " + sumNat(sn));

        // Min and Max
        System.out.println("Enter 3 numbers:");
        int mm1 = sc.nextInt(), mm2 = sc.nextInt(), mm3 = sc.nextInt();
        int[] mm = minMax(mm1, mm2, mm3);
        System.out.println("Min: " + mm[0] + ", Max: " + mm[1]);

        // Divide
        System.out.println("Enter number and divisor:");
        int dn = sc.nextInt(), dv = sc.nextInt();
        int[] dr = divide(dn, dv);
        System.out.println("Quotient: " + dr[0] + ", Remainder: " + dr[1]);

        // Chocolates
        System.out.println("Enter chocolates and kids:");
        int ch = sc.nextInt(), k = sc.nextInt();
        int[] cd = chocDivide(ch, k);
        System.out.println("Each gets: " + cd[0] + ", Left: " + cd[1]);

        // Wind Chill
        System.out.println("Enter temp and wind speed:");
        double wt = sc.nextDouble(), ws = sc.nextDouble();
        System.out.println("Wind Chill: " + windChill(wt, ws));

        // Trig Functions
        System.out.println("Enter angle:");
        double ang = sc.nextDouble();
        double[] tr = trig(ang);
        System.out.printf("Sin: %.2f, Cos: %.2f, Tan: %.2f%n", tr[0], tr[1], tr[2]);

        sc.close();
    }
}
