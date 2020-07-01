import net.HTTP

/**
 * @author: fogcoding* @date: 2020/7/1 11:21
 * @e-mail: thinfog@126.com 
 * @version 1.0
 */
class FogHTTP implements HTTP {


    @Override
    String GET() {
        return "GET1"
    }

    @Override
    String POST() {
        return "POST1"
    }
}
