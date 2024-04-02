public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask1");

        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, " +
                    "нужно немного подождать."); }
            System.out.println("\nTask2");

        int temperature = 6;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("\nTask3");

        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость равна " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость равна " + speed + ", то можно ездить спокойно");
        }

        System.out.println("\nTask4");

    }
}