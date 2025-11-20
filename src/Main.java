public class Main {
    public static void main(String[] args) {
        System.out.println("Hello gurt");
        int x = 5;
        int y = 10;
        int z = 15;
        System.out.println("x + y + z = " + (x + y + z) );
        System.out.println("x - y = " + (x - y) );
        System.out.println("x * y = " + (x * y) );
        System.out.println("x / y = " + ((double) x / y) );
        if (z >= x + y){
            System.out.println("WOW!");
        }
    }
}
