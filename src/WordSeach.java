import java.util.List;
import java.util.ArrayList;

public class WordSeach {
    public boolean exist(char[][] board,String word) {
        List<Character> searched = new ArrayList<Character>();

        for (int y = 0; y < board.length; y++) {
            for(int x = 0; x < board[y].length; x++) {
                for(int letter = 0;letter < word.length(); letter++) {
                    if(board[y][x] == word.charAt(letter)) {
                        System.out.println(searched);
                        char up = (y > 0) ? board[(y - 1)][x] : '\0';
                        char down = (y < (board.length - 1)) ? board[(y + 1)][x] : '\0';
                        char left = (x > 0) ? board[y][(x - 1)] : '\0';
                        char rigth = (x < (board[y].length - 1)) ? board[y][(x + 1)] : '\0';

                        if(up == word.charAt(letter)) {
                            searched.add(up);
                        } else if(down == word.charAt(letter)) {
                            searched.add(down);
                        } else if(left == word.charAt(letter)) {
                            searched.add(left);
                        } else if(rigth == word.charAt(letter)) {
                            searched.add(rigth);
                        }
                    }
                }
            }
        }
        return false;
    }
}
