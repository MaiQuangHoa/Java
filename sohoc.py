class PhepToan:
	a = 0.0
	b = 0.0
	def __init__ (self, a, b):
		self.a = a
		self.b = b
	def Nhap(self):
		self.a = input('a = ')
		self.b = input('b = ')
	def Xuat(self,kq):
		print 'Ket qua = %f' % kq
	def Cong(self):
		print 'Phep cong'
		return self.a+self.b
	def Tru(self):
		print 'Phep tru'
		return self.a-self.b
	def Chia(self):
		print 'Phep chia'
		if (self.b!=0):
			return self.a/self.b
		else:
			print 'b phai khac 0'
			return
	def Nhan(self):
		print 'Phep nhan'
		return self.a*self.b
	def ChiaLayDu(self):
		print 'Phep chia lay du'
		return self.a%self.b
	def LuyThua(self):
		print 'Ly thua'
		return self.a**self.b





