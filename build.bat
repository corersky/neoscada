SET MAVEN_OPTS=-Xms1024m -Xmx3072m
mvn -B -Dorg.slf4j.simpleLogger.defaultLogLevel=INFO  -Dmaven.test.failure.ignore=true -Dmaven.test.skip=true clean install