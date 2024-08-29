public class MergeSortF 
{ 
    public static void mergeSort(int[] arr, int left, int right) 
    {    
        if (left < right)
        {     
                           // Find the middle point to divide the array into two halves     
               int mid = (left + right) / 2; 
                           // Recursive call to sort the first and second halves        
            mergeSort(arr, left, mid);     
               mergeSort(arr, mid + 1, right);       
                         // Merge the sorted halves
                merge(arr, left, mid, right);    
        }    
    }    
    public static void merge(int[] arr, int left, int mid, int right) 
    {                    // Find sizes of two subarrays to be merged    
        int n1 = mid - left + 1;       
      int n2 = right - mid;   
                     // Create temporary arrays     
        int[] L = new int[n1];     
        int[] R = new int[n2];        // Copy data to temporary arrays       
      for(int i=0;i<n1;++i)       
             L[i] = arr[left + i]; 
            for(int j = 0; j < n2; ++j)    
            R[j] = arr[mid + 1 + j]; 
                // Merge the temporary arrays 
            int i = 0, j = 0;     
       int k = left;   // Initial index of merged subarray array    
         while(i < n1 && j < n2) 
    {   
             if (L[i] <= R[j]) 
        {         
                   arr[k] = L[i];           
                 i++;          
          } 
        else 
        {      
                  arr[k] = R[j];    
                    j++;            
        }        
            k++;  
      }   
         // Copy remaining elements of L[] if any  
      while(i < n1) 
      {          
      arr[k] = L[i];     
           i++;       
         k++;        
      }    
                // Copy remaining elements of R[] if any  
      while (j < n2) 
      {          
      arr[k] = R[j];    
            j++;    
            k++;     
       }    
   }
            // Utility method to print the array    public static void printArray(int[] arr) 
   public static void printArray(int[] arr) 
   {     
    int n = arr.length;    
    for(int i = 0; i < n; ++i)       
    System.out.print(arr[i] + " ");   
    System.out.println();  
   }
     // Main method to test the merge sort algorithm    
  public static void main(String[] args) 
   {  
          int[] arr = {12, 11, 13, 5, 6, 7};     
         System.out.println("Given Array"); 
            printArray(arr);    
        mergeSort(arr, 0, arr.length - 1);   
          System.out.println("\nSorted array");  
           printArray(arr);    
 }
}

