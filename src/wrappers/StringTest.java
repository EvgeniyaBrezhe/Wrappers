package wrappers;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {
        /**
         * Tasks 2.1-2.5.
         */

        String myStr = "my string";
        String myStr2 = new String("my string 2");
        char myData[] = {'z', 'h', 'e', 'n', 'y', 'a'};
        String myStr3 = new String(myData);
        String myStr4 = new String(myStr.getBytes());

        StringBuilder myBuilder = new StringBuilder("string builder");
        String myStr5 = myBuilder.toString();

        /**
         * Tasks 3.1-3.2.
         */
        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruitsArray = fruits.split(",");

        /**
         * Task 3.3
         */

        Integer[] fruitLengths = new Integer[fruitsArray.length];
        for (int i = 0; i < fruitsArray.length; i++) {
            fruitLengths[i] = fruitsArray[i].length();
        }
        Integer[] sortedFruitLengths = Arrays.copyOf(fruitLengths, fruitLengths.length);
        Arrays.sort(sortedFruitLengths);
        int maxFruitLength = sortedFruitLengths[fruitLengths.length - 1];
        int getFruitIndex = Arrays.asList(fruitLengths).indexOf(maxFruitLength);
        String maxLengthFruit = fruitsArray[getFruitIndex].toLowerCase();
        System.out.println(maxLengthFruit);

        /**
         * Task 3.4.
         */

        int shortFruitBegin = 0;
        int shortFruitEnd = 3;
        String shortFruit = maxLengthFruit.substring(shortFruitBegin, shortFruitEnd);
        System.out.println(shortFruit);

        /**
         * Tasks 3.5-3.8.
         */

        String newString = "   Я_новая_строка      ";
        String trimmedString = newString.trim();
        String changedString = trimmedString.replace("_", " ");
        System.out.println(changedString);

        /**
         * Tasks 3.9-3.10.
         */

        Scanner myInput = new Scanner(System.in);
        System.out.println("Введите текст");

        String customText = myInput.nextLine();

        if (customText.contains("Запуск")) {
            System.out.println("Запускаем процесс");
        } else if (customText.contains("завершен")) {
            System.out.println("Процесс завершен");
        } else if (customText.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        } else {
            System.out.println("Вы ввели: " + customText);
        }

        /**
         * Tasks 4.1 - 4.4.
         */

        StringBuilder anotherBuilder = new StringBuilder(myStr + myStr2 + myStr3 + "\n" +
                myStr4 + myStr5 + fruits + "\n" +
                maxLengthFruit + shortFruit + newString + "\n"
                + trimmedString + changedString + customText + "\n");

        anotherBuilder.reverse();
        String lastSting = anotherBuilder.toString();
        System.out.println(lastSting);
    }
}

