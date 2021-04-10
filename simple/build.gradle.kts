plugins {
    kotlin("jvm") version "1.4.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("ca.uhn.hapi.fhir:hapi-fhir-structures-r4:5.3.0")
}