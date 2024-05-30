package Tugas3;

public class Cycle {
    public int wheels() {
        return 0; // Default number of wheels
    }
    public void ride() {
        System.out.println("Cycle ride with " + wheels() + " wheels");
    }
}

class Unicycle extends Cycle {
    @Override
    public int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    @Override
    public int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    @Override
    public int wheels() {
        return 3;
    }
}

class Cycles {
    public static void main(String[] args) {
        Cycle[] cycles = { new Unicycle(), new Bicycle(), new Tricycle() };
        for(Cycle c : cycles) {
            c.ride();
        }
    }
}
