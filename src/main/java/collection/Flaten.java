package collection;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for (Integer[] x : array) {
            for (Integer y : x) {
                result.add(y);
            }
        }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> oneDResult = new ArrayList<>();
        for (Integer[] x : array) {
            for (Integer y : x) {
                oneDResult.add(y);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Integer x : oneDResult) {
            if (!result.contains(x)) {
                result.add(x);
            }
        }
        return result;
    }
}
