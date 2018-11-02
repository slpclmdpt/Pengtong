package JavaAssignment.Assignment7;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfTwoSortedArrayTest {

    @Test
    public void findMedianSortedArrays() {
        int[] nums1={1,2,7};
        int[] nums2={3,4,5};
        MedianOfTwoSortedArray m=new MedianOfTwoSortedArray();
        assertEquals("Median of 1,2,3,4,5,7 should be 3.5",3.5,m.findMedianSortedArrays(nums1,nums2),0);
    }
}