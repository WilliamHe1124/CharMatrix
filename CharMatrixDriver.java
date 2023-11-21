
/**
 * 在这里给出对类 charMatrixDriver 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
class CharMatrixDriver {

   public static void main (String[] args) {

      System.out.println("Create a CharMatrix filled with m's ...");
      charMatrix matrix = new charMatrix(3, 4, 'm');
      matrix.display();

      System.out.println("Testing fillrect ...");
      System.out.println("CharMatrix before method call:");
      matrix.display();
      
      matrix.fillRect(1, 1, 3, 4, 'h');

      System.out.println("  CharMatrix after method call:");
      matrix.display();

   } 
}
