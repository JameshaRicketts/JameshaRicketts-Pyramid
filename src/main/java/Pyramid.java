
public class Pyramid {
    /**
     * TODO: Return a string that is a pyramid of size n, made of of asterisks and no spaces.
     *
     *     for example:
     *
     *     size 3:
     *     *
     *     **
     *     ***
     *
     *     size 5:
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     *
     * The newline character can be written as \n .
     * The tests will not be affected by a newline character at the beginning or end of the entire pyramid.
     *
     *
     * @param n the size of the pyramid.
     * @return a string representation of the pyramid.
     */
    public String returnPyramid(int n){
        String pyramidString = "";
        for (int outer = 1; outer <= n; outer++){
            for (int inner = 1; inner <= outer; inner++){
                pyramidString+="*";
                if (inner == outer) {
                    pyramidString+= '\n';
                }
            }
        }

        return pyramidString;
    }
}
