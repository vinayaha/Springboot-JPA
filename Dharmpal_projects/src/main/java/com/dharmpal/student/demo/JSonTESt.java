package com.dharmpal.student.demo;


import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSonTESt {

    public static void main(String[] args) throws ParseException {

        String str ="{\"k1\":\"v1\",\"k2\":[\"v2\",\"v3\",\"\",{\"k21\":\"v21\",\"k22\":\"\"}],\"k3\":{\"k4\":\"v4\",\"k5\":[\"v5\",\"v6\",null],\"k6\":{\"k7\":\"v7\",\"k8\":\"\"}},\"k9\":null}";

        JSONParser jsonParser = new JSONParser();
        Object result = jsonParser.parse(str);
        System.out.println(result);
    }
}
