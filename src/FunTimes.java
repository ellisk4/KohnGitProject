public class FunTimes {
    public static void main(String[] args) {
        int apples = 15;
        int bananas = 20;
        System.out.println("I have " + apples + " apples and " + bananas + " bananas");
        if (apples > bananas){
            System.out.println("I have more apples than bananas");
        } else if (apples == bananas){
            System.out.println("I have the same amount of apples and bananas");
        } else {
            System.out.println("I have more bananas than apples");
        }
    }
}
