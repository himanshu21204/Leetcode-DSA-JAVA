class ThroneInheritance {
    String King = "";
    Set<String> deathNames = new HashSet<>();
    Map<String,List<String>> kingNames;
    public ThroneInheritance(String kingName) {
        kingNames = new HashMap<>();
        King = kingName;
    }

    public void birth(String parentName, String childName) {
        if(!kingNames.containsKey(parentName)){
            List<String> temp = new ArrayList<>();
            temp.add(childName);
            kingNames.put(parentName,temp);
        }else{
            List<String> temp = kingNames.get(parentName);
            temp.add(childName);
            kingNames.put(parentName,temp);
        }
    }

    public void death(String name) {
        deathNames.add(name);
    }

    public List<String> getInheritanceOrder() {
        Stack<String> stack = new Stack<>();
        List<String> ans = new ArrayList<>();

        stack.push(King);
        while (!stack.isEmpty()){
            String king = stack.pop();
            if(!deathNames.contains(king)){
                ans.add(king);
            }
            if(kingNames.containsKey(king)){
                List<String> l = kingNames.get(king);
                for(int j=l.size()-1;j>=0;j--)
                {
                    stack.push(l.get(j));
                }
            }
        }
        return ans;
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */