package com.heima.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: JD
 * Package: com.heima.demo2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JD implements Switch{
    private String name;
    private boolean status;//状态 默认关闭

    @Override
    public void press() {
        //按键控制开关
        status=!status;
    }

}
