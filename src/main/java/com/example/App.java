package com.example;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class App {
    public static void main(String[] args) {
        String formattedText = ""; // Variable para almacenar el texto formateado
        try {
            // Cargar el archivo PDF
            PDDocument document = PDDocument.load(new File("C:\\Users\\johnm\\OneDrive\\Documentos\\programacion\\prueba-pdf\\nuevo4-1.pdf"));

            // Crear un objeto PDFTextStripper
            PDFTextStripper pdfStripper = new PDFTextStripper();

            // Extraer texto
            String text = pdfStripper.getText(document);

            // Dividir el texto en líneas
            String[] lines = text.split("\\r?\\n");

            // Recorrer cada línea
            for (int i = 0; i < lines.length; i++) {
                // Verificar y reemplazar cada frase clave
                lines[i] = lines[i].replaceAll("\\s+", " ");
                lines[i] = lines[i].replace("Tipo Inscripción", "Tipo Inscripción: ");
                lines[i] = lines[i].replace("Tipo de empresa", "Tipo de empresa: ");
                lines[i] = lines[i].replace("RUC", "RUC: ");
                lines[i] = lines[i].replace("Tipo de documento", "Tipo de documento: ");
                lines[i] = lines[i].replace("Número de documento", "Número de documento: ");
                lines[i] = lines[i].replace("ID de documento", "ID de documento: ");
                lines[i] = lines[i].replace("Fecha Solicitud", "Fecha Solicitud: ");
                lines[i] = lines[i].replace("Digito verificación", "Digito verificación: ");
                lines[i] = lines[i].replace("Casilla si pertenece a un grupo empresarial", "Casilla si pertenece a un grupo empresarial: ");
                lines[i] = lines[i].replace("Razón social", "Razón social: ");
                lines[i] = lines[i].replace("Nombre comercial del establecimiento", "Nombre comercial del establecimiento: ");
                lines[i] = lines[i].replace("Fecha Inicio de labores", "Fecha Inicio de labores: ");
                lines[i] = lines[i].replace("Localización geográfica", "Localización geográfica: ");
                lines[i] = lines[i].replace("Dirección del establecimiento comercial", "Dirección del establecimiento comercial: ");
                lines[i] = lines[i].replace("Apartado del establecimiento comercial", "Apartado del establecimiento comercial: ");
                lines[i] = lines[i].replace("Teléfono del establecimiento comercial", "Teléfono del establecimiento comercial: ");
                lines[i] = lines[i].replace("Teléfono alterno del establecimiento", "Teléfono alterno del establecimiento: ");
                lines[i] = lines[i].replace("Celular", "Celular: ");
                lines[i] = lines[i].replace("Fax", "Fax: ");
                lines[i] = lines[i].replace("Correo electrónico", "Correo electrónico: ");
                lines[i] = lines[i].replace("Página WEB", "Página WEB: ");
                lines[i] = lines[i].replace("Agencia Solicitud", "Agencia Solicitud inscripción: ");
                lines[i] = lines[i].replace("Número aviso operación", "Número aviso operación: ");
                formattedText += lines[i] + ",\n"; // Concatenar la línea con una coma y un salto de línea al final
            }

            // Cerrar el documento
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir el texto formateado
        System.out.println(formattedText);
    }
}
