class Main {
  public static void main(String[] args) {
    Customer customer = new Customer("Arthur");
    Movie movie = new Movie("Interestelar", 0);
    Rental rental = new Rental(movie, 7);
    System.out.println("Hello world!");
  }
}