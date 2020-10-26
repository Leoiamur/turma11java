delete from matriculados
where id_curso = '2';

select * from matriculados;

#DELETAR VÁRIOS POR VEZ
delete from matriculados
where carga = '40';

#COMANDO DA MORTE
truncate table matriculados;