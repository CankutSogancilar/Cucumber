package ApachePOI;

public class _02_2DArrays {
    public static void main(String[] args) {
        String [][]zoo= {{"Lion","4","Africa"},{"Tiger","2",},{"Elephant","5","India"},{"Shark","3"}};

        //System.out.println(zoo[2][1]);
        //System.out.println(zoo[1][0]);

        for (int i = 0; i < zoo.length; i++) {
            for (int j = 0; j < zoo[i].length; j++) {
                System.out.print(zoo[i][j]+" ");
            }
            System.out.println();
        }
    }
}
