public class FizzBuzz {
    public String translate(int i) {

        if (i < 1)
        {
          throw new RuntimeException("You're an idiot");
        }

        StringBuilder sb = new StringBuilder();


        if (isaFizz(i)){
            sb.append("fizz");
        }
        if (isABuzz(i)) {
            sb.append("buzz");
        }
        if (sb.length() == 0) {
            sb.append(i);
        }
        return sb.toString();
    }

    private boolean isaFizz(int i) {
        return i % 3 == 0;
    }

    private boolean isABuzz(int i){
        return i % 5 == 0;
    }


}
