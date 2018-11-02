package JavaAssignment.Assignment7;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MergeTimeIntervalTest {

    @Test
    public void merge() {
        MergeTimeInterval m = new MergeTimeInterval();
        List<Interval> list = new LinkedList<>();
        list.add(new Interval(1, 3));
        list.add(new Interval(2, 4));
        list.add(new Interval(5, 7));
        list.add(new Interval(6, 8));
        List<Interval> result=m.merge(list);
        List<Interval> expectation =new LinkedList();
        expectation.add(new Interval(1,4));
        expectation.add(new Interval(5,8));
        //for every interval, the result's first and second should equal to the expectation's first and second.
        for(int i=0;i<result.size();i++) {
            assertEquals("After merging, {1,3},{2,4},{5,7},{6,8} should become {1,4},{5,8}", expectation.get(i).first, result.get(i).first);
            assertEquals("After merging, {1,3},{2,4},{5,7},{6,8} should become {1,4},{5,8}", expectation.get(i).second, result.get(i).second);

        }
    }
}