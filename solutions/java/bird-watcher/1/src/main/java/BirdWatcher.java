
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdsCounted = {0, 2, 5, 3, 7, 8, 4};
        return birdsCounted;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
                birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] == 0){
                return true;
            }
        } 
            return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int end = Math.min(numberOfDays, birdsPerDay.length);
        for(int i = 0; i < end; i++){
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] >= 5){
                busyDays += 1;
            }
        } 
            return busyDays;
    }
}
