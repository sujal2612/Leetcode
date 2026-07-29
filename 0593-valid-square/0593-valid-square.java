class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] dists = new int[]{
            distSq(p1, p2),
            distSq(p1, p3),
            distSq(p1, p4),
            distSq(p2, p3),
            distSq(p2, p4),
            distSq(p3, p4)
        };
        
        Arrays.sort(dists);
        
        return dists[0] > 0 &&                       
               dists[0] == dists[1] &&                
               dists[1] == dists[2] && 
               dists[2] == dists[3] && 
               dists[4] == dists[5];                 
    }

    private int distSq(int[] a, int[] b) {
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }
}