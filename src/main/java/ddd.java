import java.util.*;

public class ddd {

    public static void main(String[] args) {

        //词条等级对应的总经验
        Map<Integer,Integer> totalExperienceMap = new HashMap<>();
        totalExperienceMap.put(55,8067);
        totalExperienceMap.put(56,9762);
        totalExperienceMap.put(57,11823);
        totalExperienceMap.put(58,14317);
        totalExperienceMap.put(59,17335);
        totalExperienceMap.put(60,23635);
        totalExperienceMap.put(61,29299);
        totalExperienceMap.put(62,36317);

        //词条等级升级所需的经验值
        Map<Integer,Integer> upgradeExperienceMap = new HashMap<>();
        upgradeExperienceMap.put(55,1695);
        upgradeExperienceMap.put(56,2061);
        upgradeExperienceMap.put(57,2494);
        upgradeExperienceMap.put(58,3018);
        upgradeExperienceMap.put(59,6300);
        upgradeExperienceMap.put(60,5664);
        upgradeExperienceMap.put(61,7018);
        upgradeExperienceMap.put(62,8702);

        //词条总经验所对应的等级
        NavigableMap<Integer,Integer> inquiryExperienceMap = new TreeMap<>();
        inquiryExperienceMap.put(9762,56);
        inquiryExperienceMap.put(11823,57);
        inquiryExperienceMap.put(14317,58);
        inquiryExperienceMap.put(17335,59);
        inquiryExperienceMap.put(23635,60);
        inquiryExperienceMap.put(29299,61);
        inquiryExperienceMap.put(36317,62);
        inquiryExperienceMap.put(45019,63);

        //百分比对应的小数点
        Map<Integer,Integer> decimalPointMap = new HashMap<>();
        decimalPointMap.put(1,10);
        decimalPointMap.put(2,100);
        decimalPointMap.put(3,1000);
        decimalPointMap.put(4,10000);
        decimalPointMap.put(5,100000);

        //键盘输入
        Scanner text = new Scanner(System.in);
        System.out.println("输入词条1:");
        String entry1 = text.next();
        System.out.println("输入词条2:");
        String entry2 = text.next();

        String[] entry = {entry1,entry2};
        ArrayList<Integer> totalExperienceList = new ArrayList<>();
        //分别计算词条总经验
        for (String s : entry) {
            String[] equipmentEntry = s.split("\\.");
            int level = Integer.parseInt(equipmentEntry[0]);
            //判断词条等级是否有小数点
            if (equipmentEntry.length == 1){
                totalExperienceList.add(totalExperienceMap.get(level));
            }else {
                int decimal = Integer.parseInt(equipmentEntry[1]);
                //计算词条总经验值并添加
                totalExperienceList.add(totalExperienceMap.get(level) + (int) (upgradeExperienceMap.get(level)
                        * ((double) decimal / decimalPointMap.get(equipmentEntry[1].length()))));
            }
        }
        System.out.println("词条1总经验: " + totalExperienceList.get(0) + " <----> 词条2总经验: " + totalExperienceList.get(1));
        //两条词条总经验相加
        int totalExperience = totalExperienceList.get(0) + totalExperienceList.get(1);
        //查询相加后词条总经验所对应的最大词条等级  ex: 17335=59
        Map.Entry<Integer, Integer> entryMap = inquiryExperienceMap.floorEntry(totalExperience);
        if (entryMap == null){
            System.out.println("装备词条等级太低");
        }else {
            int equipmentLevel = entryMap.getValue();
            //计算词条百分比的经验值
            double equipmentDecimal = (double) (totalExperience - entryMap.getKey()) / upgradeExperienceMap.get(equipmentLevel);
            double equipmentEntryLevel =  equipmentLevel + equipmentDecimal;
            System.out.println("连连看词条等级: " + equipmentEntryLevel);
        }
    }
}
