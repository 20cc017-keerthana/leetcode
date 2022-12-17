class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int element =0;
        for(int no:nums){
            if(count ==0){
                element=no;
            }
            if(no==element){
                count+=1;
            }
            else{
                count-=1;
            }
        }
        return element;
    }
}
