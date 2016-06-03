package l1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Рома on 03.06.2016.
 */
public class BinarySearch {
    public static int rank(int key, int [] a){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if          (key < a[mid]) hi = mid -1;
            else if     (key > a[mid]) lo = mid + 1;
            else        return mid;
        }
        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int[] whitelist = In.readInts(args[0]);
        Scanner sc = new Scanner(new File(args[1]));
        Arrays.sort(whitelist);

        while(sc.hasNextInt()){
            int key = sc.nextInt();
            if(rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }
}
