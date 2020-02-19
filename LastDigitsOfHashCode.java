class LastDigitsOfHashCode implements Transformer<Object, Integer> {
    private final int k;

    public LastDigitsOfHashCode(int k){
        this.k = k;
    }
    
    public Integer transform(Object o) {
        int ohc = o.hashCode();
        return Math.abs((int) (ohc % Math.pow(10,k)));
    }
    
}