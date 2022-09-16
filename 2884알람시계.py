time = input() #원래시간 입력
h, m = time.split()
h = int(h) #시
m = int(m) #분

if m>=45: #경우1: 분이 45 이상
    print(h,m-45)

else: # 경우2: 분이 45 이하
    if h==0: #경우2-1: 0시일 경우
        print(23, 60-abs(m-45))
	else: #경우2-2: 0시 제외 나머지 경우
        print(h-1, 60-abs(m-45))