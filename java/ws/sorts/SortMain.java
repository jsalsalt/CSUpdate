/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import java.util.Arrays;

/**
 *
 * @author JOSALAZA
 */
public class SortMain {

    /**
     * Works well for small sized arrays In place sorting = rearranges the
     * numbers within the Array
     *
     * @param arr
     */
    public static int[] insertionSort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            System.out.println("Key " + key);
            System.out.println("ArrPre " + Arrays.toString(arr));
            while (i > -1 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
                System.out.println("ArrDur " + Arrays.toString(arr));
            }
            arr[i + 1] = key;
            System.out.println("ArrPost " + Arrays.toString(arr));
        }
        return arr;
    }

    public static int[] merge(int[] A, int p, int q, int r) {
        System.out.println("Merge Pre " + Arrays.toString(A));
        int n1 = q - p;
        int n2 = r - q + 1;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = A[q + i];
        }
        int i = 0, j = 0;
        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
        System.out.println("Merge Post " + Arrays.toString(A));
        return A;
    }

    /**
     * Takes O(n)
     *
     * @param A
     * @param p
     * @param q
     * @param r
     * @return
     */
    public static int[] mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = ((r + p + 1) / 2);
            mergeSort(A, p, q - 1);
            mergeSort(A, q, r);
            merge(A, p, q, r);
        }
        return A;
    }

    public static int parent(int i) {
        return i / 2;
    }

    public static int left(int i) {
        return 2 * i;
    }

    public static int right(int i) {
        return (2 * i) + 1;
    }

    public static int[] maxHeapify(int[] A, int i, int heapSize) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < heapSize && A[l] > A[i]) {
            largest = l;
        }
        if (r < heapSize && A[r] > A[largest]) {
            largest = r;
        }
        if (largest != i) {
            int c = A[i];
            A[i] = A[largest];
            A[largest] = c;
            maxHeapify(A, largest, heapSize);
        }
        return A;
    }

    public static int[] buildMaxHeap(int[] A) {
        for (int i = (A.length / 2); i >= 0; i--) {
            maxHeapify(A, i, A.length);
        }
        return A;
    }

    public static int[] heapSort(int[] A) {
        buildMaxHeap(A);
        int heapSize = A.length;
        for (int i = A.length - 1; i >= 1; i--) {
            int c = A[0];
            A[0] = A[i];
            A[i] = c;
            heapSize--;
            maxHeapify(A, 0, heapSize);
        }
        return A;
    }

    public static int partition(int[] A, int p, int r) {
        System.out.println("Part Pre " + Arrays.toString(A));
        int x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i++;
                int c = A[j];
                A[j] = A[i];
                A[i] = c;
            }
        }
        int c = A[i + 1];
        A[i + 1] = A[r];
        A[r] = c;
        System.out.println("Part Post " + Arrays.toString(A));

        return i + 1;
    }

    public static int[] quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
        return A;

    }

    public static void main(String[] args) {
        //int[] arrToSort = {5, 2, 4, 6, 1, 3};
        //int[] sorted = insertionSort(arrToSort);
        //int[] arrToSort = {2, 4, 5, 7, 1, 2, 3, 6};
        //int[] sorted = mergeSort(arrToSort, 0, 7);
        //int[] arrToSort = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        //int[] sorted = heapSort(arrToSort);
        int[] arrToSort = {2, 8, 7, 1, 3, 5, 6, 4};
        int[] sorted = quickSort(arrToSort, 0, 7);
        System.out.println(Arrays.toString(sorted));

    }
}
