# Last updated: 8/12/2026, 12:03:55 PM
class Solution:
    def countTasks(self, tasks: List[int], shifts: List[int]) -> List[int]:
        n = len(tasks)
        perf = [0] * (n+1)
        for i in range(n):
            perf[i+1] = perf[i] + tasks[i]

        drel = tasks

        tn = perf[-1]
        ct = 0
        ans = []

        for s in shifts:
            poten = ct + s
            if poten >= tn:
                ans.append(0)
                ct = 0
            else:
                idx = bisect.bisect_right(perf, poten) - 1
                ans.append(n-idx)
                ct = poten
                
        return ans