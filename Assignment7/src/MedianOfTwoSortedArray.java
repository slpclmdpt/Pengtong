package JavaAssignment.Assignment7;

import java.util.ArrayList;

public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        double median;
        int index1 = 0, index2 = 0;
        //sort nums1 and nums2 into a new list
        while (index1 < nums1.length || index2 < nums2.length) {
            if (index1 == nums1.length && index2 < nums2.length) {
                list.add(nums2[index2]);
                index2++;
            } else if (index1 < nums1.length && index2 == nums2.length) {
                list.add(nums1[index1]);
                index1++;
            } else {
                if(nums1[index1]<=nums2[index2]){
                    list.add(nums1[index1]);
                    index1++;
                }else{
                    list.add(nums2[index2]);
                    index2++;
                }
            }
        }
        if(list.size()%2==0){
            median=(list.get(list.size()/2-1)+list.get(list.size()/2))/2.0;
        }else{
            median=list.get(list.size()/2);
        }
        return median;
    }

    public static void main(String args[]){
        int[] nums1={1,2};
        int[] nums2={3,4};
        MedianOfTwoSortedArray m=new MedianOfTwoSortedArray();
        System.out.println(m.findMedianSortedArrays(nums1,nums2));
    }
}
