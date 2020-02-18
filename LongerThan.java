class LongerThan implements BooleanCondition<String> {
    private final int len;

    public LongerThan(int x) {
        this.len = x;
    }

    public boolean test(String s) {
        if (s == null) {
            return false;
        }
        return s.length()>len;
    }
}