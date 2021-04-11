/*
 * This file was generated by the Gradle 'init' task.
 */

object Version {
    const val hoplite = "1.3.0"
}

plugins {
    id("playground.kotlin-application-conventions")
}

dependencies {
    implementation("io.ktor:ktor-auth:1.5.3")
    implementation("com.sksamuel.hoplite:hoplite-core:${Version.hoplite}")
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("playground.app.AppKt")
}