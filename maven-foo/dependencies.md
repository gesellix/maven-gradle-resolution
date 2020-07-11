Output of `mvn org.apache.maven.plugins:maven-dependency-plugin:3.0.2:tree`

```
docker run --rm -v `pwd`/cache:/root/.m2 -v `pwd`:/w -w /w maven:3-jdk-8 mvn org.apache.maven.plugins:maven-dependency-plugin:3.0.2:tree
```

````
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< de.gesellix.maven.foo:maven-foo >-------------------
[INFO] Building maven-foo 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-dependency-plugin:3.0.2:tree (default-cli) @ maven-foo ---
[INFO] de.gesellix.maven.foo:maven-foo:jar:1.0-SNAPSHOT
[INFO] +- junit:junit:jar:4.11:test
[INFO] |  \- org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] \- org.apache.cxf:cxf-rt-ws-security:jar:3.2.11:compile
[INFO]    +- org.apache.cxf:cxf-core:jar:3.2.11:compile
[INFO]    |  +- com.fasterxml.woodstox:woodstox-core:jar:5.0.3:compile
[INFO]    |  |  \- org.codehaus.woodstox:stax2-api:jar:3.1.4:compile
[INFO]    |  \- org.apache.ws.xmlschema:xmlschema-core:jar:2.2.4:compile
[INFO]    +- org.apache.cxf:cxf-rt-bindings-soap:jar:3.2.11:compile
[INFO]    |  +- org.apache.cxf:cxf-rt-wsdl:jar:3.2.11:compile
[INFO]    |  |  +- wsdl4j:wsdl4j:jar:1.6.3:compile
[INFO]    |  |  \- org.ow2.asm:asm:jar:7.1:compile
[INFO]    |  \- org.apache.cxf:cxf-rt-databinding-jaxb:jar:3.2.11:compile
[INFO]    +- org.apache.cxf:cxf-rt-security-saml:jar:3.2.11:compile
[INFO]    |  \- org.apache.cxf:cxf-rt-security:jar:3.2.11:compile
[INFO]    +- net.sf.ehcache:ehcache:jar:2.10.6:compile
[INFO]    |  \- org.slf4j:slf4j-api:jar:1.7.25:compile
[INFO]    +- org.apache.wss4j:wss4j-ws-security-dom:jar:2.2.4:compile
[INFO]    |  \- org.apache.wss4j:wss4j-ws-security-common:jar:2.2.4:compile
[INFO]    |     +- org.apache.santuario:xmlsec:jar:2.1.4:compile
[INFO]    |     |  \- commons-codec:commons-codec:jar:1.12:compile
[INFO]    |     +- org.opensaml:opensaml-saml-impl:jar:3.3.0:compile
[INFO]    |     |  +- org.opensaml:opensaml-profile-api:jar:3.3.0:compile
[INFO]    |     |  |  \- org.opensaml:opensaml-core:jar:3.3.0:compile
[INFO]    |     |  |     \- io.dropwizard.metrics:metrics-core:jar:3.1.2:compile
[INFO]    |     |  +- org.opensaml:opensaml-saml-api:jar:3.3.0:compile
[INFO]    |     |  |  +- org.opensaml:opensaml-xmlsec-api:jar:3.3.0:compile
[INFO]    |     |  |  \- org.opensaml:opensaml-soap-api:jar:3.3.0:compile
[INFO]    |     |  +- org.opensaml:opensaml-security-impl:jar:3.3.0:compile
[INFO]    |     |  |  \- org.opensaml:opensaml-security-api:jar:3.3.0:compile
[INFO]    |     |  |     +- org.cryptacular:cryptacular:jar:1.1.1:compile
[INFO]    |     |  |     \- org.bouncycastle:bcprov-jdk15on:jar:1.54:compile
[INFO]    |     |  +- org.opensaml:opensaml-xmlsec-impl:jar:3.3.0:compile
[INFO]    |     |  \- net.shibboleth.utilities:java-support:jar:7.3.0:compile
[INFO]    |     |     +- com.google.guava:guava:jar:19.0:compile
[INFO]    |     |     \- joda-time:joda-time:jar:2.9:compile
[INFO]    |     +- org.opensaml:opensaml-xacml-impl:jar:3.3.0:compile
[INFO]    |     |  \- org.opensaml:opensaml-xacml-api:jar:3.3.0:compile
[INFO]    |     +- org.opensaml:opensaml-xacml-saml-impl:jar:3.3.0:compile
[INFO]    |     |  \- org.opensaml:opensaml-xacml-saml-api:jar:3.3.0:compile
[INFO]    |     +- org.jasypt:jasypt:jar:1.9.3:compile
[INFO]    |     \- org.apache.geronimo.javamail:geronimo-javamail_1.4_mail:jar:1.8.4:compile
[INFO]    +- org.apache.wss4j:wss4j-policy:jar:2.2.4:compile
[INFO]    |  \- org.apache.neethi:neethi:jar:3.1.1:compile
[INFO]    |     \- org.codehaus.woodstox:woodstox-core-asl:jar:4.4.1:compile
[INFO]    |        \- javax.xml.stream:stax-api:jar:1.0-2:compile
[INFO]    +- org.apache.wss4j:wss4j-ws-security-stax:jar:2.2.4:compile
[INFO]    |  \- org.apache.wss4j:wss4j-bindings:jar:2.2.4:compile
[INFO]    \- org.apache.wss4j:wss4j-ws-security-policy-stax:jar:2.2.4:compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.311 s
[INFO] Finished at: 2020-07-11T19:06:08Z
[INFO] ------------------------------------------------------------------------
````
