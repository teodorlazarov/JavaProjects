public class Main {
    public static void main(String[] args) {
//Using FileStreams
        /*try {
            FileInputStream fs = new FileInputStream("test.txt");

            int data = fs.read();

            while (data != -1){
                System.out.print((char)data);
                data = fs.read();
            }
            fs.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }*/
        /*try {
            FileOutputStream fs = new FileOutputStream("testOutput.txt");
            String toWrite = "Testing the output stream!";
            fs.write(toWrite.getBytes());
        } catch (Exception e) {
            System.out.println(e.toString());
        }*/
//Using DataStreams
        /*File file = new File("dataOutput.txt");

        if(file.exists()){
            System.out.println("File exists: " + file.getAbsolutePath());
        }else{
            try{
                if(file.createNewFile()){
                    System.out.println("File created at: " + file.getAbsolutePath());
                }else{
                    System.out.println("File could not be created!");
                }

            }catch (Exception e){
                System.out.println(e.toString());
            }
        }

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
            DataInputStream dis = new DataInputStream(new FileInputStream(file));
            dos.writeInt(55);
            dos.writeDouble(14.3);
            dos.writeBoolean(true);
            dos.close();

            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());

        } catch (Exception e) {
            System.out.println(e.toString());
        }*/
//Writer, Reader streams
        /*try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("StreamWriter.txt"));
            InputStreamReader isr = new InputStreamReader(new FileInputStream("StreamWriter.txt"));
            osw.write("Hey file!");
            //osw.flush();
            osw.close();

            int value = isr.read();
            while (value !=-1){
                System.out.print((char)value);
                value = isr.read();
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }*/
        //BufferedReader/Writer
        /*try {
            BufferedReader reader = new BufferedReader(new FileReader("BufferToRead.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("BufferToWrite.txt"));

            String line = null;
            while((line = reader.readLine())!= null){
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }*/
        //PrintStream
        /*try {
            PrintStream pr = new PrintStream("PrStream.txt");
            pr.println("Hey file!");
            pr.print(310);
            pr.close();
        }catch (Exception e){
            System.out.println(e.toString());
        }*/
    }
}
