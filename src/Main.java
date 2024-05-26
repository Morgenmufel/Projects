import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int Role;
        int row;
        int column;
        int count = 0;
        char[][] gamespace = new char[3][3];
        System.out.println("Вас приветствует игра Крестики-Нолики");
        System.out.println("За кого вы хотите начать игру?");
        System.out.println("1. Нолик");
        System.out.println("2. Крестик");
        Scanner RoleInTheGame = new Scanner(System.in);
        Role = RoleInTheGame.nextInt();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                gamespace[i][j] = '_';
                System.out.printf(gamespace[i][j] + " ");
            }
            System.out.println();
        }
        switch(Role){
            default: case 1:
                while (count <= 9) {
                System.out.println("Выберите вашу ячейку(укажите строку и столбец)");
                if (count % 2 == 0){
                    Scanner XandY = new Scanner(System.in);
                    row = XandY.nextInt();
                    column = XandY.nextInt();
                    gamespace[row - 1][column - 1] = 'O';
                    for (int i = 0; i < 3; i++){
                        for (int j = 0; j < 3; j++){
                            System.out.printf(gamespace[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
                if (count % 2 != 0){
                    Scanner XandY = new Scanner(System.in);
                    row = XandY.nextInt();
                    column = XandY.nextInt();
                    gamespace[row - 1][column - 1] = 'X';
                    for (int i = 0; i < 3; i++){
                        for (int j = 0; j < 3; j++){
                            System.out.printf(gamespace[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
                if (count >= 9) {System.out.println("Ничья"); return;}
                else if (gamespace[0][0] == 'X' && gamespace[0][1] == 'X' && gamespace[0][2] == 'X') {System.out.println("Крестики выиграли"); return;}
                else if (gamespace[1][0] == 'X' && gamespace[1][1] == 'X' && gamespace[1][2] == 'X') {System.out.println("Крестики выиграли"); return;}
                else if (gamespace[2][0] == 'X' && gamespace[2][1] == 'X' && gamespace[2][2] == 'X') {System.out.println("Крестики выиграли"); return;}
                else if (gamespace[0][0] == 'X' && gamespace[1][0] == 'X' && gamespace[2][0] == 'X') {System.out.println("Крестики выиграли"); return;}
                else if (gamespace[0][1] == 'X' && gamespace[1][1] == 'X' && gamespace[2][1] == 'X') {System.out.println("Крестики выиграли"); return;}
                else if (gamespace[0][2] == 'X' && gamespace[1][2] == 'X' && gamespace[2][2] == 'X') {System.out.println("Крестики выиграли"); return;}
                else if (gamespace[0][0] == 'X' && gamespace[1][1] == 'X' && gamespace[2][2] == 'X') {System.out.println("Крестики выиграли"); return;}
                else if (gamespace[0][2] == 'X' && gamespace[1][1] == 'X' && gamespace[2][0] == 'X') {System.out.println("Крестики выиграли"); return;}
                else if (gamespace[0][0] == 'O' && gamespace[0][1] == 'O' && gamespace[0][2] == 'O') {System.out.println("Нолики выиграли");return;}
                else if (gamespace[1][0] == 'O' && gamespace[1][1] == 'O' && gamespace[1][2] == 'O') {System.out.println("Нолики выиграли");return;}
                else if (gamespace[2][0] == 'O' && gamespace[2][1] == 'O' && gamespace[2][2] == 'O') {System.out.println("Нолики выиграли");return;}
                else if (gamespace[0][0] == 'O' && gamespace[1][0] == 'O' && gamespace[2][0] == 'O') {System.out.println("Нолики выиграли");return;}
                else if (gamespace[0][1] == 'O' && gamespace[1][1] == 'O' && gamespace[2][1] == 'O') {System.out.println("Нолики выиграли");return;}
                else if (gamespace[0][2] == 'O' && gamespace[1][2] == 'O' && gamespace[2][2] == 'O') {System.out.println("Нолики выиграли");return;}
                else if (gamespace[0][0] == 'O' && gamespace[1][1] == 'O' && gamespace[2][2] == 'O') {System.out.println("Нолики выиграли");return;}
                else if (gamespace[0][2] == 'O' && gamespace[1][1] == 'O' && gamespace[2][0] == 'O') {System.out.println("Нолики выиграли");return;}
                count++;
            }
                break;
            case 2:
                while (count <= 9) {

                    System.out.println("Выберите вашу ячейку(укажите строку и столбец)");
                    if (0 == count % 2){
                        Scanner XandY = new Scanner(System.in);
                        row = XandY.nextInt();
                        column = XandY.nextInt();
                        gamespace[row - 1][column - 1] = 'X';
                        for (int i = 0; i < 3; i++){
                            for (int j = 0; j < 3; j++){
                                System.out.printf(gamespace[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    if (count % 2 != 0){
                        Scanner XandY = new Scanner(System.in);
                        row = XandY.nextInt();
                        column = XandY.nextInt();
                        gamespace[row - 1][column - 1] = 'O';
                        for (int i = 0; i < 3; i++){
                            for (int j = 0; j < 3; j++){
                                System.out.printf(gamespace[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    if (count >= 8) {System.out.println("Ничья"); return;}
                    else if (gamespace[0][0] == 'X' && gamespace[0][1] == 'X' && gamespace[0][2] == 'X') {System.out.println("Крестики выиграли"); return;}
                    else if (gamespace[1][0] == 'X' && gamespace[1][1] == 'X' && gamespace[1][2] == 'X') {System.out.println("Крестики выиграли"); return;}
                    else if (gamespace[2][0] == 'X' && gamespace[2][1] == 'X' && gamespace[2][2] == 'X') {System.out.println("Крестики выиграли"); return;}
                    else if (gamespace[0][0] == 'X' && gamespace[1][0] == 'X' && gamespace[2][0] == 'X') {System.out.println("Крестики выиграли"); return;}
                    else if (gamespace[0][1] == 'X' && gamespace[1][1] == 'X' && gamespace[2][1] == 'X') {System.out.println("Крестики выиграли"); return;}
                    else if (gamespace[0][2] == 'X' && gamespace[1][2] == 'X' && gamespace[2][2] == 'X') {System.out.println("Крестики выиграли"); return;}
                    else if (gamespace[0][0] == 'X' && gamespace[1][1] == 'X' && gamespace[2][2] == 'X') {System.out.println("Крестики выиграли"); return;}
                    else if (gamespace[0][2] == 'X' && gamespace[1][1] == 'X' && gamespace[2][0] == 'X') {System.out.println("Крестики выиграли"); return;}
                    else if (gamespace[0][0] == 'O' && gamespace[0][1] == 'O' && gamespace[0][2] == 'O') {System.out.println("Нолики выиграли");return;}
                    else if (gamespace[1][0] == 'O' && gamespace[1][1] == 'O' && gamespace[1][2] == 'O') {System.out.println("Нолики выиграли");return;}
                    else if (gamespace[2][0] == 'O' && gamespace[2][1] == 'O' && gamespace[2][2] == 'O') {System.out.println("Нолики выиграли");return;}
                    else if (gamespace[0][0] == 'O' && gamespace[1][0] == 'O' && gamespace[2][0] == 'O') {System.out.println("Нолики выиграли");return;}
                    else if (gamespace[0][1] == 'O' && gamespace[1][1] == 'O' && gamespace[2][1] == 'O') {System.out.println("Нолики выиграли");return;}
                    else if (gamespace[0][2] == 'O' && gamespace[1][2] == 'O' && gamespace[2][2] == 'O') {System.out.println("Нолики выиграли");return;}
                    else if (gamespace[0][0] == 'O' && gamespace[1][1] == 'O' && gamespace[2][2] == 'O') {System.out.println("Нолики выиграли");return;}
                    else if (gamespace[0][2] == 'O' && gamespace[1][1] == 'O' && gamespace[2][0] == 'O') {System.out.println("Нолики выиграли");return;}
                    count++;
                }
                break;
        }
        return;
    }
}