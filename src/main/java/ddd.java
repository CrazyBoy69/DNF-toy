import java.math.BigDecimal;
import java.util.*;

public class ddd {

    public static Map<Integer,Integer> result;

    static {
        result = new HashMap<>();
        result.put(1,0); //词条1等级
        result.put(2,0); //词条2等级
        result.put(3,0); //词条3等级
        result.put(4,0); //词条4等级
        result.put(5,0); //消耗金绿柱石数量
        result.put(6,0); //消耗金币数量
        result.put(7,0); //消耗灵魂之源数量
    }

    public static void main(String[] args) {

        ArrayList<Equipment> ss = new ArrayList<>();
        ss.add(new Equipment("61.0578","59.4109","55.0342","50.1254"));
        ss.add(new Equipment("59","54","50","48"));
        ss.add(new Equipment("31","47","53","27"));
        //分别计算词条总经验
        for (int i = 0; i < ss.size(); i++) {
            int experience1 = calculateEntries(ss.get(i).getEntry1(),i);
            int experience2 = calculateEntries(ss.get(i).getEntry2(),i);
            int experience3 = calculateEntries(ss.get(i).getEntry3(),i);
            int experience4 = calculateEntries(ss.get(i).getEntry4(),i);
            result.put(1,result.get(1) + experience1);
            result.put(2,result.get(2) + experience2);
            result.put(3,result.get(3) + experience3);
            result.put(4,result.get(4) + experience4);
        }
        System.out.println("词条1总经验: " + result.get(1) + " <> 词条2总经验: " + result.get(2)
                + " <> 词条3总经验: " + result.get(3) + " <> 词条4总经验: " + result.get(4));
        System.out.println("词条1: " + calculateLevel(result.get(1)));
        System.out.println("词条2: " + calculateLevel(result.get(2)));
        System.out.println("词条3: " + calculateLevel(result.get(3)));
        System.out.println("词条4: " + calculateLevel(result.get(4)));
        System.out.println("消耗金绿柱石数量: " + result.get(5));
        System.out.println("消耗金币数量: " + result.get(6));
        System.out.println("消耗灵魂之源数量: " + result.get(7));
    }

    private static double calculateLevel(Integer experience) {
        //查询相加后词条总经验所对应的最大词条等级  ex: 17335=59
        Map.Entry<Integer, Integer> entryMap = FeedMap.inquiryExperienceMap.floorEntry(experience);
        if (entryMap == null){
            return -1;
        }else {
            int equipmentLevel = entryMap.getValue();
            //计算词条百分比的经验值
            double equipmentDecimal = (double) (experience - entryMap.getKey()) / FeedMap.upgradeExperienceMap.get(equipmentLevel);
            return equipmentLevel + equipmentDecimal;
        }
    }

    public static Integer calculateEntries(String entry, Integer num) {
        String[] equipmentEntry = entry.split("\\.");
        int level = Integer.parseInt(equipmentEntry[0]);
        if (num != 0){
            calculateConsumables(level);
        }
        if (FeedMap.totalExperienceMap.get(level) == null || FeedMap.upgradeExperienceMap.get(level) == null){
            return -1;
        }
        //判断词条等级是否有小数点
        if (equipmentEntry.length == 1){
            return FeedMap.totalExperienceMap.get(level);
        }else {
            int decimal = Integer.parseInt(equipmentEntry[1]);
            //计算词条总经验值并添加
            return FeedMap.totalExperienceMap.get(level) + Math.round(FeedMap.upgradeExperienceMap.get(level)
                    * ((float) decimal / FeedMap.decimalPointMap.get(equipmentEntry[1].length())));
        }
    }

    private static void calculateConsumables(int level) {
        Map.Entry<Integer, Integer> stoneMap = FeedMap.stoneMap.ceilingEntry(level);
        result.put(5,result.get(5) + stoneMap.getValue());
        Map.Entry<Integer, Integer> moneyMap = FeedMap.moneyMap.ceilingEntry(level);
        result.put(6,result.get(6) + moneyMap.getValue());
        Map.Entry<Integer, Integer> soulMap = FeedMap.soulMap.ceilingEntry(level);
        result.put(7,result.get(7) + soulMap.getValue());
    }
}
