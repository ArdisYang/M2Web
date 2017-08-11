USE [SystemDemo]
GO

/****** Object:  Table [dbo].[Personnel]    Script Date: 2017/8/10 下午 03:54:19 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[Personnel](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[account] [varchar](255) NULL,
	[birthday] [datetime] NULL,
	[createDate] [datetime] NULL,
	[dateOfWork] [datetime] NULL,
	[emergentContactNumber] [varchar](255) NULL,
	[emergentContactPerson] [varchar](255) NULL,
	[gender] [int] NOT NULL,
	[lastModifiedDate] [datetime] NULL,
	[name] [varchar](255) NULL,
	[nationality] [varchar](255) NULL,
	[note] [varchar](255) NULL,
	[password] [varchar](255) NULL,
	[paySystem] [varchar](255) NULL,
	[permissions] [int] NOT NULL,
	[phone] [varchar](255) NULL,
	[position] [varchar](255) NULL,
	[status] [int] NOT NULL,
	[telephone] [varchar](255) NULL,
	[strPosition] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

