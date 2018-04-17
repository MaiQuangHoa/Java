from SinhVien import *
from Khoa import *

l=[]
sv = SinhVien('001', 'Ma Phi Hung', '57')
l.append(sv)
sv = SinhVien('002', 'Nguyen Tuong Phi', '57')
l.append(sv)
sv = SinhVien('003', 'Le Xuan Khanh', '57')
l.append(sv)
sv = SinhVien('004', 'Nguyen Van Nghia', '57')
l.append(sv)
sv = SinhVien('005', 'Ma Phi Hung', '57')
l.append(sv)
sv = SinhVien('006', 'Ma Phi Hung', '57')
l.append(sv)


for i in l:
	i.Xuat()

for i in l:
	if '57' == i.getNhom():
		i.Xuat()
