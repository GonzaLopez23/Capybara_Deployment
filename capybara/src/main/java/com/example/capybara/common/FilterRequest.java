package com.example.capybara.common;


import com.example.capybara.entities.Base;
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
public class FilterRequest<T extends Base>  {

    private String key;

    private Operator operator;

//    private FieldType fieldType; --> T : class   + key

    // object puede ser generic

    /*
    public Object getAtributeType(){
        Class cls = T.key.getClass();
        return  cls.getComponentType();
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
