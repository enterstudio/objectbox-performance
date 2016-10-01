package io.objectbox.performanceapp;

/**
 * Created by Markus on 01.10.2016.
 */
public class TestType {
    public static final String BULK_OPERATIONS = "Bulk operations (CRUD)";
    public static final String BULK_OPERATIONS_INDEXED = "Bulk operations (CRUD) - indexed";
    public static final String LOOK_UP_STRING = "Look up string using index";

    public final String name;
    public final String nameShort;

    public TestType(String name, String nameShort) {
        this.name = name;
        this.nameShort = nameShort;
    }

    @Override
    public String toString() {
        return name;
    }
}
