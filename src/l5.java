public class l5 {
    public static void main(String[] args) {
    int a = 1, b = 2;
     System.out.println (symma2(a, b));
     double n = 5, m =7;
     System.out.println((s(n, m) ) ) ;
     double x = 3;
     System.out.println(function( x ) );
     double z = 45;
     System.out.println((trig(z)));

    }
    public static int symma2 (int a, int b) {
        int c = a + b;
        return c;
    }
    public static double s (double n, double m) {
        double d = n * m;
        return d;
    }
    public static double function (double x){
        double g = x * x * x + x * x +1;
        return g;
        }
        public static double trig (double z) {
        double p = 2 * Math.sin(Math.toRadians(z)) * Math.cos(Math.toRadians(z));
        return p;
    }
}
