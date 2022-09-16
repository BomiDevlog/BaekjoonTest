'''
[문제 이해]

'''
n, m = map(int, input().split())
lst = list(map(int, input().split()))

start = 1
end = max(lst) #가장 큰 값이 끝 값 #가장 높은 나무

#이진 탐색 수행 (반복)
while start <= end:
    total = 0 #획득한 cm #남은 부분을 담기위한 변수
    mid = (start + end) // 2 # 절단기높이 = 최솟값+최댓값/2 (이분탐색법)

    for i in lst:
        if i >= mid:
            total += i - mid # 나무 높이에서 절단기 아래 부분을 제외한 남은 cm 획득 값들

    if total < m: # 나무의 양이 부족한 경우 더 많이 자르기 (왼쪽 부분 탐색)
        end = mid - 1 #최솟값up

    else:       # 나무의 양이 충분한 경우 덜 자르기 (오른쪽 부분 탐색)
        start = mid + 1#최댓값down

print(end)

