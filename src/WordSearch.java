import java.util.ArrayList;
import java.util.List;

public class WordSearch {
    public boolean exist (char[][] board, String word) {
        List<Character> finds = new ArrayList<>();
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                for (int letter = 0; letter < word.length(); letter++) {
                    char current = board[y][x];
                    char up = (y > 0) ? board[(y - 1)][x] : '\0';
                    char down = (y < (board.length - 1)) ? board[(y + 1)][x] : '\0';
                    char left = (x > 0) ? board[y][(x - 1)] : '\0';
                    char rigth = (x < (board[y].length - 1)) ? board[y][(x + 1)] : '\0';

                    if (current == word.charAt(letter)) {
                        if (letter < word.length() - 1) {
                            char afterLetter = word.charAt(letter + 1);
                            boolean canMove = up == afterLetter || down == afterLetter || left == afterLetter || rigth == afterLetter;
                            if (letter > 0 && !finds.isEmpty()) {
                                char beforeLetter = word.charAt(letter - 1);
                                if (finds.get(finds.size() - 1) == beforeLetter && canMove) {
                                    finds.add(current);
                                }
                            } else if (canMove) {
                                finds.add(current);
                            }
                        } else if (!finds.isEmpty() && finds.get(finds.size() - 1) == word.charAt(letter - 1) && finds.size() != word.length()) {
                            finds.add(current);
                        }
                    }
                }
            }
        }

        System.out.println(finds);
        return finds.size() == word.length();
    }
}