# kafka-java-app

## Team Lead
* Sumanth Reddy Naidu - https://github.com/sumanthreddy1233

## Team Members
* Sumana Reddy Reddybathula - https://github.com/sumana-reddy
* Navya Devineni - https://github.com/navyadevineni
* Vishal Reddy Vennavaram - https://github.com/Vishalreddy114
* Swaroopa Tirumalareddy - https://github.com/swaroopatirumalareddy
* Krishna Sumanth Koyyalamudi - https://github.com/Krishna-Koyyalamudi

## Compile and Build a Fat Jar File

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
java -cp target/kafka-case-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.isl.professorcase.kafka.CustomConsumer
```

## 4 - Start Producer

Open a new PowerShell as Administrator in the root project folder, start the Producer app using topic test:

```PowerShell
java -cp target/kafka-case-1.0-SNAPSHOT-jar-with-dependencies.jar edu.nwmissouri.isl.professorcase.kafka.CustomProducer
```

## Test Communications

Verify messages are output by the Consumer.
