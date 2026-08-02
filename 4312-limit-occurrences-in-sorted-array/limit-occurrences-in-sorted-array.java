class Solution {
    public int[] limitOccurrences(int[] arr, int k) {
         ArrayList<Integer> list = new ArrayList<>();
         int element=arr[0];
         int count=1;
         list.add(arr[0]);
         for(int i=1;i<arr.length;i++){
            if(arr[i]==element)count+=1;
            else 
            {element=arr[i];
            count=1;
            }

            if(count<=k)list.add(arr[i]);
         }
         int temp[]=new int[list.size()];
         for(int i=0;i<temp.length;i++){
            temp[i]=list.get(i);
         }
         return temp;
    }
}