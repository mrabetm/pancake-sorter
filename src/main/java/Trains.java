import java.util.ArrayList;

import java.util.List;



public class Trains {

    private List<Train> trainList;



    public Trains() {

        trainList = new ArrayList<>();

    }



    // Add a new train to the system

    public void addTrain(Train train) {

        // Placeholder: Add train logic here

        trainList.add(train);

    }



    // Get the number of trains in the system

    public int getNumberOfTrains() {

        // Placeholder: Get number of trains logic here

        return trainList.size();

    }



    // Get information about a specific train by its ID

    public Train getTrainById(int trainId) {

        // Placeholder: Get train by ID logic here

        for (Train train : trainList) {

            if (train.getId() == trainId) {

                return train;

            }

        }

        return null; // Return null if the train with the given ID is not found

    }



    // Placeholder for the Train class

    private class Train {

        private int id;

        private String name;



        public Train(int id, String name) {

            this.id = id;

            this.name = name;

        }



        public int getId() {

            return id;

        }



        public String getName() {

            return name;

        }

    }

}
