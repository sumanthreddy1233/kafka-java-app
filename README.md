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
