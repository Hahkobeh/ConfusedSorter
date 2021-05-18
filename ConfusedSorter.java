import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ConfusedSorter {
    public static void main(String[] args) {
        Float[] array = new Float[2000];
        String[] s = new String[2000];
        int i = 0;
        String inputName = args[0];
        String outputName = args[1];

        Pattern naturalNum = Pattern.compile("^[1-9]+[0-9]*$");


        try {
            BufferedReader br = new BufferedReader(new FileReader(inputName));


            while ((s[i] = br.readLine()) != null) {
                i++;
            }
            br.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputName, false));
            boolean found666 = false;
            int j = 0, k = 0;
            for (int q = 0; s[q] != null; q++) {
                if (s[q].equals("666")) {
                    found666 = true;
                    s[q] = "@";
                    break;
                }
            }
            while (s[j] != null) {
                Matcher naturalNumberMatcher = naturalNum.matcher(s[j]);
                if (s[j].equals("666")) {
                    array[j] = -2f;
                } else if (s[j].equals("0")) {
                    array[j] = 0f;
                } else if (naturalNumberMatcher.find()) {
                    array[j] = (float) Integer.parseInt(s[j]);
                } else if (s[j].equals("Do")) {
                    array[j] = 0.5f;
                } else if (s[j].equals("@")) {
                    array[j] = 3.3f;
                } else if (s[j].equals("&")) {
                    array[j] = 3.7f;
                } else if (s[j].equals("Fa")) {
                    array[j] = 15.5f;
                } else if (s[j].equals("$")) {
                    array[j] = 20.5f;
                } else if (s[j].equals("Asymbolwithareallylongname")) {
                    array[j] = 55.5f;
                } else if (s[j].equals("Re")) {
                    array[j] = 100.5f;
                } else if (s[j].equals("One")) {
                    array[j] = 103.2f;
                } else if (s[j].equals("Two")) {
                    array[j] = 103.5f;
                } else if (s[j].equals("Three")) {
                    array[j] = 103.8f;
                } else if (s[j].equals("Mi")) {
                    array[j] = 1000.5f;
                } else if (s[j].equals("%")) {
                    array[j] = 1005000.5f;
                } else {
                    bw.write("Input error.");
                    bw.flush();
                    System.exit(1);
                }
                j++;
            }




            while (!isOrdered(array, i)){
                for (int u = 0; u < i - 1; u++){
                    if(array[u] < array[u + 1]){
                        float temp = array[u];
                        array[u] = array[u + 1];
                        array[u + 1] = temp;
                    }
                }
            }
            if(found666){
                for(int g = 0; g < i / 2; g++){
                    float temp = array[g];
                    array[g] = array[i - g - 1];
                    array[i - g - 1] = temp;
                }
            }


                while (array[k] != null) {
                    if(array[k] == -2f){
                        k++;
                        continue;
                    }

                    if (array[k] == 0.5f) {
                        bw.write("Do");
                    } else if (array[k] == 3.3f) {
                        bw.write("@");
                    } else if (array[k] == 3.7f) {
                        bw.write("&");
                    } else if (array[k] == 15.5f) {
                        bw.write("Fa");
                    } else if (array[k] == 20.5f) {
                        bw.write("$");
                    } else if (array[k] == 55.5f) {
                        bw.write("Asymbolwithareallylongname");
                    } else if (array[k] == 100.5f) {
                        bw.write("Re");
                    } else if (array[k] == 103.2f) {
                        bw.write("One");
                    } else if (array[k] == 103.5f) {
                        bw.write("Two");
                    } else if (array[k] == 103.8f) {
                        bw.write("Three");
                    } else if (array[k] == 1000.5f) {
                        bw.write("Mi");
                    } else if (array[k] == 1005000.5f) {
                        bw.write("%");
                    } else {
                        bw.write(String.valueOf((int) ((float) array[k])));
                    }


                    if (!(array[k + 1] == null)) {
                        bw.newLine();
                    }
                    bw.flush();
                    k++;
                }

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static public boolean isOrdered(Float[] array, int i) {
        boolean ordered = true;
        for (int r = 0; r < i - 1; r++) {
            if (array[r] < array[r + 1]) {
                return false;
            }
        }
        return ordered;
    }
}

