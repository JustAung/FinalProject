class NewsAPI extends API<String> {
    @Override
    public String getData() throws Exception {
        // Code to call news API and retrieve news headlines
        return "Here are the latest news headlines:\nBreaking news story: Elf Maids?\nThe search for a village with elf maidens are still rampant "
        		+ "\nPlease report to Dr. Johnson as soon as the village is found";
    }
}
