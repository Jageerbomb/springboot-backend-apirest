
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

---

## Soluciones 
### Mac
#### *ERROR 2002 (HY000): Can't connect to local MySQL server through socket '/tmp/mysql.sock' (2)*
Es probable que sea necesario actualizar la version de MySQL y volver a conectar la base de datos.
Ejecutaremos los siguientes comandos:

- Descargar la version de MySQL reciente
> brew install mysql

- Reiniciar servicios MySQL
> brew services restart mysql

- Conectar con base de datos MySQL
> mysql -u root -p