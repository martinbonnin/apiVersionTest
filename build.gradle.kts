plugins {
    kotlin("multiplatform").version("1.4.21")
}

group = "me.martin"
version = "1.0-SNAPSHOT"

kotlin {
    jvm()
}

repositories {
    mavenCentral()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>() {
    kotlinOptions {
        jvmTarget = "1.8"
        apiVersion = "1.3"
    }
}

