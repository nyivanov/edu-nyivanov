package ocp.ocareview;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class ListHelper {
    public List<String> copyAndSortList(List<String> pList) {
        List<String> list = new ArrayList<String>(pList);
        sort(list);
        return list;
    }
}