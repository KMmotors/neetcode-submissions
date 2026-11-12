class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;

        // Max pile size is the upper bound: eating that fast finishes each pile in 1 hour
        int maxSpeed = 0;
        for (int pile : piles) {
            maxSpeed = Math.max(maxSpeed, pile);
        }

        // Binary search for the smallest speed that works
        while (minSpeed < maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;
            if (canEatInTime(piles, h, mid)) {
                maxSpeed = mid;       // mid works, try slower
            } else {
                minSpeed = mid + 1;   // mid is too slow
            }
        }
        return minSpeed;
    }

    private boolean canEatInTime(int[] piles, int h, int speed) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;   // integer ceiling division
        }
        return hours <= h;
    }
}