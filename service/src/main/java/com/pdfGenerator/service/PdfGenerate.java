package com.pdfGenerator.service;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.pdfGenerator.request.OrderRequest;

import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PdfGenerate {

    public void generatePdf (OrderRequest orderRequest) throws Exception{

        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("iTextHelloWorld.pdf"));

        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.GREEN);
        Chunk chunk = new Chunk("Hello World", font);
        document.add(chunk);

        Path path = Paths.get("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.insity.com%2Fblack-forest-cake&psig=AOvVaw0xQWxCF_i1xqAIr5rFb63p&ust=1623999778763000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCKDo1uGMnvECFQAAAAAdAAAAABAD");
        Image img = Image.getInstance(path.toAbsolutePath().toString());
        document.add(img);


        document.close();

    }
}
