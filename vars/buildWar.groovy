
def call() {
    echo 'Shared Library: Building Maven application'

    sh 'mvn -B -Djdk.version=1.8 clean test org.apache.maven.plugins:maven-war-plugin:3.4.0:war'
}
