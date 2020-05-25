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
    }

    public static void printThisTextToConsole() throws Exception {
        String name = "Test phrase";
        String a;
        a = "Привет, друг!";
        String[] words = a.split(",");
        MainProgram.main(new String[]{name});

        // Логический тип;
        boolean flag = true;
        flag = false;
        flag = !flag;
        boolean hasCheck = false;
        boolean conj = flag && hasCheck; //
        boolean disj = flag || hasCheck; //



        //Целочисленный тип - byte, short, char, int, long
        // 2 ^ 8
        byte number = 15; // -128 .. 127
        // 15 - привычное число в десятичной СС
        //+ - / * %

        byte doubleAccount = 0b101;// 1 * 2 ^ 0 + 0 * 2 ^ 1 + 1 * 2 ^ 2 = 1 + 0 + 4 = 5
        byte eightAccount = 017; // 7 * 8 ^ 0 + 1 * 8 ^ 1 = 7 + 8 = 15
        byte hexAccount = -0xF; // -15

        short type = 789; // - 2 ^ 15..2 ^ 15 - 1

        int digit = 54565645; //- 2 ^ 31 .. 2 ^ 31 - 1

        long mostBigDigit = 4645545456465524L; // - 2 ^ 63 .. 2 ^ 61 - 1

        char symbol = 'Ж'; // 0 .. 2 ^ 16 - 1

        //Вещественный тип - float, double
        float flowDigit = 15.23f;
        double doubleDigit = 4534545456.1212455;


        short result = (short) (type + hexAccount + digit);
        var dymanicValue = 15;
    }
}
