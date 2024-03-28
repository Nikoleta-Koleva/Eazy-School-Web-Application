package com.eazybytes.eazyschool.model;

import lombok.Data;

/*
LOMBOK - Java library with annotations aimed at avoiding
writing Java code known to be repetitive and boilerplate
like getters/setters/constructors.
Autogenerates the methods during the build process, and
they are not present in the source code.

POJO class
*/
@Data
public class Holiday {
    private final String day;
    private final String reason;
    private final Type type;

    //Enum - special Java type defining set of constants
    public enum Type {
        FESTIVAL, FEDERAL
    }
}
