abstract class API<T> {
    // This method should be implemented by the child classes to retrieve the data
    public abstract T getData() throws Exception;
}
