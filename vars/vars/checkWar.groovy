
def call() {
    echo 'Shared Library: Verifying WAR artifact'

    sh 'ls -lh target/*.war'
}
