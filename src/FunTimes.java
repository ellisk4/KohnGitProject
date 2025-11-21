public class FunTimes {
    public static void main(String[] args) {
        int apples = 15;
        int bananas = 20;
        boolean isRaining = true;

        System.out.println("I have " + apples + " apples and " + bananas + " bananas");
        if (isRaining == true){
            System.out.println("ITS RAINING!");
            System.out.println("MY FRUITS ARE GONNA GET WASHED AWAY :((");
        }
        System.out.println("YAY IT'S NOT RAINING");
        if (apples > bananas){
            System.out.println("I have more apples than bananas");
        } else if (apples == bananas){
            System.out.println("I have the same amount of apples and bananas");
        } else {
            System.out.println("I have more bananas than apples");
        }
        System.out.println("This is a change from home! WoW :D");
    }
}
