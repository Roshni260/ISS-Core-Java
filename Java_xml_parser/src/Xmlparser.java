import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


public class Xmlparser {
    public static void main(String[] args) {
        // Get a Document Builder
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder=factory.newDocumentBuilder();

            // Get Document
            Document document= (Document) builder.parse(new File("laptop.xml"));

            //Normalize the xml structure
            ((org.w3c.dom.Document) document).getDocumentElement().normalize();

            // Get all the elements by tagname

            NodeList laptopList= ((org.w3c.dom.Document) document).getElementsByTagName("laptop");
            for(int i=0;i<laptopList.getLength();i++){
                Node laptop= laptopList.item(i);
                if(laptop.getNodeType()==Node.ELEMENT_NODE){
                    Element laptopElement= (Element) laptop;
                    System.out.println("Laptop name: "+laptopElement.getAttribute("name"));

                    NodeList laptopdetails= laptop.getChildNodes();
                    for(int j=0;j<laptopdetails.getLength();j++){
                        Node detail= laptopdetails.item(j);
                        if(detail.getNodeType()==Node.ELEMENT_NODE){
                            Element detailElement= (Element) detail;
                            System.out.println("   "+detailElement.getTagName()+": "+detailElement.getAttribute("value"));
                        }
                    }
                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

}
