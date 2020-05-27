package ru.synergyitacademy;

public class MainProgram {

    /**
     * Основная точка входа в приложение
     *
     * @param args      список аргументов, которые можно кастомизировать
     * @throws Exception список исключений, которые генерируются во время выполнения программы
     */
    public static void main(String[] args) throws Exception {
        //TODO: переписать данный код
        // Выведется в консоль фраза Привет, мир!
        /*
        здесь много текста
        вааыпаыпы
        паыпаыпы*/
        System.out.println("Привет, мир!");
        printThisTextToConsole();
    }

    public static void printThisTextToConsole() throws Exception {
        String name = "Test phrase";
        String a;
        a = "Привет, друг!";
        String[] words = a.split(",");
//        MainProgram.main(new String[]{name});


        int a1 = 1, a2 = 2, a3 = 3;
        int i = 0;
        boolean type = false;
        boolean checkA1 = i == 0 && a2 / 2 == a1 && false;
        boolean checkA2 = i != 0 && a2 / i == a2;

        int b1 = 1;
        float f1 = 2.0f;


        // Логический тип;
        boolean flag = true;
        flag = false;
        flag = !flag;
        boolean hasCheck = false;
        boolean conj = flag && hasCheck; //
        boolean test = false;
        boolean disj = flag || hasCheck; //

        //Целочисленный тип - byte, short, char, int, long
        // 2 ^ 8
        byte number = 15; // -128 .. 127
        // 15 - привычное число в десятичной СС
        //+ - / * %

        byte doubleAccount = 0b101;// 1 * 2 ^ 0 + 0 * 2 ^ 1 + 1 * 2 ^ 2 = 1 + 0 + 4 = 5
        byte eightAccount = 017; // 7 * 8 ^ 0 + 1 * 8 ^ 1 = 7 + 8 = 15
        byte hexAccount = -0xF; // -15

        short typeShort = 789; // - 2 ^ 15..2 ^ 15 - 1

        int digit = 54565645; //- 2 ^ 31 .. 2 ^ 31 - 1

        long mostBigDigit = 4645545456465524L; // - 2 ^ 63 .. 2 ^ 61 - 1

        char symbol = 'Ж'; // 0 .. 2 ^ 16 - 1

        //Вещественный тип - float, double
        float flowDigit = 15.23f;
        double doubleDigit = 4534545456.1212455;


        short result = (short) (typeShort + hexAccount + digit);
        var dymanicValue = 15;

        boolean fl = false;
        int index = 0;
        float f = 0.0f;
        char ch = 'T';

        if (ch == index) {

        }
        else if (ch == f){
            //
        }
        else if (ch == f){
            //
        }
        else {
            //
        }


        if (!flag) {

        }

        long value = 456456 + 545345456L + (short) 6;
        long minus = 5456 + (-1123);
        float deleteResult = 5 / 2.f; //

        float operationResult = deleteResult >= 0 ?
                deleteResult : -deleteResult;
        operationResult = Math.abs(operationResult);

        int joke = (2 + 2) * 2; // 6
        joke = digit = 8 / 13;

        short s = 5;
        short ss = 45;
        ss += 4565453;
        flag &= true;

        joke++; ++joke; --joke; joke--;

        for (int ii = 100; ii > 10; ii-=5) { // ii = ii - 5;
            if (ii % 2 == 0) continue;
            System.out.println("Привет " + ii);
        }

        int aInit = 100;

        System.out.println("До выполнения цикла");
        long currentTime = System.currentTimeMillis();

        while(true) {
            if (aInit == 200) {
                break;
            }
            Thread.sleep(aInit);
            aInit += 20;
        }

        do {
            System.out.println("It works!");
            if (true) break;
        } while(4 != 3);

        System.out.printf("После выполнения цикла %d", System.currentTimeMillis() - currentTime);

//        for(;;){ // бесконечный цикл
//
//        }
    }
}
