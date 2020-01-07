package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();
        for (Integer x : array) {
            result.add(x * 3);
        }
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        for (Integer x : array) {
            Integer index = x - 1;
            result.add(letters[index]);
        }
        return result;
    }

    //将数字转化为对应的英文字母
    public String convertToTitle(int num) {
        double quotient = Math.floor((float)(num - 1) / 26);
        int remainder = (num - 1) % 26;
        if(quotient == 0) {
            return letters[remainder];
        } else {
            return convertToTitle((int)quotient) + letters[remainder];
        }
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();
        for (Integer x : array) {
            result.add(convertToTitle(x));
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        List<Integer> resultList = new ArrayList<>(array);
        Collections.sort(resultList, (o1, o2) -> o2 - o1);
        return resultList;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> resultList = new ArrayList<>(array);
        Collections.sort(resultList);
        return resultList;

    }
}
