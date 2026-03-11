public class sorting {
    
    public static void insertionSort(int arr[],int n){
        for(int i = 1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void print(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,1,6,3,5};
        int n = arr.length;

        insertionSort(arr, n);
        print(arr, n);
    }
}
