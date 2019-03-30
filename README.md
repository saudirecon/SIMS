# SIMS
Student Information Management System

TO RUN THE Application in a linux enviroment: 

Open terminal and type: 
java -jar project.jar

TO RUN THE Application in a Windows enviroment: 

open command line prompt and type:

java -jar project.jar 

# a tool such as SOAPUI is very useful on windows. 
# on linux, you can use curl with the commands below, or you can use burp suite.
# java is requred to run the applicaton. 

curl Commands Instuctions: 

##################### View Students Information  ######################### 


curl http://localhost:8083/student/info


##################### ADD Student ######################### 


curl -d '{ "name": "<name>", "age": <age>,"id":"<id>","gpa": <gpa>}' -H "Content-Type:Application/json" http://localhost:8083/student/regester -X POST

#Example:

curl -d '{ "name": "Saad", "age": 26,"id":"113","gpa":4.0}' -H "Content-Type:Application/json" http://localhost:8083/student/regester -X POST



##################### Update Student Informaiton ######################### 
 
#All inforamtoin can be updated, except the student ID.

curl -d '{ "name": "<name>", "age": <age>,"id":"<cannotBeAltered>","gpa":<gpa>}' -H "Content-Type:Application/json" http://localhost:8083/student/update -X PUT

#Example:

curl -d '{ "name": "saad", "age": 22,"id":"123","gpa":5.0}' -H "Content-Type:Application/json" http://localhost:8083/student/update -X PUT


##################### Delete Student ######################### 


curl http://localhost:8083/student/delete/<id> -X DELETE

#Example:

curl http://localhost:8083/student/delete/113 -X DELETE

