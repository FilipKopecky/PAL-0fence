package pal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int startX;
        int startY;
        double result = 0;
        int numOfPosts = Integer.parseInt(reader.readLine());

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        startX = Integer.parseInt(tokenizer.nextToken());
        startY = Integer.parseInt(tokenizer.nextToken());
        int currX = startX;
        int currY = startY;
        for (int i = 0; i < numOfPosts - 1; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int nextX = Integer.parseInt(tokenizer.nextToken());
            int nextY = Integer.parseInt(tokenizer.nextToken());
            result += Math.sqrt(Math.pow(currX - nextX, 2) + Math.pow(currY - nextY, 2));
            currX = nextX;
            currY = nextY;
        }
        result += Math.sqrt(Math.pow(currX - startX, 2) + Math.pow(currY - startY, 2));
        result *= 5;
        System.out.println((int)Math.ceil(result));
    }


}
