Output of `mvn org.apache.maven.plugins:maven-dependency-plugin:3.0.2:tree`

```
docker run --rm -v `pwd`/cache:/root/.m2 -v `pwd`:/w -w /w maven:3-jdk-8 mvn org.apache.maven.plugins:maven-dependency-plugin:3.1.2:tree
```

````
--- maven-dependency-plugin:3.1.2:tree (default-cli) @ maven-foo ---
de.gesellix.maven.foo:maven-foo:1.0-SNAPSHOT
\- org.apache.wss4j:wss4j-ws-security-common:2.2.4
   +- org.slf4j:slf4j-api:1.7.26
   +- org.apache.santuario:xmlsec:2.1.4
   |  +- com.fasterxml.woodstox:woodstox-core:5.0.3
   |  |  \- org.codehaus.woodstox:stax2-api:3.1.4
   |  \- commons-codec:commons-codec:1.12
   +- org.opensaml:opensaml-saml-impl:3.3.0
   |  +- org.opensaml:opensaml-profile-api:3.3.0
   |  |  \- org.opensaml:opensaml-core:3.3.0
   |  |     \- io.dropwizard.metrics:metrics-core:3.1.2
   |  +- org.opensaml:opensaml-saml-api:3.3.0
   |  |  +- org.opensaml:opensaml-xmlsec-api:3.3.0
   |  |  \- org.opensaml:opensaml-soap-api:3.3.0
   |  +- org.opensaml:opensaml-security-impl:3.3.0
   |  |  \- org.opensaml:opensaml-security-api:3.3.0
   |  |     +- org.cryptacular:cryptacular:1.1.1
   |  |     \- org.bouncycastle:bcprov-jdk15on:1.54
   |  +- org.opensaml:opensaml-xmlsec-impl:3.3.0
   |  \- net.shibboleth.utilities:java-support:7.3.0
   |     +- com.google.guava:guava:19.0
   |     \- joda-time:joda-time:2.9
   +- org.opensaml:opensaml-xacml-impl:3.3.0
   |  \- org.opensaml:opensaml-xacml-api:3.3.0
   +- org.opensaml:opensaml-xacml-saml-impl:3.3.0
   |  \- org.opensaml:opensaml-xacml-saml-api:3.3.0
   +- org.jasypt:jasypt:1.9.3
   \- org.apache.geronimo.javamail:geronimo-javamail_1.4_mail:1.8.4
````
