 class Solution {
     public int[] twoSum(int[] arr, int x) {
         int n =arr.length;
         int ans []= new int[2];
         for(int i=0; i<n;i++){
             for(int j=i+1; j<n;j++){
      if(arr[i]+arr[j]==x){
 ans[0]=i;
 ans[1]=j;
 break;
                 }

            
             }
        
         }
         return ans;
     }
 }