public class Robot {
    // Enumeração das direcoes posiveis
    public enum Direction {
        NORTH, EAST, SOUTH, WEST
    }

    private int x;
    private int y;
    private Direction direction;

    // Metodo construtor
    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    // Virar à esquerda
    public void turnLeft() {
        switch (direction) { //nesta parte conforme a direcao insirida no main entao este podera voltar para outra direcao
            case NORTH:
                direction = Direction.WEST;
                break;
            case EAST:
                direction = Direction.NORTH;
                break;
            case SOUTH:
                direction = Direction.EAST;
                break;
            case WEST:
                direction = Direction.SOUTH;
                break;
        }
    }

    // Virar à direita
    public void turnRight() {
        switch (direction) {
            case NORTH:
                direction = Direction.EAST;
                break;
            case EAST:
                direction = Direction.SOUTH;
                break;
            case SOUTH:
                direction = Direction.WEST;
                break;
            case WEST:
                direction = Direction.NORTH;
                break;
        }
    }

    // Método para mover o Robo conforme a direcao passa no testarRobo
    public void move() {
        switch (direction) {
            case NORTH:
                y++;
                break;
            case EAST:
                x++;
                break;
            case SOUTH:
                y--;
                break;
            case WEST:
                x--;
                break;
        }
    }

    // Método para obter a localização atual do Robo
    public Ponto2D getLocation() {
        return new Ponto2D(x, y);
    }

    // Método para obter a direção atual
    public String getDirection() {
        return direction.toString();
    }

    // Classe para mostrar cada coordernada
    public static class Ponto2D {
        private int x;
        private int y;

        public Ponto2D(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}