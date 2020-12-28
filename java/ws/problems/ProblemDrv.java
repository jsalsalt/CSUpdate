package problems;

public class ProblemDrv {

    public static void print2d(){

    }

    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCABA";

        LCS lcsp = new LCS(s1, s2);

        lcsp.lcsLength();
        //lcsp.printPath(lcsp.path);
        System.out.println(s1.charAt(0));
        lcsp.printPath(lcsp.store);
        LCS.printLCS(lcsp.path, s1, s1.length()-1, s2.length()-1);
        
    }
}
