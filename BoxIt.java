class BoxIt<T> implements Transformer<T, Box<T>> {
    
    public Box<T> transform(T o) {
        return  Box.ofNullable(o); 
    }
}
