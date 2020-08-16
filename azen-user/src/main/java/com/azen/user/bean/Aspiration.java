package com.azen.user.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("aspiration")
public class Aspiration {
    private Integer asId;
    private Integer coId;
    private Integer uId;
    private Commodity commodity;
}
