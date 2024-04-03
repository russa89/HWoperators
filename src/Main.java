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

        int personAge = 20;
    if (personAge >= 2 && personAge <= 6) {
        System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
    } else if (personAge >= 7 && personAge <= 17) {
        System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
    } else if (personAge >= 18 && personAge <= 24) {
        System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет.");
    } else if (personAge > 24) {
        System.out.println("Если возраст человека равен " + personAge + ", то ему пора ходить на работу.");
    }

        System.out.println("\nTask5");

    int childAge = 15;
    if (childAge < 5) {
        System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
    } else if (childAge >= 5 && childAge < 14) {
        System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в " +
                "сопровождении взрослого.");
    } else if (childAge >= 14) {
        System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без " +
                "сопровождения взрослого.");
        }
        System.out.println("\nTask6");
    int people = 103;
        if (people <= 60) {
            System.out.println("В вагоне имеются сидячие места.");
        } else if (people > 60 && people <= 102) {
            System.out.println("В вагоне остались только стоячие места.");
        } else if (people > 102) {
            System.out.println("К сожалению, в вагоне не осталось мест.");
        }
        System.out.println("\nTask7");
    int one = 5;
    int two = 2;
    int three = 3;
    if (one > two && one > three) {
        System.out.println("Самым большим числом здесь является " + one);
    } else if (two > one && two > three) {
        System.out.println("Самым большим числом здесь является " + two);
    } else if (three > one && three > two) {
        System.out.println("Самым большим числом здесь является " + three);
    }
    }

}
