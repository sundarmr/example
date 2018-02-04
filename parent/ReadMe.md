This project acts as a guide project for all the projects which refer to this project as parent in their pom as below

```
  <parent>
      <groupId>com.city</groupId>
      <artifactId>parent</artifactId>
      <version>1.0.0</version>
  </parent>
 ```
 
 1. The project depends on the Fuse Bill of Materials and Includes Fuse and Jboss GA an Early access repositories
 2. If defined the plugins to be used in the project in generic way 
 

### maven-bundle-plugin

 
1. The plugin is configured with default set of values for all the project which are parameterized in the properties section.
2. The projects which inherit this project will now not need to declare the plugin in the plugins section.All that needs to be done is 
   define the below properties in properties section of the pom
   
```
<properties>
    <osgi.exclude.dependencies>true</osgi.exclude.dependencies>
		<osgi.activator>If there is an activator class in the bundle<osgi.activator>
		<osgi.import.package>*</osgi.import.package>
		<osgi.export.package>com.city.service</osgi.export.package>
		<osgi.private.package>com.city.service.profile</osgi.private.package>
		<osgi.import.service>*</osgi.import.service>
		<osgi.export.service>*</osgi.export.service>
<properties>
```
3. The default values are configured to * , so if it is the same value we need these properties need not be defined.
4. Declare the property which needs to be over-ridden.


### fabric8-maven-plugin

The plugin is configured as the maven-bundle-plugin and follows the same rules with the below properties

```
<properties>
  <profileName>differentProfile</profileName>
  <profileVersion>1.0</profileVersion>
  <serverId>differentServer</serverId>
  <jolokiaUrl>http://differentserver:differentport/jolokia</jolokiaUrl>
  <parentProfiles>default otherprofile</parentProfiles>
  <profileConfigDir>different directory</profileConfigDir>
  <isAbstractProfile>true</isAbstractProfile>
  <isIncludeArtifact>true</isIncludeArtifact>
</properties>
</properties>
```

### Migration to a different version of Fuse

The parent project provides a distinct advantage in that , when migrating to a different version of fuse , the versions can be 
updated here and will be reflected to all the child  projects on compilation.
