use [Projeto]
select *from Convenio

insert into Convenio values ( 'Santa Helena')
insert into Convenio values ( 'Amil')
insert into Convenio values ( 'Bradesco')
insert into Convenio values ( 'Porto Seguro')
insert into Convenio values ( 'Intermedica')
insert into Convenio values ( 'Green Line')
insert into Convenio values ( 'Notre Dame')
insert into Convenio values ( 'Bradesco')


select *from Paciente

insert into Paciente values ( 'Carolina Campos', 1, '11-02-1996', 9, 'carol_muniz@gmail.com.br', 'internação')
insert into Paciente values ( 'Stefanie Mendes', 3, '02-05-2000', 7, 'stediadema@hotmail.com.br', 'internação')
insert into Paciente values ( 'Maria Melo', 5, '01-01-2000', 2, 'mariamelo@gmail.com.br', 'alta medica')
insert into Paciente values ( 'Pedro Antonio', 4, '19-05-1994', 3, 'antoniop@yahool.com.br', 'alta medica')
insert into Paciente values ( 'Maicon Jordan', 8, '18-07-1974', 1, 'jordan@gmail.com.br', 'alta medica')

select *from Paciente


SELECT * FROM Convenio

SELECT cd_convenio, nm_convenio  from dbo.Convenio