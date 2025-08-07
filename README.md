# i2b2-server-common
A group of common server files that are used by the i2b2 cells.

## Building the Software

### Prerequisites

The following software and tools are required:

- [OpenJDK 8](https://docs.microsoft.com/en-us/java/openjdk/download)
- [Apache Maven 3.x.x](https://maven.apache.org/download.cgi)

### Building the JAR File

Open up a terminal in the folder **i2b2-server-common** and execute the following command to build the JAR file:

```
mvn clean package
```

The JAR file ***i2b2Common-core.jar*** is located in the directory ```i2b2-server-common/target```.

### Installing as Maven Dependency (Library)

Open up a terminal in the folder **i2b2-server-common** and execute the following command to compile and add to Maven local repository:

```
mvn clean install
```

The jar library should be installed in the Maven default local repository:

###### Windows:

```
C:\Users\<username>\.m2\repository\edu\harvard\i2b2\server-common
```

###### Linux:

```
/home/<username>/.m2/repository/edu/harvard/i2b2/server-common
```

###### Mac:

```
/Users/<username>/.m2/repository/edu/harvard/i2b2/server-common
```
