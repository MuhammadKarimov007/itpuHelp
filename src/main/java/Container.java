import java.util.*;


public class Container {
    private Set<Pair> pairs;

    public Container() {
    }

    public Container(List<Pair> list) {
        this.pairs = new HashSet<>(list);
    }

    public List<String> process() {
        List<String> processedNums = new ArrayList<>();

        for (Pair pair : pairs) {
            int pairSum = pair.val1() + pair.val2();
            if ( pairSum > 0 ) {
                processedNums.add(Integer.toString(pairSum));
            }
        }

        processedNums.sort(Comparator.reverseOrder());

        return processedNums;
    }

    public void removeOnCondition() {
        pairs.removeIf(tempPair -> tempPair.val1() * tempPair.val2() >= 0);
    }
}
