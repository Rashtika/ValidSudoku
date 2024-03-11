import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

    static public boolean isValidSudoku(char[][] board) {

        for(int i=0; i<9; i++) {
            Set<String> numbers = new HashSet<>();
            for (int j=0; j<9; j++) {
                if (!String.valueOf(board[i][j]).equals(".")) {
                    if (!numbers.add(String.valueOf(board[i][j]))) {
                        return false;
                    }
                }
            }
        }
        for(int i=0; i<9; i++) {
            Set<String> numbers = new HashSet<>();
            for (int j=0; j<9; j++) {
                if (!String.valueOf(board[j][i]).equals(".")) {
                    if (!numbers.add(String.valueOf(board[j][i]))) {
                        return false;
                    }
                }
            }
        }

        for (int s=3; s<10; s=s+3) {
            for (int t=3; t<10; t=t+3) {
                Set<String> numbers = new HashSet<>();
                for (int i = s - 3; i < s; i++) {
                    for (int j = t - 3; j < t; j++) {
                        if (!(String.valueOf(board[i][j]).equals(".")) && !numbers.add(String.valueOf(board[i][j]))) {
                                return false;
                        }
                    }
                }
            }
        }

        return true;

    }
}
