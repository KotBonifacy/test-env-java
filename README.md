# Environmnet setup for technical interview
1. Install Maven (https://maven.apache.org/download.cgi)
2. Install OpenJDK 19 (https://jdk.java.net/19/)
3. Add Maven and Java to your PATH variable.
4. Execute command: `mvn --version`. You should received something like this:
    > Apache Maven 3.9.0 (9b58d2bad23a66be161c4664ef21ce219c2c8584)
    >
    > Maven home: C:\Program Files\apache-maven\apache-maven-3.9.0
    >
    > Java version: 19.0.2, vendor: Oracle Corporation, runtime: C:\Program Files\OpenJDK\jdk-19.0.2
    >
    > Default locale: en_US, platform encoding: UTF-8
    >
    > OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

# Verify your setup
1. Open command line from the repository folder.
2. Run command `mvn spring-boot:run`. After a few seconds you should see following log:
    > => Open your favorite web browser and go to address: localhost:8080 <=

    Open browser and check mentioned address.
3. Stop running process.
4. That's it, if point 2 works, you are ready for technical interview.

# Troubleshooting
1. If you are not able to resolve potential problems you can send us an email with description and we will try to help.
2. If you are familiar with Visual Studio Code, you can install Live Share extension so we can share a live session with you.