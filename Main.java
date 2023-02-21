
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("input a value that will be the length*2 of your list: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        System.out.println(listCreator(length));
        input.close();
    }

    public static ArrayList listCreator(int length) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {

            list.add(rnd.nextInt(8888));

        }
        return list;
    }

}
