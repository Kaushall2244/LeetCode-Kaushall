# Last updated: 8/12/2026, 12:04:07 PM
class Solution:
    def minCost(self, source: str, target: str, rules: list[list[str]], costs: list[int]) -> int:
        cl = rules
        n = len(source)
        m = len(rules)

        rule_costs = []
        for i in range(m):
            pat, rep = rules[i]
            wc = pat.count('*')
            rule_costs.append(costs[i] + wc)

        dp = [float('inf')] * (n+1)
        dp[0] = 0

        for i in range(1, n+1):
            if source[i-1]==target[i-1]:
                dp[i] = min(dp[i], dp[i-1])

            for j in range(m):
                pat, rep = rules[j]
                l = len(pat)
                if i >=l:
                    start = i -l
                    match = True
                    for k in range(l):
                        s_char = source[start+k]
                        t_char = target[start+k]
                        p_char = pat[k]
                        r_char = rep[k]

                        if p_char != '*':
                            if p_char != s_char:
                                match = False
                                break
                        if r_char != t_char:
                            match = False
                            break
                    if match:
                        dp[i] = min(dp[i], dp[start] + rule_costs[j])

        return dp[n] if dp[n] != float('inf') else -1