package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(arrayList);
    }

    public double getMinimum() {
        double min = arrayList.get(0);
        for (Integer x : arrayList) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public double getAverage() {
        double sum = 0;
        for (Integer x : arrayList) {
            sum += x;
        }
        double average = sum / arrayList.size();
        return average;
    }

    public double getOrderedMedian() {
        double median;
        Collections.sort(arrayList);
        int len = arrayList.size();
        if (len % 2 == 0) {
            median = (double)(arrayList.get(len / 2 - 1) + arrayList.get(len / 2)) / 2;
        } else {
            median = (double)arrayList.get((len - 1) / 2);
        }
        return median;
    }

    public int getFirstEven() {
        for (Integer x : arrayList) {
            if (x % 2 == 0) {
                return x;
            }
        }
        return -1; //如果没有even就返回-1
    }

    public int getIndexOfFirstEven() {
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean isEqual(List<Integer> differentArrayList) {
        if (arrayList.size() != differentArrayList.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.get(i).equals(differentArrayList.get(i))) {
                return false;
            }
        }
        return true;
    }

//    //实现接口SingleLink，然后再此函数内使用
//    public double getMedianInLinkList(SingleLink<Integer> singleLink) {
//
//    }
//
    public int getLastOdd() {
        int lastOdd = 0;
        for (Integer x : arrayList) {
            if (x % 2 == 1) {
                lastOdd = x;
            }
        }
        return lastOdd;
    }

    public int getIndexOfLastOdd() {
        int lastIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 1) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}
