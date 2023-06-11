package org.example.entity;

public class Product {
        private  int id ;
        private  String name ;
        private String createData ;

        private  int categoryId ;
        private  int brandId ;

    public Product(int id, String name, String createData, int categoryId, int brandId) {
        this.id = id;
        this.name = name;
        this.createData = createData;
        this.categoryId = categoryId;
        this.brandId = brandId;
    }

}
