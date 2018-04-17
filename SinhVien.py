class SinhVien:
	MSSV = ''
	hoTen = ''
	nhom = ''
	def __init__ (self, MSSV, HoTen, Nhom):
		self.MSSV = MSSV
		self.hoTen = HoTen
		self.nhom = Nhom
	def getMSSV(self):
	        return self.MSSV 
	def setMSSV(self, MSSV):
		self.MSSV = MSSV
	def getHoTen(self):
	        return self.hoTen
	def setHoTen(self, HoTen):
		self.hoTen = HoTen
	def getNhom(self):
	        return self.nhom
	def setNhom(self, Nhom):
		self.nhom = Nhom
	def Xuat(self):
		print '%s  %s  %s' %(self.MSSV, self.hoTen, self.nhom)
