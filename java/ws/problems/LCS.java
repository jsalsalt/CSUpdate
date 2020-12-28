package problems;

public class LCS {
    private String s1;
    private String s2;
    public int[][] store;
    public int[][] path;
    public LCS(String s1, String s2){
        this.s1 = s1;
        this.s2 = s2;
        this.store = new int[s1.length()+1][s2.length()+1];
        this.path = new int[s1.length()][s2.length()];
    }

    public void lcsLength() {
        for (int i = 0; i < this.s1.length(); i++) {
            store[i][0] = 0;
        }
        for (int j = 0; j < this.s2.length(); j++) {
            store[0][j] = 0;
        }

        for (int i = 1; i <= this.s1.length(); i++) {
            for (int j = 1; j <= this.s2.length(); j++) {
                if (this.s1.charAt(i-1) == this.s2.charAt(j-1)) {
                    this.store[i][j] = this.store[i - 1][j - 1] + 1;
                    this.path[i-1][j-1] = -1;
                } else if (this.store[i - 1][j] >= this.store[i][j - 1]) {
                    this.store[i][j] = this.store[i - 1][j];
                    this.path[i-1][j-1] = 0;
                } else {
                    this.store[i][j] = this.store[i][j - 1];
                    this.path[i-1][j-1] = 1;
                }
            }
        }
    }

    public static void printLCS(int[][] path, String s1, int l1, int l2) {
        if (l1 == -1 || l2 == -1) {
            return;
        }

        if (path[l1][l2] == -1) {
            printLCS(path, s1, l1 - 1, l2 - 1);
            System.out.println(s1.charAt(l1));
        } else if (path[l1][l2] == 0) {
            printLCS(path, s1, l1 - 1, l2);
        } else {
            printLCS(path, s1, l1, l2 - 1);
        }
    }
    
    public static void printPath(int [][] m) {
        String row = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                row += m[i][j] + "\t";
            }
            System.out.println(row);
            row = "";
        }
    }
}