# Auto Tuning Pid Controllers

### Reccommended Setup
Clone this repository and follow the tuning guide https://docs.google.com/document/d/1bymQrM0Fjh6iF8rk0LOnRxAvZ4Z7ZZ_rhb6DtUqgZno/edit?usp=sharing

### If you want to implement this into you own repository
1. Edit TeamCode build.gradle and add ```repositories{maven { url 'https://jitpack.io' }
 maven { url 'https://maven.brott.dev/' }}```
2. In the project build.gradle (name of repository - build.gradle) remove the ```repositories {
    mavenCentral()
}``` at the bottom of the file.
3. Change gradle version to 7.4
4. Inside the FTCRobotController module, under src/main, open AndroidManifest.xml, and add this ```
      tools:replace = "android:icon,android:theme"``` below ```android:usesCleartextTraffic="true"```
5. In the build.common.gradle change ```compileSdkVersion 29``` to ```compileSdkVersion 34```
6. In Android Project view -> under .gradle -> wrapper -> gradle-wrapper.properties -> change distribution url to ```distributionUrl=https\://services.gradle.org/distributions/gradle-7.5-bin.zip```
## All set!
