package com.limbo.union;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.stream.IntStream;

/**
 * D	[2251]花期内花的数目	50.9%	Hard	0.0%
 */
public class FullBloomFlowersSolution {

    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        TreeMap<Integer, Integer> cnt = new TreeMap<>();
        for (int[] flower : flowers) {
            cnt.put(flower[0], cnt.getOrDefault(flower[0], 0) + 1);
            cnt.put(flower[1] + 1, cnt.getOrDefault(flower[1] + 1, 0) - 1);
        }
        int m = people.length;
        Integer[] indices = IntStream.range(0, m).boxed().toArray(Integer[]::new);
        Arrays.sort(indices, Comparator.comparingInt(i -> people[i]));
        int[] ans = new int[m];
        int curr = 0;
        for (int x : indices) {
            while (!cnt.isEmpty() && cnt.firstKey() <= people[x]) {
                curr += cnt.pollFirstEntry().getValue();
            }
            ans[x] = curr;
        }
        return ans;
    }

}
