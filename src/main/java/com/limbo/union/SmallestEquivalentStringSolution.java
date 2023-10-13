package com.limbo.union;

/**
 * ✔	[1061]按字典序排列最小的等效字符串	64.7%	Medium	0.0%
 */
public class SmallestEquivalentStringSolution {

    public static int[] unionSet = new int[26];
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int offset = 97;

        init();

        int p, q;
        for (int i = 0; i < s1.length(); i++) {
            p = s1.charAt(i)-offset;
            q = s2.charAt(i)-offset;
            union(p,q);
        }

        char[] result = new char[baseStr.length()];
        for (int i = 0; i < baseStr.length(); i++) {
            result[i] = (char)(find(baseStr.charAt(i) - offset) + offset);
        }

        return new String(result);
    }


    public static void init() {
        for (int i = 0; i < unionSet.length; i++) {
            unionSet[i] = i;
        }
    }

    public static int find(int p) {
        while (unionSet[p] != p){
            p = unionSet[p];
        }
        return unionSet[p];
    }

    public static void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        }
        if (pRoot < qRoot) {
            unionSet[qRoot] = pRoot;
        } else {
            unionSet[pRoot] = qRoot;
        }
    }

}
