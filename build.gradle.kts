plugins {
    idea
    java
}

group = "daggerok.interview"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
    testImplementation("org.mockito:mockito-junit-jupiter:3.7.7")
    testImplementation("org.assertj:assertj-core:3.19.0")
}

defaultTasks("clean", "test")

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks {
    test {
        useJUnitPlatform()
        testLogging {
            showExceptions = true
            showStandardStreams = true
            events(
                org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED,
                org.gradle.api.tasks.testing.logging.TestLogEvent.SKIPPED,
                org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED
            )
        }
    }
}
