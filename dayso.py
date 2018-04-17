
n = input("n = ")
for i in range (1, n+1 ,1):
	print '%d' %i

Tong = 0;
if(n%2 == 0):
	for i in range (2,n+1,2):
		Tong = Tong + i
else:
	for i in range (1,n+1,1):
		if i%2 == 0:
			Tong = Tong + i
print 'Ket Qua: %d' %Tong
