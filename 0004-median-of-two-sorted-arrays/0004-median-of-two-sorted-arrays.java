class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int i=0;
        int j=0;
        int k=0;
        int arr[] = new int[a.length + b.length];
        while(i<a.length && j<b.length && k<arr.length){
            if(a[i] < b[j]){
                arr[k] = a[i];
                i++;
            }
            else{
                arr[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<a.length && k<arr.length){
            arr[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length && k<arr.length){
            arr[k] = b[j];
            j++;
            k++;
        }
        int n = arr.length;
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
        }
    }
}