
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class FeedMap {

    //词条等级对应的总经验
    public static Map<Integer,Integer> totalExperienceMap;

    //词条等级升级所需的经验值
    public static Map<Integer,Integer> upgradeExperienceMap;

    //词条总经验所对应的等级
    public static NavigableMap<Integer,Integer> inquiryExperienceMap;

    //百分比对应的小数点
    public static Map<Integer,Integer> decimalPointMap;

    //装备喂养使用的金绿柱石数量
    public static NavigableMap<Integer,Integer> stoneMap;

    //装备喂养使用的金币数量
    public static NavigableMap<Integer,Integer> moneyMap;

    //装备喂养使用的灵魂之源数量
    public static NavigableMap<Integer,Integer> soulMap;

    //装备喂养结果
    public static Map<Integer,Integer> result;

    static {
        totalExperienceMap = new HashMap<>();
        totalExperienceMap.put(27,73);
        totalExperienceMap.put(31,133);
        totalExperienceMap.put(47,1679);
        totalExperienceMap.put(48,1981);
        totalExperienceMap.put(49,2338);
        totalExperienceMap.put(50,3112);
        totalExperienceMap.put(51,3765);
        totalExperienceMap.put(52,4556);
        totalExperienceMap.put(53,5513);
        totalExperienceMap.put(54,6668);
        totalExperienceMap.put(55,8067);
        totalExperienceMap.put(56,9762);
        totalExperienceMap.put(57,11823);
        totalExperienceMap.put(58,14317);
        totalExperienceMap.put(59,17335);
        totalExperienceMap.put(60,23635);
        totalExperienceMap.put(61,29299);
        totalExperienceMap.put(62,36317);
        totalExperienceMap.put(63,45019);
        totalExperienceMap.put(64,55809);
        totalExperienceMap.put(65,69189);

        upgradeExperienceMap = new HashMap<>();
        upgradeExperienceMap.put(27,9);
        upgradeExperienceMap.put(31,20);
        upgradeExperienceMap.put(47,302);
        upgradeExperienceMap.put(48,357);
        upgradeExperienceMap.put(49,774);
        upgradeExperienceMap.put(50,653);
        upgradeExperienceMap.put(51,791);
        upgradeExperienceMap.put(52,957);
        upgradeExperienceMap.put(53,1155);
        upgradeExperienceMap.put(54,1399);
        upgradeExperienceMap.put(55,1695);
        upgradeExperienceMap.put(56,2069);
        upgradeExperienceMap.put(57,2494);
        upgradeExperienceMap.put(58,3018);
        upgradeExperienceMap.put(59,6300);
        upgradeExperienceMap.put(60,5664);
        upgradeExperienceMap.put(61,7018);
        upgradeExperienceMap.put(62,8702);
        upgradeExperienceMap.put(63,10790);
        upgradeExperienceMap.put(64,13380);
        upgradeExperienceMap.put(65,16590);

        inquiryExperienceMap = new TreeMap<>();
        inquiryExperienceMap.put(4556,52);
        inquiryExperienceMap.put(5513,53);
        inquiryExperienceMap.put(6668,54);
        inquiryExperienceMap.put(8067,55);
        inquiryExperienceMap.put(9762,56);
        inquiryExperienceMap.put(11823,57);
        inquiryExperienceMap.put(14317,58);
        inquiryExperienceMap.put(17335,59);
        inquiryExperienceMap.put(23635,60);
        inquiryExperienceMap.put(29299,61);
        inquiryExperienceMap.put(36317,62);
        inquiryExperienceMap.put(45019,63);
        inquiryExperienceMap.put(55809,64);
        inquiryExperienceMap.put(69189,65);

        decimalPointMap = new HashMap<>();
        decimalPointMap.put(1,10);
        decimalPointMap.put(2,100);
        decimalPointMap.put(3,1000);
        decimalPointMap.put(4,10000);
        decimalPointMap.put(5,100000);

        stoneMap = new TreeMap<>();
        stoneMap.put(10,10);
        stoneMap.put(20,15);
        stoneMap.put(30,20);
        stoneMap.put(40,25);
        stoneMap.put(45,50);
        stoneMap.put(50,60);
        stoneMap.put(55,70);
        stoneMap.put(60,80);
        stoneMap.put(65,90);
        stoneMap.put(70,100);
        stoneMap.put(75,110);
        stoneMap.put(80,120);

        moneyMap = new TreeMap<>();
        moneyMap.put(10,10000);
        moneyMap.put(20,15000);
        moneyMap.put(30,20000);
        moneyMap.put(40,25000);
        moneyMap.put(45,50000);
        moneyMap.put(50,60000);
        moneyMap.put(55,70000);
        moneyMap.put(60,80000);
        moneyMap.put(65,90000);
        moneyMap.put(70,100000);
        moneyMap.put(75,110000);
        moneyMap.put(80,120000);

        soulMap = new TreeMap<>();
        soulMap.put(40,0);
        soulMap.put(80,1);

        result = new HashMap<>();
        result.put(1,0);
        result.put(2,0);
        result.put(3,0);
        result.put(4,0);
    }
}
