// 那么2只能拆成1+1，所以乘积也为1。

// 数字3可以拆分成2+1或1+1+1，显然第一种拆分方法乘积大为2。

// 数字4拆成2+2，乘积最大，为4。

// 数字5拆成3+2，乘积最大，为6。

// 数字6拆成3+3，乘积最大，为9。

// 数字7拆为3+4，乘积最大，为12。

// 数字8拆为3+3+2，乘积最大，为18。

// 数字9拆为3+3+3，乘积最大，为27。

// 数字10拆为3+3+4，乘积最大，为36。

public class Solution {
    public int integerBreak(int n) {
        if (n ==2 || n ==3) return n-1;
        int res = 1;
        while(n>4){
            res *= 3;
            n -= 3;
        }
        return res * n;
    }
}