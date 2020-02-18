class LastDigitOfHashCode implements Transformer<Object, Integer> {

    public Integer transform(Object o) {
        return o.hashCode();
    }
    
}