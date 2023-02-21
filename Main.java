
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class Main {
    public static void main(String[] args) {
        System.out.println("input a value that will be the length of your list: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        input.close();
        ArrayList<Integer> yourList = new ArrayList<>();
        yourList = listCreator(length);
        System.out.printf("it's your created list of numbers %s \n", yourList);
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
        System.out.printf("it's your new list without evens %s", list);
    }
}