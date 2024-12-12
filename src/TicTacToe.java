import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        char[][] morpion = new char[2][2];
        String rejouer = "";

        if (rejouer.equals("") || rejouer.equals("Oui")) {

            for (int i = 0; i < morpion.length; i++) {
                for (int j = 0; j < morpion[0].length; j++) {
                    morpion[i][j] = '-';
                }
            }

            for (int i = 0; i < morpion.length; i++) {
                for (int j = 0; j < morpion[0].length; j++) {
                    System.out.print(morpion[i][j]);;
                }
            }

            System.out.println("oui ou non");
            rejouer = clavier.nextLine();
        }
    }
}