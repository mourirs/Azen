package com.azen.root.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("order")
public class Order {
    private Integer oId;
    private Integer uId;
    private String oNumber;
    private String oCrateTime;
    private Integer oGold;
    private Integer aId;
    private String oName;
    private Integer oPrice;
    private Integer oNum;
    private Integer oStatue;
    private String coImage;
    private Address address;
}
