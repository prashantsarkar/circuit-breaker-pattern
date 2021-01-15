# CircuitBreakerPattern
#
# Approch 1 - using Docker Networking
#### Craete a docker network
> docker network create book-store-reading

#### Create an image and run on container for book-store micro-service
1. Create an application jar
> gradle clean build

2. Create an image from the location where Dockerfile is available for book-store micro-service
> docker image build -t book-store .
	
3. Run the docker container
> docker container run --network book-store-reading --name book-store -p 8081:8081 -d book-store

4. To check the container logs
> docker container logs book-store

#### Create an image and run on container for book-reading micro-service
1. Make changes in ``` BookService.java ``` file to change the URL from ``` localhost ``` to ``` book-store ```

2. Create an application jar
> gradle clean build

3. Create an image from the location where Dockerfile is available for book-reading micro-service
> docker image build -t book-reading .

4. Run the docker container
> docker container run --network book-store-reading --name book-store -p 8082:8082 -d book-reading

5. To check the container logs
> docker container logs book-reading

#
#### Test the microservice using below URL
> http://localhost:8082/to-read

#
# Approch 2 - using Docker Compose
#### Create an image and run on container for book-store micro-service
1. Create an application jar
> gradle clean build

2. Create an image from the location where Dockerfile is available for book-store micro-service
> docker image build -t book-store .

#### Create an image and run on container for book-reading micro-service
1. Make changes in ``` BookService.java ``` file to change the URL from ``` localhost ``` to ``` book-store ```

2. Create an application jar
> gradle clean build

3. Create an image from the location where Dockerfile is available for book-reading micro-service
> docker image build -t book-reading .

#### Run docker compose command from the location where docker-compose.yml is reasiding
> docker-compose up -d

#
#### Test the microservice using below URL
> http://localhost:8082/to-read
