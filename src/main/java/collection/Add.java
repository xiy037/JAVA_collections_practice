package collection;

import java.util.*;

public class Add {

  public int getSumOfEvens(int leftBorder, int rightBorder) {
    int sum = 0;
    if (leftBorder < rightBorder) {
      for (int i = leftBorder; i <= rightBorder; i++) {
        if (i % 2 == 0) {
          sum += i;
        }
      }
    } else {
      for (int i = leftBorder; i >= rightBorder; i--) {
        if (i % 2 == 0) {
          sum += i;
        }
      }
    }
    return sum;
  }

  public int getSumOfOdds(int leftBorder, int rightBorder) {
    int sum = 0;
    if (leftBorder < rightBorder) {
      for (int i = leftBorder; i <= rightBorder; i++) {
        if (i % 2 == 1) {
          sum += i;
        }
      }
    } else {
      for (int i = leftBorder; i >= rightBorder; i--) {
        if (i % 2 == 1) {
          sum += i;
        }
      }
    }
    return sum;
  }

  public int getSumTripleAndAddTwo(List<Integer> arrayList) {
    int sum = 0;
    for (Integer x : arrayList) {
      sum += 3 * x + 2;
    }
    return sum;
  }

  public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
    List<Integer> result = new ArrayList<>();
    for (Integer element : arrayList) {
      int resultElement;
      if (element % 2 == 1) {
        resultElement = 3 * element + 2;
      } else {
        resultElement = element;
      }
      result.add(resultElement);
    }
    return result;
  }

  public int getSumOfProcessedOdds(List<Integer> arrayList) {
    int sum = 0;
    for (Integer x : arrayList) {
      if (x % 2 == 1) {
        sum += 3 * x + 5;
      }
    }
    return sum;
  }

  public List<Integer> getProcessedList(List<Integer> arrayList) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < arrayList.size() - 1; i++) {
      Integer resultElement = (arrayList.get(i) + arrayList.get(i + 1)) * 3;
      result.add(resultElement);
    }
    return result;
  }

  public double getMedianOfEvenIndex(List<Integer> arrayList) {
    List<Integer> evenIndexList = new ArrayList<>();
    for (int i = 0; i < arrayList.size(); i++) {
      if (i % 2 == 0) {
        evenIndexList.add(arrayList.get(i));
      }
    }
    Collections.sort(evenIndexList);
    double median;
    int len = evenIndexList.size();
    if (len % 2 == 1) {
      median = evenIndexList.get((len - 1) / 2);
    } else {
      median = (double)(evenIndexList.get(len / 2) + evenIndexList.get(len / 2 - 1)) / 2;
    }
    return median;
  }

  public double getAverageOfEvenIndex(List<Integer> arrayList) {
    List<Integer> evenIndexList = new ArrayList<>();
    for (int i = 0; i < arrayList.size(); i++) {
      if (i % 2 == 0) {
        evenIndexList.add(arrayList.get(i));
      }
    }
    int sum = 0;
    double average;
    for (Integer x : evenIndexList) {
      sum += x;
    }
    average = (double)sum / evenIndexList.size();
    return average;
  }

  public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
    boolean result;
    List<Integer> evenIndexList = new ArrayList<>();
    for (int i = 0; i < arrayList.size(); i++) {
      if (i % 2 == 0) {
        evenIndexList.add(arrayList.get(i));
      }
    }
    result = evenIndexList.contains(specialElment);
    return result;
  }

  public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
    List<Integer> evenList = new ArrayList<>();
    for (Integer x : arrayList) {
      if (x % 2 == 0) {
        evenList.add(x);
      }
    }
//      Set<Integer> set = new LinkedHashSet<>(evenList);
//      evenList.clear();
//      evenList.addAll(set);
//      return evenList; //不用set，手动去重写一下
    for (int i = 0; i < evenList.size() - 1; i++) {
      for (int j = i + 1; j < evenList.size(); j++) {
        if (evenList.get(i).equals(evenList.get(j))) {
          evenList.remove(j);
          j--;
        }
      }
    }
    return evenList;
  }

  public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
    List<Integer> evenList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    for (Integer x : arrayList) {
      if(x % 2 == 0) {
        evenList.add(x);
      } else {
        oddList.add(x);
      }
    }
    Collections.sort(evenList);
    Collections.sort(oddList, (o1, o2) -> o2 - o1);
    evenList.addAll(oddList);
    return evenList;
  }


}
