package testmygen;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MyNumGenerator {
    private int numOfElem;
    private int maxNumb;

    public MyNumGenerator(int numOfElem, int maxNumb) {
        this.numOfElem = numOfElem;
        this.maxNumb = maxNumb;
    }

    public List generate() {
        List list = new ArrayList();
        for (int i = 0; i <= numOfElem; i++) {
            int res = (int) (Math.random() * maxNumb + 1);
            list.add(res);
        }
        return list;
    }

    public Set generatorDistinct(){
        Set set = new LinkedHashSet();
        for (int i = 0; i <= numOfElem; i++) {
            int res = (int) (Math.random() * maxNumb + 1);
            if (set.contains(res)){
                i--;
            }
            set.add(res);
        }
        return set;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyNumGenerator that = (MyNumGenerator) o;

        if (numOfElem != that.numOfElem) return false;
        return maxNumb == that.maxNumb;
    }

    @Override
    public int hashCode() {
        int result = numOfElem;
        result = 31 * result + maxNumb;
        return result;
    }
}
