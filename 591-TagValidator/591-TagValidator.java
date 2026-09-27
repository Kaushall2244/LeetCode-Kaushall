// Last updated: 9/27/2026, 12:43:10 PM
class Solution {
    public boolean isValid(String code) {
        java.util.Stack<String> stack = new java.util.Stack<>();
        int i = 0;
        int n = code.length();

        while (i < n) {
            if (i > 0 && stack.isEmpty()) {
                return false;
            }
            if (code.startsWith("<![CDATA[", i)) {
                if (stack.isEmpty()) return false;
                int j = code.indexOf("]]>", i + 9);
                if (j == -1) return false;
                i = j + 3;
            } else if (code.startsWith("</", i)) {
                if (stack.isEmpty()) return false;
                int j = code.indexOf('>', i + 2);
                if (j == -1) return false;
                String tagName = code.substring(i + 2, j);
                if (!isValidTagName(tagName)) return false;
                if (!stack.peek().equals(tagName)) return false;
                stack.pop();
                i = j + 1;
            } else if (code.startsWith("<", i)) {
                int j = code.indexOf('>', i + 1);
                if (j == -1) return false;
                String tagName = code.substring(i + 1, j);
                if (!isValidTagName(tagName)) return false;
                stack.push(tagName);
                i = j + 1;
            } else {
                if (stack.isEmpty()) return false;
                i++;
            }
        }

        return stack.isEmpty();
    }

    private boolean isValidTagName(String name) {
        if (name.length() < 1 || name.length() > 9) return false;
        for (int k = 0; k < name.length(); k++) {
            char c = name.charAt(k);
            if (c < 'A' || c > 'Z') return false;
        }
        return true;
    }
}