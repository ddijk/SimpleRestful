package com.mycompany.testrestful;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Produces
@Provider
public class HtmlWriter implements MessageBodyWriter<Person> {

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        System.out.println("isWritable: mediatype=" + mediaType);
        return type == Person.class && mediaType.isCompatible(MediaType.TEXT_HTML_TYPE);
    }

    @Override
    public long getSize(Person t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return preamble.length() + t.toString().length() + postamble.length();
    }

    @Override
    public void writeTo(Person t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        System.out.println("write to called for " + t);
        entityStream.write(preamble.getBytes());
        entityStream.write(t.toString().getBytes());
        entityStream.write(postamble.getBytes());
        entityStream.flush();
    }
    private static String preamble = "<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>\n"
            + "<html><head><title>Data</title></head>\n"
            + "<body><h1>";

    private static String postamble = "</h1></body></html>";
}
