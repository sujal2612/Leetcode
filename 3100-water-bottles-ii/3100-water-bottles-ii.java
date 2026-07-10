class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int dr=numBottles;
        int mt=numBottles;
        while(mt>=numExchange){
            mt-=numExchange;
            numExchange++;
            dr++;
            mt++;
        }
        return dr;
    }
}