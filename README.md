
## Instalacion MySQL

- Descargar **MySQL Server Community** (*version completa*):
> https://dev.mysql.com/downloads/windows/installer/

- Seleccionar instalacion Custom 
    - Instalar MySql Server (Servers)
    - Instalar MySql Workbench (Application)
    
### Creacion base de datos
**Importante** agregar variable de entorno de MySQL para poder utilizar comandos en consola

- En consola, abrir conexion con MySQL (pass: sasa):
> mysql -u root -p

- Creamos la base de datos:
> CREATE DATABASE db_springboot_backend;

- Verificamos que este creada la base de datos:
> show databases;

