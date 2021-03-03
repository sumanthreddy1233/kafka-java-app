# kafka-java-app

## Team Lead
* Sumanth Reddy Naidu - https://github.com/sumanthreddy1233

## Team Members
* Sumana Reddy Reddybathula - https://github.com/sumana-reddy
* Navya Devineni - https://github.com/navyadevineni
* Vishal Reddy Vennavaram - https://github.com/Vishalreddy114
* Swaroopa Tirumalareddy - https://github.com/swaroopatirumalareddy
* Krishna Sumanth Koyyalamudi - https://github.com/Krishna-Koyyalamudi

## Individual Consumer-Producer Examples
* Sumana Reddy: https://github.com/sumana-reddy/kafka-consumer-producer
* Navya Devineni: https://github.com/navyadevineni/kakfa-java

## Sumana Producer-Consumer Compile and Build a Fat Jar File

Open PowerShell as Administrator in the root project folder, compile the code using Maven and create an executable jar file. Generated artificacts can be found in the new 'target' folder.

Recommendation:  Run this command each time you make code changes. 

```PowerShell
mvn clean compile assembly:single
```

## 1 - Run Zookeeper Service

Start and keep running the Zookeeper service.

## 2 - Run Kafka Service

Start and keep running the Kafka service.

## 3 - Start Consumer

Open PowerShell as Administrator in the root project folder, start the original consumer app:

```PowerShell
java -cp target/kafka-consumer-producer-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata.sumana.Consumer con-prod group1
```

## 4 - Start Producer

Open a new PowerShell as Administrator in the root project folder, start the Producer app using topic test:

```PowerShell
java -cp target/kafka-consumer-producer-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.bigdata.sumana.ProducerBySumana con-prod
```

## Test Communications

Verify messages are output by the Consumer.

## Krishna Sumanth Koyyalamudi - https://github.com/Krishna-Koyyalamudi

I have created various combinations of sandwich with different meat, cheese and veggie options using random generator for my custom producer package.

### Commands for kafka environment
* Open PowerShell in C:\kafka_2.13-2.7.0 folder.
* Use a different PowerShell window for each process.

Window 1 - Start Zookeeper Service
```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
Window 2 - Start Kafka Service
```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```
Window 3 - Create your topic name
```
.\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --create --topic krish-kafka
```
* Open PowerShell as Administrator in your root project folder kafka-java-app folder
  
Window 4 - Compile and build the jar file
```
mvn clean compile assembly:single
```
Window 5 - Start Consumer
```
 java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.sumanth.Consumer krish-kafka group1
```
Window 6 - Start Producer
```
java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.sumanth.KrishnaProducer krish-kafka
```
## Sumanth Reddy Naidu - Kafka commands

I generated the random number with double data type and added 2 for it so that the result will be two more than the generated number.

### Commands for kafka environment
* Open PowerShell in C:\kafka_2.13-2.7.0 folder.
* Use a different PowerShell window for each process.

Window 1 - Start Zookeeper Service
```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
Window 2 - Start Kafka Service
```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```
Window 3 - Create your topic name
```
.\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --create --topic 
```
* Open PowerShell as Administrator in your root project folder kafka-java-app folder
  
Window 4 - Compile and build the jar file
```
mvn clean compile assembly:single
```
Window 5 - Start Consumer
```
 java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.sumanth.Consumer sum group1
```
Window 6 - Start Producer
```
java -cp target/kafka-java-app-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.sumanth.SumanthProducer sum
```

## Navya Devineni - Kafka Producer-Consumer commands 

Commands I used to complete this assignment are:

- Start Zookeeper service:
```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
- Start Kafka service:
```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```
- Created a topic using the below command:
```
.\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --create --topic producerconsumer-message
```
- Build a jar file using the following command:
```
mvn clean compile assembly:single
```
- Run the consumer class using the below command:
```
java -cp target/kafka-java-1.0-SNAPSHOT-jar-with-dependencies.jar com.nwmissouri.navyadevineni.Consumer producerconsumer-message group1
```
- Run the producer class using the below command:
```
java -cp target/kafka-java-1.0-SNAPSHOT-jar-with-dependencies.jar com.nwmissouri.navyadevineni.Producer producerconsumer-message
```
