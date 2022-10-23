package com.example.capybara.common;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilterRequest<T>{

    private String key;

    private Operator operator;

//    private FieldType fieldType; --> T : class   + key

    // object puede ser generic
    public Object getAtributeType(){
        return  T[this.key].class;
    }

    /*
    class Product {
        private String name;
        ....
    }

    t.[key].class --> string

     */

    private  Object value;

    private  Object valueTo;

    private  List<Object> values;

}
