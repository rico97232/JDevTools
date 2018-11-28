/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.easyvox.tools.mail.session;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.activation.DataSource;

/**
 *
 * @author ecrispin
 */
class InputStreamDataSource implements DataSource {
    
    private final String name;
    private final String contentType;
    private final ByteArrayOutputStream baos;
         
    InputStreamDataSource(String name, String contentType, InputStream inputStream) throws IOException {
        this.name = name;
        this.contentType = contentType;

        baos = new ByteArrayOutputStream();

        int read;
        byte[] buff = new byte[256];
        while((read = inputStream.read(buff)) != -1) {
            baos.write(buff, 0, read);
        }
    }
         
    @Override
    public String getContentType() {
        return contentType;
    }
  
    @Override
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(baos.toByteArray());
    }
  
    @Override
    public String getName() {
        return name;
    }
  
    @Override
    public OutputStream getOutputStream() throws IOException {
        throw new IOException("Cannot write to this read-only resource");
    }    
    
}
