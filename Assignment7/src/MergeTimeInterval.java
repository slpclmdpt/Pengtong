package JavaAssignment.Assignment7;

import java.util.*;

class Interval {
    int first;
    int second;
    
    public Interval(int num1, int num2) {
        first= num1;
        second = num2;
    }
}

//override the method in order to sort original intervals
class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval a, Interval b) {
        if (a.first< b.first)
            return -1;
        else if (a.first == b.first)
            return 0;
        else
            return 1;
    }
}

//sort original intervals and merge them
public class MergeTimeInterval {

    public List<Interval> merge(List<Interval> intervals) {
        Comparator cprt = new IntervalComparator();
        Collections.sort(intervals, cprt);
        LinkedList<Interval> result = new LinkedList<>();
        for (Interval i : intervals) {
            //first interval to put in or cannot be merged
            if (result.isEmpty()||i.first>result.getLast().second) {
                result.add(i);
            }
            result.getLast().second=Math.max(i.second,result.getLast().second);
        }
        return result;
    }

    public static void main(String[] args) {
        MergeTimeInterval m = new MergeTimeInterval();
        List<Interval> list = new LinkedList<>();
        list.add(new Interval(1, 3));
        list.add(new Interval(2, 4));
        list.add(new Interval(5, 7));
        list.add(new Interval(6, 8));
        List<Interval> result=m.merge(list);
        for (Interval i :result) {
            System.out.printf("{%d,%d},", i.first, i.second);
        }
    }

}
