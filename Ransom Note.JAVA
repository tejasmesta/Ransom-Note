class Solution {
    public boolean canConstruct(String r, String magazine) {
        HashMap<Character,Integer>map = new HashMap<>();
        
        int n = magazine.length();
        
        for(int i=0;i<n;i++)
        {
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }
        
        int m = r.length();
        
        for(int i=0;i<m;i++)
        {
            char c= r.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)-1);
                if(map.get(c)==0)
                {
                    map.remove(c);
                }
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}
