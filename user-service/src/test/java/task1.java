


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class task1 {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("1","2");
        map.put("2","3");

        String json = JSON.toJSONString(map);
        System.out.println(json);

        Map map1 = JSON.parseObject(json);
        for (Object mapData : map.entrySet()) {
            Map.Entry<String,String> entry = (Map.Entry<String,String>)mapData;
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }
    }

}
