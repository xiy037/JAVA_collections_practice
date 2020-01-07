package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator<resultList> {
  public List<Integer> getListByInterval(int left, int right) {
    List<Integer> resultList = new ArrayList<>();
    if (left < right) {
      for (int i = left; i <= right; i++) {
        resultList.add(i);
      }
    } else {
      for (int i = left; i >= right; i--) {
        resultList.add(i);
      }
    }
    return resultList;
  }

  public List<Integer> getEvenListByIntervals(int left, int right) {
    List<Integer> resultList = new ArrayList<>();
    if (left < right) {
      for (int i = left; i <= right; i++) {
        if (i % 2 == 0) {
          resultList.add(i);
        }
      }
    } else {
      for (int i = left; i >= right; i--) {
        if (i % 2 == 0) {
          resultList.add(i);
        }
      }
    }
    return resultList;
  }

  public List<Integer> popEvenElments(int[] array) {
    List<Integer> resultList = new ArrayList<>();
    for (int x : array) {
      if (x % 2 == 0) {
        resultList.add(x);
      }
    }
    return resultList;
  }

  public int popLastElment(int[] array) {
    int len = array.length;
    return array[len - 1];
  }

  public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
    List<Integer> resultList = new ArrayList<>();
    Arrays.sort(firstArray);
    for (int x : secondArray) {
      if (Arrays.binarySearch(firstArray,x) >= 0) {
        resultList.add(x);
      }
    }
    return resultList;
  }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
      List<Integer> resultList = new ArrayList<>(Arrays.asList(firstArray));
      Arrays.sort(firstArray);
      for (Integer x : secondArray) {
        if (Arrays.binarySearch(firstArray, x) < 0) {
          resultList.add(x);
        }
      }
      return resultList;
    }
}
