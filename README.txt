IMPORTANT NOTICE: you must have JDK8 installed on your system, otherwise .jar files wont run.

Testing.jar runs all test suites while CreateBooking.jar lets you create a booking with user input.

To run the jar files: 

Windows/MAC 
	 command-line/terminal navigate to the folder where jar is located
	 java -jar Testing.jar
	 java -jar CreateBooking.jar

We have two separate source code folders for mac and windows because default installation on mac does not you require to create password for root user and we keep in empty. However, on windows you are required to create a password and we keep it same as username, root. So to keep things safe we decided to create both without password(MAC) and with password, so you can choose either you want.

1. Download and install MySql workbench for your operating system from http://dev.mysql.com/downloads/workbench/

2. Download and install Mysql Community server for your operating system http://dev.mysql.com/downloads/mysql/

3. After installations are complete Run MySql workbench

4. Run mysql Server: On windows run from the shell: "C:\Program Files\MySQL\MySQL Server 5.0\bin\mysqld" for default installation directory
	On Mac run from terminal sudo /usr/local/mysql/bin/mysqld_safe

5.Open workbench and click + sign next to MySql Connections  then enter any value for connection name and click OK. 

IMPORTANT:
A.For mac, do not create a password and keep username: root. 
B.On windows, create password:root and username:root.


6.Open your newly created connection and On the  side of the panel navigate to "Data Import/Restore".

7.Choose Import Self-Contained File and navigate to newDb.sql file provided in the folder

8.Next to Default Target Schema click "New" and name it Hms_schema (Importnat: name is case sensitive, so make sure to type name as it appears here!). and click Start Import.
Your database is ready
Run  MDD SUBMIT-MAC.zip on MAC OR MDD SUBMIT.zip on windows
	 