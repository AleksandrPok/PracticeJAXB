package main;

        import javax.xml.bind.JAXBContext;
        import javax.xml.bind.JAXBException;
        import javax.xml.bind.Marshaller;
        import java.io.File;

public class JaxbWriter {
    public static void main(String[] args) throws JAXBException {
        Catalog catalog = new Catalog();
        catalog.add(new Book("Aldous Huxley", "Brave New World", "Novel", 15.25, "05.08.1932"));
        catalog.add(new Book("Richard Feynman", "Surely You're Joking, Mr. Feynman!", "Autobiography", 20.50, "20.10.1985"));

//        Book book = new Book("Aldous Huxley", "Brave New World", "Novel", 15.25, "05.08.1932");
        File file = new File("C://Users/"+ System.getProperty("user.name") +"/Desktop/dirForMarsh/myxml.xml");
        JAXBContext context = JAXBContext.newInstance(Catalog.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(catalog, file);
        marshaller.marshal(catalog, System.out);
    }
}
