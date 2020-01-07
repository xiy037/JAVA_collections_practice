package collection;

import java.util.*;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> evenList = new ArrayList<>();
        for (Integer x : array) {
            if (x % 2 == 0) {
                evenList.add(x);
            }
        }
        return evenList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> tripleList = new ArrayList<>();
        for (Integer x : array) {
            if (x % 3 == 0) {
                tripleList.add(x);
            }
        }
        return tripleList;
    }

    public List<Integer> getDifferentElements() {
        Set<Integer> set = new LinkedHashSet<>(array);
        List<Integer> resultList = new ArrayList<>(set);
        return resultList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer x : firstList) {
            if (secondList.contains(x)) {
                resultList.add(x);
            }
        }
        return resultList;
    }


}