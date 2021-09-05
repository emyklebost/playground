plugins {
    kotlin("jvm") version "1.5.30" apply false
    id("com.github.johnrengelman.shadow") version "7.0.0" apply false
}

subprojects {
    repositories {
        mavenCentral()
    }
}
