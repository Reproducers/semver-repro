plugins {
    id("java")
}

group = "com.javiersc.semver.repro"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
    maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    implementation("io.github.bric3.fireplace:fireplace-swing:0.0.1-SNAPSHOT")
//    implementation("io.github.bric3.fireplace:fireplace-swing:0.0.1-SNAPSHOT")
//    implementation("io.github.bric3.fireplace:fireplace-swing:0.+")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
