package com.seed.testThread;

/**
 * Created by OL on 2017/2/17.
 */
public class Main {

    public static void main(String[] args) {
        BigFileReader.Builder builder = new BigFileReader.Builder("f:/reliability.txt",new IHandle() {

            @Override
            public void handle(String line) {
                System.out.println(line);
                //increat();
            }
        });
        builder.withTreahdSize(10)
                .withCharset("gbk")
                .withBufferSize(1024*1024);
        BigFileReader bigFileReader = builder.build();
        bigFileReader.start();
    }

}
