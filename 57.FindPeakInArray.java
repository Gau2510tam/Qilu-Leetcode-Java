//A peak element is an element that is greater than its neighbors.

//Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

//The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

//You may imagine that num[-1] = num[n] = -∞.

//For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.

public class Solution {
    private int findPeakRe(int[] num, int low, int high)
    {
        int n = num.length;
        int mid = (high + low)/2;
        if((mid==0||num[mid] > num[mid-1]) && (mid==n-1||num[mid] > num[mid+1]))
            return mid;
        else if(mid!=0&&num[mid-1] > num[mid])
            return this.findPeakRe(num, low, mid-1);
        else
            return this.findPeakRe(num, mid+1, high);
    }
    
    public int findPeakElement(int[] num) {
        int low = 0;
        int high = num.length -1;
        int peakIndex = this.findPeakRe(num, low, high);
        return peakIndex;
    }
}
