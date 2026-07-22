import java.util.*;

class Solution {
    public boolean canCross(int[] stones) {
        if (stones[1] != 1) return false;

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int stone : stones) {
            map.put(stone, new HashSet<>());
        }
        map.get(1).add(1);

        for (int i = 1; i < stones.length; i++) {
            int currentPos = stones[i];
            Set<Integer> previousJumps = map.get(currentPos);
            for (int k : previousJumps) {
                for (int nextJump = k - 1; nextJump <= k + 1; nextJump++) {
                    if (nextJump > 0) {
                        int nextPos = currentPos + nextJump;
                        if (map.containsKey(nextPos)) {
                            map.get(nextPos).add(nextJump);
                        }
                    }
                }
            }
        }
        return !map.get(stones[stones.length - 1]).isEmpty();
    }
}