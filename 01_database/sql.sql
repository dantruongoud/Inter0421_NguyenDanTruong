create database Furama;
use Furama;

create table LoaiKhach
(
IDLoaiKhach int primary key,
TenLoaiKhach varchar(45)
);
insert into LoaiKhach values
(1,"du lich"),
(2,"vang lai"),
(3,"dia phuong");

create table KhachHang
(
IDKhachHang int primary key,
IDLoaiKhach int,
FOREIGN KEY (IDLoaiKhach) REFERENCES LoaiKhach(IDLoaiKhach),
Hoten varchar(45),
Ngaysinh Date,
SoCMND varchar(45),
SDT varchar(45),
Email varchar(45),
Diachi varchar(45)
);
insert into KhachHang values
(1,1,"Nguyen Van A",15/4/1997,"123456789","0935117614","anv@gmail.com","35 Nguyen Van Hue, Da Nang"),
(2,2,"Nguyen Van B",16/4/1997,"253647823","0935117614","bnv@gmail.com","36 Tran Phu, Quang Tri"),
(3,3,"Nguyen Van C",17/4/1997,"987254675","0935117614","cnv@gmail.com","37 Hai Phong, Da nang");

create table KieuThue
(
IDKieuThue int primary key,
TenKieuThue varchar(45),
Gia int
);
insert into KieuThue values
(1,"truc tiep","5000000"),
(2,"dai ly","5600000"),
(3,"he thong","5800000");

create table LoaiDichVu
(
IDLoaiDichVu int primary key,
TenLoaiDichVu varchar(45)
);
insert into LoaiDichVu values
(1,"co ban"),
(2,"cao cap");

create table DichVu
(
IDDichVu int primary key,
TenDichVu varchar(45),
DienTich int,
SoTang int,
SoNguoiToiDa varchar(45),
ChiPhiThue varchar(45),
IDKieuThue int,
FOREIGN KEY (IDKieuThue) REFERENCES KieuThue(IDKieuThue),
IDLoaiDichVu int,
FOREIGN KEY (IDLoaiDichVu) REFERENCES LoaiDichVu(IDLoaiDichVu),
TrangThai varchar(45)
);
insert into DichVu values
(1,"giat ui","80","2","50","100000",1,1,"active"),
(2,"xe dua don","80","2","50","100000",3,1,"active"),
(3,"Spa","80","2","30","100000",2,1,"active"),
(4,"Trong tre","80","2","50","100000",1,1,"active"),
(8,"phu vu phong","80","2","50","100000",3,1,"active"),
(9,"Karaoke","80","2","10","100000",1,1,"active"),
(5,"Fitness center","80","2","100","100000",3,2,"active"),
(6,"golf, tenis","80","2","20","100000",1,2,"active"),
(7,"casino","80","2","100","100000",2,2,"active"),
(10,"ho boi","80","2","50","2000000",1,2,"active");

create table ViTri
(
IDViTri int primary key,
TenViTri varchar(45)
);
insert into Vitri values
(1,"tong giam doc"),
(2,"pho tong giam doc"),
(3,"nhan vien lam phong"),
(4,"nhan vien giat la"),
(5,"nhan vien phong thay do"),
(6,"nhan vien le tan"),
(7,"nhan vien dat phong"),
(8,"nhan vien thu ngan"),
(9,"nhan vien ho tro khach hang"),
(10,"bep truong"),
(11,"phu bep"),
(12,"nhan vien phu vu"),
(13,"nhan vien pha che"),
(14,"nhan vien ke toan tong hop"),
(15,"nhan vien ke toan noi bo"),
(16,"nhan vien thu quy"),
(17,"nhan vien thu mua"),
(18,"nhan vien Marketing"),
(19,"nhan vien PR/quan he khach hang"),
(20,"nhan vien sales");

create table TrinhDo
(
IDTrinhDo int primary key,
TrinhDo varchar(45)
);
insert into TrinhDo values
(1,"binh thuong"),
(2,"Tai nang tre"),
(3,"Quan ly, chuyen gia"),
(4,"Chu chot de dai ngo");

create table BoPhan
(
IDBoPhan int primary key,
TenBoPhan varchar(45)
);
insert into BoPhan values
(1,"lanh dao"),
(2,"buong phong"),
(3,"le tan"),
(4,"am thuc"),
(5,"tai chinh, ke toan"),
(6,"kinh doanh");

create table NhanVien
(
IDNhanVien int primary key,
HoTen varchar(45),
IDViTri int,
FOREIGN KEY (IDViTri) REFERENCES ViTri(IDViTri),
IDTrinhDo int,
FOREIGN KEY (IDTrinhDo) REFERENCES TrinhDo(IDTrinhDo),
IDBoPhan int,
FOREIGN KEY (IDBoPhan) REFERENCES BoPhan(IDBoPhan),
NgaySinh Date,
SoCMND varchar(45),
Luong varchar(45),
SDT varchar(10),
Email varchar(45),
DiaChi varchar(45)
);
insert into NhanVien values
(1,"Nguyen Thanh Huong",1,3,1,12/2/1890,"286364785","60000000",09355578345,"huongnt@gmail.com","12 Nguyen Van Hue"),
(2,"Nguyen Van Truong",2,3,1,12/2/1890,"286364785","60000000",09355578345,"truongnv@gmail.com","12 Nguyen Van Hue"),
(3,"Tran Thanh Kim",3,1,2,12/2/1890,"286364785","60000000",09355578345,"kimtt@gmail.com","12 Nguyen Van Hue"),
(4,"Nguyen Van Dat",4,1,2,12/2/1890,"286364785","60000000",09355578345,"datnt@gmail.com","12 Nguyen Van Hue"),
(5,"Truong Van Khanh",5,1,2,12/2/1890,"286364785","60000000",09355578345,"khanhtvt@gmail.com","12 Nguyen Van Hue"),
(6,"Nguyen Van Ha",6,1,3,12/2/1890,"286364785","60000000",09355578345,"hanv@gmail.com","12 Nguyen Van Hue");

create table HopDong
(
IDHopDong int primary key,
IDNhanVien int,
FOREIGN KEY (IDNhanVien) REFERENCES NhanVien(IDNhanVien),
IDKhachHang int,
FOREIGN KEY (IDKhachHang) REFERENCES KhachHang(IDKhachHang),
IDDichVu int,
FOREIGN KEY (IDDichVu) REFERENCES DichVu(IDDichVu),
NgayLam Date,
NgayKetThuc Date,
TienDatCoc int,
TongTien int
);

create table DichVuDiKem
(
IDDichVuDiKem int primary key,
TenDichVu varchar(45),
Gia int,
DonVi varchar(45),
TrangThai varchar(45)
);

create table HopDongChiTiet
(
IDHopDongChiTiet int primary key,
IDHopDong int,
FOREIGN KEY (IDHopDong) REFERENCES HopDong(IDHopDong),
IDDichVuDiKem int,
FOREIGN KEY (IDDichVuDiKem) REFERENCES DichVuDiKem(IDDichVuDiKem),
SoLuong int
);

SELECT * FROM nhanvien WHERE (SUBSTRING_INDEX(SUBSTRING_INDEX( HoTen , ' ', -1 ),' ',2) LIKE "H%" OR SUBSTRING_INDEX(SUBSTRING_INDEX( HoTen , ' ', -1 ),' ',2) LIKE "T%")
