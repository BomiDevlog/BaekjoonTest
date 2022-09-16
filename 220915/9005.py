# https://www.acmicpc.net/problem/9095
# [백준/파이썬] 9005번 1, 2, 3 더하기
# https://blog.naver.com/kut_da_92/222737682125

for tc in range(int(input())):
    n = int(input())

    if n == 1:
        print(1)
        
    elif n == 2:
        print(2)
        
    elif n == 3:
        print(4)
        
    elif n >= 4:
        dp = [0] * (n+1)
        dp[1] = 1
        dp[2] = 2
        dp[3] = 4
        
        for i in range(4, n+1):
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3]
            
        print(dp[n])

''''
DP의 큰 특징인 "점화식"을 이용하는 문제였다.

DP의 특징 중 " k번째까지 효율적인 수는 정해져있다"과 더불어 "점화식"도 중요한 부분이다.

​

이 문제는  " k번째까지 효율적인 수는 정해져있다" 를 이용하여 직접 세주는 문제가 아니라, 

그냥 점화식을 찾으면 되는 문제였다.  오히려 직접 다른 규칙을 찾아서 세주려고 하면 너무 복잡해지고

점화식을 발견하고 나면 너무 쉬워져버린다.
'''