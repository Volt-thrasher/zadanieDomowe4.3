public class RightTest {
    boolean isRightTriangle(Triangle triangle){
       boolean rght= triangle.sideC*triangle.sideC==triangle.sideB*triangle.sideB+triangle.sideA*triangle.sideA ||
               triangle.sideA*triangle.sideA==triangle.sideB*triangle.sideB+triangle.sideC*triangle.sideC ||
               triangle.sideB*triangle.sideB==triangle.sideC*triangle.sideC+triangle.sideA*triangle.sideA;
       return rght;
    }
}
