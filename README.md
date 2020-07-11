# maven-gradle-resolution

Example to show different dependency resolution for `"org.apache.wss4j:wss4j-ws-security-common:2.2.4"`

The [Maven POM](https://github.com/apache/ws-wss4j/blob/wss4j-2.2.4/ws-security-common/pom.xml#L109) for `"org.apache.wss4j:wss4j-ws-security-common:2.2.4"`
contains a dependency on `"org.opensaml:opensaml-saml-impl:3.3.0"`, having exclusions on:

- `org.opensaml:opensaml-soap-impl`
- `org.opensaml:opensaml-storage-api`
- `org.opensaml:opensaml-messaging-api`
- `org.apache.velocity:velocity`
- `org.apache.httpcomponents:httpclient`
- `com.google.code.findbugs:jsr305`

Maven does consider those exclusions, so that they won't appear in the compile classpath.
Gradle seems to ignore those exclusions, so they actually do appear in the compile classpath.
