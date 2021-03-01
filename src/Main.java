import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int key;
        String text;
        key =1+(int)(Math.random()*27);


        System.out.println("Gib einen Text ein");
        Scanner eingabe = new Scanner(System.in);
        text = eingabe.nextLine();

        char[] chars = text.toCharArray();
        for (char c : chars) {
            c += key;
            System.out.print(c);


        }
    }
}
