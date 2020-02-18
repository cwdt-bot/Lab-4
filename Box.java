class Box<T> {
    protected final T item;
    private static final Box<? super Object> EMPTY_BOX = new Box<>(null);

    private Box (T item) {
        this.item = item;
    }

    static <T> Box<T> of(T item) {
        if (item == null) {
            return null;
        } else {
            return new Box<T>(item);
        }
    }

    static <T> Box<T> ofNullable(T item) {
        if (item == null) {
            return Box.empty();
        } else {
            return new Box<T>(item);
        }
    }

    static <U> Box<U> empty() {
        return (Box<U>) EMPTY_BOX;
    }

    T get() {
        return this.item;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Box<?>) {
            Box<T> obox = (Box<T>) other;
            if (this.get() == null || obox.get() == null) {
                return this.get() == obox.get();
            }
            return this.get().equals(obox.get());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "[" + item + "]";
    }

    boolean isPresent() {
        return this.get() != null;
    }



    <U> Box<U> filter(BooleanCondition<U> x) {
        if (x.test(this) == false) {
            return Box.empty();
        } else {
            return this;
        }
    }
    
}