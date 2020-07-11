plugins {
    `java-library`
    groovy
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.apache.cxf:cxf-rt-ws-security:3.2.11")
    testImplementation("org.codehaus.groovy:groovy-all:2.5.11")
    testImplementation("org.spockframework:spock-core:1.3-groovy-2.5")
    testImplementation("junit:junit:4.13")
}
