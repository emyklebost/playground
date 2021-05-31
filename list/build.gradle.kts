/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("playground.kotlin-library-conventions")
}

val ktorVersion = "1.6.0"
val ktor2Version = "1.5.4"

dependencies {
    implementation("io.ktor:ktor-server-netty:${ktorVersion}")
    implementation("io.ktor:ktor-metrics-micrometer:$ktor2Version")
    implementation("org.apache.kafka:kafka-clients:2.6.0")
}
