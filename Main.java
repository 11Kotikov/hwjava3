
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
// 2) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

public class Main {

    public static void main(String[] args) {
        System.out.println("input a value that will be the length of your list: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        input.close();
        ArrayList<Integer> yourList = new ArrayList<>();
        yourList = listCreator(length);
        System.out.printf("it's your created list of numbers %s \n", yourList);
        minMaxMid(yourList);
        evenRemover(yourList);
    }

    public static ArrayList<Integer> listCreator(int length) {

        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {

            list.add(rnd.nextInt(8888));
        }
        return list;
    }

    public static void evenRemover(ArrayList<Integer> newList) {
        int stopNum = newList.size();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < stopNum; i++) {
            if (newList.get(i) % 2 != 0) {

                list.add(newList.get(i));

            }
        }
        System.out.printf("it's your new list without evens %s \n", list);
    }

    public static void minMaxMid(ArrayList<Integer> mmmList) {
        int sum = 0;
        int max = mmmList.get(0);
        int min = mmmList.get(0);
        for (int i = 0; i < mmmList.size(); i++) {
            sum = sum + mmmList.get(i);
        }
        System.out.printf("Your average value is %s\n", sum / mmmList.size());

        for (int i = 0; i < mmmList.size(); i++) {
            if (mmmList.get(i) > max) {
                max = mmmList.get(i);
            }
        }
        System.out.printf("the maxxx %s \n", max);
        for (int i = 0; i < mmmList.size(); i++) {
            if (mmmList.get(i) < min) {
                min = mmmList.get(i);
            }
        }
        System.out.printf("the minnn %s \n", min);
    }

}
