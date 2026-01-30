public class Q_11_X1773 {
    public static void main(String[] args) {


        //Q.No. 1773. Count Items Matching a Rule


        String [][] item = {{"Phone", "silver", "Iphone"},
                            {"Laptop", "Black", "Mackbook"},
                            {"phone", "Black", "Pixel"},
                            {"laptop", "Golden", "Asus"}};

        String ruleKey = "color";
        String ruleVlaue = "Black";

        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;

        int count = 0;

        for(int i = 0; i < item.length; i++){
            if(item[i][index].equals(ruleVlaue)){
                count++;
            }
        }


        System.out.println(count);

    }
}
