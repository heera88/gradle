plugins {
    scala
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.12.1")
}

// tag::zinc-dependency[]
dependencies {
    zinc("org.scala-sbt:zinc_2.12:1.2.1")
}
// end::zinc-dependency[]
