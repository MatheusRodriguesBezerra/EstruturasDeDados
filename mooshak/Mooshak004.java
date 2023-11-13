// mooshak 4
// aceite

import java.util.Scanner;

public class Mooshak004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int range;
        String line;
        range = scanner.nextInt();
        scanner.nextLine();
        Board n = new Board(range);
        for(int i=0; i<range; i++){
            line = scanner.nextLine();
            for(int j=0; j<range; j++){
                n.game[i][j] = line.charAt(j);
            }
        }
        scanner.close();

        if(Xwins(n)){
            System.out.println("Ganhou o X");
            return ;
        }
        if(Owins(n)){
            System.out.println("Ganhou o O");
            return ;
        }
        if(n.GameOver()){
            System.out.println("Empate");
            return ;
        }
        if(!n.GameOver()){
            System.out.println("Jogo incompleto");
            return ;
        }

        
    }

    public static boolean Xwins(Board n){
        if(n.WinnerXInd()){
            return true;
        }
        if(n.WinnerXOp()){
            return true;
        }
        for(int i=0; i<n.x; i++){
            if(n.WinnerXColumn(i)){
                return true;
            }
            if(n.WinnerXRow(i)){
                return true;
            }
        }
        return false;
    }

    public static boolean Owins(Board n){
        if(n.WinnerOInd()){
            return true;
        }
        if(n.WinnerOOp()){
            return true;
        }
        for(int i=0; i<n.x; i++){
            if(n.WinnerOColumn(i)){
                return true;
            }
            if(n.WinnerORow(i)){
                return true;
            }
        }
        return false;
    }
}


class Board{
    int x;
    char[][] game;

    Board(int n){
        x = n;
        game = new char[n][n];
    }

    public boolean WinnerXColumn(int n){
        for(int i = 0; i < this.x; i++){
            if (this.game[i][n] != 'X') {
                return false;
            }
        }
        return true;
    }

    public boolean WinnerOColumn(int n){
        for(int i = 0; i < this.x; i++){
            if (this.game[i][n] != 'O') {
                return false;
            }
        }
        return true;
    }

    public boolean WinnerXRow(int n){
        for(int i = 0; i < this.x; i++){
            if (this.game[n][i] != 'X') {
                return false;
            }
        }
        return true;
    }

    public boolean WinnerORow(int n){
        for(int i = 0; i < this.x; i++){
            if (this.game[n][i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public boolean WinnerXInd(){
        for(int i = 0; i < this.x; i++){
            if (this.game[i][i] != 'X') {
                return false;
            }
        }
        return true;
    }

    public boolean WinnerOInd(){
        for(int i = 0; i < this.x; i++){
            if (this.game[i][i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public boolean WinnerXOp(){
        int height = 0;
        int width = this.x-1;
        for(int i = 0; i < this.x; i++){
            if (this.game[height][width] != 'X') {
                return false;
            }
            height++;
            width--;
        }
        return true;
    }

    public boolean WinnerOOp(){
        int height = 0;
        int width = this.x-1;
        for(int i = 0; i < this.x; i++){
            if (this.game[height][width] != 'O') {
                return false;
            }
            height++;
            width--;
        }
        return true;
    }

    public boolean GameOver(){
        for(int i = 0; i < this.x; i++){
            for(int j=0; j<this.x; j++){
                if(this.game[i][j] == '.'){
                    return false;
                }
            }
        }
        return true;
    }
}