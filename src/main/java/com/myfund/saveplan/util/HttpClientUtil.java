package com.myfund.saveplan.util;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Http请求调用接口工具类
 * 
 * @author: haocheng
 * @date: 2019-05-20 17:28
 * 
 */
public class HttpClientUtil {
    /**
     * 带参数的get请求
     * @param url
     * @param param
     * @return String
     */
    public static String doGet(String url, Map<String, String> param) {
        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            // 创建uri
            URIBuilder builder = new URIBuilder(url);
            if (param != null) {
//                // 解决中文乱码问题
//                StringEntity entity = new StringEntity(param.toString(), "utf-8");
//                entity.setContentEncoding("UTF-8");
//                entity.setContentType("application/x-www-form-urlencoded");
//                httpPost.setEntity(entity);
                for (String key : param.keySet()) {
                    builder.addParameter(key, param.get(key));
                }
            }
            URI uri = builder.build();
            // 创建http GET请求
            HttpGet httpGet = new HttpGet(uri);
            // 执行请求
            response = httpclient.execute(httpGet);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }

    /**
     * 带参数的post请求
     * @param url
     * @param param
     * @return String
     */
    public static String doPost(String url, Map<String, String> param) {
        // 创建Httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            // 创建Http Post请求
            HttpPost httpPost = new HttpPost(url);
            // 创建参数列表
            if (param != null) {
                List<NameValuePair> paramList = new ArrayList<>();
                for (String key : param.keySet()) {
                    paramList.add(new BasicNameValuePair(key, param.get(key)));
                }
                // 模拟表单
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(paramList, "utf8");
                httpPost.setEntity(entity);
            }
            // 执行http请求
            response = httpClient.execute(httpPost);
            resultString = EntityUtils.toString(response.getEntity(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }




    /**
     * 不带参数的get请求
     * @param url
     * @return String
     */
    public static String doGet(String url) {
        return doGet(url, null);
    }
    /**
     * 不带参数的post请求
     * @param url
     * @return String
     */
    public static String doPost(String url) {
        return doPost(url, null);
    }




    /**
     * 传送json类型的post请求
     * @param url
     * @param json
     * @return String
     */
    public static String doPostJson(String url, String json) {
        // 创建Httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        // 创建Http Post请求
        HttpPost httpPost = new HttpPost(url);
        try {
            // 创建请求内容
            StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
            // 执行http请求
            response = httpClient.execute(httpPost);
            resultString = EntityUtils.toString(response.getEntity(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }

//    中文乱码问题
//    https://www.cnblogs.com/luohero/p/7792260.html#4157229
}
