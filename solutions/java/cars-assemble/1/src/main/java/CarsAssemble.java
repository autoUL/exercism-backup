public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        if ((speed >= 1)&&(speed <= 4)){
            return speed*221;
        }
        else if ((speed >= 5)&&(speed <= 8)){
            return 0.9*(speed*221);
        }
        else if (speed == 9){
            return 0.8*(speed*221);
        }
        else{
            return 0.77*(speed*221);
        }
    }

    public int workingItemsPerMinute(int speed) {
        
        return ((int)new CarsAssemble().productionRatePerHour(speed))/60;
    }
}
