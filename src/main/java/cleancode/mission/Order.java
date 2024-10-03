package cleancode.mission;

import java.util.List;

public class Order {
    List<Item> items;
    Customer customer;

    public Order(List<Item> items, Customer customer) {
        validate();
        this.items = items;
        this.customer = customer;
    }

    private void validate() {
        if(hasNoneItem()) {
            throw new IllegalArgumentException("주문 항목이 없습니다.");
        }
        if(hasTotalPrice()) {
            throw new IllegalArgumentException("올바르지 않은 총 가격입니다.");
        }
        if(hasCustomerInfo()) {
            throw new IllegalArgumentException("사용자 정보가 없습니다.");
        }
    }

    private boolean hasCustomerInfo() {
        return this.customer != null;
    }

    private boolean hasNoneItem() {
        return this.items == null || this.items.isEmpty();
    }

    private boolean hasTotalPrice() {
        return getTotalPrice() > 0;
    }

    private int getTotalPrice() {
        return items.stream()
            .mapToInt(Item::getPrice)
            .sum();
    }

}
