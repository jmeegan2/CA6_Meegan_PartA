interface Predator {

    //Abstract method eat (Prey prey)
    void eat(Prey prey);

    //Abstract method hunt (Prey prey)
    boolean hunt(Prey prey);

}

interface Prey {

    //Abstract method nutrition
    int nutrition();
}

class RoboHunter implements Predator {

    //method eat(Prey prey)
   //Override the method in Predator interface
    public void eat(Prey prey) {
        System.out.println("RoboHunter has killed the prey up with a laser");
    }

    //Method hunt(Prey prey)
    //Override the method in Predator Interface
    //Hunt is always successful for RoboHunters
    public boolean hunt(Prey prey) {
        System.out.println(this.toString() + " is hunting the" + prey.toString());
        return true;
    }
    //toString method
    @Override
    public String toString() {
        return "RoboHunter";
    }

    }

    //Bait
    //Implements Prey
    class Bait implements Prey {
        /**
         * overriding nutrition() method
         * of Prey interface
         * nutrition is always zero for Baits
         */
        public int nutrition() {
            return 0;
        }
        /** toString() Method */
        @Override
        public String toString() {
            return "Bait";
        }
    }

    /** Main Class which is used for testing */

    class Main {
        /** Main method */
        public static void main(String[] args) {
            RoboHunter roboHunter = new RoboHunter();
            Bait bait = new Bait();
            System.out.println("Nutrition of Bait: " + bait.nutrition());
            nature(roboHunter, bait);
        }

        /**
         * nature(Predator predator, Prey prey)
         * this method takes in predator and prey instances
         * the predator eats the prey if the hunt is successful
         * the hunt is always successful because RoboHunters is a good shot
         */
        public static void nature(Predator predator, Prey prey) {
            if (predator.hunt(prey)) {
                predator.eat(prey);
            }
        }
    }
