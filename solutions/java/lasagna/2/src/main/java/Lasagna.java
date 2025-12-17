public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int minutes){
        return expectedMinutesInOven() - minutes;
    }
   
    public int preparationTimeInMinutes(int layer){
        return layer * 2;
    }

    public int totalTimeInMinutes(int layer, int minutes){
        int layerMinutes = preparationTimeInMinutes(layer);
        return minutes + layerMinutes;
    }
}
