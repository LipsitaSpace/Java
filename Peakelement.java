/* Given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak 
if it is greater than its adjacent elements (if they exist). If there are multiple peak elements, return index of any one of them. 
The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".

Note: Consider the element before the first element and the element after the last element to be negative infinity.

Examples :
Input: arr = [1, 2, 4, 5, 7, 8, 3]
Output: true
Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
Input: arr = [10, 20, 15, 2, 23, 90, 80]
Output: true
Explanation: arr[1] = 20 and arr[5] = 90 are peak elements because arr[0] < arr[1] > arr[2] and arr[4] < arr[5] > arr[6]. 
Input: arr = [1, 2, 3]
Output: true
Explanation: arr[2] is a peak element because arr[1] < arr[2] and arr[2] is the last element, so it has negative infinity to its right.
Constraints:
1 ≤ arr.size() ≤ 106
-231 ≤ arr[i] ≤ 231 - 1 */

class Solution {
    public int peakElement(int[] arr) {
        // code here
        int l = arr.length-1;
        int peak = 0;
        if(l == 0) {
            peak = 0;
        }
        else if(arr[0]>arr[1]){
            peak = 0;
        }
        else if(arr[l]>arr[l-1]){
            peak = l;
        }
        for(int i=1; i<l; i++){
            if(arr[i-1]<=arr[i] && arr[i]>=arr[i+1]){
                peak = i;
                break;
            }
        }
        return peak;
    }
}
