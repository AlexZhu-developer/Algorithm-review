public class printbyrecursion {
    /**
     * @param n: An integer.
     * return : An array storing 1 to the largest number with n digits.
     */
    public List<Integer> numbersByRecursion(int n) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<>();
        num(n, 0, res);
        return res;
    }
    
    public void num(int n, int ans,ArrayList<Integer> res){
        
        if(n == 0){
            if(ans > 0){
                res.add(ans);
            }
            return;
        }
        
        int i;
        for(i = 0; i <= 9; i++){
            num(n - 1, ans * 10 + i, res);
        }
        
    }
}