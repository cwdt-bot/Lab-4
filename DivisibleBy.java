class DivisibleBy implements BooleanCondition<Integer> {
    protected final int dvsr;

    public DivisibleBy(int x) {
        this.dvsr = x;
    }

    public boolean test(Integer y) {
        if (y == null) {
            return false;
        }
        return y%dvsr == 0;
    }
}