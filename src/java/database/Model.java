/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.util.*;
/**
 *
 * @author 林哲宏
 */
public class Model {
    private HashMap<String,String> answer=new HashMap<String,String>();
    public Model(){
        answer.put("A", "It's A");
        answer.put("B", "It's B");
        answer.put("C", "It's C");
    }
    public void putMap(String key,String value){
         answer.put(key, value);
    }
    public String getMap(String key){
        return answer.get(key);
    }
}
