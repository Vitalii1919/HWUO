//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            int age = 18;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
            }
            int t = 5;
            if (t < 5) {
                System.out.println("На улице " + t + " градусов, нужно надеть шапку.");
            } else {
                System.out.println("На улице " + t + " градусов, можно идти без шапки.");
            }
            int speed = 60;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
            } else {
                System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
            }
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
            } else if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            } else if (age >= 18 && age <= 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
            } else if (age > 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
            } else {
                System.out.println("Возраст должен быть 2 года или больше.");
            }
            int ageFromLessThan5   =  4;
            if (ageFromLessThan5<5 ) {
                System.out.println("Если возраст  ребенка равен " + ageFromLessThan5  +   ", то  он не может кататься на аттракционе.");
            } else {
                System.out.println("Если больше 5 лет, то может каталься на аттракционев в присутвствии взрослого");
            }

            int ageFrom5To14 = 6;
            if (ageFrom5To14 > 5 && ageFrom5To14 < 14) {
                System.out.println("Если возраст  ребенка равен " + ageFrom5To14  +   ", то  он   может кататься на аттракционе в сопровождении  взрослого.");
            } else {
                System.out.println("Если больше 14 лет, то может кататься без  сопровождения взрослого");
            }

            int ageFromMoreThan14 = 14;
            if (ageFromMoreThan14 >= 14) {
                System.out.println("Если возраст  ребенка равен " + ageFromMoreThan14  +   ", то  он   может кататься на " +
                        "аттракционе  без  сопровождения взрослого.");
            } else {
                System.out.println("Если меньше 14 лет, то может кататься, но в  сопровождении взрослого ");
            }
            int place = 0;
            if (place > 60) {
                System.out.println("Если место под номером " + place + ", то   место стоячее");
            }
            if (place <= 60 && place != 0) {
                System.out.println("Если место под номером " + place + ", то   место сидячее");
            } else {
                System.out.println("Если мест " + place + ", то вагон уже полностью забит ");
            }
            int One = 10;
            int Two = 20;
            int Three = 15;
            int max;
            if (One >= Two && One >= Three) {
                max = One;
            } else if (Two >= One && Two >= Three) {
                max = Two;
            } else {
                max = Three;
            }
            System.out.println("Наибольшее число: " + max);
        }
            }

        }


