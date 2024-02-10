package co.com.qvision.conduit.utils;


import co.com.qvision.conduit.models.Login;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class LeerExcel {
    private String archivoExcel = "src/test/resources/Data/DatosUsuario.xlsx";
    private FileInputStream file;
    private XSSFWorkbook book;
    private XSSFSheet hoja;

    public List<Login> obtenerLogin() {
        List<Login> listlogin = new ArrayList<>();
        try {
            this.file = new FileInputStream(archivoExcel);
            this.book = new XSSFWorkbook(file);
            this.hoja = book.getSheet("Login");
            Row row;
                int rows = hoja.getPhysicalNumberOfRows();

            System.out.println(rows);


            for (int i = 1; i < rows; i++){
                row = hoja.getRow(i);
                System.out.println(i);

                listlogin.add(new Login(row.getCell(0).toString(),
                        row.getCell(1).toString(),
                        row.getCell(2).toString()));
            }
            this.book.close();
            this.file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listlogin;
    }



}
