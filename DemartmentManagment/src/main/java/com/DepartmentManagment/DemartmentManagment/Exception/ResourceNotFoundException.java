package com.DepartmentManagment.DemartmentManagment.Exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String dataNotPresent) {
        super(dataNotPresent);
    }

    public ResourceNotFoundException(){
        super("Resource not found excaption!!");
    }
}
