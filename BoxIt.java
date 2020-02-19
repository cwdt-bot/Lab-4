class BoxIt<T> implements Transformer<Object, Box<T>> {
    
    @SuppressWarnings("unchecked")
    public Box<T> transform(Object o) {
        return (Box<T>) Box.ofNullable(o); 
    }
}