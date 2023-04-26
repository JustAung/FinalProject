import java.util.Scanner;

class Chatbot {
    private Scanner scanner = new Scanner(System.in);
    private String name;

    public void startChat() {
        System.out.println("Hi! I'm The Accountabilibuddies. What's your name?");
        name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("How can I assist you today?");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.toLowerCase().contains("weather")) {
                API<String> weatherAPI = new WeatherAPI();
                ChatbotResponse response = callAPI(weatherAPI);
                System.out.println(response.getText());
            } else if (userInput.toLowerCase().contains("news")) {
                API<String> newsAPI = new NewsAPI();
                ChatbotResponse response = callAPI(newsAPI);
                System.out.println(response.getText());
            } else if (userInput.toLowerCase().contains("joke")) {
                API<String> jokeAPI = new JokeAPI();
                ChatbotResponse response = callAPI(jokeAPI);
                System.out.println(response.getText());
            } else {
                System.out.println("I'm sorry, I didn't understand your request. Please try again.");
            }
            System.out.println("What else can I help you with today?");
        }
    }

    // This method calls the given API and returns a ChatbotResponse object
    private <T> ChatbotResponse callAPI(API<T> api) {
        try {
            T data = api.getData();
            return new ChatbotResponse(data.toString());
        } catch (Exception e) {
            return new ChatbotResponse("I'm sorry, there was an error processing your request.");
        }
    }
}
