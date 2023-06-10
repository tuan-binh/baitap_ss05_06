package OOP;

public class Category {
    private int categoryId;
    private String categoryName;

    public Category() {
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public void display() {
        System.out.println("Mã Hàng: " + categoryId + "\nTên Hàng: " + categoryName);
    }
}
