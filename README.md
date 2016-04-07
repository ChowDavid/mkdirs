#How to use

##Build
```linux
mvn clean package
cd target
rename the jar file to mkdirs.jar
mv mkdirs-0.0.1-SNAPSHOT.jar mkdirs.jar
```
##Exec
single folder creation

```linux
	java -jar mkdirs.jar /repos/Webappaix31/usr/WebSphere6/AppServer/lib
```
multi folder creation with admin access

```
	sudo java -jar mkdirs.jar /repos/Webappaix31/usr/WebSphere6/AppServer/lib /repos/Webappaix31/usr/WebSphere6/AppServer/java/jre/lib /repos/Webappaix31/repos/admin /repos/Webappaix31/repos/oracle /repos/Webappaix31/repos/tmp /repos/Webappaix31/repos/dbProp /repos/Webappaix31/repos/javaclass /repos/Webappaix31/repos/prop
```