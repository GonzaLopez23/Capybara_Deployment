package com.example.capybara.common;


import com.example.capybara.entities.Base;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilterRequest<T extends Base>  {

    private String key;

    private Operator operator;

   private FieldType fieldType;

    // object puede ser generic

    /*
    public Object getAtributeType(){
        Class cls = T.key.getClass();
        return  cls.getComponentType();
    }
    */

    private  Object value;

    private  Object valueTo;

    private  List<Object> values;

}
