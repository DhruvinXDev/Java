
class methodoverloading {

    void display() {
        System.out.println("Default Argument Method");
    }

    void display(int a) {
        System.out.println("Default Argument Method");
    }

    void display(int a, int b) {
        System.out.println("Default Argument Method");
    }

}

class MainOfMethodoverriding {

    public static void main(String[] args) {
        methodoverloading ma = new methodoverloading();
        ma.display();

    }
}
