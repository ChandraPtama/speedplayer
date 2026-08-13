# SpeedPlayer - Build via GitHub Actions

## 1. Create a GitHub repository
Create a new repository, then upload all files/folders in this project.

Important: upload the `.github` folder too.

## 2. Push/commit to main or master
The workflow starts automatically after a push to `main` or `master`.
You can also run it manually:
GitHub repository -> Actions -> Build SpeedPlayer -> Run workflow.

## 3. Download the JAR
After the workflow finishes successfully:
Actions -> Build SpeedPlayer -> click the successful run -> Artifacts -> SpeedPlayer-1.0.0

The downloaded artifact contains:
SpeedPlayer-1.0.0.jar

## 4. Install on Paper
Copy the JAR into:
server/plugins/

Restart the Paper server.

The workflow uses JDK 25 and Gradle, matching the Paper 26.2 development setup.
