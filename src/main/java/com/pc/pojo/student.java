package com.pc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class student {
    public Integer id;
    public String name;
    public Integer age;
    public String sex;
}
