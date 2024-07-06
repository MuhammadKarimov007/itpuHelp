import java.util.Objects;

public record Pair(int a, int b) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Math.abs(a - b) == Math.abs(pair.a - pair.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Math.abs(a - b));
    }
}
