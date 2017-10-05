package com.company;

public class Main {

    public static void main(String[] args) {
      Device devices [] = {new Device("Device",200,"SASFAW"),new Monitor("Monitor",100,
              "SADU",45,55),new EthernetAdapter("EthernetAdapter",50,"ILDF",100,"mac")};
        for (int i = 0; i < devices.length; i++) {
            System.out.println(devices[i].toString());
        }
    }
}
