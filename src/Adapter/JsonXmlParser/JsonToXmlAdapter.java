package Adapter.JsonXmlParser;

public class JsonToXmlAdapter implements JSONProcessor{
    private XMLProcessor xmlProcessor;

    public JsonToXmlAdapter(XMLProcessor xmlProcessor){
        this.xmlProcessor = xmlProcessor;
    }


    @Override
    public void processJson(String json) {
        String xml = "<xml>" + json.replace("{", "").replace("}", "") + "</xml>";
        xmlProcessor.processXml(xml);
    }
}
