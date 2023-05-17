package org.daming.graphql.entity.input;

import com.google.common.base.MoreObjects;

public class AuthorInput {

    private String idCardNo;

    private String name;

    private Integer age;

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AuthorInput(String idCardNo, String name, Integer age) {
        this.idCardNo = idCardNo;
        this.name = name;
        this.age = age;
    }

    public AuthorInput() {
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("idCardNo", idCardNo)
                .add("name", name)
                .add("age", age)
                .toString();
    }
}
