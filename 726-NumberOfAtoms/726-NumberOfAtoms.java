// Last updated: 9/27/2026, 12:42:51 PM
import java.util.*;

class Solution {
    public String countOfAtoms(String formula) {
        int n = formula.length();
        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>());
        
        int i = 0;
        while (i < n) {
            char c = formula.charAt(i);
            if (c == '(') {
                stack.push(new HashMap<>());
                i++;
            } else if (c == ')') {
                i++;
                int start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) {
                    i++;
                }
                int count = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
                Map<String, Integer> popped = stack.pop();
                Map<String, Integer> top = stack.peek();
                for (String key : popped.keySet()) {
                    top.put(key, top.getOrDefault(key, 0) + popped.get(key) * count);
                }
            } else {
                int start = i;
                i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) {
                    i++;
                }
                String name = formula.substring(start, i);
                
                start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) {
                    i++;
                }
                int count = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
                
                Map<String, Integer> top = stack.peek();
                top.put(name, top.getOrDefault(name, 0) + count);
            }
        }
        
        Map<String, Integer> map = stack.peek();
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        StringBuilder sb = new StringBuilder();
        for (String key : sortedMap.keySet()) {
            sb.append(key);
            int count = sortedMap.get(key);
            if (count > 1) {
                sb.append(count);
            }
        }
        
        return sb.toString();
    }
}