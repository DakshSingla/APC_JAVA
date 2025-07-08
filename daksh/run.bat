@echo off
echo ===================================
echo Daksh's Java Module System Demo
echo ===================================

echo.
echo Creating mods directory...
if not exist mods mkdir mods

echo.
echo Compiling com.greeting module...
javac -d mods --module-source-path . com.greeting/module-info.java com.greeting/com/greeting/Greeting.java

echo.
echo Compiling com.app module...
javac -d mods --module-source-path . --module-path mods com.app/module-info.java com.app/com/app/MainApp.java

echo.
echo Running the application...
echo ===================================
java --module-path mods -m com.app/com.app.MainApp

echo.
echo ===================================
echo Compilation and execution complete!
echo ===================================
pause
