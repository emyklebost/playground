plugins {
    kotlin("jvm") version "1.4.32"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("ca.uhn.hapi.fhir:hapi-fhir-structures-r4:5.2.0")
}