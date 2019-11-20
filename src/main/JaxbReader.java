package main;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbReader {
    public static void main(String[] args) throws JAXBException {
        File file = new File("C://Users/"+ System.getProperty("user.name") +"/Desktop/dirForMarsh/mycatalog.xml");
        JAXBContext context = JAXBContext.newInstance(Catalog.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Catalog catalog = (Catalog) unmarshaller.unmarshal(file);
        System.out.println(catalog);
    }
}
