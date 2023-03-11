plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
    maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    implementation("com.javiersc.semver:semver-gradle-plugin:0.4.0-SNAPSHOT")
}
