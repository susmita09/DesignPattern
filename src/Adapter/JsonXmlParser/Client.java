package Adapter.JsonXmlParser;

public class Client {
    public static void main(String[] args){

        //adaptee
        XMLProcessor xmlProcessor = new XMLProcessor();

        //adapter
        JsonToXmlAdapter adapter = new JsonToXmlAdapter(xmlProcessor);

        // Client using the adapter
        String json = "{name: 'John', age: 30}";
        adapter.processJson(json);
    }
}
