/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rato;

/**
 *
 * @author maihoa
 */
public class Rotate {
    public static void Rotate90(int[][] a)
    {
        int[][] tam = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tam[j][4-i-1] = a[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = tam[i][j];
            }
        }
    }
    public static void Rotate180(int[][] a)
    {
        int[][] tam = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tam[4-1-i][4-1-j]=a[i][j];
            }
        }
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = tam[i][j];
            }
        }
    }        
    public static void main(String[] args) {
        int a[][]= {{1,3,5,1},{2,2,2,2}, {3,3,3,3},{4,4,4,4}} ;
       
        Rotate180(a);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }
    }
            
}
