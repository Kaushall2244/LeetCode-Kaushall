# Last updated: 8/12/2026, 12:04:10 PM
class Solution:
    def transformStr(self, s: str, strs: List[str]) -> List[bool]:

        vl = strs
        n = len(s)
        tz = s.count('0')

        sp = [0] * (n+1)
        for i in range(n):
            sp[i+1] = sp[i] + (1 if s[i] == '0' else 0)

        ans = []

        for t in strs:
            fz = t.count('0')
            fo = t.count('1')
            wc = t.count('?')

            nz = tz - fz

            if nz < 0 or nz > wc:
                ans.append(False)
                continue

            tzp = 0
            pb = True
            zp = 0
            
            for i in range(n):
                if t[i] == '0':
                    tzp += 1
                elif t[i] == '?':
                    if zp < nz:
                        tzp += 1
                        zp += 1
                    else:
                        pass
                else:
                    pass

                if tzp < sp[i + 1]:
                    pb = False
                    break
            ans.append(pb)

        return ans