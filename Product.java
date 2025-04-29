    public abstract class Product {
        private String id;
        private String name;
        double price;

        public Product(String id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public abstract double calculateTotalPrice(int quantity);


        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        } //cau 1
    }
