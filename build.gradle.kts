allprojects {
    group = "kapt.bug"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

plugins {
    base
}

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.11")
    }
}

dependencies {
    // Make the root project archives configuration depend on every subproject
    subprojects.forEach {
        archives(it)
    }
}
