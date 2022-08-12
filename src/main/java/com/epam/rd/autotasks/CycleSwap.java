package com.epam.rd.autotasks;

import java.lang.reflect.Array;
import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int len = array.length;
        if (len > 0) {
            int lastNum = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, len - 1);
            array[0] = lastNum;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        int len = array.length;
        if (len > 0 && len != shift) {

            int[] b = new int[len];
            System.arraycopy(array, shift, b, shift, len - shift);
            System.arraycopy(array, 0, array, shift, shift);
            System.arraycopy(b, shift, array, shift + shift, len - shift - shift);
            System.arraycopy(b, len - shift, array, 0, shift);
        }
    }
}
