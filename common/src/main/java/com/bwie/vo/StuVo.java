package com.bwie.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName StuVo
 * @Description TODO
 * @Author 李奉武
 * @Motto 逆水行舟, 不进则退
 * @Date 2021/10/14 16:13
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StuVo {
    private Integer sid;
    private String sname;
    private String spassword;
    private String sex;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private Integer cid;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date minday;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date maxday;
}
