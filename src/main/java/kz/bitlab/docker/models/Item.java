package kz.bitlab.docker.models;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Item {
    private Long id;
    private String name;
    private int price;
}
