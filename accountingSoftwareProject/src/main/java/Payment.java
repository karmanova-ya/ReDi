public class Payment {
    private int id;
    private double amount;
    private Category category;
    private Integer month;
    private int year;

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", amount=" + amount +
                ", category=" + category +
                ", month=" + DateUtils.month(month) +
                ", year=" + year +
                '}';
    }

    public Payment(int id, double amount, Category category, int month, int year) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.month = month;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}