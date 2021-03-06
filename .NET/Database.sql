CREATE DATABASE DoAnJAVA
GO
USE [DoAnJAVA]
GO
/****** Object:  StoredProcedure [dbo].[CTPhieuBan_Delete]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO


CREATE PROCEDURE [dbo].[CTPhieuBan_Delete]

/*
Author:   			Huynh_Anh_Nhat
Created: 			2016-1-1
Last Modified: 		2016-1-1
*/

@SoPhieuBan int,
@MaDia int
-- WITH ENCRYPTION
AS

DELETE FROM [dbo].[CTPhieuBan]
WHERE
	[SoPhieuBan] = @SoPhieuBan
	AND [MaDia] = @MaDia
update PhieuBan set TongTien = (select sum(SoLuong * DonGiaBan) from CTPhieuBan ct inner join Dia d on d.MaDia = ct.MaDia where SoPhieuBan = @SoPhieuBan group by SoPhieuBan) where SoPhieuBan = @SoPhieuBan


GO
/****** Object:  StoredProcedure [dbo].[CTPhieuBan_Insert]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO


CREATE PROCEDURE [dbo].[CTPhieuBan_Insert]

-- THIS STORED PROCEDURE NEEDS TO BE MANUALLY COMPLETED
-- MULITPLE PRIMARY KEY MEMBERS OR NON-GUID/INT PRIMARY KEY

@SoPhieuBan int,
@MaDia int,
@SoLuong decimal(18, 0)


-- WITH ENCRYPTION
AS
if( not exists(select * from CTPhieuBan where SoPhieuBan = @SoPhieuBan and MaDia = @MaDia))
begin
INSERT INTO 		[dbo].[CTPhieuBan] 
(
					[SoPhieuBan],
					[MaDia],
				
					[SoLuong]
) 

VALUES 
(
					@SoPhieuBan,
					@MaDia,
					
					@SoLuong
)
end
else
begin
update CTPhieuBan set SoLuong = SoLuong + @SoLuong where MaDia =@MaDia and SoPhieuBan = @SoPhieuBan

end

update PhieuBan set TongTien = (select sum(SoLuong * DonGiaBan) from CTPhieuBan ct inner join Dia d on d.MaDia = ct.MaDia where SoPhieuBan = @SoPhieuBan group by SoPhieuBan) where SoPhieuBan = @SoPhieuBan


GO
/****** Object:  StoredProcedure [dbo].[CTPhieuBan_SelectAll]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[CTPhieuBan_SelectAll]

/*
Author:   			Huynh_Anh_Nhat
Created: 			2016-1-1
Last Modified: 		2016-1-1
*/
-- WITH ENCRYPTION
AS


SELECT
		[SoPhieuBan],
		d.[MaDia],
		DonGiaBan [DonGia],
		SoLuong
		
FROM
		[dbo].[CTPhieuBan] ct inner join Dia d on d.MaDia = ct.MaDia



GO
/****** Object:  StoredProcedure [dbo].[CTPhieuBan_SelectOne]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO


CREATE PROCEDURE [dbo].[CTPhieuBan_SelectOne]

/*
Author:   			Huynh_Anh_Nhat
Created: 			2016-1-1
Last Modified: 		2016-1-1
*/

@SoPhieuBan int
-- WITH ENCRYPTION
AS


SELECT
		[SoPhieuBan],
		p.[MaDia],
		[DonGiaBan] [Dongia],
		SoLuong,
		TenDia
		
FROM
		[dbo].[CTPhieuBan] p inner join Dia d on d.MaDia = p.MaDia
		
WHERE
		[SoPhieuBan] = @SoPhieuBan
		



GO
/****** Object:  StoredProcedure [dbo].[CTPhieuBan_Update]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO


CREATE PROCEDURE [dbo].[CTPhieuBan_Update]

/*
Author:   			Huynh_Anh_Nhat
Created: 			2016-1-1
Last Modified: 		2016-1-1
*/
	
@SoPhieuBan int, 
@MaDia int, 
@GiaBan decimal(18, 0) 

-- WITH ENCRYPTION
AS

UPDATE 		[dbo].[CTPhieuBan] 

SET
			[GiaBan] = @GiaBan
			
WHERE
			[SoPhieuBan] = @SoPhieuBan
			AND [MaDia] = @MaDia



GO
/****** Object:  StoredProcedure [dbo].[CTPhieuThue_SelectAll]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[CTPhieuThue_SelectAll]
@SoPhieuThue int
/*
Author:   			Huynh_Anh_Nhat
Created: 			2016-1-1
Last Modified: 		2016-1-1
*/
-- WITH ENCRYPTION
AS


SELECT
		SoPhieuThue,
		d.[MaDia],
		[TenDia],
		DonGiaBan [DonGia],
		SoLuong
		
		
FROM
		[dbo].[CTPhieuThue] ct inner join Dia d on d.MaDia = ct.MaDia

where SoPhieuThue = @SoPhieuThue



GO
/****** Object:  StoredProcedure [dbo].[CTPhieuThueUpdate]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO


CREATE PROCEDURE [dbo].[CTPhieuThueUpdate]

-- THIS STORED PROCEDURE NEEDS TO BE MANUALLY COMPLETED
-- MULITPLE PRIMARY KEY MEMBERS OR NON-GUID/INT PRIMARY KEY

@SoPhieuThue int,
@MaDia int,
@SoLuong decimal(18, 0)


-- WITH ENCRYPTION
AS
if( not exists(select * from CTPhieuThue where SoPhieuThue = @SoPhieuThue and MaDia = @MaDia))
begin
INSERT INTO 		[dbo].[CTPhieuThue] 
(
					SoPhieuThue,
					[MaDia],
					[SoLuong]
) 

VALUES 
(
					@SoPhieuThue,
					@MaDia,
					
					@SoLuong
)
end
else
begin

update CTPhieuThue set SoLuong = SoLuong + @SoLuong where MaDia =@MaDia and SoPhieuThue = @SoPhieuThue

end

update PhieuThue set TongTien = 
(select sum(SoLuong * DonGiaThue * pt.SoLuongNgayThue) 

from PhieuThue pt 
inner join  CTPhieuThue  ct  on ct.SoPhieuThue = pt.SoPhieuThue
inner join Dia d on d.MaDia = ct.MaDia 
where pt.SoPhieuThue = @SoPhieuThue 
group by ct.SoPhieuThue ) 

where SoPhieuThue = @SoPhieuThue


GO
/****** Object:  StoredProcedure [dbo].[PhieuBan_Delete]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO


CREATE PROCEDURE [dbo].[PhieuBan_Delete]

/*
Author:   			Huynh_Anh_Nhat
Created: 			2016-1-1
Last Modified: 		2016-1-1
*/

@SoPhieuBan int
-- WITH ENCRYPTION
AS

DELETE FROM [dbo].[PhieuBan]
WHERE
	[SoPhieuBan] = @SoPhieuBan


GO
/****** Object:  StoredProcedure [dbo].[PhieuBan_Insert]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO


CREATE PROCEDURE [dbo].[PhieuBan_Insert]

/*
Author:   			Huynh_Anh_Nhat
Created: 			2016-1-1
Last Modified: 		2016-1-1
*/
@SoPhieuBan int,
@NgayBan smalldatetime,
@MaKH nvarchar(50),
@MaNV nvarchar(50),
@TrangThai bit

-- WITH ENCRYPTION
AS

INSERT INTO 	[dbo].[PhieuBan] 
(
				[SoPhieuBan],
				[NgayBan],
				[MaKH],
				[MaNV],
				[TrangThai]
) 

VALUES 
(
				@SoPhieuBan,
				@NgayBan,
				@MaKH,
				@MaNV,
				@TrangThai
				
)
SELECT @@IDENTITY 




GO
/****** Object:  StoredProcedure [dbo].[PhieuBan_SelectAll]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[PhieuBan_SelectAll]

@key nvarchar(50)
/*
Author:   			Huynh_Anh_Nhat
Created: 			2016-1-1
Last Modified: 		2016-1-1
*/
-- WITH ENCRYPTION
AS


SELECT
		[SoPhieuBan],
		[NgayBan],
		[TenThanhVien],
		[TenNhanVien],
		[MaKH],
		[MaNV],
		[TrangThai],
		[TongTien]
		
FROM
		[dbo].[PhieuBan] p inner join NhanVien n on p.MaNV = n.MaNhanVien
							inner join ThanhVien t on p.MaKH = t.MaThanhVien 

where SoPhieuBan like '%'+@key+'%' or NgayBan like '%'+@key+'%' or MaKH like '%'+@key+'%' or TrangThai like '%'+@key+'%' or @key = ''

GO
/****** Object:  StoredProcedure [dbo].[PhieuBan_SelectOne]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO


CREATE PROCEDURE [dbo].[PhieuBan_SelectOne]

/*
Author:   			Huynh_Anh_Nhat
Created: 			2016-1-1
Last Modified: 		2016-1-1
*/

@SoPhieuBan int
-- WITH ENCRYPTION
AS


SELECT
		[SoPhieuBan],
		[NgayBan],
		[MaKH],
		[MaNV],
		[TrangThai]
		
FROM
		[dbo].[PhieuBan]
		
WHERE
		[SoPhieuBan] = @SoPhieuBan



GO
/****** Object:  StoredProcedure [dbo].[PhieuBan_SelectPage]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO



CREATE PROCEDURE [dbo].[PhieuBan_SelectPage]

-- Author:   			Huynh_Anh_Nhat
-- Created: 			2016-1-1
-- Last Modified: 		2016-1-1

@PageNumber 			int,
@PageSize 			int
-- WITH ENCRYPTION
AS

DECLARE @PageLowerBound int
DECLARE @PageUpperBound int


SET @PageLowerBound = (@PageSize * @PageNumber) - @PageSize
SET @PageUpperBound = @PageLowerBound + @PageSize + 1

/*
Note: temp tables use the server default for collation not the database default
so if adding character columns be sure and specify to use the database collation like this
to avoid collation errors:

CREATE TABLE #PageIndexForUsers
(
IndexID int IDENTITY (1, 1) NOT NULL,
UserName nvarchar(50) COLLATE DATABASE_DEFAULT,
LoginName nvarchar(50) COLLATE DATABASE_DEFAULT
) 


*/

CREATE TABLE #PageIndex 
(
	IndexID int IDENTITY (1, 1) NOT NULL,
SoPhieuBan Int
)

BEGIN

INSERT INTO #PageIndex ( 
SoPhieuBan
)

SELECT
		[SoPhieuBan]
		
FROM
		[dbo].[PhieuBan]
		
-- WHERE

-- ORDER BY

END


SELECT
		t1.*
		
FROM
		[dbo].[PhieuBan] t1

JOIN			#PageIndex t2
ON			
		t1.[SoPhieuBan] = t2.[SoPhieuBan]
		
WHERE
		t2.IndexID > @PageLowerBound 
		AND t2.IndexID < @PageUpperBound
		
ORDER BY t2.IndexID

DROP TABLE #PageIndex



GO
/****** Object:  StoredProcedure [dbo].[PhieuBan_Update]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO


CREATE PROCEDURE [dbo].[PhieuBan_Update]

/*
Author:   			Huynh_Anh_Nhat
Created: 			2016-1-1
Last Modified: 		2016-1-1
*/
	
@SoPhieuBan int, 

@MaKH nvarchar(50)


-- WITH ENCRYPTION
AS

UPDATE 		[dbo].[PhieuBan] 

SET
			
			[MaKH] = @MaKH
		
			
			
WHERE
			[SoPhieuBan] = @SoPhieuBan



GO
/****** Object:  StoredProcedure [dbo].[PhieuMuon]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO


CREATE PROCEDURE [dbo].[PhieuMuon]

@key nvarchar(50)
-- WITH ENCRYPTION
AS

select * from PhieuThue inner join NhanVien on NhanVien.MaNhanVien = PhieuThue.MaNV

inner join ThanhVien on ThanhVien.MaThanhVien = PhieuThue.MaKH



GO
/****** Object:  StoredProcedure [dbo].[PhieuMuonSelectOne]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO


Create PROCEDURE [dbo].[PhieuMuonSelectOne]

@key int
-- WITH ENCRYPTION
AS

select * from PhieuThue inner join NhanVien on NhanVien.MaNhanVien = PhieuThue.MaNV

inner join ThanhVien on ThanhVien.MaThanhVien = PhieuThue.MaKH

where SoPhieuThue = @key

GO
/****** Object:  StoredProcedure [dbo].[TraDia]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO


Create PROCEDURE [dbo].[TraDia]

@soPhieu int
-- WITH ENCRYPTION
AS

INSERT INTO PhieuTra(SoPhieuTra, NgayTra,MaPhieuThue,MaNV,TrangThai)
SELECT SoPhieuThue,GETDATE(),SoPhieuThue,MaNV,1 from PhieuThue where SoPhieuThue = @soPhieu

insert into CTPhieuTra(MaDia,MaPhieuTra) select MaDia ,SoPhieuThue from  CTPhieuThue where SoPhieuThue = @soPhieu

GO
/****** Object:  StoredProcedure [dbo].[TrangThai]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO


CREATE PROCEDURE [dbo].[TrangThai]

@MaPhieu int
-- WITH ENCRYPTION
AS

select count(*) [SoLuong] from PhieuTra where MaPhieuThue = @MaPhieu



GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[MaChucVu] [nvarchar](50) NOT NULL,
	[TenChucVu] [nvarchar](50) NULL,
	[GhiChu] [text] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaChucVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[CTPhieuBan]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTPhieuBan](
	[SoPhieuBan] [int] NOT NULL,
	[MaDia] [int] NOT NULL,
	[SoLuong] [int] NULL,
 CONSTRAINT [PK_BanDia] PRIMARY KEY CLUSTERED 
(
	[SoPhieuBan] ASC,
	[MaDia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[CTPhieuNhap]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTPhieuNhap](
	[SoPhieuNhap] [int] NOT NULL,
	[MaDia] [int] NOT NULL,
	[SoLuong] [int] NULL,
	[DonGia] [decimal](18, 0) NULL,
 CONSTRAINT [PK_NhapDia_1] PRIMARY KEY CLUSTERED 
(
	[SoPhieuNhap] ASC,
	[MaDia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[CTPhieuThue]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTPhieuThue](
	[SoPhieuThue] [int] NOT NULL,
	[MaDia] [int] NOT NULL,
	[GiaThue] [decimal](18, 0) NULL,
	[SoLuong] [int] NULL,
 CONSTRAINT [PK_ThueDia] PRIMARY KEY CLUSTERED 
(
	[SoPhieuThue] ASC,
	[MaDia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[CTPhieuTra]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTPhieuTra](
	[MaDia] [int] NOT NULL,
	[TienCoc] [decimal](18, 0) NULL,
	[MaPhieuTra] [int] NOT NULL,
 CONSTRAINT [PK_TraDia] PRIMARY KEY CLUSTERED 
(
	[MaDia] ASC,
	[MaPhieuTra] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Dia]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Dia](
	[MaDia] [int] NOT NULL,
	[TenDia] [nvarchar](50) NULL,
	[QuocGia] [nvarchar](50) NULL,
	[DienVienChinh] [nvarchar](50) NULL,
	[SoTap] [int] NULL,
	[MaTheLoai] [int] NULL,
	[DonGiaBan] [decimal](18, 0) NULL,
	[DonGiaMua] [decimal](18, 0) NULL,
	[DonGiaThue] [decimal](18, 0) NULL,
 CONSTRAINT [PK_Dia] PRIMARY KEY CLUSTERED 
(
	[MaDia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiThanhVien]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiThanhVien](
	[MaLoaiThanhVien] [nvarchar](50) NOT NULL,
	[TenLoaiThanhVien] [nvarchar](50) NULL,
	[GhiChu] [text] NULL,
 CONSTRAINT [PK_LoaiThanhVien] PRIMARY KEY CLUSTERED 
(
	[MaLoaiThanhVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[MaNhaCC] [int] NOT NULL,
	[TenNhaCC] [nvarchar](50) NULL,
	[DiaChiNhaCC] [nvarchar](500) NULL,
	[SDTNhaCC] [varchar](12) NULL,
 CONSTRAINT [PK_NhaCungCap] PRIMARY KEY CLUSTERED 
(
	[MaNhaCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaChucVu] [nvarchar](50) NOT NULL,
	[MaNhanVien] [nvarchar](50) NOT NULL,
	[TenNhanVien] [nvarchar](50) NULL,
	[NgaySinh] [smalldatetime] NULL,
	[GioiTinh] [bit] NULL,
	[DiaChi] [nvarchar](100) NULL,
	[SDT] [nvarchar](13) NULL,
	[Email] [nvarchar](50) NULL,
	[GhiChu] [nvarchar](100) NULL,
 CONSTRAINT [PK__NhanVien__77B2CA4715C12799] PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PhieuBan]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuBan](
	[SoPhieuBan] [int] NOT NULL,
	[NgayBan] [smalldatetime] NULL,
	[MaKH] [nvarchar](50) NULL,
	[MaNV] [nvarchar](50) NULL,
	[TrangThai] [bit] NULL,
	[TongTien] [decimal](18, 0) NULL,
 CONSTRAINT [PK_PhieuBan] PRIMARY KEY CLUSTERED 
(
	[SoPhieuBan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PhieuNhap]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhap](
	[SoPhieuNhap] [int] NOT NULL,
	[MaNhaCC] [int] NULL,
	[MaNhanVien] [nvarchar](50) NOT NULL,
	[NgayNhap] [nvarchar](50) NULL,
	[TrangThai] [bit] NULL,
 CONSTRAINT [PK_PhieuNhap] PRIMARY KEY CLUSTERED 
(
	[SoPhieuNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PhieuThue]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuThue](
	[SoPhieuThue] [int] NOT NULL,
	[NgayThue] [nvarchar](50) NULL,
	[MaKH] [nvarchar](50) NULL,
	[MaNV] [nvarchar](50) NULL,
	[TrangThai] [bit] NULL,
	[TongTien] [decimal](18, 0) NULL,
	[SoLuongNgayThue] [int] NULL,
 CONSTRAINT [PK_PhieuThue] PRIMARY KEY CLUSTERED 
(
	[SoPhieuThue] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PhieuTra]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuTra](
	[SoPhieuTra] [int] NOT NULL,
	[NgayTra] [smalldatetime] NULL,
	[MaPhieuThue] [int] NULL,
	[MaNV] [nvarchar](50) NULL,
	[TrangThai] [bit] NULL,
 CONSTRAINT [PK_PhieuTra] PRIMARY KEY CLUSTERED 
(
	[SoPhieuTra] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TaiKhoanNhanVien]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoanNhanVien](
	[MaNhanVien] [nvarchar](50) NOT NULL,
	[MatKhauNhanVien] [nvarchar](50) NULL,
 CONSTRAINT [PK_TaiKhoanNhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TaiKhoanThanhVien]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoanThanhVien](
	[MaThanhVien] [nvarchar](50) NOT NULL,
	[MatKhauThanhVien] [nvarchar](50) NULL,
 CONSTRAINT [PK_TaiKhoanThanhVien] PRIMARY KEY CLUSTERED 
(
	[MaThanhVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ThanhVien]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThanhVien](
	[MaLoaiThanhVien] [nvarchar](50) NULL,
	[MaThanhVien] [nvarchar](50) NOT NULL,
	[TenThanhVien] [nvarchar](50) NULL,
	[NgaySinh] [smalldatetime] NULL,
	[GioiTinh] [bit] NULL,
	[DiaChi] [nvarchar](100) NULL,
	[SDT] [bigint] NULL,
	[Email] [nvarchar](50) NULL,
	[GhiChu] [nvarchar](100) NULL,
 CONSTRAINT [PK__ThanhVie__2BE0A0F057ED662F] PRIMARY KEY CLUSTERED 
(
	[MaThanhVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TheLoai]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TheLoai](
	[MaTheLoai] [int] NOT NULL,
	[TenTheLoai] [nvarchar](50) NULL,
 CONSTRAINT [PK_TheLoai] PRIMARY KEY CLUSTERED 
(
	[MaTheLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  View [dbo].[vchitietdia]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create view [dbo].[vchitietdia]
as
select CTPhieuNhap.SoPhieuNhap, Dia.MaDia, TenDia, TenNhaCC,
	QuocGia, DienVienChinh, SoTap, TenTheLoai
	from Dia, TheLoai, CTPhieuNhap, PhieuNhap, NhaCungCap
	where Dia.MaTheLoai=TheLoai.MaTheLoai
	and Dia.MaDia=CTPhieuNhap.MaDia
	and PhieuNhap.SoPhieuNhap=CTPhieuNhap.SoPhieuNhap
	and PhieuNhap.MaNhaCC=NhaCungCap.MaNhaCC


GO
/****** Object:  View [dbo].[vchitietnhanvien]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create view [dbo].[vchitietnhanvien]
as
select 
	tenchucvu, manhanvien, tennhanvien, ngaysinh, gioitinh, diachi, sdt, email, nhanvien.ghichu from nhanvien, chucvu
	where nhanvien.machucvu=chucvu.machucvu


GO
/****** Object:  View [dbo].[vchitietthanhvien]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create view [dbo].[vchitietthanhvien]
as
select 
	tenloaithanhvien, mathanhvien, tenthanhvien, ngaysinh, gioitinh, diachi, sdt, email, thanhvien.ghichu from thanhvien, loaithanhvien
	where thanhvien.maloaithanhvien=loaithanhvien.maloaithanhvien


GO
/****** Object:  View [dbo].[vmanhanvien_chualap_taikhoan]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create view [dbo].[vmanhanvien_chualap_taikhoan]
as
select
	manhanvien from nhanvien where manhanvien not in (select manhanvien from taikhoannhanvien)


GO
/****** Object:  View [dbo].[vphieunhap]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create view [dbo].[vphieunhap] 
as
select PhieuNhap.SoPhieuNhap,TenNhaCC, TenNhanVien, phieunhap.NgayNhap
		from PhieuNhap,NhaCungCap, NhanVien
		where PhieuNhap.MaNhanVien=NhanVien.MaNhanVien
		and PhieuNhap.MaNhaCC=NhaCungCap.MaNhaCC


GO
/****** Object:  View [dbo].[VPhieuThue]    Script Date: 18/1/2016 22:15:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE view [dbo].[VPhieuThue]
as
select SoPhieuThue, TenThanhVien, TenNhanVien, NgayThue, MaKH, MaNV,SoLuongNgayThue
from PhieuThue, NhanVien, ThanhVien
where ThanhVien.MaThanhVien=PhieuThue.MaKH
and NhanVien.MaNhanVien=PhieuThue.MaNV



GO
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [GhiChu]) VALUES (N'Admin', N'Admin', N'Qu?n lí ngu?i dùng, nhân viên và thành viên.')
GO
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [GhiChu]) VALUES (N'Mana', N'Quản lí sản phẩm', N'Manager')
GO
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [GhiChu]) VALUES (N'NX', N'Nhan vien nhap xuat', N'')
GO
INSERT [dbo].[CTPhieuBan] ([SoPhieuBan], [MaDia], [SoLuong]) VALUES (1, 1, 5)
GO
INSERT [dbo].[CTPhieuBan] ([SoPhieuBan], [MaDia], [SoLuong]) VALUES (2, 1, 32)
GO
INSERT [dbo].[CTPhieuBan] ([SoPhieuBan], [MaDia], [SoLuong]) VALUES (2, 2, 9)
GO
INSERT [dbo].[CTPhieuBan] ([SoPhieuBan], [MaDia], [SoLuong]) VALUES (2, 3, 8)
GO
INSERT [dbo].[CTPhieuBan] ([SoPhieuBan], [MaDia], [SoLuong]) VALUES (3, 1, 6)
GO
INSERT [dbo].[CTPhieuBan] ([SoPhieuBan], [MaDia], [SoLuong]) VALUES (3, 2, 20)
GO
INSERT [dbo].[CTPhieuBan] ([SoPhieuBan], [MaDia], [SoLuong]) VALUES (3, 3, 36)
GO
INSERT [dbo].[CTPhieuBan] ([SoPhieuBan], [MaDia], [SoLuong]) VALUES (4, 1, 30)
GO
INSERT [dbo].[CTPhieuBan] ([SoPhieuBan], [MaDia], [SoLuong]) VALUES (4, 2, 11)
GO
INSERT [dbo].[CTPhieuBan] ([SoPhieuBan], [MaDia], [SoLuong]) VALUES (5, 1, 5)
GO
INSERT [dbo].[CTPhieuBan] ([SoPhieuBan], [MaDia], [SoLuong]) VALUES (6, 1, 6)
GO
INSERT [dbo].[CTPhieuBan] ([SoPhieuBan], [MaDia], [SoLuong]) VALUES (6, 2, 5)
GO
INSERT [dbo].[CTPhieuNhap] ([SoPhieuNhap], [MaDia], [SoLuong], [DonGia]) VALUES (1, 4, 9, CAST(1 AS Decimal(18, 0)))
GO
INSERT [dbo].[CTPhieuNhap] ([SoPhieuNhap], [MaDia], [SoLuong], [DonGia]) VALUES (1, 8, 13, CAST(1 AS Decimal(18, 0)))
GO
INSERT [dbo].[CTPhieuNhap] ([SoPhieuNhap], [MaDia], [SoLuong], [DonGia]) VALUES (2, 1, 75, CAST(1 AS Decimal(18, 0)))
GO
INSERT [dbo].[CTPhieuNhap] ([SoPhieuNhap], [MaDia], [SoLuong], [DonGia]) VALUES (2, 2, 8, CAST(1 AS Decimal(18, 0)))
GO
INSERT [dbo].[CTPhieuNhap] ([SoPhieuNhap], [MaDia], [SoLuong], [DonGia]) VALUES (3, 2, 7, CAST(1 AS Decimal(18, 0)))
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (1, 4, NULL, 3)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (1, 5, NULL, 4)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (2, 1, CAST(5 AS Decimal(18, 0)), 15)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (2, 2, NULL, 2)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (2, 3, NULL, 10)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (2, 4, NULL, 2)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (2, 5, NULL, 2)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (2, 6, NULL, 5)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (2, 7, NULL, 2)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (2, 8, NULL, 2)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (2, 9, NULL, 8)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (3, 1, CAST(6 AS Decimal(18, 0)), 1)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (3, 2, CAST(12 AS Decimal(18, 0)), 39)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (4, 1, CAST(2 AS Decimal(18, 0)), 16)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (4, 4, CAST(2 AS Decimal(18, 0)), 9)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (5, 1, CAST(5 AS Decimal(18, 0)), 20)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (5, 2, NULL, 1)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (5, 4, CAST(6 AS Decimal(18, 0)), 11)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (5, 5, CAST(3 AS Decimal(18, 0)), 14)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (12, 1, NULL, 4)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (12, 2, NULL, 4)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (12, 3, NULL, 4)
GO
INSERT [dbo].[CTPhieuThue] ([SoPhieuThue], [MaDia], [GiaThue], [SoLuong]) VALUES (12, 4, NULL, 4)
GO
INSERT [dbo].[CTPhieuTra] ([MaDia], [TienCoc], [MaPhieuTra]) VALUES (1, NULL, 3)
GO
INSERT [dbo].[CTPhieuTra] ([MaDia], [TienCoc], [MaPhieuTra]) VALUES (1, NULL, 4)
GO
INSERT [dbo].[CTPhieuTra] ([MaDia], [TienCoc], [MaPhieuTra]) VALUES (1, NULL, 12)
GO
INSERT [dbo].[CTPhieuTra] ([MaDia], [TienCoc], [MaPhieuTra]) VALUES (2, NULL, 3)
GO
INSERT [dbo].[CTPhieuTra] ([MaDia], [TienCoc], [MaPhieuTra]) VALUES (2, NULL, 12)
GO
INSERT [dbo].[CTPhieuTra] ([MaDia], [TienCoc], [MaPhieuTra]) VALUES (3, NULL, 12)
GO
INSERT [dbo].[CTPhieuTra] ([MaDia], [TienCoc], [MaPhieuTra]) VALUES (4, NULL, 4)
GO
INSERT [dbo].[CTPhieuTra] ([MaDia], [TienCoc], [MaPhieuTra]) VALUES (4, NULL, 5)
GO
INSERT [dbo].[CTPhieuTra] ([MaDia], [TienCoc], [MaPhieuTra]) VALUES (4, NULL, 12)
GO
INSERT [dbo].[CTPhieuTra] ([MaDia], [TienCoc], [MaPhieuTra]) VALUES (5, NULL, 5)
GO
INSERT [dbo].[Dia] ([MaDia], [TenDia], [QuocGia], [DienVienChinh], [SoTap], [MaTheLoai], [DonGiaBan], [DonGiaMua], [DonGiaThue]) VALUES (1, N'Tây Du Ký', N'Nhật Bản', N'Mèo Máy', 247, 1, CAST(5000 AS Decimal(18, 0)), CAST(4000 AS Decimal(18, 0)), CAST(2000 AS Decimal(18, 0)))
GO
INSERT [dbo].[Dia] ([MaDia], [TenDia], [QuocGia], [DienVienChinh], [SoTap], [MaTheLoai], [DonGiaBan], [DonGiaMua], [DonGiaThue]) VALUES (2, N'Thám Tử Lừng Danh', N'Nhật Bản', N'Mèo Máy', 245, 1, CAST(7000 AS Decimal(18, 0)), CAST(6000 AS Decimal(18, 0)), CAST(3000 AS Decimal(18, 0)))
GO
INSERT [dbo].[Dia] ([MaDia], [TenDia], [QuocGia], [DienVienChinh], [SoTap], [MaTheLoai], [DonGiaBan], [DonGiaMua], [DonGiaThue]) VALUES (3, N'Nhạc Cải Lương', N'Việt Nam', N'Bạch Tuyết', 12, 1, CAST(8000 AS Decimal(18, 0)), CAST(7000 AS Decimal(18, 0)), CAST(5000 AS Decimal(18, 0)))
GO
INSERT [dbo].[Dia] ([MaDia], [TenDia], [QuocGia], [DienVienChinh], [SoTap], [MaTheLoai], [DonGiaBan], [DonGiaMua], [DonGiaThue]) VALUES (4, N'Thần Điêu Đại Hiệp', N'Trong Quốc', N'Dương Hóa', 54, 1, CAST(34000 AS Decimal(18, 0)), CAST(3000 AS Decimal(18, 0)), CAST(5000 AS Decimal(18, 0)))
GO
INSERT [dbo].[Dia] ([MaDia], [TenDia], [QuocGia], [DienVienChinh], [SoTap], [MaTheLoai], [DonGiaBan], [DonGiaMua], [DonGiaThue]) VALUES (5, N'Cô Tiên Xanh', N'Trung Quốc', N'Duong Hóa', 54, 1, CAST(34000 AS Decimal(18, 0)), CAST(34000 AS Decimal(18, 0)), CAST(34000 AS Decimal(18, 0)))
GO
INSERT [dbo].[Dia] ([MaDia], [TenDia], [QuocGia], [DienVienChinh], [SoTap], [MaTheLoai], [DonGiaBan], [DonGiaMua], [DonGiaThue]) VALUES (6, N'Thần Điêu Đại Hiệp 2', N'VN', N'Dương Hóa', 54, 1, CAST(34000 AS Decimal(18, 0)), CAST(3000 AS Decimal(18, 0)), CAST(5000 AS Decimal(18, 0)))
GO
INSERT [dbo].[Dia] ([MaDia], [TenDia], [QuocGia], [DienVienChinh], [SoTap], [MaTheLoai], [DonGiaBan], [DonGiaMua], [DonGiaThue]) VALUES (7, N'Doremon', N'VN', N'Dương Hóa', 54, 1, CAST(34000 AS Decimal(18, 0)), CAST(3000 AS Decimal(18, 0)), CAST(5000 AS Decimal(18, 0)))
GO
INSERT [dbo].[Dia] ([MaDia], [TenDia], [QuocGia], [DienVienChinh], [SoTap], [MaTheLoai], [DonGiaBan], [DonGiaMua], [DonGiaThue]) VALUES (8, N'Cuộc chiến của các vị thần', N'Trong Quốc', N'Dương Hóa', 54, 1, CAST(34000 AS Decimal(18, 0)), CAST(3000 AS Decimal(18, 0)), CAST(5000 AS Decimal(18, 0)))
GO
INSERT [dbo].[Dia] ([MaDia], [TenDia], [QuocGia], [DienVienChinh], [SoTap], [MaTheLoai], [DonGiaBan], [DonGiaMua], [DonGiaThue]) VALUES (9, N'Khủng Long Tốt Bụng', N'Trong Quốc', N'Dương Hóa', 54, 1, CAST(34000 AS Decimal(18, 0)), CAST(3000 AS Decimal(18, 0)), CAST(5000 AS Decimal(18, 0)))
GO
INSERT [dbo].[Dia] ([MaDia], [TenDia], [QuocGia], [DienVienChinh], [SoTap], [MaTheLoai], [DonGiaBan], [DonGiaMua], [DonGiaThue]) VALUES (10, N'Star War', N'USA', N'Ninza Rùa', 1, 1, CAST(78000 AS Decimal(18, 0)), CAST(80000 AS Decimal(18, 0)), CAST(12000 AS Decimal(18, 0)))
GO
INSERT [dbo].[Dia] ([MaDia], [TenDia], [QuocGia], [DienVienChinh], [SoTap], [MaTheLoai], [DonGiaBan], [DonGiaMua], [DonGiaThue]) VALUES (12, N'Toi Thay Hoa VAng Tren Co Xanh', N'Viet Nam', N'âmbc', 1, 1, CAST(250000 AS Decimal(18, 0)), CAST(300000 AS Decimal(18, 0)), CAST(50000 AS Decimal(18, 0)))
GO
INSERT [dbo].[LoaiThanhVien] ([MaLoaiThanhVien], [TenLoaiThanhVien], [GhiChu]) VALUES (N'1', N'Khách Vip', N'Thuong xuyên thuê, và mua dia')
GO
INSERT [dbo].[LoaiThanhVien] ([MaLoaiThanhVien], [TenLoaiThanhVien], [GhiChu]) VALUES (N'2', N'Khách vãng lai', N'Thuong mua')
GO
INSERT [dbo].[NhaCungCap] ([MaNhaCC], [TenNhaCC], [DiaChiNhaCC], [SDTNhaCC]) VALUES (1, N'Paribynight ', N'Pháp', N'0165465934')
GO
INSERT [dbo].[NhaCungCap] ([MaNhaCC], [TenNhaCC], [DiaChiNhaCC], [SDTNhaCC]) VALUES (2, N'Thanh Nien', N'Viet Nam', N'01666890459')
GO
INSERT [dbo].[NhanVien] ([MaChucVu], [MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [DiaChi], [SDT], [Email], [GhiChu]) VALUES (N'NX', N'1', N'Anh Nhat', CAST(0xA4E90000 AS SmallDateTime), 1, N'dsfsdf', N'444', N'dfdsg', N'gsdfsd')
GO
INSERT [dbo].[NhanVien] ([MaChucVu], [MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [DiaChi], [SDT], [Email], [GhiChu]) VALUES (N'Admin', N'Administrator', N'Huynh Thi Thu Hong', CAST(0x83C20000 AS SmallDateTime), 1, N'01654659343', N'HCMC', N'honghtt@i-data.vn', N'Xin chào admin!')
GO
INSERT [dbo].[NhanVien] ([MaChucVu], [MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [DiaChi], [SDT], [Email], [GhiChu]) VALUES (N'Mana', N'Manager', N'Huynh Anh Nhat', CAST(0x00000000 AS SmallDateTime), 1, N'765/71/32 XVNT Phuong 26 Q. Binh Thanh', N'01666890459', N'nhathuyn77@gmail.com', N'^^')
GO
INSERT [dbo].[PhieuBan] ([SoPhieuBan], [NgayBan], [MaKH], [MaNV], [TrangThai], [TongTien]) VALUES (1, CAST(0xA58A0510 AS SmallDateTime), N'1', N'1', 0, CAST(25000 AS Decimal(18, 0)))
GO
INSERT [dbo].[PhieuBan] ([SoPhieuBan], [NgayBan], [MaKH], [MaNV], [TrangThai], [TongTien]) VALUES (2, CAST(0xA58A0510 AS SmallDateTime), N'2', N'manager', 0, CAST(287000 AS Decimal(18, 0)))
GO
INSERT [dbo].[PhieuBan] ([SoPhieuBan], [NgayBan], [MaKH], [MaNV], [TrangThai], [TongTien]) VALUES (3, CAST(0xA58A0510 AS SmallDateTime), N'1', N'manager', 0, CAST(458000 AS Decimal(18, 0)))
GO
INSERT [dbo].[PhieuBan] ([SoPhieuBan], [NgayBan], [MaKH], [MaNV], [TrangThai], [TongTien]) VALUES (4, CAST(0xA58A0510 AS SmallDateTime), N'1', N'manager', 0, CAST(152000 AS Decimal(18, 0)))
GO
INSERT [dbo].[PhieuBan] ([SoPhieuBan], [NgayBan], [MaKH], [MaNV], [TrangThai], [TongTien]) VALUES (5, CAST(0xA58A0510 AS SmallDateTime), N'2', N'manager', 0, CAST(25000 AS Decimal(18, 0)))
GO
INSERT [dbo].[PhieuBan] ([SoPhieuBan], [NgayBan], [MaKH], [MaNV], [TrangThai], [TongTien]) VALUES (6, CAST(0xA58A0510 AS SmallDateTime), N'1', N'manager', 0, CAST(65000 AS Decimal(18, 0)))
GO
INSERT [dbo].[PhieuNhap] ([SoPhieuNhap], [MaNhaCC], [MaNhanVien], [NgayNhap], [TrangThai]) VALUES (1, 1, N'1', N'12:27:52 15/01/2016', NULL)
GO
INSERT [dbo].[PhieuNhap] ([SoPhieuNhap], [MaNhaCC], [MaNhanVien], [NgayNhap], [TrangThai]) VALUES (2, 2, N'1', N'20/11/2015', NULL)
GO
INSERT [dbo].[PhieuNhap] ([SoPhieuNhap], [MaNhaCC], [MaNhanVien], [NgayNhap], [TrangThai]) VALUES (3, 1, N'1', N'20/11/2015', NULL)
GO
INSERT [dbo].[PhieuThue] ([SoPhieuThue], [NgayThue], [MaKH], [MaNV], [TrangThai], [TongTien], [SoLuongNgayThue]) VALUES (1, N'Jan 11 2016  9:35PM', N'1', N'Manager', 1, CAST(161000 AS Decimal(18, 0)), 1)
GO
INSERT [dbo].[PhieuThue] ([SoPhieuThue], [NgayThue], [MaKH], [MaNV], [TrangThai], [TongTien], [SoLuongNgayThue]) VALUES (2, N'Jan 11 2016  9:35PM', N'1', N'Manager', 1, CAST(498000 AS Decimal(18, 0)), 4)
GO
INSERT [dbo].[PhieuThue] ([SoPhieuThue], [NgayThue], [MaKH], [MaNV], [TrangThai], [TongTien], [SoLuongNgayThue]) VALUES (3, N'Jan 11 2016  9:35PM', N'1', N'Manager', 1, CAST(357000 AS Decimal(18, 0)), 4)
GO
INSERT [dbo].[PhieuThue] ([SoPhieuThue], [NgayThue], [MaKH], [MaNV], [TrangThai], [TongTien], [SoLuongNgayThue]) VALUES (4, N'Jan 11 2016  9:35PM', N'1', N'manager', 1, CAST(308000 AS Decimal(18, 0)), 4)
GO
INSERT [dbo].[PhieuThue] ([SoPhieuThue], [NgayThue], [MaKH], [MaNV], [TrangThai], [TongTien], [SoLuongNgayThue]) VALUES (5, N'Jan 11 2016  9:35PM', N'1', N'manager', 1, CAST(1722000 AS Decimal(18, 0)), 3)
GO
INSERT [dbo].[PhieuThue] ([SoPhieuThue], [NgayThue], [MaKH], [MaNV], [TrangThai], [TongTien], [SoLuongNgayThue]) VALUES (12, N'Jan 11 2016  9:35PM', N'2', N'manager', 1, CAST(120000 AS Decimal(18, 0)), 2)
GO
INSERT [dbo].[PhieuThue] ([SoPhieuThue], [NgayThue], [MaKH], [MaNV], [TrangThai], [TongTien], [SoLuongNgayThue]) VALUES (13, N'Jan 11 2016  9:35PM', N'2', N'manager', NULL, NULL, 3)
GO
INSERT [dbo].[PhieuTra] ([SoPhieuTra], [NgayTra], [MaPhieuThue], [MaNV], [TrangThai]) VALUES (3, CAST(0xA5880028 AS SmallDateTime), 3, N'Manager', 1)
GO
INSERT [dbo].[PhieuTra] ([SoPhieuTra], [NgayTra], [MaPhieuThue], [MaNV], [TrangThai]) VALUES (4, CAST(0xA5880028 AS SmallDateTime), 4, N'manager', 1)
GO
INSERT [dbo].[PhieuTra] ([SoPhieuTra], [NgayTra], [MaPhieuThue], [MaNV], [TrangThai]) VALUES (5, CAST(0xA5870596 AS SmallDateTime), 5, N'manager', 1)
GO
INSERT [dbo].[PhieuTra] ([SoPhieuTra], [NgayTra], [MaPhieuThue], [MaNV], [TrangThai]) VALUES (12, CAST(0xA58A04D5 AS SmallDateTime), 12, N'manager', 1)
GO
INSERT [dbo].[TaiKhoanNhanVien] ([MaNhanVien], [MatKhauNhanVien]) VALUES (N'Administrator', N'e10adc3949ba59abbe56e057f20f883e')
GO
INSERT [dbo].[TaiKhoanNhanVien] ([MaNhanVien], [MatKhauNhanVien]) VALUES (N'Manager', N'e10adc3949ba59abbe56e057f20f883e')
GO
INSERT [dbo].[ThanhVien] ([MaLoaiThanhVien], [MaThanhVien], [TenThanhVien], [NgaySinh], [GioiTinh], [DiaChi], [SDT], [Email], [GhiChu]) VALUES (N'1', N'1', N'Huỳnh Anh Nhật', CAST(0x87330000 AS SmallDateTime), 1, N'Bình thạnh', 1654659343, N'nhathuynh77@gmail.com', NULL)
GO
INSERT [dbo].[ThanhVien] ([MaLoaiThanhVien], [MaThanhVien], [TenThanhVien], [NgaySinh], [GioiTinh], [DiaChi], [SDT], [Email], [GhiChu]) VALUES (N'1', N'2', N'Huỳnh Thị Thu Hồng', CAST(0x863E0000 AS SmallDateTime), 0, N'Bình Định', 166689034, N'thuhong@gmail.com', NULL)
GO
INSERT [dbo].[TheLoai] ([MaTheLoai], [TenTheLoai]) VALUES (1, N'Phim Trinh Tham')
GO
INSERT [dbo].[TheLoai] ([MaTheLoai], [TenTheLoai]) VALUES (4, N'Phim Kiem Hiep')
GO
INSERT [dbo].[TheLoai] ([MaTheLoai], [TenTheLoai]) VALUES (5, N'Phim Ma Thai Lan')
GO
ALTER TABLE [dbo].[CTPhieuBan]  WITH CHECK ADD  CONSTRAINT [FK_BanDia_Dia] FOREIGN KEY([MaDia])
REFERENCES [dbo].[Dia] ([MaDia])
GO
ALTER TABLE [dbo].[CTPhieuBan] CHECK CONSTRAINT [FK_BanDia_Dia]
GO
ALTER TABLE [dbo].[CTPhieuBan]  WITH CHECK ADD  CONSTRAINT [FK_BanDia_PhieuBan] FOREIGN KEY([SoPhieuBan])
REFERENCES [dbo].[PhieuBan] ([SoPhieuBan])
GO
ALTER TABLE [dbo].[CTPhieuBan] CHECK CONSTRAINT [FK_BanDia_PhieuBan]
GO
ALTER TABLE [dbo].[CTPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_NhapDia_Dia] FOREIGN KEY([MaDia])
REFERENCES [dbo].[Dia] ([MaDia])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[CTPhieuNhap] CHECK CONSTRAINT [FK_NhapDia_Dia]
GO
ALTER TABLE [dbo].[CTPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_NhapDia_PhieuNhap] FOREIGN KEY([SoPhieuNhap])
REFERENCES [dbo].[PhieuNhap] ([SoPhieuNhap])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[CTPhieuNhap] CHECK CONSTRAINT [FK_NhapDia_PhieuNhap]
GO
ALTER TABLE [dbo].[CTPhieuThue]  WITH CHECK ADD  CONSTRAINT [FK_ThueDia_Dia] FOREIGN KEY([MaDia])
REFERENCES [dbo].[Dia] ([MaDia])
GO
ALTER TABLE [dbo].[CTPhieuThue] CHECK CONSTRAINT [FK_ThueDia_Dia]
GO
ALTER TABLE [dbo].[CTPhieuThue]  WITH CHECK ADD  CONSTRAINT [FK_ThueDia_PhieuThue] FOREIGN KEY([SoPhieuThue])
REFERENCES [dbo].[PhieuThue] ([SoPhieuThue])
GO
ALTER TABLE [dbo].[CTPhieuThue] CHECK CONSTRAINT [FK_ThueDia_PhieuThue]
GO
ALTER TABLE [dbo].[CTPhieuTra]  WITH CHECK ADD  CONSTRAINT [FK_TraDia_Dia] FOREIGN KEY([MaDia])
REFERENCES [dbo].[Dia] ([MaDia])
GO
ALTER TABLE [dbo].[CTPhieuTra] CHECK CONSTRAINT [FK_TraDia_Dia]
GO
ALTER TABLE [dbo].[CTPhieuTra]  WITH CHECK ADD  CONSTRAINT [FK_TraDia_PhieuTra] FOREIGN KEY([MaPhieuTra])
REFERENCES [dbo].[PhieuTra] ([SoPhieuTra])
GO
ALTER TABLE [dbo].[CTPhieuTra] CHECK CONSTRAINT [FK_TraDia_PhieuTra]
GO
ALTER TABLE [dbo].[Dia]  WITH CHECK ADD  CONSTRAINT [FK_Dia_TheLoai] FOREIGN KEY([MaTheLoai])
REFERENCES [dbo].[TheLoai] ([MaTheLoai])
GO
ALTER TABLE [dbo].[Dia] CHECK CONSTRAINT [FK_Dia_TheLoai]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK__NhanVien__MaChuc__38996AB5] FOREIGN KEY([MaChucVu])
REFERENCES [dbo].[ChucVu] ([MaChucVu])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK__NhanVien__MaChuc__38996AB5]
GO
ALTER TABLE [dbo].[PhieuBan]  WITH CHECK ADD  CONSTRAINT [FK_PhieuBan_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[PhieuBan] CHECK CONSTRAINT [FK_PhieuBan_NhanVien]
GO
ALTER TABLE [dbo].[PhieuBan]  WITH CHECK ADD  CONSTRAINT [FK_PhieuBan_ThanhVien] FOREIGN KEY([MaKH])
REFERENCES [dbo].[ThanhVien] ([MaThanhVien])
GO
ALTER TABLE [dbo].[PhieuBan] CHECK CONSTRAINT [FK_PhieuBan_ThanhVien]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_NhaCungCap] FOREIGN KEY([MaNhaCC])
REFERENCES [dbo].[NhaCungCap] ([MaNhaCC])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_NhaCungCap]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_NhanVien]
GO
ALTER TABLE [dbo].[PhieuThue]  WITH CHECK ADD  CONSTRAINT [FK_PhieuThue_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[PhieuThue] CHECK CONSTRAINT [FK_PhieuThue_NhanVien]
GO
ALTER TABLE [dbo].[PhieuThue]  WITH CHECK ADD  CONSTRAINT [FK_PhieuThue_ThanhVien] FOREIGN KEY([MaKH])
REFERENCES [dbo].[ThanhVien] ([MaThanhVien])
GO
ALTER TABLE [dbo].[PhieuThue] CHECK CONSTRAINT [FK_PhieuThue_ThanhVien]
GO
ALTER TABLE [dbo].[PhieuTra]  WITH CHECK ADD  CONSTRAINT [FK_PhieuTra_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[PhieuTra] CHECK CONSTRAINT [FK_PhieuTra_NhanVien]
GO
ALTER TABLE [dbo].[PhieuTra]  WITH CHECK ADD  CONSTRAINT [FK_PhieuTra_PhieuThue] FOREIGN KEY([MaPhieuThue])
REFERENCES [dbo].[PhieuThue] ([SoPhieuThue])
GO
ALTER TABLE [dbo].[PhieuTra] CHECK CONSTRAINT [FK_PhieuTra_PhieuThue]
GO
ALTER TABLE [dbo].[TaiKhoanNhanVien]  WITH CHECK ADD  CONSTRAINT [FK__TaiKhoanN__MaNha__33D4B598] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[TaiKhoanNhanVien] CHECK CONSTRAINT [FK__TaiKhoanN__MaNha__33D4B598]
GO
ALTER TABLE [dbo].[TaiKhoanThanhVien]  WITH CHECK ADD  CONSTRAINT [FK__TaiKhoanT__MaTha__3A81B327] FOREIGN KEY([MaThanhVien])
REFERENCES [dbo].[ThanhVien] ([MaThanhVien])
GO
ALTER TABLE [dbo].[TaiKhoanThanhVien] CHECK CONSTRAINT [FK__TaiKhoanT__MaTha__3A81B327]
GO
ALTER TABLE [dbo].[ThanhVien]  WITH CHECK ADD  CONSTRAINT [FK__ThanhVien__MaLoa__6754599E] FOREIGN KEY([MaLoaiThanhVien])
REFERENCES [dbo].[LoaiThanhVien] ([MaLoaiThanhVien])
GO
ALTER TABLE [dbo].[ThanhVien] CHECK CONSTRAINT [FK__ThanhVien__MaLoa__6754599E]
GO
ALTER TABLE [dbo].[ChucVu]  WITH CHECK ADD  CONSTRAINT [CK_MaChucVu_MUST_NOT_EMPTY] CHECK  (([MaChucVu]<>''))
GO
ALTER TABLE [dbo].[ChucVu] CHECK CONSTRAINT [CK_MaChucVu_MUST_NOT_EMPTY]
GO
