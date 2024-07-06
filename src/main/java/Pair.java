import java.util.Objects;

public record Pair(int val1, int val2) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Math.abs(val1 - val2) == Math.abs(pair.val1 - pair.val2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Math.abs(val1 - val2));
    }
}
