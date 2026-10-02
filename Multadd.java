public class Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }
     public static void main(String[] args) {
        System.out.println(multadd(1.0, 2.0, 3.0));// should equal 5.0

        double angle = Math.PI / 4;
        System.out.println(multadd(Math.cos(angle), 0.5, Math.sin(angle)));// 1.06066...
        System.out.println(multadd(1.0, Math.log(10), Math.log(20)));// 5.29832...
    }
    public static double expSum(double x) {
        return multadd(Math.exp(-1*x), x , Math.sqrt(1 - Math.exp(-1*x)));
    }
}