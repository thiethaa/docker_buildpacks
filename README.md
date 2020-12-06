# docker_buildpacks
Dockerize spring boot using Cloud Native BuildPacks
adding Maven Docker plugin and Customize Docker Image Name:

      <build>
          <plugins>
              <plugin>
                  <groupId>org.springframework.boot</groupId>
                  <artifactId>spring-boot-maven-plugin</artifactId>
                  <configuration>
                      <image>
                          <name>docker.io/thiethaa/${project.artifactId}:latest</name>
                      </image>
                  </configuration>
              </plugin>
          </plugins>
      </build>
 
 build docker image :
 
        ./mvnw spring-boot:build-image
        
run and build Docker container:

         docker run -d -p 4242:4242 --name buildpackcontainer thiethaa/docker_buildpacks 
