package delivery.dto;


import delivery.utils.RandomDataGenerator;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class OrderDto {

    private String status;
    private int courierId;
    private String customerName;
    private String customerPhone;
    private String comment;
    int id;

    // static method to use factory
    public static OrderDto createRandomOrder() {
        return OrderDto.builder()
                .status("OPEN")
                .courierId(RandomDataGenerator.generateCourierId())
                .customerName(RandomDataGenerator.generateName())
                .customerPhone(RandomDataGenerator.generatePhoneNumber())
                .comment(RandomDataGenerator.generateComment())
                .id(RandomDataGenerator.generateId())
                .build();
    }
}

