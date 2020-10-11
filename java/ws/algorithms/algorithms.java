package algorithms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JOSALAZA
 */
public class algorithms {

    //Divide and Conquer
    public static int[] maxCross(int[] A, int l, int m, int h) {
        int[] res = {l, h, 0};
        int ls = Integer.MIN_VALUE;
        int sum = 0;
        int ml = l;
        int mr = h;
        for (int i = m - 1; i > l - 1; i--) {
            sum += A[i];
            if (sum > ls) {
                ls = sum;
                ml = i;
            }
        }

        int rs = Integer.MIN_VALUE;
        sum = 0;
        for (int j = m; j < h; j++) {
            sum += A[j];
            if (sum > rs) {
                rs = sum;
                mr = j;
            }
        }
        res[0] = ml;
        res[1] = mr;
        res[2] = ls + rs;
        return res;
    }

    public static int[] maxSub(int[] A, int l, int h) {
        int[] res = {l, h, 0};
        if (l >= h) {
            res[2] = A[l];
        } else {
            int mid = (l + h + 1) / 2;
            int[] left = maxSub(A, l, mid - 1);
            int[] right = maxSub(A, mid, h - 1);
            int[] cross = maxCross(A, l, mid, h);

            if (left[2] > right[2] && left[2] > cross[2]) {
                return left;
            } else if (right[2] > left[2] && right[2] > cross[2]) {
                return right;
            } else {
                return cross;
            }
        }

        return res;
    }

    //Dynamic programming;
    public static int cutRod(int[] A, int n) {
        if (n == 0) {
            return 0;
        }
        int q = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int rres = A[i] + cutRod(A, n - 1);
            q = (q > rres) ? q : rres;
            System.out.println("n " + n + "\tq " + q);
        }
        return q;
    }

    public static int mCutRodAux(int[] A, int n, int[] raux) {
        if (n > -1 && n < raux.length && raux[n] >= 0) {
            return raux[n];
        }
        int q = 0;
        if (n == 0) {
            q = 0;
        } else {
            q = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int rres = A[i] + mCutRodAux(A, n - 1, raux);
                q = (q > rres) ? q : rres;
            }
        }
        if (n > -1 && n < raux.length) {
            raux[n] = q;
        }
        return q;
    }

    public static int mCutRod(int[] A, int n) {
        int[] raux = new int[n];
        for (int i = 0; i < n; i++) {
            raux[i] = Integer.MIN_VALUE;
        }

        return mCutRodAux(A, n, raux);
    }

    public static void main(String[] args) {
//        int[] sub = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
//        System.out.println(Arrays.toString(maxSub(sub, 0, sub.length - 1)));

        int[] sub = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        System.out.println(mCutRod(sub, 4));
    }
}
