@echo off
set /p suiteName="Nhap ten testsuite: "
del ".\src\main\java\org\selenium\automationtest\testsuite\*" /F /Q
echo Thuc hien gent script
java -jar viettel-1.0-SNAPSHOT-jar-with-dependencies.jar ".\testsuite_excel\%suiteName%.xlsx" ".\src\main\java\org\selenium\automationtest\testsuite"
echo Thuc hien chay test
mvn clean install test