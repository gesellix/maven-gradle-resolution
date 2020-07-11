# maven-gradle-resolution
Example to show different dependency resolution for org.apache.cxf:cxf-rt-ws-security:3.2.11

---

Output of `diff maven-foo/dependencies.md gradle-foo/dependencies.md`

````diff
1c1
< Output of `mvn org.apache.maven.plugins:maven-dependency-plugin:3.0.2:tree`
---
> Output of `dependencies` task
4c4
< docker run --rm -v `pwd`/cache:/root/.m2 -v `pwd`:/w -w /w maven:3-jdk-8 mvn org.apache.maven.plugins:maven-dependency-plugin:3.0.2:tree
---
> docker run --rm -v `pwd`/cache:/root/.gradle -v `pwd`:/w -w /w openjdk:8 ./gradlew dependencies
8,69c8,828
< [INFO] Scanning for projects...
< [INFO] 
< [INFO] ------------------< de.gesellix.maven.foo:maven-foo >-------------------
< [INFO] Building maven-foo 1.0-SNAPSHOT
< [INFO] --------------------------------[ jar ]---------------------------------
< [INFO] 
< [INFO] --- maven-dependency-plugin:3.0.2:tree (default-cli) @ maven-foo ---
< [INFO] de.gesellix.maven.foo:maven-foo:jar:1.0-SNAPSHOT
< [INFO] +- junit:junit:jar:4.11:test
< [INFO] |  \- org.hamcrest:hamcrest-core:jar:1.3:test
< [INFO] \- org.apache.cxf:cxf-rt-ws-security:jar:3.2.11:compile
< [INFO]    +- org.apache.cxf:cxf-core:jar:3.2.11:compile
< [INFO]    |  +- com.fasterxml.woodstox:woodstox-core:jar:5.0.3:compile
< [INFO]    |  |  \- org.codehaus.woodstox:stax2-api:jar:3.1.4:compile
< [INFO]    |  \- org.apache.ws.xmlschema:xmlschema-core:jar:2.2.4:compile
< [INFO]    +- org.apache.cxf:cxf-rt-bindings-soap:jar:3.2.11:compile
< [INFO]    |  +- org.apache.cxf:cxf-rt-wsdl:jar:3.2.11:compile
< [INFO]    |  |  +- wsdl4j:wsdl4j:jar:1.6.3:compile
< [INFO]    |  |  \- org.ow2.asm:asm:jar:7.1:compile
< [INFO]    |  \- org.apache.cxf:cxf-rt-databinding-jaxb:jar:3.2.11:compile
< [INFO]    +- org.apache.cxf:cxf-rt-security-saml:jar:3.2.11:compile
< [INFO]    |  \- org.apache.cxf:cxf-rt-security:jar:3.2.11:compile
< [INFO]    +- net.sf.ehcache:ehcache:jar:2.10.6:compile
< [INFO]    |  \- org.slf4j:slf4j-api:jar:1.7.25:compile
< [INFO]    +- org.apache.wss4j:wss4j-ws-security-dom:jar:2.2.4:compile
< [INFO]    |  \- org.apache.wss4j:wss4j-ws-security-common:jar:2.2.4:compile
< [INFO]    |     +- org.apache.santuario:xmlsec:jar:2.1.4:compile
< [INFO]    |     |  \- commons-codec:commons-codec:jar:1.12:compile
< [INFO]    |     +- org.opensaml:opensaml-saml-impl:jar:3.3.0:compile
< [INFO]    |     |  +- org.opensaml:opensaml-profile-api:jar:3.3.0:compile
< [INFO]    |     |  |  \- org.opensaml:opensaml-core:jar:3.3.0:compile
< [INFO]    |     |  |     \- io.dropwizard.metrics:metrics-core:jar:3.1.2:compile
< [INFO]    |     |  +- org.opensaml:opensaml-saml-api:jar:3.3.0:compile
< [INFO]    |     |  |  +- org.opensaml:opensaml-xmlsec-api:jar:3.3.0:compile
< [INFO]    |     |  |  \- org.opensaml:opensaml-soap-api:jar:3.3.0:compile
< [INFO]    |     |  +- org.opensaml:opensaml-security-impl:jar:3.3.0:compile
< [INFO]    |     |  |  \- org.opensaml:opensaml-security-api:jar:3.3.0:compile
< [INFO]    |     |  |     +- org.cryptacular:cryptacular:jar:1.1.1:compile
< [INFO]    |     |  |     \- org.bouncycastle:bcprov-jdk15on:jar:1.54:compile
< [INFO]    |     |  +- org.opensaml:opensaml-xmlsec-impl:jar:3.3.0:compile
< [INFO]    |     |  \- net.shibboleth.utilities:java-support:jar:7.3.0:compile
< [INFO]    |     |     +- com.google.guava:guava:jar:19.0:compile
< [INFO]    |     |     \- joda-time:joda-time:jar:2.9:compile
< [INFO]    |     +- org.opensaml:opensaml-xacml-impl:jar:3.3.0:compile
< [INFO]    |     |  \- org.opensaml:opensaml-xacml-api:jar:3.3.0:compile
< [INFO]    |     +- org.opensaml:opensaml-xacml-saml-impl:jar:3.3.0:compile
< [INFO]    |     |  \- org.opensaml:opensaml-xacml-saml-api:jar:3.3.0:compile
< [INFO]    |     +- org.jasypt:jasypt:jar:1.9.3:compile
< [INFO]    |     \- org.apache.geronimo.javamail:geronimo-javamail_1.4_mail:jar:1.8.4:compile
< [INFO]    +- org.apache.wss4j:wss4j-policy:jar:2.2.4:compile
< [INFO]    |  \- org.apache.neethi:neethi:jar:3.1.1:compile
< [INFO]    |     \- org.codehaus.woodstox:woodstox-core-asl:jar:4.4.1:compile
< [INFO]    |        \- javax.xml.stream:stax-api:jar:1.0-2:compile
< [INFO]    +- org.apache.wss4j:wss4j-ws-security-stax:jar:2.2.4:compile
< [INFO]    |  \- org.apache.wss4j:wss4j-bindings:jar:2.2.4:compile
< [INFO]    \- org.apache.wss4j:wss4j-ws-security-policy-stax:jar:2.2.4:compile
< [INFO] ------------------------------------------------------------------------
< [INFO] BUILD SUCCESS
< [INFO] ------------------------------------------------------------------------
< [INFO] Total time:  4.311 s
< [INFO] Finished at: 2020-07-11T19:06:08Z
< [INFO] ------------------------------------------------------------------------
---
> Starting a Gradle Daemon, 1 incompatible and 2 stopped Daemons could not be reused, use --status for details
> 
> > Task :dependencies
> 
> ------------------------------------------------------------
> Root project
> ------------------------------------------------------------
> 
> annotationProcessor - Annotation processors and their dependencies for source set 'main'.
> No dependencies
> 
> api - API dependencies for source set 'main'. (n)
> No dependencies
> 
> apiElements - API elements for main. (n)
> No dependencies
> 
> archives - Configuration for archive artifacts. (n)
> No dependencies
> 
> compileClasspath - Compile classpath for source set 'main'.
> \--- org.apache.cxf:cxf-rt-ws-security:3.2.11
>      +--- org.apache.cxf:cxf-core:3.2.11
>      |    +--- com.fasterxml.woodstox:woodstox-core:5.0.3
>      |    |    \--- org.codehaus.woodstox:stax2-api:3.1.4
>      |    \--- org.apache.ws.xmlschema:xmlschema-core:2.2.4
>      +--- org.apache.cxf:cxf-rt-bindings-soap:3.2.11
>      |    +--- org.apache.cxf:cxf-core:3.2.11 (*)
>      |    +--- org.apache.cxf:cxf-rt-wsdl:3.2.11
>      |    |    +--- org.apache.cxf:cxf-core:3.2.11 (*)
>      |    |    +--- wsdl4j:wsdl4j:1.6.3
>      |    |    \--- org.ow2.asm:asm:7.1
>      |    \--- org.apache.cxf:cxf-rt-databinding-jaxb:3.2.11
>      |         +--- org.apache.cxf:cxf-core:3.2.11 (*)
>      |         \--- org.apache.cxf:cxf-rt-wsdl:3.2.11 (*)
>      +--- org.apache.cxf:cxf-rt-security-saml:3.2.11
>      |    +--- org.apache.cxf:cxf-rt-security:3.2.11
>      |    |    \--- org.apache.cxf:cxf-core:3.2.11 (*)
>      |    \--- org.apache.wss4j:wss4j-ws-security-dom:2.2.4
>      |         \--- org.apache.wss4j:wss4j-ws-security-common:2.2.4
>      |              +--- org.slf4j:slf4j-api:1.7.26
>      |              +--- org.apache.santuario:xmlsec:2.1.4
>      |              |    +--- org.slf4j:slf4j-api:1.7.26
>      |              |    +--- com.fasterxml.woodstox:woodstox-core:5.0.3 (*)
>      |              |    \--- commons-codec:commons-codec:1.12
>      |              +--- org.opensaml:opensaml-saml-impl:3.3.0
>      |              |    +--- org.opensaml:opensaml-profile-api:3.3.0
>      |              |    |    +--- org.opensaml:opensaml-core:3.3.0
>      |              |    |    |    +--- joda-time:joda-time:2.9
>      |              |    |    |    +--- io.dropwizard.metrics:metrics-core:3.1.2
>      |              |    |    |    |    \--- org.slf4j:slf4j-api:1.7.7 -> 1.7.26
>      |              |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0
>      |              |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    |    |    +--- com.google.code.findbugs:jsr305:3.0.1
>      |              |    |    |    |    +--- com.google.guava:guava:19.0
>      |              |    |    |    |    +--- joda-time:joda-time:2.9
>      |              |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0
>      |              |    |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
>      |              |    |    |    +--- joda-time:joda-time:2.9
>      |              |    |    |    +--- org.apache.httpcomponents:httpclient:4.3.6
>      |              |    |    |    |    +--- org.apache.httpcomponents:httpcore:4.3.3
>      |              |    |    |    |    \--- commons-codec:commons-codec:1.6 -> 1.12
>      |              |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    +--- org.opensaml:opensaml-saml-api:3.3.0
>      |              |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0
>      |              |    |    |    +--- org.opensaml:opensaml-security-api:3.3.0
>      |              |    |    |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
>      |              |    |    |    |    +--- org.apache.santuario:xmlsec:2.0.5 -> 2.1.4 (*)
>      |              |    |    |    |    +--- org.cryptacular:cryptacular:1.1.1
>      |              |    |    |    |    |    \--- org.bouncycastle:bcprov-jdk15on:1.54
>      |              |    |    |    |    +--- org.bouncycastle:bcprov-jdk15on:1.54
>      |              |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    |    +--- org.opensaml:opensaml-soap-api:3.3.0
>      |              |    |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0 (*)
>      |              |    |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0 (*)
>      |              |    |    |    +--- org.apache.httpcomponents:httpclient:4.3.6 (*)
>      |              |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0 (*)
>      |              |    |    +--- org.opensaml:opensaml-profile-api:3.3.0 (*)
>      |              |    |    +--- org.opensaml:opensaml-storage-api:3.3.0
>      |              |    |    |    +--- joda-time:joda-time:2.9
>      |              |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    +--- org.opensaml:opensaml-storage-api:3.3.0 (*)
>      |              |    +--- org.opensaml:opensaml-security-impl:3.3.0
>      |              |    |    +--- org.opensaml:opensaml-security-api:3.3.0 (*)
>      |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    +--- org.opensaml:opensaml-xmlsec-impl:3.3.0
>      |              |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0 (*)
>      |              |    |    +--- org.opensaml:opensaml-security-impl:3.3.0 (*)
>      |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    +--- org.opensaml:opensaml-soap-impl:3.3.0
>      |              |    |    +--- org.opensaml:opensaml-soap-api:3.3.0 (*)
>      |              |    |    +--- org.opensaml:opensaml-profile-api:3.3.0 (*)
>      |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    +--- org.apache.velocity:velocity:1.7
>      |              |    |    +--- commons-collections:commons-collections:3.2.1
>      |              |    |    \--- commons-lang:commons-lang:2.4
>      |              |    +--- org.apache.httpcomponents:httpclient:4.3.6 (*)
>      |              |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              +--- org.opensaml:opensaml-xacml-impl:3.3.0
>      |              |    +--- org.opensaml:opensaml-xacml-api:3.3.0
>      |              |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
>      |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              +--- org.opensaml:opensaml-xacml-saml-impl:3.3.0
>      |              |    +--- org.opensaml:opensaml-xacml-saml-api:3.3.0
>      |              |    |    +--- org.opensaml:opensaml-xacml-api:3.3.0 (*)
>      |              |    |    +--- org.opensaml:opensaml-saml-api:3.3.0 (*)
>      |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              |    +--- org.opensaml:opensaml-saml-impl:3.3.0 (*)
>      |              |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |              |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |              |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |              +--- org.jasypt:jasypt:1.9.3
>      |              \--- org.apache.geronimo.javamail:geronimo-javamail_1.4_mail:1.8.4
>      +--- net.sf.ehcache:ehcache:2.10.6
>      |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.26
>      +--- org.apache.wss4j:wss4j-ws-security-dom:2.2.4 (*)
>      +--- org.apache.wss4j:wss4j-policy:2.2.4
>      |    \--- org.apache.neethi:neethi:3.1.1
>      |         \--- org.codehaus.woodstox:woodstox-core-asl:4.4.1
>      |              +--- javax.xml.stream:stax-api:1.0-2
>      |              \--- org.codehaus.woodstox:stax2-api:3.1.4
>      +--- org.apache.wss4j:wss4j-ws-security-stax:2.2.4
>      |    +--- org.apache.wss4j:wss4j-bindings:2.2.4
>      |    |    \--- org.apache.santuario:xmlsec:2.1.4 (*)
>      |    \--- org.apache.wss4j:wss4j-ws-security-common:2.2.4 (*)
>      \--- org.apache.wss4j:wss4j-ws-security-policy-stax:2.2.4
>           +--- org.apache.wss4j:wss4j-ws-security-stax:2.2.4 (*)
>           \--- org.apache.wss4j:wss4j-policy:2.2.4 (*)
> 
> compileOnly - Compile only dependencies for source set 'main'. (n)
> No dependencies
> 
> default - Configuration for default artifacts. (n)
> No dependencies
> 
> implementation - Implementation only dependencies for source set 'main'. (n)
> \--- org.apache.cxf:cxf-rt-ws-security:3.2.11 (n)
> 
> runtimeClasspath - Runtime classpath of source set 'main'.
> \--- org.apache.cxf:cxf-rt-ws-security:3.2.11
>      +--- org.apache.cxf:cxf-core:3.2.11
>      |    +--- com.fasterxml.woodstox:woodstox-core:5.0.3
>      |    |    \--- org.codehaus.woodstox:stax2-api:3.1.4
>      |    \--- org.apache.ws.xmlschema:xmlschema-core:2.2.4
>      +--- org.apache.cxf:cxf-rt-bindings-soap:3.2.11
>      |    +--- org.apache.cxf:cxf-core:3.2.11 (*)
>      |    +--- org.apache.cxf:cxf-rt-wsdl:3.2.11
>      |    |    +--- org.apache.cxf:cxf-core:3.2.11 (*)
>      |    |    +--- wsdl4j:wsdl4j:1.6.3
>      |    |    \--- org.ow2.asm:asm:7.1
>      |    \--- org.apache.cxf:cxf-rt-databinding-jaxb:3.2.11
>      |         +--- org.apache.cxf:cxf-core:3.2.11 (*)
>      |         \--- org.apache.cxf:cxf-rt-wsdl:3.2.11 (*)
>      +--- org.apache.cxf:cxf-rt-security-saml:3.2.11
>      |    +--- org.apache.cxf:cxf-rt-security:3.2.11
>      |    |    \--- org.apache.cxf:cxf-core:3.2.11 (*)
>      |    \--- org.apache.wss4j:wss4j-ws-security-dom:2.2.4
>      |         +--- org.apache.wss4j:wss4j-ws-security-common:2.2.4
>      |         |    +--- org.slf4j:slf4j-api:1.7.26
>      |         |    +--- org.apache.santuario:xmlsec:2.1.4
>      |         |    |    +--- org.slf4j:slf4j-api:1.7.26
>      |         |    |    +--- com.fasterxml.woodstox:woodstox-core:5.0.3 (*)
>      |         |    |    \--- commons-codec:commons-codec:1.12
>      |         |    +--- org.opensaml:opensaml-saml-impl:3.3.0
>      |         |    |    +--- org.opensaml:opensaml-profile-api:3.3.0
>      |         |    |    |    +--- org.opensaml:opensaml-core:3.3.0
>      |         |    |    |    |    +--- joda-time:joda-time:2.9
>      |         |    |    |    |    +--- io.dropwizard.metrics:metrics-core:3.1.2
>      |         |    |    |    |    |    \--- org.slf4j:slf4j-api:1.7.7 -> 1.7.26
>      |         |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0
>      |         |    |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    |    |    +--- com.google.code.findbugs:jsr305:3.0.1
>      |         |    |    |    |    |    +--- com.google.guava:guava:19.0
>      |         |    |    |    |    |    +--- joda-time:joda-time:2.9
>      |         |    |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0
>      |         |    |    |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
>      |         |    |    |    |    +--- joda-time:joda-time:2.9
>      |         |    |    |    |    +--- org.apache.httpcomponents:httpclient:4.3.6
>      |         |    |    |    |    |    +--- org.apache.httpcomponents:httpcore:4.3.3
>      |         |    |    |    |    |    \--- commons-codec:commons-codec:1.6 -> 1.12
>      |         |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    +--- org.opensaml:opensaml-saml-api:3.3.0
>      |         |    |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0
>      |         |    |    |    |    +--- org.opensaml:opensaml-security-api:3.3.0
>      |         |    |    |    |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
>      |         |    |    |    |    |    +--- org.apache.santuario:xmlsec:2.0.5 -> 2.1.4 (*)
>      |         |    |    |    |    |    +--- org.cryptacular:cryptacular:1.1.1
>      |         |    |    |    |    |    |    \--- org.bouncycastle:bcprov-jdk15on:1.54
>      |         |    |    |    |    |    +--- org.bouncycastle:bcprov-jdk15on:1.54
>      |         |    |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    |    +--- org.opensaml:opensaml-soap-api:3.3.0
>      |         |    |    |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0 (*)
>      |         |    |    |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0 (*)
>      |         |    |    |    |    +--- org.apache.httpcomponents:httpclient:4.3.6 (*)
>      |         |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0 (*)
>      |         |    |    |    +--- org.opensaml:opensaml-profile-api:3.3.0 (*)
>      |         |    |    |    +--- org.opensaml:opensaml-storage-api:3.3.0
>      |         |    |    |    |    +--- joda-time:joda-time:2.9
>      |         |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    +--- org.opensaml:opensaml-storage-api:3.3.0 (*)
>      |         |    |    +--- org.opensaml:opensaml-security-impl:3.3.0
>      |         |    |    |    +--- org.opensaml:opensaml-security-api:3.3.0 (*)
>      |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    +--- org.opensaml:opensaml-xmlsec-impl:3.3.0
>      |         |    |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0 (*)
>      |         |    |    |    +--- org.opensaml:opensaml-security-impl:3.3.0 (*)
>      |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    +--- org.opensaml:opensaml-soap-impl:3.3.0
>      |         |    |    |    +--- org.opensaml:opensaml-soap-api:3.3.0 (*)
>      |         |    |    |    +--- org.opensaml:opensaml-profile-api:3.3.0 (*)
>      |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    +--- org.apache.velocity:velocity:1.7
>      |         |    |    |    +--- commons-collections:commons-collections:3.2.1
>      |         |    |    |    \--- commons-lang:commons-lang:2.4
>      |         |    |    +--- org.apache.httpcomponents:httpclient:4.3.6 (*)
>      |         |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    +--- org.opensaml:opensaml-xacml-impl:3.3.0
>      |         |    |    +--- org.opensaml:opensaml-xacml-api:3.3.0
>      |         |    |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
>      |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    +--- org.opensaml:opensaml-xacml-saml-impl:3.3.0
>      |         |    |    +--- org.opensaml:opensaml-xacml-saml-api:3.3.0
>      |         |    |    |    +--- org.opensaml:opensaml-xacml-api:3.3.0 (*)
>      |         |    |    |    +--- org.opensaml:opensaml-saml-api:3.3.0 (*)
>      |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    |    +--- org.opensaml:opensaml-saml-impl:3.3.0 (*)
>      |         |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
>      |         |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
>      |         |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
>      |         |    +--- org.jasypt:jasypt:1.9.3
>      |         |    \--- org.apache.geronimo.javamail:geronimo-javamail_1.4_mail:1.8.4
>      |         \--- net.sf.ehcache:ehcache:2.10.6
>      |              \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.26
>      +--- net.sf.ehcache:ehcache:2.10.6 (*)
>      +--- org.apache.wss4j:wss4j-ws-security-dom:2.2.4 (*)
>      +--- org.apache.wss4j:wss4j-policy:2.2.4
>      |    \--- org.apache.neethi:neethi:3.1.1
>      |         \--- org.codehaus.woodstox:woodstox-core-asl:4.4.1
>      |              +--- javax.xml.stream:stax-api:1.0-2
>      |              \--- org.codehaus.woodstox:stax2-api:3.1.4
>      +--- org.apache.wss4j:wss4j-ws-security-stax:2.2.4
>      |    +--- org.apache.wss4j:wss4j-bindings:2.2.4
>      |    |    \--- org.apache.santuario:xmlsec:2.1.4 (*)
>      |    +--- org.apache.wss4j:wss4j-ws-security-common:2.2.4 (*)
>      |    \--- net.sf.ehcache:ehcache:2.10.6 (*)
>      \--- org.apache.wss4j:wss4j-ws-security-policy-stax:2.2.4
>           +--- org.apache.wss4j:wss4j-ws-security-stax:2.2.4 (*)
>           \--- org.apache.wss4j:wss4j-policy:2.2.4 (*)
> 
> runtimeElements - Elements of runtime for main. (n)
> No dependencies
> 
> runtimeOnly - Runtime only dependencies for source set 'main'. (n)
> No dependencies
> 
> testAnnotationProcessor - Annotation processors and their dependencies for source set 'test'.
> No dependencies
> 
> testCompileClasspath - Compile classpath for source set 'test'.
> +--- org.apache.cxf:cxf-rt-ws-security:3.2.11
> |    +--- org.apache.cxf:cxf-core:3.2.11
> |    |    +--- com.fasterxml.woodstox:woodstox-core:5.0.3
> |    |    |    \--- org.codehaus.woodstox:stax2-api:3.1.4
> |    |    \--- org.apache.ws.xmlschema:xmlschema-core:2.2.4
> |    +--- org.apache.cxf:cxf-rt-bindings-soap:3.2.11
> |    |    +--- org.apache.cxf:cxf-core:3.2.11 (*)
> |    |    +--- org.apache.cxf:cxf-rt-wsdl:3.2.11
> |    |    |    +--- org.apache.cxf:cxf-core:3.2.11 (*)
> |    |    |    +--- wsdl4j:wsdl4j:1.6.3
> |    |    |    \--- org.ow2.asm:asm:7.1
> |    |    \--- org.apache.cxf:cxf-rt-databinding-jaxb:3.2.11
> |    |         +--- org.apache.cxf:cxf-core:3.2.11 (*)
> |    |         \--- org.apache.cxf:cxf-rt-wsdl:3.2.11 (*)
> |    +--- org.apache.cxf:cxf-rt-security-saml:3.2.11
> |    |    +--- org.apache.cxf:cxf-rt-security:3.2.11
> |    |    |    \--- org.apache.cxf:cxf-core:3.2.11 (*)
> |    |    \--- org.apache.wss4j:wss4j-ws-security-dom:2.2.4
> |    |         \--- org.apache.wss4j:wss4j-ws-security-common:2.2.4
> |    |              +--- org.slf4j:slf4j-api:1.7.26
> |    |              +--- org.apache.santuario:xmlsec:2.1.4
> |    |              |    +--- org.slf4j:slf4j-api:1.7.26
> |    |              |    +--- com.fasterxml.woodstox:woodstox-core:5.0.3 (*)
> |    |              |    \--- commons-codec:commons-codec:1.12
> |    |              +--- org.opensaml:opensaml-saml-impl:3.3.0
> |    |              |    +--- org.opensaml:opensaml-profile-api:3.3.0
> |    |              |    |    +--- org.opensaml:opensaml-core:3.3.0
> |    |              |    |    |    +--- joda-time:joda-time:2.9
> |    |              |    |    |    +--- io.dropwizard.metrics:metrics-core:3.1.2
> |    |              |    |    |    |    \--- org.slf4j:slf4j-api:1.7.7 -> 1.7.26
> |    |              |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0
> |    |              |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    |    |    +--- com.google.code.findbugs:jsr305:3.0.1
> |    |              |    |    |    |    +--- com.google.guava:guava:19.0
> |    |              |    |    |    |    +--- joda-time:joda-time:2.9
> |    |              |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0
> |    |              |    |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
> |    |              |    |    |    +--- joda-time:joda-time:2.9
> |    |              |    |    |    +--- org.apache.httpcomponents:httpclient:4.3.6
> |    |              |    |    |    |    +--- org.apache.httpcomponents:httpcore:4.3.3
> |    |              |    |    |    |    \--- commons-codec:commons-codec:1.6 -> 1.12
> |    |              |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    +--- org.opensaml:opensaml-saml-api:3.3.0
> |    |              |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0
> |    |              |    |    |    +--- org.opensaml:opensaml-security-api:3.3.0
> |    |              |    |    |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
> |    |              |    |    |    |    +--- org.apache.santuario:xmlsec:2.0.5 -> 2.1.4 (*)
> |    |              |    |    |    |    +--- org.cryptacular:cryptacular:1.1.1
> |    |              |    |    |    |    |    \--- org.bouncycastle:bcprov-jdk15on:1.54
> |    |              |    |    |    |    +--- org.bouncycastle:bcprov-jdk15on:1.54
> |    |              |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    |    +--- org.opensaml:opensaml-soap-api:3.3.0
> |    |              |    |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0 (*)
> |    |              |    |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0 (*)
> |    |              |    |    |    +--- org.apache.httpcomponents:httpclient:4.3.6 (*)
> |    |              |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0 (*)
> |    |              |    |    +--- org.opensaml:opensaml-profile-api:3.3.0 (*)
> |    |              |    |    +--- org.opensaml:opensaml-storage-api:3.3.0
> |    |              |    |    |    +--- joda-time:joda-time:2.9
> |    |              |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    +--- org.opensaml:opensaml-storage-api:3.3.0 (*)
> |    |              |    +--- org.opensaml:opensaml-security-impl:3.3.0
> |    |              |    |    +--- org.opensaml:opensaml-security-api:3.3.0 (*)
> |    |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    +--- org.opensaml:opensaml-xmlsec-impl:3.3.0
> |    |              |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0 (*)
> |    |              |    |    +--- org.opensaml:opensaml-security-impl:3.3.0 (*)
> |    |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    +--- org.opensaml:opensaml-soap-impl:3.3.0
> |    |              |    |    +--- org.opensaml:opensaml-soap-api:3.3.0 (*)
> |    |              |    |    +--- org.opensaml:opensaml-profile-api:3.3.0 (*)
> |    |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    +--- org.apache.velocity:velocity:1.7
> |    |              |    |    +--- commons-collections:commons-collections:3.2.1
> |    |              |    |    \--- commons-lang:commons-lang:2.4
> |    |              |    +--- org.apache.httpcomponents:httpclient:4.3.6 (*)
> |    |              |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              +--- org.opensaml:opensaml-xacml-impl:3.3.0
> |    |              |    +--- org.opensaml:opensaml-xacml-api:3.3.0
> |    |              |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
> |    |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              +--- org.opensaml:opensaml-xacml-saml-impl:3.3.0
> |    |              |    +--- org.opensaml:opensaml-xacml-saml-api:3.3.0
> |    |              |    |    +--- org.opensaml:opensaml-xacml-api:3.3.0 (*)
> |    |              |    |    +--- org.opensaml:opensaml-saml-api:3.3.0 (*)
> |    |              |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              |    +--- org.opensaml:opensaml-saml-impl:3.3.0 (*)
> |    |              |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |              |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |              |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |              +--- org.jasypt:jasypt:1.9.3
> |    |              \--- org.apache.geronimo.javamail:geronimo-javamail_1.4_mail:1.8.4
> |    +--- net.sf.ehcache:ehcache:2.10.6
> |    |    \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.26
> |    +--- org.apache.wss4j:wss4j-ws-security-dom:2.2.4 (*)
> |    +--- org.apache.wss4j:wss4j-policy:2.2.4
> |    |    \--- org.apache.neethi:neethi:3.1.1
> |    |         \--- org.codehaus.woodstox:woodstox-core-asl:4.4.1
> |    |              +--- javax.xml.stream:stax-api:1.0-2
> |    |              \--- org.codehaus.woodstox:stax2-api:3.1.4
> |    +--- org.apache.wss4j:wss4j-ws-security-stax:2.2.4
> |    |    +--- org.apache.wss4j:wss4j-bindings:2.2.4
> |    |    |    \--- org.apache.santuario:xmlsec:2.1.4 (*)
> |    |    \--- org.apache.wss4j:wss4j-ws-security-common:2.2.4 (*)
> |    \--- org.apache.wss4j:wss4j-ws-security-policy-stax:2.2.4
> |         +--- org.apache.wss4j:wss4j-ws-security-stax:2.2.4 (*)
> |         \--- org.apache.wss4j:wss4j-policy:2.2.4 (*)
> +--- org.codehaus.groovy:groovy-all:2.5.11
> |    +--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-ant:2.5.11
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    +--- org.apache.ant:ant:1.9.13
> |    |    |    \--- org.apache.ant:ant-launcher:1.9.13
> |    |    \--- org.codehaus.groovy:groovy-groovydoc:2.5.11
> |    |         +--- org.codehaus.groovy:groovy-templates:2.5.11
> |    |         |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |         |    \--- org.codehaus.groovy:groovy-xml:2.5.11
> |    |         |         \--- org.codehaus.groovy:groovy:2.5.11
> |    |         +--- org.codehaus.groovy:groovy:2.5.11
> |    |         \--- org.codehaus.groovy:groovy-cli-picocli:2.5.11
> |    |              +--- org.codehaus.groovy:groovy:2.5.11
> |    |              \--- info.picocli:picocli:4.0.1
> |    +--- org.codehaus.groovy:groovy-cli-commons:2.5.11
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    \--- commons-cli:commons-cli:1.4
> |    +--- org.codehaus.groovy:groovy-cli-picocli:2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-console:2.5.11
> |    |    +--- org.codehaus.groovy:groovy-templates:2.5.11 (*)
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    +--- org.codehaus.groovy:groovy-cli-picocli:2.5.11 (*)
> |    |    \--- org.codehaus.groovy:groovy-swing:2.5.11
> |    |         \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-datetime:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-docgenerator:2.5.11
> |    |    +--- org.codehaus.groovy:groovy-templates:2.5.11 (*)
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    +--- org.codehaus.groovy:groovy-cli-picocli:2.5.11 (*)
> |    |    \--- com.thoughtworks.qdox:qdox:1.12.1
> |    +--- org.codehaus.groovy:groovy-groovydoc:2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-groovysh:2.5.11
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    +--- org.codehaus.groovy:groovy-cli-picocli:2.5.11 (*)
> |    |    +--- org.codehaus.groovy:groovy-console:2.5.11 (*)
> |    |    \--- jline:jline:2.14.6
> |    +--- org.codehaus.groovy:groovy-jmx:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-json:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-jsr223:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-macro:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-nio:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-servlet:2.5.11
> |    |    +--- org.codehaus.groovy:groovy-templates:2.5.11 (*)
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    \--- org.codehaus.groovy:groovy-xml:2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-sql:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-swing:2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-templates:2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-test:2.5.11
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    \--- junit:junit:4.12 -> 4.13
> |    |         \--- org.hamcrest:hamcrest-core:1.3
> |    +--- org.codehaus.groovy:groovy-test-junit5:2.5.11
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    \--- org.junit.platform:junit-platform-launcher:1.4.0
> |    |         +--- org.apiguardian:apiguardian-api:1.0.0
> |    |         \--- org.junit.platform:junit-platform-engine:1.4.0
> |    |              +--- org.apiguardian:apiguardian-api:1.0.0
> |    |              +--- org.opentest4j:opentest4j:1.1.1
> |    |              \--- org.junit.platform:junit-platform-commons:1.4.0
> |    |                   \--- org.apiguardian:apiguardian-api:1.0.0
> |    +--- org.codehaus.groovy:groovy-testng:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    \--- org.codehaus.groovy:groovy-xml:2.5.11 (*)
> +--- org.spockframework:spock-core:1.3-groovy-2.5
> |    +--- org.codehaus.groovy:groovy:2.5.4 -> 2.5.11
> |    +--- org.codehaus.groovy:groovy-json:2.5.4 -> 2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-nio:2.5.4 -> 2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-macro:2.5.4 -> 2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-templates:2.5.4 -> 2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-test:2.5.4 -> 2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-sql:2.5.4 -> 2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-xml:2.5.4 -> 2.5.11 (*)
> |    \--- junit:junit:4.12 -> 4.13 (*)
> \--- junit:junit:4.13 (*)
> 
> testCompileOnly - Compile only dependencies for source set 'test'. (n)
> No dependencies
> 
> testImplementation - Implementation only dependencies for source set 'test'. (n)
> +--- org.codehaus.groovy:groovy-all:2.5.11 (n)
> +--- org.spockframework:spock-core:1.3-groovy-2.5 (n)
> \--- junit:junit:4.13 (n)
> 
> testRuntimeClasspath - Runtime classpath of source set 'test'.
> +--- org.apache.cxf:cxf-rt-ws-security:3.2.11
> |    +--- org.apache.cxf:cxf-core:3.2.11
> |    |    +--- com.fasterxml.woodstox:woodstox-core:5.0.3
> |    |    |    \--- org.codehaus.woodstox:stax2-api:3.1.4
> |    |    \--- org.apache.ws.xmlschema:xmlschema-core:2.2.4
> |    +--- org.apache.cxf:cxf-rt-bindings-soap:3.2.11
> |    |    +--- org.apache.cxf:cxf-core:3.2.11 (*)
> |    |    +--- org.apache.cxf:cxf-rt-wsdl:3.2.11
> |    |    |    +--- org.apache.cxf:cxf-core:3.2.11 (*)
> |    |    |    +--- wsdl4j:wsdl4j:1.6.3
> |    |    |    \--- org.ow2.asm:asm:7.1
> |    |    \--- org.apache.cxf:cxf-rt-databinding-jaxb:3.2.11
> |    |         +--- org.apache.cxf:cxf-core:3.2.11 (*)
> |    |         \--- org.apache.cxf:cxf-rt-wsdl:3.2.11 (*)
> |    +--- org.apache.cxf:cxf-rt-security-saml:3.2.11
> |    |    +--- org.apache.cxf:cxf-rt-security:3.2.11
> |    |    |    \--- org.apache.cxf:cxf-core:3.2.11 (*)
> |    |    \--- org.apache.wss4j:wss4j-ws-security-dom:2.2.4
> |    |         +--- org.apache.wss4j:wss4j-ws-security-common:2.2.4
> |    |         |    +--- org.slf4j:slf4j-api:1.7.26
> |    |         |    +--- org.apache.santuario:xmlsec:2.1.4
> |    |         |    |    +--- org.slf4j:slf4j-api:1.7.26
> |    |         |    |    +--- com.fasterxml.woodstox:woodstox-core:5.0.3 (*)
> |    |         |    |    \--- commons-codec:commons-codec:1.12
> |    |         |    +--- org.opensaml:opensaml-saml-impl:3.3.0
> |    |         |    |    +--- org.opensaml:opensaml-profile-api:3.3.0
> |    |         |    |    |    +--- org.opensaml:opensaml-core:3.3.0
> |    |         |    |    |    |    +--- joda-time:joda-time:2.9
> |    |         |    |    |    |    +--- io.dropwizard.metrics:metrics-core:3.1.2
> |    |         |    |    |    |    |    \--- org.slf4j:slf4j-api:1.7.7 -> 1.7.26
> |    |         |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0
> |    |         |    |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    |    |    +--- com.google.code.findbugs:jsr305:3.0.1
> |    |         |    |    |    |    |    +--- com.google.guava:guava:19.0
> |    |         |    |    |    |    |    +--- joda-time:joda-time:2.9
> |    |         |    |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0
> |    |         |    |    |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
> |    |         |    |    |    |    +--- joda-time:joda-time:2.9
> |    |         |    |    |    |    +--- org.apache.httpcomponents:httpclient:4.3.6
> |    |         |    |    |    |    |    +--- org.apache.httpcomponents:httpcore:4.3.3
> |    |         |    |    |    |    |    \--- commons-codec:commons-codec:1.6 -> 1.12
> |    |         |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    +--- org.opensaml:opensaml-saml-api:3.3.0
> |    |         |    |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0
> |    |         |    |    |    |    +--- org.opensaml:opensaml-security-api:3.3.0
> |    |         |    |    |    |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
> |    |         |    |    |    |    |    +--- org.apache.santuario:xmlsec:2.0.5 -> 2.1.4 (*)
> |    |         |    |    |    |    |    +--- org.cryptacular:cryptacular:1.1.1
> |    |         |    |    |    |    |    |    \--- org.bouncycastle:bcprov-jdk15on:1.54
> |    |         |    |    |    |    |    +--- org.bouncycastle:bcprov-jdk15on:1.54
> |    |         |    |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    |    +--- org.opensaml:opensaml-soap-api:3.3.0
> |    |         |    |    |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0 (*)
> |    |         |    |    |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0 (*)
> |    |         |    |    |    |    +--- org.apache.httpcomponents:httpclient:4.3.6 (*)
> |    |         |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    |    +--- org.opensaml:opensaml-messaging-api:3.3.0 (*)
> |    |         |    |    |    +--- org.opensaml:opensaml-profile-api:3.3.0 (*)
> |    |         |    |    |    +--- org.opensaml:opensaml-storage-api:3.3.0
> |    |         |    |    |    |    +--- joda-time:joda-time:2.9
> |    |         |    |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    +--- org.opensaml:opensaml-storage-api:3.3.0 (*)
> |    |         |    |    +--- org.opensaml:opensaml-security-impl:3.3.0
> |    |         |    |    |    +--- org.opensaml:opensaml-security-api:3.3.0 (*)
> |    |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    +--- org.opensaml:opensaml-xmlsec-impl:3.3.0
> |    |         |    |    |    +--- org.opensaml:opensaml-xmlsec-api:3.3.0 (*)
> |    |         |    |    |    +--- org.opensaml:opensaml-security-impl:3.3.0 (*)
> |    |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    +--- org.opensaml:opensaml-soap-impl:3.3.0
> |    |         |    |    |    +--- org.opensaml:opensaml-soap-api:3.3.0 (*)
> |    |         |    |    |    +--- org.opensaml:opensaml-profile-api:3.3.0 (*)
> |    |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    +--- org.apache.velocity:velocity:1.7
> |    |         |    |    |    +--- commons-collections:commons-collections:3.2.1
> |    |         |    |    |    \--- commons-lang:commons-lang:2.4
> |    |         |    |    +--- org.apache.httpcomponents:httpclient:4.3.6 (*)
> |    |         |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    +--- org.opensaml:opensaml-xacml-impl:3.3.0
> |    |         |    |    +--- org.opensaml:opensaml-xacml-api:3.3.0
> |    |         |    |    |    +--- org.opensaml:opensaml-core:3.3.0 (*)
> |    |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    +--- org.opensaml:opensaml-xacml-saml-impl:3.3.0
> |    |         |    |    +--- org.opensaml:opensaml-xacml-saml-api:3.3.0
> |    |         |    |    |    +--- org.opensaml:opensaml-xacml-api:3.3.0 (*)
> |    |         |    |    |    +--- org.opensaml:opensaml-saml-api:3.3.0 (*)
> |    |         |    |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    |    +--- org.opensaml:opensaml-saml-impl:3.3.0 (*)
> |    |         |    |    +--- net.shibboleth.utilities:java-support:7.3.0 (*)
> |    |         |    |    +--- commons-codec:commons-codec:1.10 -> 1.12
> |    |         |    |    \--- org.slf4j:slf4j-api:1.7.12 -> 1.7.26
> |    |         |    +--- org.jasypt:jasypt:1.9.3
> |    |         |    \--- org.apache.geronimo.javamail:geronimo-javamail_1.4_mail:1.8.4
> |    |         \--- net.sf.ehcache:ehcache:2.10.6
> |    |              \--- org.slf4j:slf4j-api:1.7.25 -> 1.7.26
> |    +--- net.sf.ehcache:ehcache:2.10.6 (*)
> |    +--- org.apache.wss4j:wss4j-ws-security-dom:2.2.4 (*)
> |    +--- org.apache.wss4j:wss4j-policy:2.2.4
> |    |    \--- org.apache.neethi:neethi:3.1.1
> |    |         \--- org.codehaus.woodstox:woodstox-core-asl:4.4.1
> |    |              +--- javax.xml.stream:stax-api:1.0-2
> |    |              \--- org.codehaus.woodstox:stax2-api:3.1.4
> |    +--- org.apache.wss4j:wss4j-ws-security-stax:2.2.4
> |    |    +--- org.apache.wss4j:wss4j-bindings:2.2.4
> |    |    |    \--- org.apache.santuario:xmlsec:2.1.4 (*)
> |    |    +--- org.apache.wss4j:wss4j-ws-security-common:2.2.4 (*)
> |    |    \--- net.sf.ehcache:ehcache:2.10.6 (*)
> |    \--- org.apache.wss4j:wss4j-ws-security-policy-stax:2.2.4
> |         +--- org.apache.wss4j:wss4j-ws-security-stax:2.2.4 (*)
> |         \--- org.apache.wss4j:wss4j-policy:2.2.4 (*)
> +--- org.codehaus.groovy:groovy-all:2.5.11
> |    +--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-ant:2.5.11
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    +--- org.apache.ant:ant:1.9.13
> |    |    |    \--- org.apache.ant:ant-launcher:1.9.13
> |    |    +--- org.codehaus.groovy:groovy-groovydoc:2.5.11
> |    |    |    +--- org.codehaus.groovy:groovy-templates:2.5.11
> |    |    |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    |    |    \--- org.codehaus.groovy:groovy-xml:2.5.11
> |    |    |    |         \--- org.codehaus.groovy:groovy:2.5.11
> |    |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    |    +--- org.codehaus.groovy:groovy-cli-picocli:2.5.11
> |    |    |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    |    |    \--- info.picocli:picocli:4.0.1
> |    |    |    \--- org.codehaus.groovy:groovy-docgenerator:2.5.11
> |    |    |         +--- org.codehaus.groovy:groovy-templates:2.5.11 (*)
> |    |    |         +--- org.codehaus.groovy:groovy:2.5.11
> |    |    |         +--- org.codehaus.groovy:groovy-cli-picocli:2.5.11 (*)
> |    |    |         \--- com.thoughtworks.qdox:qdox:1.12.1
> |    |    +--- org.apache.ant:ant-junit:1.9.13
> |    |    |    \--- org.apache.ant:ant:1.9.13 (*)
> |    |    +--- org.apache.ant:ant-launcher:1.9.13
> |    |    \--- org.apache.ant:ant-antlr:1.9.13
> |    +--- org.codehaus.groovy:groovy-cli-commons:2.5.11
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    \--- commons-cli:commons-cli:1.4
> |    +--- org.codehaus.groovy:groovy-cli-picocli:2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-console:2.5.11
> |    |    +--- org.codehaus.groovy:groovy-templates:2.5.11 (*)
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    +--- org.codehaus.groovy:groovy-cli-picocli:2.5.11 (*)
> |    |    \--- org.codehaus.groovy:groovy-swing:2.5.11
> |    |         \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-datetime:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-docgenerator:2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-groovydoc:2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-groovysh:2.5.11
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    +--- org.codehaus.groovy:groovy-cli-picocli:2.5.11 (*)
> |    |    +--- org.codehaus.groovy:groovy-console:2.5.11 (*)
> |    |    \--- jline:jline:2.14.6
> |    +--- org.codehaus.groovy:groovy-jmx:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-json:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-jsr223:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-macro:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-nio:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-servlet:2.5.11
> |    |    +--- org.codehaus.groovy:groovy-templates:2.5.11 (*)
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    \--- org.codehaus.groovy:groovy-xml:2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-sql:2.5.11
> |    |    \--- org.codehaus.groovy:groovy:2.5.11
> |    +--- org.codehaus.groovy:groovy-swing:2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-templates:2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-test:2.5.11
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    \--- junit:junit:4.12 -> 4.13
> |    |         \--- org.hamcrest:hamcrest-core:1.3
> |    +--- org.codehaus.groovy:groovy-test-junit5:2.5.11
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    +--- org.junit.platform:junit-platform-launcher:1.4.0
> |    |    |    +--- org.apiguardian:apiguardian-api:1.0.0
> |    |    |    \--- org.junit.platform:junit-platform-engine:1.4.0
> |    |    |         +--- org.apiguardian:apiguardian-api:1.0.0
> |    |    |         +--- org.opentest4j:opentest4j:1.1.1
> |    |    |         \--- org.junit.platform:junit-platform-commons:1.4.0
> |    |    |              \--- org.apiguardian:apiguardian-api:1.0.0
> |    |    \--- org.junit.jupiter:junit-jupiter-engine:5.4.0
> |    |         +--- org.apiguardian:apiguardian-api:1.0.0
> |    |         +--- org.junit.platform:junit-platform-engine:1.4.0 (*)
> |    |         \--- org.junit.jupiter:junit-jupiter-api:5.4.0
> |    |              +--- org.apiguardian:apiguardian-api:1.0.0
> |    |              +--- org.opentest4j:opentest4j:1.1.1
> |    |              \--- org.junit.platform:junit-platform-commons:1.4.0 (*)
> |    +--- org.codehaus.groovy:groovy-testng:2.5.11
> |    |    +--- org.codehaus.groovy:groovy:2.5.11
> |    |    \--- org.testng:testng:6.13.1
> |    |         \--- com.beust:jcommander:1.72
> |    \--- org.codehaus.groovy:groovy-xml:2.5.11 (*)
> +--- org.spockframework:spock-core:1.3-groovy-2.5
> |    +--- org.codehaus.groovy:groovy:2.5.4 -> 2.5.11
> |    +--- org.codehaus.groovy:groovy-json:2.5.4 -> 2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-nio:2.5.4 -> 2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-macro:2.5.4 -> 2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-templates:2.5.4 -> 2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-test:2.5.4 -> 2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-sql:2.5.4 -> 2.5.11 (*)
> |    +--- org.codehaus.groovy:groovy-xml:2.5.4 -> 2.5.11 (*)
> |    \--- junit:junit:4.12 -> 4.13 (*)
> \--- junit:junit:4.13 (*)
> 
> testRuntimeOnly - Runtime only dependencies for source set 'test'. (n)
> No dependencies
> 
> (*) - dependencies omitted (listed previously)
> 
> (n) - Not resolved (configuration is not meant to be resolved)
> 
> A web-based, searchable dependency report is available by adding the --scan option.
> 
> BUILD SUCCESSFUL in 11s
> 1 actionable task: 1 executed
````
