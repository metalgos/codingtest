package backjun_step.step3_forwhile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b15552 {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int step = Integer.parseInt(s);
        int[] arr= new int[step];
        int arrint =0;
        for (int i =step; i>0;i--) {

            String s2 = bf.readLine();
            StringTokenizer st = new StringTokenizer(s2);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[arrint]=a+b;
            arrint++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i<arr.length;i++){

            String s3 = String.valueOf(arr[i]);
            bw.write(s3+"\n");

        }
        bw.flush();
        bw.close();
    }
}
