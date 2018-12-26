import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("kotlin-platform-jvm")
}

apply {
    plugin("war")
    plugin("kotlin")
    plugin("kotlin-kapt")
}

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }
}

dependencies {
    "implementation"("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    "implementation"("com.querydsl:querydsl-jpa:4.2.1")
    "kapt"("com.querydsl:querydsl-apt:4.2.1:jpa")

    "expectedBy"(project(":common"))
}
