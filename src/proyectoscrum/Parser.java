/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoscrum;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

/**
 *
 * @author Santi
 */
public class Parser {
    
    public static void guardarArchivo(Proyecto p, File file) throws IOException {
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        try (ObjectOutputStream os = new ObjectOutputStream(bs)) {
            os.writeObject(p);
        }
        byte[] bytes = bs.toByteArray();
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(bytes);
        }
    }
    
    public static Proyecto cargarArchivo(File file) throws IOException, ClassNotFoundException {
        byte[] bytes = Files.readAllBytes(file.toPath());
        ByteArrayInputStream bs = new ByteArrayInputStream(bytes);
        Proyecto p;
        try (ObjectInputStream is = new ObjectInputStream(bs)) {
            p = (Proyecto) is.readObject();
        }
        return p;
    }
}
