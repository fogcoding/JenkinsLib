/**
 * @author: fogcoding* @date: 2020/6/24 16:49
 * @e-mail: thinfog@126.com 
 * @version 1.0
 */
void api(){
    def data = [jobId : "11111111111111", data : 5,status: 2]
//    def url = new URL("http://111.229.204.19:8080/jenkins")
    def url = new URL("http://www.baidu.com/s?")
    def conn = url.openConnection()
    conn.setRequestMethod("GET")
    conn.setRequestProperty("Content-Type", "application/json")
    conn.doOutput = true
//    def writer = new OutputStreamWriter(conn.outputStream)
//    println JsonOutput.toJson(data)
//    writer.write(JsonOutput.toJson(data))
//    writer.flush()
//    writer.close()
    conn.connect()
    def code = conn.getResponseCode()
    println conn.content.text
    println code
}

api()