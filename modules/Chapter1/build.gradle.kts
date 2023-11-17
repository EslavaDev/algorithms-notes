plugins {
    kotlin("jvm") apply true
    application
}

group = "porky.chapter1"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("porky.AppKt")
}