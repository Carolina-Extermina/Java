USE [Projeto]
ALTER TABLE [dbo].[Paciente] REBUILD PARTITION = ALL
WITH
(DATA_COMPRESSION = NONE
)

SELECT *FROM Paciente