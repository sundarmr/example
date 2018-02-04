The project depends on the parent project where the plugins are defined .
Override the below property values to change any of them for child project

```
<jolokiaUrl>${jolokiaUrl}</jolokiaUrl>
<profile>${profileName}</profile>
<profileVersion>${profileVersion}</profileVersion>
<serverId>${serverId}</serverId>
<parentProfiles>${parentProfiles}</parentProfiles>
<bundles>${bundles}</bundles>
<profileConfigDir>${profileConfigDir}</profileConfigDir>
<webContextPath>${webContextPath}</webContextPath>
<abstractProfile>${isAbstractProfile}</abstractProfile>
<includeArtifact>${isIncludeArtifact}</includeArtifact>
```

and place them in the properties section 
```
<properties>
  <profileName>somedifferentprofilename</profile>
  <profileVersion>1.1</profileVersion>
</properties>
```

Run mvn fabric8:deploy on the project to see the project getting deployed to the profile somedifferentprofilename with version 1.1 


Prerequisites

1. Create the server section on your maven settings file 
```
<servers>
    ...
    <server>
        <id>fabric8.maven.upload</id>
        <user>admin</user>
        <password>admin</password>
    </server>
  </servers>
  ```
2. If you want to over-ride the id of the server , you can do it so by changing the serverId property in your pom.xml . <servers>
<server><id> = serverId property in the fabric8 configuration
```
<properties>
  <serverId>myserver</serverId>
</properties>
```
Then the entry to maven settings becomes
```
<servers>
    ...
    <server>
        <id>myserver</id>
        <user>admin</user>
        <password>admin</password>
    </server>
</servers>
 ```
3. Also the fabric8 maven plugin is compatile with higher versions of maven , use any version of 3.3.x
