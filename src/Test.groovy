/**
 * @author: fogcoding* @date: 2020/6/24 15:56
 * @e-mail: thinfog@126.com 
 * @version 1.0
 */

println "hello,groovy!"
//println "www.baidu.com".toURI().text

URL url = new URL("HTTP","WWW.BAIDU.COM","CESHI");
URLConnection connection = url.openConnection();
connection.setRequestMethod("POST")
connection.setRequestProperty("Content-Type", "application/json")

connection.setDoOutput(true)
connection.setDoInput(true)
OutputStream os = connection.outputStream

os.write("CESHI");
os.flush()

conn.connect()
def code = conn.getResponseCode()
println conn.content.text

