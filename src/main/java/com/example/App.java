package com.example;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class App {
    public static void main(String[] args) {
        try {
            // Obtener el texto formateado
            String formattedText = processPDFDocument("C:\\Users\\johnm\\OneDrive\\Documentos\\programacion\\prueba-pdf\\nuevo4-1.pdf");

            // Imprimir el texto formateado
            System.out.println(formattedText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String processPDFDocument(String filePath) throws IOException {
        // Cargar el archivo PDF
        PDDocument document = PDDocument.load(new File(filePath));

        // Crear un objeto PDFTextStripper
        PDFTextStripper pdfStripper = new PDFTextStripper();

        // Extraer texto
        String text = pdfStripper.getText(document);

        // Dividir el texto en líneas
        String[] lines = text.split("\\r?\\n");

        // Recorrer cada línea y aplicar los reemplazos necesarios
        StringBuilder formattedText = new StringBuilder();
        for (String line : lines) {
            line = line.replaceAll("\\s+", " ");
            line = line.replace("Tipo Inscripción", "Tipo Inscripción: ");
            line = line.replace("Tipo de empresa", "Tipo de empresa: ");
            line = line.replace("RUC", "RUC: ");
            line = line.replace("Tipo de documento", "Tipo de documento: ");
            line = line.replace("Número de documento", "Número de documento: ");
            line = line.replace("ID de documento", "ID de documento: ");
            line = line.replace("Fecha Solicitud", "Fecha Solicitud: ");
            line = line.replace("Digito verificación", "Digito verificación: ");
            line = line.replace("Casilla si pertenece a un grupo empresarial", "Casilla si pertenece a un grupo empresarial: ");
            line = line.replace("Razón social", "Razón social: ");
            line = line.replace("Nombre comercial del establecimiento", "Nombre comercial del establecimiento: ");
            line = line.replace("Fecha Inicio de labores", "Fecha Inicio de labores: ");
            line = line.replace("Localización geográfica", "Localización geográfica: ");
            line = line.replace("Dirección del establecimiento comercial", "Dirección del establecimiento comercial: ");
            line = line.replace("Apartado del establecimiento comercial", "Apartado del establecimiento comercial: ");
            line = line.replace("Teléfono del establecimiento comercial", "Teléfono del establecimiento comercial: ");
            line = line.replace("Teléfono alterno del establecimiento", "Teléfono alterno del establecimiento: ");
            line = line.replace("Celular", "Celular: ");
            line = line.replace("Fax", "Fax (Verificar si todavía se debe usar este): ");
            line = line.replace("Correo electrónico", "Correo electrónico: ");
            line = line.replace("Página WEB", "Página WEB: ");
            line = line.replace("Agencia Solicitud", "Agencia Solicitud inscripción (Preguntar: ");
            line = line.replace("Número aviso operación", "Número aviso operación: ");
            formattedText.append(line).append(",\n");
        }

        // Cerrar el documento
        document.close();

        return formattedText.toString();
    }
}
