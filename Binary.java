
class  Binary{
    public static  int BinarySearch(int[]arr , int x)
    {
        int low = 0;
        int high = arr.length-1 ;
        int mid ;
        while(low<= high){
            mid = low + (high-low)/2 ;
            if(arr[mid]== x){
                return mid ;
            }
            if(arr[mid]<x){
                low = mid+1 ;
            }
            else{
                high = mid-1 ;
            }
        }
            return-1 ;
            

        }

    
    public static void main(String[] args) {
        int[]arr = { 1,3,4,66,4};
        int x = 66 ;
        int result = BinarySearch(arr, x);
    
    if(result== -1)
        System.out.println("Element not found");
    
    else
        System.out.println("Element found at index" + result);
}
}
    
