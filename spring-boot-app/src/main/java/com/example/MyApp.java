package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
@RestController
public class MyApp {

	@Value("${greeting.message}")
    private String content;
	
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public Message displayMessage() {
    	String greetingMsgEnvironment = System.getenv().getOrDefault("GREETING_MESSAGE", "");
    	System.out.println("System map = " + System.getenv());
    	System.out.println("Content is  " + content);
    	
        return new Message(content, greetingMsgEnvironment);
    }
    
    
    @RequestMapping("/cpuspin/{percentage}/{duration}")
    @ResponseBody
    public String cpuspin(@PathVariable("percentage") int percentage, @PathVariable("duration") int duration) {
    	long currentTime = System.currentTimeMillis();
    	long stopTime = currentTime + duration;
    	
    	while(currentTime < stopTime) {
    		// Sleep a percentage every 100 milliseconds
    		if ((System.currentTimeMillis() - currentTime) >= (100 - percentage)) {
    			try {
					Thread.sleep(percentage);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
    			currentTime = System.currentTimeMillis();
    		} 
    	}
    	
        return "DONE";
    }
    
    @RequestMapping("/memoryhog/{kbytesPerMilliSecond}/{duration}")
    @ResponseBody
    public String memoryhog(@PathVariable("kbytesPerMilliSecond") int kbytesPerMilliSecond, @PathVariable("duration") int duration) {
    	// Slowly allocating JVM memory
    	Map<Integer,byte[]> map = new HashMap<Integer, byte[]>();
    	for (int i = 0; i < duration; i ++) {
    		map.put(i, new byte[1024*kbytesPerMilliSecond]);
    		try {
				Thread.sleep(1L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    	return "DONE";
    }
    

    final class Message {
    	private String content;
    	private String envValue;
    	
    	public Message(String value, String envValue) {
    		this.content = value;
    		this.envValue = envValue;
    	}
        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
        
		public String getEnvValue() {
			return envValue;
		}
        
        
    }
}

