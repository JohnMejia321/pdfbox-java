package com.example;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class App {
    public static void main(String[] args) {
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
                // Verificar si la línea contiene las frases que necesitas
                if (lines[i].contains("Tipo Inscripción")) {
                    lines[i] = lines[i].replace("Tipo Inscripción", "Tipo Inscripción: ");
                }
                if (lines[i].contains("Tipo de empresa")) {
                    lines[i] = lines[i].replace("Tipo de empresa", "Tipo de empresa: ");
                }

                if (lines[i].contains("RUC")) {
                    lines[i] = lines[i].replace("RUC", "RUC: ");
                }
                if (lines[i].contains("Tipo de documento")) {
                    lines[i] = lines[i].replace("Tipo de documento ", "Tipo de documento: ");
                }
                if (lines[i].contains("Número de documento")) {
                    lines[i] = lines[i].replace("Número de documento ", "Número de documento: ");
                }
                if (lines[i].contains("ID de documento")) {
                    lines[i] = lines[i].replace("ID de documento ", "ID de documento: ");
                }
                if (lines[i].contains("Fecha Solicitud")) {
                    lines[i] = lines[i].replace("Fecha Solicitud ", "Fecha Solicitud: ");
                }
                // Las frases que ya estaban en el código anterior
                if (lines[i].contains("Digito verificación")) {
                    lines[i] = lines[i].replace("Digito verificación ", "Digito verificación: ");
                }
                if (lines[i].contains("Casilla si pertenece a un grupo empresarial")) {
                    lines[i] = lines[i].replace("Casilla si pertenece a un grupo empresarial", "Casilla si pertenece a un grupo empresarial: ");
                }
                if (lines[i].contains("Razón social")) {
                    lines[i] = lines[i].replace("Razón social", "Razón social: ");
                }
                if (lines[i].contains("Nombre comercial del establecimiento")) {
                    lines[i] = lines[i].replace("Nombre comercial del establecimiento", "Nombre comercial del establecimiento: ");
                }
                if (lines[i].contains("Fecha Inicio de labores")) {
                    lines[i] = lines[i].replace("Fecha Inicio de labores", "Fecha Inicio de labores: ");
                }
                if (lines[i].contains("Localización geográfica")) {
                    lines[i] = lines[i].replace("Localización geográfica", "Localización geográfica: ");
                }
                if (lines[i].contains("Dirección del establecimiento comercial")) {
                    lines[i] = lines[i].replace("Dirección del establecimiento comercial", "Dirección del establecimiento comercial: ");
                }
                if (lines[i].contains("Apartado del establecimiento comercial")) {
                    lines[i] = lines[i].replace("Apartado del establecimiento comercial", "Apartado del establecimiento comercial: ");
                }
                if (lines[i].contains("Teléfono del establecimiento comercial")) {
                    lines[i] = lines[i].replace("Teléfono del establecimiento comercial", "Teléfono del establecimiento comercial: ");
                }
                if (lines[i].contains("Teléfono alterno del establecimiento")) {
                    lines[i] = lines[i].replace("Teléfono alterno del establecimiento", "Teléfono alterno del establecimiento: ");
                }
                if (lines[i].contains("Celular")) {
                    lines[i] = lines[i].replace("Celular", "Celular: ");
                }
                if (lines[i].contains("Fax")) {
                    lines[i] = lines[i].replace("Fax", "Fax (Verificar si todavía se debe usar este): ");
                }
                if (lines[i].contains("Correo electrónico")) {
                    lines[i] = lines[i].replace("Correo electrónico", "Correo electrónico: ");
                }
                if (lines[i].contains("Página WEB")) {
                    lines[i] = lines[i].replace("Página WEB", "Página WEB: ");
                }
                if (lines[i].contains("Agencia Solicitud")) {
                    lines[i] = lines[i].replace("Agencia Solicitud", "Agencia Solicitud inscripción (Preguntar: ");
                }
                if (lines[i].contains("Número aviso operación")) {
                    lines[i] = lines[i].replace("Número aviso operación", "Número aviso operación: ");
                }

                lines[i] = lines[i].replaceAll("\\s+", " ");

                // Imprimir la línea con la coma al final
                System.out.println(lines[i] + ",");
            }

            // Cerrar el documento
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}