import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        char[][] morpion = new char[3][3];
        String rejouer = "";
        String[] joueur = new String[3];
        boolean gagner = false;
        int ligne, colonne, temponLigne, temponColonne;
        String victoire = "";

        System.out.println("Qui va jouer ?");
        System.out.print("Joueur 1 ton pseudo : ");
        joueur[0] = clavier.nextLine();
        System.out.print("Joueur 2 ton pseudo : ");
        joueur[1] = clavier.nextLine();

        while (rejouer.equals("") || rejouer.equals("OUI")) {

            for (int i = 0; i < morpion.length; i++) {
                for (int j = 0; j < morpion[0].length; j++) {
                    morpion[i][j] = '-';
                }
            }
            while(!gagner){
                gagner = false;
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < morpion.length; j++) {
                        for (int k = 0; k < morpion[0].length; k++) {
                            System.out.print(morpion[j][k]+" ");;
                        }
                        System.out.println();
                    }

                    do{
                        System.out.println(joueur[i]+ " où voulez vous jouer ?");
                        System.out.println("La ligne ? : ");
                        temponLigne = nombreInt();
                        System.out.println("La colonne ? : ");
                        temponColonne = nombreInt();
                    }while(morpion[temponLigne-1][temponColonne-1] == 'O'||morpion[temponLigne-1][temponColonne-1] == 'X');
                    ligne = temponLigne;
                    colonne = temponColonne;
                    if (i == 0){
                        morpion[ligne-1][colonne-1] = 'X';
                    }else if (i == 1){
                        morpion[ligne-1][colonne-1] = 'O';
                    }

                    if ((morpion[0][0] == 'X' && morpion[0][1] == 'X' && morpion[0][2] == 'X')||
                            (morpion[1][0] == 'X' && morpion[1][1] == 'X' && morpion[1][2] == 'X')||
                            (morpion[2][0] == 'X' && morpion[2][1] == 'X' && morpion[2][2] == 'X')||
                            (morpion[0][0] == 'X' && morpion[1][0] == 'X' && morpion[2][0] == 'X')||
                            (morpion[0][1] == 'X' && morpion[1][1] == 'X' && morpion[2][1] == 'X')||
                            (morpion[0][2] == 'X' && morpion[1][2] == 'X' && morpion[2][2] == 'X')||
                            (morpion[0][0] == 'X' && morpion[1][1] == 'X' && morpion[2][2] == 'X')||
                            (morpion[0][2] == 'X' && morpion[1][1] == 'X' && morpion[2][0] == 'X')) {
                        gagner = true;
                        for (int j = 0; j < morpion.length; j++) {
                            for (int k = 0; k < morpion[0].length; k++) {
                                System.out.print(morpion[j][k]+" ");;
                            }
                            System.out.println();
                        }
                        System.out.println(joueur[0] + " vous avez gagné !");
                        victoire += joueur[0]+", ";
                        i=2;
                    }
                    if ((morpion[0][0] == 'O' && morpion[0][1] == 'O' && morpion[0][2] == 'O')||
                            (morpion[1][0] == 'O' && morpion[1][1] == 'O' && morpion[1][2] == 'O')||
                            (morpion[2][0] == 'O' && morpion[2][1] == 'O' && morpion[2][2] == 'O')||
                            (morpion[0][0] == 'O' && morpion[1][0] == 'O' && morpion[2][0] == 'O')||
                            (morpion[0][1] == 'O' && morpion[1][1] == 'O' && morpion[2][1] == 'O')||
                            (morpion[0][2] == 'O' && morpion[1][2] == 'O' && morpion[2][2] == 'O')||
                            (morpion[0][0] == 'O' && morpion[1][1] == 'O' && morpion[2][2] == 'O')||
                            (morpion[0][2] == 'O' && morpion[1][1] == 'O' && morpion[2][0] == 'O')) {
                        gagner = true;
                        for (int j = 0; j < morpion.length; j++) {
                            for (int k = 0; k < morpion[0].length; k++) {
                                System.out.print(morpion[j][k]+" ");;
                            }
                            System.out.println();
                        }
                        System.out.println(joueur[1] + " vous avez gagné !");
                        victoire += joueur[1]+", ";
                        i=2;
                    }
                }
            }


            System.out.println(victoire);
            System.out.println("voulez vous rejouer ? oui ou non");
            rejouer = clavier.nextLine().toUpperCase();

            joueur[2] = joueur[0];
            joueur[0] = joueur[1];
            joueur[1] = joueur[2];
        }
    }

    public static int nombreInt() {
        Scanner clavier = new Scanner(System.in);
        while (!clavier.hasNextInt()) {
            System.out.println("Pas un nombre");
            clavier.nextLine();
            System.out.println("Entrer un nombre SANS virgule");
        }

        return clavier.nextInt();
    }
}