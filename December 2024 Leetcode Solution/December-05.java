class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (start.charAt(i) != '_') {
                while (j < n && target.charAt(j) == '_') j++;

                if (j == n || start.charAt(i) != target.charAt(j)) return false;

                if ((start.charAt(i) == 'L' && i < j) || (start.charAt(i) == 'R' && i > j)) return false;

                j++;
            }
        }

        while (j < n) {
            if (target.charAt(j) != '_') return false;
            j++;
        }

        return true;
    }
}
