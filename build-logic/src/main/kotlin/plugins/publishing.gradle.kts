package plugins

plugins {
    `maven-publish`
    signing
    id("com.javiersc.semver.gradle.plugin")
}

semver {
    tagPrefix.set("v")
}
