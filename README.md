# SpeedPlayer

Paper 26.2 plugin that displays a player's real-time movement speed in blocks/second using a BossBar at the top of the screen.

## Features

- Paper/Minecraft 26.2
- Java 25
- Real-time speed in blocks/second
- BossBar at the top of the screen
- `/speed` toggles display
- `/speed on` enables it
- `/speed off` disables it
- Normal players can use the command (`speedplayer.use` defaults to true)
- Configurable update interval and color thresholds
- Optional vehicle/spectator filtering

## Build with GitHub Actions

1. Upload the contents of this repository to the root of your GitHub repository.
2. Make sure `.github/workflows/build.yml` exists.
3. Commit to `main` or `master`.
4. Open GitHub -> Actions -> Build SpeedPlayer.
5. Wait for the green successful run.
6. Open the run and download the `SpeedPlayer-1.0.0` artifact.
7. Put `SpeedPlayer-1.0.0.jar` into your Paper server's `plugins` folder.

The workflow installs Java 25 and Gradle automatically, so no Gradle installation is required on your PC.

## Important

This project intentionally uses the Paper API only; it does not use NMS/paperweight because the speedometer feature does not need server internals.

Paper 26.2 requires Java 25.
