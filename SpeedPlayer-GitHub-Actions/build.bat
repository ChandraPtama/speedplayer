@echo off
if not exist gradlew.bat (
  echo Gradle Wrapper belum tersedia.
  echo Install Gradle 8.14+ lalu jalankan: gradle wrapper
  exit /b 1
)
call gradlew.bat build
pause
