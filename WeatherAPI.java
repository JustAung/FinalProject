class WeatherAPI extends API<String> {
    @Override
    public String getData() throws Exception {
        // Code to call weather API and retrieve weather information
        return "The current temperature is 47°F and it's partly cloudy.";
    }
}
