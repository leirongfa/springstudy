package com.lei.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class person {
    @Autowired
    private cat cat;
    @Autowired
    @Qualifier(value = "dog2")//起个名字dog2,
    private  dog dog;
    private String name;

    @Override
    public String toString() {
        return "person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public com.lei.pojo.cat getCat() {
        return cat;
    }

    public void setCat(com.lei.pojo.cat cat) {
        this.cat = cat;
    }

    public com.lei.pojo.dog getDog() {
        return dog;
    }

    public void setDog(com.lei.pojo.dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
