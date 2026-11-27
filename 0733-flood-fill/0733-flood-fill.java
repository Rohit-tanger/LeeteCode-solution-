class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old = image[sr][sc];
        if(old==color) return image;

        fill(image,sr,sc,old,color);
        return image;
    }
    public static void fill(int[][]image , int r, int c,int old,int color){
        // bahar nikal gya to
        if(r<0 ||r>=image.length||c<0 || c>=image[0].length) return;
        // base case ye pixel purane color ka nhi hua h
        if(image[r][c] !=old) return;

        image[r][c] = color;
        fill(image ,r-1,c,old,color);
         fill(image ,r+1,c,old,color);
          fill(image ,r,c-1,old,color);
           fill(image ,r,c+1,old,color);
    }
}