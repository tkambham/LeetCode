class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
         List<Integer> result = new ArrayList<>();

         for(int i =0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            int colIndex = 0;
            for(int j =0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    colIndex = j;
                }
            }
            
            boolean check = true;
            for(int k =0;k<matrix.length;k++){
                if(matrix[k][colIndex]>min){
                    check = false;
                    break;
                }
            }

            if(check){
                result.add(min);
            }
         }

         return result;
    }
}