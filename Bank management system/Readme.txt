This folder contains Bank management system desktop project made in java with eclipse Ide.
This project uses concepts of 
                           -> Java
                           -> Swing designer
                           -> Database management system
                           -> Basic banking process etc.

Database use - MySQL

Steps for testing. 
Step 1.) Download and install MySql database.
Step 2.) Create a database with the name bankproject.
Step 3.)Login details used
         host name  - localhost
         User       - root
         Password   - 12345
         Port       - 3306
         database name - bankproject
         table name - bankdata
         
Step 4.) Create table in database with the name as bankdata and description as shown below.

mysql> use bankproject;
Database changed

 mysql> desc bankdata;
+-----------------+--------------+------+-----+---------+-------+
| Field           | Type         | Null | Key | Default | Extra |
+-----------------+--------------+------+-----+---------+-------+
| account_no      | int          | YES  |     | NULL    |       |
| name            | varchar(200) | YES  |     | NULL    |       |
| father_name     | varchar(200) | YES  |     | NULL    |       |
| address         | varchar(200) | YES  |     | NULL    |       |
| gender          | varchar(15)  | YES  |     | NULL    |       |
| account_type    | varchar(20)  | YES  |     | NULL    |       |
| account_balance | int          | YES  |     | NULL    |       |
+-----------------+--------------+------+-----+---------+-------+ 
Step 5.) Run .exe or .jar file of the project.

Step 6.) Desktop application login details
             username - admin
             password - 123
