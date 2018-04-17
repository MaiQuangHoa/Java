class Khoa:
	maKhoa =''
	tenKhoa = ''
	def __init__ (self, MaKhoa, TenKhoa):
		self.maKhoa = MaKhoa
		self.tenKhoa = TenKhoa
	def Xuat(self):
		print '%s  %s' %(self.maKhoa, self.tenKhoa)
