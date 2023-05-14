This folder contains Employee management system desktop project made in java with eclipse Ide.
This project uses concepts of 
                           -> Java
                           -> Swing designer
                           -> Database management system
                           -> Knowledge of basic processes etc.

Database use - MySQL
Steps for testing. 
Step 1.) Download and install MySql database. 

Step 2.) Create a database with the name employeemanagementproject.

Step 3.)Login details used
         host name  - localhost
         User       - root
         Password   - 12345
         Port       - 3306
         database name - employeemanagementproject
         table name - employeedata
         
Step 4.) Create table in database with the name as employeedata and description as shown below.
mysql> use employeemanagementproject;
Database changed
mysql> desc employeedata;
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| id         | int          | NO   | PRI | NULL    |       |
| name       | varchar(200) | YES  |     | NULL    |       |
| address    | varchar(200) | YES  |     | NULL    |       |
| department | varchar(200) | YES  |     | NULL    |       |
| salary     | int          | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
5 rows in set (0.26 sec)

Step 5.) Run .exe or .Jar file for testing. 

Step 6.) Desktop application login details
             username - admin
             password - 123












