// aceite

class Mooshak186 {
    public static void main(String[] args) {
        Point a = new Point(1,1);
        Point b = new Point(2,2);
        Point c = new Point(3,4);
        Point d = new Point(8,2);
        
        Rectangle amarelo  = new Rectangle(a, c);
        Rectangle laranja  = new Rectangle(2, 3, 9, 6);
        Rectangle verde    = new Rectangle(3, 4, 4, 5);
        Rectangle azul     = new Rectangle(5, 1, 6, 5);
        Rectangle vermelho = new Rectangle(7, 3, 9, 5);
        
        System.out.println("Perimetro do retangulo amarelo = " + amarelo.perimeter()); // 10
        System.out.println("Perimetro do retangulo laranja = " + laranja.perimeter()); // 20
        
        System.out.println("Area do retangulo amarelo = " + amarelo.area()); // 6
        System.out.println("Area do retangulo laranja = " + laranja.area()); // 21                   
        
        System.out.println("Ponto B dentro rectangulo amarelo? " + amarelo.pointInside(b)); // true
        System.out.println("Ponto D dentro rectangulo amarelo? " + amarelo.pointInside(d)); // false
        
        System.out.println("Retangulo verde dentro do laranja? " + laranja.rectangleInside(verde));       // true
        System.out.println("Retangulo azul dentro do laranja? " + laranja.rectangleInside(azul));         // false
        System.out.println("Retangulo vermelho dentro do laranja? " + laranja.rectangleInside(vermelho)); // true
    }
}

class Point {
    int x, y;
 
    Point() {
       x = y = 0;
    }
    
    Point(int x0, int y0) {
       x = x0;
       y = y0;
    }
 
    public String toString() {
       return "(" + x + "," + y + ")";
    }
}

class Rectangle {
    Point inf, sup;

    Rectangle(int x1, int y1, int x2, int y2){
        inf = new Point(x1, y1);
        sup = new Point(x2, y2);
    }

    Rectangle(Point p1, Point p2){
        inf = p1;
        sup = p2;
    }

    public int area(){
        int largura, altura;
        largura = sup.x - inf.x;
        altura = sup.y - inf.y;
        return (largura*altura);
    }

    public int perimeter(){
        int largura, altura;
        largura = sup.x - inf.x;
        altura = sup.y - inf.y;
        return ((2*largura)+(2*altura));
    }

    public boolean pointInside(Point p){
        if((inf.x<=p.x) && (sup.x >= p.x) && (inf.y<=p.y) && (sup.y >= p.y)){
            return true;
        }else{
            return false;
        }
    }

    public boolean rectangleInside(Rectangle r){
        if((inf.x<=r.inf.x) && (sup.x >= r.inf.x) && (inf.y<=r.sup.y) && (sup.y >= r.sup.y) && (inf.x<=r.sup.x) && (sup.x >= r.sup.x) && (inf.y<=r.inf.y) && (sup.y >= r.inf.y)){
            return true;
        }else{
            return false;
        }
    }
}
