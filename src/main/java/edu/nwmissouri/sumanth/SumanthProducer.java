package edu.nwmissouri.sumanth;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.Random;
import java.util.Scanner;


public class SumanthProducer{
  private static Scanner in;

  public static void main(String[] argv) throws Exception {
    if (argv.length != 1) {
      System.err.println("Please specify 1 parameter (the name of the topic)");
      System.exit(-1);
    }
    String topicName = argv[0];
    in = new Scanner(System.in);
    System.out.println("Thank you for providing the topic " + topicName + "\n");
    System.out.println("Enter message (type exit to quit).\n");

    // Configure the Producer
    Properties configProperties = new Properties();
    configProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
    configProperties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
        "org.apache.kafka.common.serialization.ByteArraySerializer");
    configProperties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
        "org.apache.kafka.common.serialization.StringSerializer");
    System.out.println("The configuration properties are: " + configProperties.toString());
    System.out.println("\nWill use this configuration to create a producer.\n");

    org.apache.kafka.clients.producer.Producer producer = new KafkaProducer(configProperties);

    // Make our own messages - create your custom logic here
    String msg="Addition of two numbers..";
    ProducerRecord<String, String> rec1 = new ProducerRecord<String, String>(topicName, msg);
    producer.send(rec1);

    for (int i = 1; i <= 10; i++) {
      String message = additionOfTwoNumbers();
      ProducerRecord<String, String> rec = new ProducerRecord<String, String>(topicName, message);
      producer.send(rec);
    }

    // still allow input from keyboard
	System.out.println("send two numbers as input");
    String line = in.nextLine();
    while (!line.equals("exit")) {
      ProducerRecord<String, String> rec = new ProducerRecord<String, String>(topicName, additionOfTwoNumbers1(line));
      producer.send(rec);
      line = in.nextLine();
    }

    in.close();
    producer.close();

  }

 private static String additionOfTwoNumbers() {

        int[] Arr= {1,23,32,12,33,23,14,44,43,17};
        String str;
    	Random r = new Random();
    	int a = r.nextInt(40-10)+10;
        int b = r.nextInt(25-1)+1;
    	    str="The result for addition is"+(Arr[b]+a);
    		}
    	return str;

        }
	private static String additionOfTwoNumbers1(String num1, String num2) {
			 int g =Integer.parseInt(num1);
             int h = Integer.parseInt(num2);
             String str;
    	int b = g + h;

    		str="your guessed the correct number"+b ;
    
    	return str;

        }
}