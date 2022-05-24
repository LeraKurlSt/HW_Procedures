import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    static String RandomString(int amountOfWords){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < amountOfWords; i++) {
            int size = (int)(Math.random() * 10) + 1;

            random
                    .ints(size,97, 122)
                    .forEach(x -> stringBuilder.append((char) x));

            if (i == (amountOfWords - 1)){
                stringBuilder.append(" ");
            }
            else {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    static void printArray(String[] array){
        for (String k : array) {
            System.out.println(k);
        }
    }

    static void printAccordingToTask1(String[] array){
        for (String k : array) {
            System.out.print(k);
        }
    }

    static String[] ArrayReverseSort(String[] array){
        Arrays.sort(array, Collections.reverseOrder());
        return array;
    }

    static class AmountOfWords implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return (numberOfWords(o1) - numberOfWords(o2));
        }

        private int numberOfWords(String str){
            Pattern pat = Pattern.compile("[a-z] + ");
            Matcher match = pat.matcher(str);
            int size = 0;
            while (match.find()){
                size++;
            }
            return size;
        }
    }

    static String[] ArrSort(String[] arr){
        return Arrays.stream(arr).sorted(new AmountOfWords()).toArray(String[]::new);
    }


    public static void main(String[] args) {
//            В массиве хранится n явно заданных текстовых строк. Создать метод:
//    ■ выводящий содержимое массива в строку через пробел;
//    ■ сортирующий массив в обратном порядке (без учета регистра) от z до a;
//    ■ сортирующий массив по количеству слов в строке (слова разделены пробелами).
//           Программа должна вывести строки в начальном и отсортированном порядке.
        String[] stringArray = new String[5];
        stringArray[0] = RandomString(1);
        stringArray[1] = RandomString(2);
        stringArray[2] = RandomString((int)(Math.random() * 10) + 1);
        stringArray[3] = RandomString(4);
        stringArray[4] = RandomString((int)(Math.random() * 10) + 1);

        System.out.println("The original Array looks that way: ");
        printArray(stringArray);
        System.out.println("\n");
        System.out.println("The Array without line breaks: ");
        printAccordingToTask1(stringArray);
        System.out.println("\n");
        System.out.println("The Array in reverse order: ");
        printAccordingToTask1(ArrayReverseSort(stringArray));
        System.out.println("\n");
        System.out.println("The Array that is sorted by num");
        printAccordingToTask1(ArrSort(stringArray));
        System.out.println();
    }
}
