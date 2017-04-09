package json;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonExample
{
    public static void main(String[] args)
    {
        // 将字符串转换成json对象来操作
        String jsonStr = "[ { \"title\": \"apple\", \"date\" : \"2017-04-08\", \"url\"  : \"http://www.apple.com\" }, { \"title\": \"orange\", \"date\" : \"2017-04-09\", \"url\"  : \"http://www.orange.com\" } ]";
        JSONArray jsonArray = new JSONArray(jsonStr);

        for (int i = 0; i < jsonArray.length(); ++i)
        {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            System.out.println("Title:" + jsonObject.get("title"));
            System.out.println("date:" + jsonObject.get("date"));
            System.out.println("url:" + jsonObject.get("url"));
            System.out.println("");
        }
    }
}
