object Version {
    const val ktor = "1.5.2"
    const val hapi = "5.2.1"
    const val token_validation = "1.3.3"
    const val junit = "5.7.1"
    const val mock_oauth = "0.3.1"
    const val logback = "1.2.3"
    const val logstash = "6.6"
    const val micrometer_prometheus = "1.6.5"
}
plugins {
    kotlin("jvm") version "1.4.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("ca.uhn.hapi.fhir:hapi-fhir-structures-r4:${Version.hapi}")
    implementation("io.ktor:ktor-client-jackson:${Version.ktor}")
    implementation("io.ktor:ktor-server-netty:${Version.ktor}")
    implementation("no.nav.security:token-validation-ktor:${Version.token_validation}")
    implementation("io.micrometer:micrometer-registry-prometheus:${Version.micrometer_prometheus}")
    implementation("io.ktor:ktor-metrics-micrometer:${Version.ktor}")
    testImplementation("io.ktor:ktor-server-test-host:${Version.ktor}") { exclude(group = "junit", module = "junit") }
    testImplementation("no.nav.security:mock-oauth2-server:${Version.mock_oauth}")
    testImplementation("org.junit.jupiter:junit-jupiter:${Version.junit}")
    runtimeOnly("ca.uhn.hapi.fhir:hapi-fhir-client:${Version.hapi}")
    runtimeOnly("ch.qos.logback:logback-classic:${Version.logback}")
    runtimeOnly("io.ktor:ktor-client-cio:${Version.ktor}")
    runtimeOnly("net.logstash.logback:logstash-logback-encoder:${Version.logstash}")
}