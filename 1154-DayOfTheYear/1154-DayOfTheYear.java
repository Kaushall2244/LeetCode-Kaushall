// Last updated: 9/27/2026, 12:41:41 PM
class Solution {
    public int dayOfYear(String date) {
        String[] d = date.split("-");
        int year = Integer.parseInt(d[0]);
        int month = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            days[1] = 29;

        int ans = day;
        for (int i = 0; i < month - 1; i++)
            ans += days[i];

        return ans;
    }
}