class Solution {
    public int maximumWealth(int[][] accounts) {
        int Maxsum=Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            int sum=0;
            for(int j=0; j<accounts[0].length; j++){
                sum += accounts[i][j];
            }
            if(Maxsum<sum){
                Maxsum=sum;
            }
        }
        return Maxsum;
    }
}
