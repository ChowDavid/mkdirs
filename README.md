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
	java -jar mkdirs.jar /folderA
```
multi folder creation with admin access

```
	sudo java -jar mkdirs.jar /folderA /folderB /folderC
```