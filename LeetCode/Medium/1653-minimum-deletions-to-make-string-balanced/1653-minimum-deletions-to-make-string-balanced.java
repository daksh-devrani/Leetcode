class Solution {
    public int minimumDeletions(String s) {
        int count_b=0;
        int deleted=0;
        for(char c: s.toCharArray()){
            if(c == 'b'){
                count_b++;
            }
            else{
                deleted = Math.min(deleted+1, count_b);
            }
        }
        return(deleted);
    }
}