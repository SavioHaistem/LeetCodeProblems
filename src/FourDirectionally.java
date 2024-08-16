import java.util.LinkedList;
import java.util.Queue;

class FourDirectionally {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) {
            return image;
        }

        int[] directionX = new int[]{0,0,1,-1};
        int[] directionY = new int[]{1,-1,0,0};

        Queue<int[]> queue = new LinkedList<>();
        int startPixel = image[sr][sc];

        queue.offer(new int[]{sr,sc});

        while(!queue.isEmpty()) {
            int queueSize = queue.size();
            for(int i = 0; i < queueSize; i++) {
                int[] position = queue.poll();

                assert position != null;
                image[position[0]][position[1]] = color;

                for(int j = 0; j < 4; j++) {
                    int x = position[0] + directionX[j];
                    int y = position[1] + directionY[j];

                    if(x < 0 || x >= image.length || y < 0 || y >= image[0].length || image[x][y] != startPixel) {
                        continue;
                    };

                    image[x][y] = color;

                    queue.offer(new int[]{x,y});
                }
            }
        }
        return image;
    }
}
