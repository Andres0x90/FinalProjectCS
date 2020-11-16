USE [videotienda]
GO
/****** Object:  Table [dbo].[articulo]    Script Date: 16/11/2020 11:59:02 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[articulo](
	[codigo] [varchar](15) NOT NULL,
	[titulo] [varchar](50) NULL,
	[genero] [varchar](15) NULL,
	[precio] [int] NULL,
	[cantidad] [int] NULL,
	[tipo] [varchar](15) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[cliente]    Script Date: 16/11/2020 11:59:03 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cliente](
	[codigo] [varchar](15) NOT NULL,
	[nombre] [varchar](30) NULL,
	[apellido] [varchar](30) NULL,
	[dir] [varchar](30) NULL,
	[telefono] [varchar](15) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[empleado]    Script Date: 16/11/2020 11:59:03 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[empleado](
	[codigo] [varchar](15) NOT NULL,
	[nombre] [varchar](30) NULL,
	[apellido] [varchar](30) NULL,
	[edad] [int] NULL,
	[telefono] [varchar](15) NULL,
	[pass] [varchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[venta]    Script Date: 16/11/2020 11:59:03 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[venta](
	[cod_emp] [varchar](15) NULL,
	[cod_client] [varchar](15) NULL,
	[cod_art] [varchar](15) NULL,
	[codigo] [int] IDENTITY(1,1) NOT NULL,
	[cantidad] [int] NULL,
	[total] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[venta]  WITH CHECK ADD FOREIGN KEY([cod_art])
REFERENCES [dbo].[articulo] ([codigo])
GO
ALTER TABLE [dbo].[venta]  WITH CHECK ADD FOREIGN KEY([cod_client])
REFERENCES [dbo].[cliente] ([codigo])
GO
ALTER TABLE [dbo].[venta]  WITH CHECK ADD FOREIGN KEY([cod_emp])
REFERENCES [dbo].[empleado] ([codigo])
GO
