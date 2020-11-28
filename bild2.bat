@echo off
chcp utf-16
SET ROOT=.
SET SRC=%ROOT%/src
SET OUT=%ROOT%/out

mkdir jar

SET MAIN=%SRC%/com/academy/telesens/lesson_01/task_01/Demo2.java

SET BUILD_DIR=%ROOT%/jar
SET BUILD_NAME=Demo2

SET MAIN_CLASS=com.academy.telesens.lesson_01.task_01.Demo2
SET ARGS=

echo "compiling..."
javac -cp "%SRC%" -d %OUT% %MAIN%
echo "=> compiled"
echo.
echo "packaging"
jar -cf %BUILD_DIR%/%BUILD_NAME%.jar -C %OUT% .
echo "=> packaged"

echo "starting..."
java -cp "%BUILD_DIR%/*"  %MAIN_CLASS% %ARGS%
echo "=> finished"