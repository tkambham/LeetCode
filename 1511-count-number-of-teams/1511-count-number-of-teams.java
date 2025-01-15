class Solution {
    public int numTeams(int[] rating) {
        int teams = 0;
        int n = rating.length;
        for(int i=1; i<n; i++){
            int ll =0;
            int rl = 0;
            int lg = 0;
            int rg = 0;
            for(int j=0;j<i;j++){
                if(rating[j]<rating[i]){
                    ll++;
                }
                else{
                    lg++;
                }            
            }
            for(int j = i+1; j<n; j++){
                if(rating[j]<rating[i]){
                    rl++;
                }
                else{
                    rg++;
                }
            }
            teams += ll*rg;
            teams += lg*rl;
        }
        return teams;
    }
}