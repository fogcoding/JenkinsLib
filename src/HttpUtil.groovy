/**
 * @author: fogcoding* @date: 2020/6/24 15:57
 * @e-mail: thinfog@126.com 
 * @version 1.0
 */

//@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7' )

class HttpUtil {

    void execute(String... params){
        "curl -G -d $params  http://10.16.84.15:9999/test ".execute()
    }





}
