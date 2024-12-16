package example.spring;

public class Welcome_Service implements Greeting_Service {
    @Override
    public String greetings() {  
        return "Hello... Welcome Service!";
    }
}
