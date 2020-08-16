package com.azen.user.bean;

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

    public Order(Integer uId, String oNumber, String oCrateTime, Integer oGold, Integer aId, String oName, Integer oPrice, Integer oNum, Integer oStatue) {
        this.uId = uId;
        this.oNumber = oNumber;
        this.oCrateTime = oCrateTime;
        this.oGold = oGold;
        this.aId = aId;
        this.oName = oName;
        this.oPrice = oPrice;
        this.oNum = oNum;
        this.oStatue = oStatue;
    }
}
