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

    public static void bubbleSort(int arr[],int n){
        for(int i = 0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
 public static void selectionSort(int arr[], int n){
    for(int i = 0; i < n-1; i++){
        int smallestIDX = i;

        // smallest dhundo
        for(int j = i+1; j < n; j++){
            if(arr[j] < arr[smallestIDX]){
                smallestIDX = j;  // ✅ index store karo
            }
        }

        // bahar swap karo
        int temp = arr[i];              
        arr[i] = arr[smallestIDX];       
        arr[smallestIDX] = temp;        
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

        selectionSort(arr, n);
        print(arr, n);
    }
}
