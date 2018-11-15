package top.wukezhi.cloudweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
        //发起http请求只需调用sendokhttprequest（），传入请求地址，并注册一个回调来处理服务器响应
    }
}
