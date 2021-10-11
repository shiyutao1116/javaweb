import com.yutao.shi.book;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @author shiyutao
 * @create 2021-10-08 13:07
 */
public class dom4j {
    @Test
    public void test1() throws DocumentException {
        SAXReader saxReader=new SAXReader();
        Document document = saxReader.read("src/book.xml");
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        for(Element book:elements){
            Element name = book.element("name");
            String nameText = name.getText();
            String price = book.elementText("price");
            String author = book.elementText("author");
            String sn = book.attributeValue("sn");
            System.out.println(new book(sn,nameText,Double.parseDouble(price),author));
        }
    }




}
