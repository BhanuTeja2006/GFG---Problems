class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        Map<Integer,Integer> ans=new LinkedHashMap<>();
        for(int num:arr)
        ans.put(num,ans.getOrDefault(num,0)+1);
        ArrayList<Integer> res=new ArrayList<>(ans.values());
        return res;
    }
}