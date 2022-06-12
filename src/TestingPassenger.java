import java.util.ArrayList;
import java.util.List;

public static class TestingPassengers {


    public static List<Passenger> sortPassengers(List<Passenger> listToSort) {
        for (int i = 0; i < listToSort.size() - 1; i++) {
            for (int j = i + 1; j < listToSort.size(); j++) {
                if (listToSort.get(i).getFirstName().compareTo(listToSort.get(j).getFirstName()) > 0) {
                    Passenger temp = listToSort.get(i);
                    listToSort.set(i, listToSort.get(j));
                    listToSort.set(j, temp);
                }
            }
        }
        return listToSort;
    }

    public static void main(String[] args) {
        List<Passenger> passengersList = new ArrayList<>();
        passengersList.add(new Passenger("Edgar", "Gomez", 27, "2102101234", "1"));
        passengersList.add(new Passenger("Tony", "Tony", 30, "1231231234", "2"));
        passengersList.add(new Passenger("Name", "lastName", 20, "1231231234", "3"));
        passengersList.add(new Passenger("Abc", "Xyz", 30, "1231231234", "4"));
        passengersList.add(new Passenger("LastOne", "Last", 33, "1231234123", "5"));

        List<Passenger> sortedList = sortPassengers(passengersList);
        for (int n = 0; n < sortedList.size(); n++) {
            System.out.println(passengersList.get(n).getFirstName());
        }
    }
}
