SET PATH=c:\Program Files\Java\jdk-16\bin\;%PATH%
SET JAVA_HOME=c:\Program Files\Java\jdk-16\

java --enable-preview --add-modules jdk.incubator.foreign -Dforeign.restricted=permit -jar target/cf-0.1-SNAPSHOT-jar-with-dependencies.jar