package com.ivoronline.springboot_qiockstart_beans_create_from_applicationproperties_class.data;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Component
@ConfigurationProperties("person1.property") //Use Setters after Bean creation
public class Person {
  public String  name;
  public Integer age;
}
