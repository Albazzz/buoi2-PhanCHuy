với for(i=0;i<=index;i++){
temp = temp.next
}
thì node tại vị trí index vì vòng for chạy tới 0 tới =  index 
lúc đầu temp là head sau lần i = 0 thì sẽ là vị trí số 1 
0           1           2              3
head    head.next(1)       h.next(2)   h.next(3)
còn với vòng for không có = thì chỉ chạy đến index -1
0           1           2              3
head    head.next(1)       h.next(2)   không tới được vì không có =
