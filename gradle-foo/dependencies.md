Output of `dependencies` task

```
docker run --rm -v `pwd`/cache:/root/.gradle -v `pwd`:/w -w /w openjdk:8 ./gradlew dependencies --configuration=compileClasspath
```

````
compileClasspath - Compile classpath for source set 'main'.
\--- org.apache.wss4j:wss4j-ws-security-common:2.2.4
     +--- org.slf4j:slf4j-api:1.7.26
     +--- org.apache.santuario:xmlsec:2.1.4
     |    +--- org.slf4j:slf4j-api:1.7.26
     |    +--- com.fasterxml.woodstox:woodstox-core:5.0.3
     |    |    \--- org.codehaus.woodstox:stax2-api:3.1.4
     |    \--- commons-codec:commons-codec:1.12
     +--- org.opensaml:opensaml-saml-impl:3.3.0
     |    +--- org.opensaml:opensaml-profile-api:3.3.0
     |    |    +--- org.opensaml:opensaml-core:3.3.0
     |    |    |    +--- joda-time:joda-time:2.9
     |    |    |    +--- io.dropwizard.metrics:metrics-core:3.1.2
     |    |    |    |    \--- org.slf4j:slf4j-api:1.7.7 -> 1.7.26
     |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0
     |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    |    |    +--- com.google.code.findbugs:jsr305:3.0.1
     |    |    |    |    +--- com.google.guava:guava:19.0
     |    |    |    |    +--- joda-time:joda-time:2.9
     |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0
     |    |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
     |    |    |    +--- joda-time:joda-time:2.9
     |    |    |    +--- org.apache.httpcomponents:httpclient:4.3.6
     |    |    |    |    +--- org.apache.httpcomponents:httpcore:4.3.3
     |    |    |    |    \--- commons-codec:commons-codec:1.6 -> 1.12
     |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    +--- org.opensaml:opensaml-saml-api:3.3.0
     |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0
     |    |    |    +--- org.opensaml:opensaml-security-api:3.3.0
     |    |    |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
     |    |    |    |    +--- org.apache.santuario:xmlsec:2.0.5 -> 2.1.4 (*)
     |    |    |    |    +--- org.cryptacular:cryptacular:1.1.1
     |    |    |    |    |    \--- org.bouncycastle:bcprov-jdk15on:1.54
     |    |    |    |    +--- org.bouncycastle:bcprov-jdk15on:1.54
     |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    |    +--- org.opensaml:opensaml-soap-api:3.3.0
     |    |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0 (*)
     |    |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0 (*)
     |    |    |    +--- org.apache.httpcomponents:httpclient:4.3.6 (*)
     |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0 (*)
     |    |    +--- org.opensaml:opensaml-profile-api:3.3.0 (*)
     |    |    +--- org.opensaml:opensaml-storage-api:3.3.0
     |    |    |    +--- joda-time:joda-time:2.9
     |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    +--- org.opensaml:opensaml-storage-api:3.3.0 (*)
     |    +--- org.opensaml:opensaml-security-impl:3.3.0
     |    |    +--- org.opensaml:opensaml-security-api:3.3.0 (*)
     |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    +--- org.opensaml:opensaml-xmlsec-impl:3.3.0
     |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0 (*)
     |    |    +--- org.opensaml:opensaml-security-impl:3.3.0 (*)
     |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    +--- org.opensaml:opensaml-soap-impl:3.3.0
     |    |    +--- org.opensaml:opensaml-soap-api:3.3.0 (*)
     |    |    +--- org.opensaml:opensaml-profile-api:3.3.0 (*)
     |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    +--- org.apache.velocity:velocity:1.7
     |    |    +--- commons-collections:commons-collections:3.2.1
     |    |    \--- commons-lang:commons-lang:2.4
     |    +--- org.apache.httpcomponents:httpclient:4.3.6 (*)
     |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     +--- org.opensaml:opensaml-xacml-impl:3.3.0
     |    +--- org.opensaml:opensaml-xacml-api:3.3.0
     |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
     |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     +--- org.opensaml:opensaml-xacml-saml-impl:3.3.0
     |    +--- org.opensaml:opensaml-xacml-saml-api:3.3.0
     |    |    +--- org.opensaml:opensaml-xacml-api:3.3.0 (*)
     |    |    +--- org.opensaml:opensaml-saml-api:3.3.0 (*)
     |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     |    +--- org.opensaml:opensaml-saml-impl:3.3.0 (*)
     |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
     |    +--- commons-codec:commons-codec:1.10 -> 1.12
     |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
     +--- org.jasypt:jasypt:1.9.3
     \--- org.apache.geronimo.javamail:geronimo-javamail_1.4_mail:1.8.4

(*) - dependencies omitted (listed previously)
````
