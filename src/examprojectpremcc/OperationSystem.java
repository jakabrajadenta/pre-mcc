
package examprojectpremcc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class OperationSystem extends Operation{

    @Override
    public void showData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;
        
        fileInput   = new FileReader("database.txt");
        bufferInput = new BufferedReader(fileInput);
        
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("| No. | Costumer Name       | Phone Number   | Country        | Items        ");
        System.out.println("-----------------------------------------------------------------------------");
        
        String data = bufferInput.readLine();
        int noData  = 0;
        while(data != null) {
            noData++;
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            stringToken.nextToken();
            System.out.printf("| %-4d", noData);
            System.out.printf("| %-20s", stringToken.nextToken());
            System.out.printf("| %-15s", stringToken.nextToken());
            System.out.printf("| %-15s", stringToken.nextToken());
            System.out.printf("| %s", stringToken.nextToken());
            System.out.println("");

            data = bufferInput.readLine();
        }
    }

    @Override
    public void findData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;
        
        fileInput   = new FileReader("database.txt");
        bufferInput = new BufferedReader(fileInput);
        
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Insert the keywords: ");
        String findString = terminalInput.nextLine();
        String[] keywords = findString.split("\\s+"); //split widespace
        
        String data = bufferInput.readLine();
        boolean isExist;
        int noData  = 0;
        
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("| No. | Costumer Name       | Phone Number   | Country        | Items        ");
        System.out.println("-----------------------------------------------------------------------------");
        
        while(data != null) {
            noData++;
            isExist = true;
            for (String keyword : keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }
            
            if (isExist) {
                
                StringTokenizer stringToken = new StringTokenizer(data, ",");
                stringToken.nextToken();
                System.out.printf("| %-4d", noData);
                System.out.printf("| %-20s", stringToken.nextToken());
                System.out.printf("| %-15s", stringToken.nextToken());
                System.out.printf("| %-15s", stringToken.nextToken());
                System.out.printf("| %s", stringToken.nextToken());
                System.out.println("");
            }
            
            data = bufferInput.readLine();
        }
    }

    @Override
    public void addData() throws IOException {
        FileWriter fileOutput;
        BufferedWriter bufferOutput;
        
        fileOutput   = new FileWriter("database.txt",true);
        bufferOutput = new BufferedWriter(fileOutput);
        
        Scanner terminalInput = new Scanner(System.in);
        String costumername, phonenum, country, items;

        System.out.print("Input Costumer Name   : ");
        costumername = terminalInput.nextLine();
        System.out.print("Input Phone Number    : ");
        phonenum     = terminalInput.nextLine();
        System.out.print("Input Country         : ");
        country      = terminalInput.nextLine();
        System.out.print("Input SOLD Items      : ");
        items        = terminalInput.nextLine();
        
        bufferOutput.write("x,"+costumername+","+phonenum+","+country+","+items);
        bufferOutput.newLine();
        bufferOutput.flush();
        bufferOutput.close();
    }

    @Override
    public void removeData() throws IOException {
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);
        
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);
        
        showData();
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nInput number data line that want to remove: ");
        int removeNum = terminalInput.nextInt();
        
        boolean isFound = false;
        int noData = 0;
        String data = bufferInput.readLine();
        while (data != null) {            
            noData ++;
            boolean isRemove = false;
            
            if (removeNum == noData) {
                isRemove = true;
                isFound = true;
            }
            if (isRemove) {
                System.out.println("Data removed!");
            } else {
                bufferOutput.write(data);
                bufferOutput.newLine();
            }
            data = bufferInput.readLine();
        }
        
        if (!isFound) {
            System.err.println("Unfound data or wrong num line");
        }
        bufferOutput.flush();
        bufferOutput.close();
        fileOutput.close();
        bufferInput.close();
        fileInput.close();
        System.gc();
        database.delete();
        tempDB.renameTo(database);
    }
    
}