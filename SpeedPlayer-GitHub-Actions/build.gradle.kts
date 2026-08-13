plugins {
    java
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.21"
}

group = "id.speedplayer"
version = "1.0.0"

repositories {
    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    paperweight.paperDevBundle("26.2.build.87-stable")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(25))
}

tasks.jar {
    archiveBaseName.set("SpeedPlayer")
}
