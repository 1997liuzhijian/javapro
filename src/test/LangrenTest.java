package test;

import java.util.*;

/*
* 项目描述：
    共计21张牌。在{村民，狼人，守护，预言家，猎人，丘比特，长老，盗贼，替罪羊，女巫}随机生成12-18个身份
(每个身份唯一，村民狼人除外)。有三张底牌，底牌必须不能出现盗贼身份。
玩家输入游戏人数：15
随机生成游戏人数配置：
游戏配置：12-18人（大于18人或者小于12人，输出超出游戏人数范围）
标准配置：
人数（狼，民，神）
18（5,7,5）人    5狼人     7村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊 1吹笛者 1盗贼      21张牌
17（5,6,6）人    5狼人     7村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊 1盗贼                    20张牌
16（5,6,5）人    5狼人     6村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊 1盗贼                    19张牌
15（5,5,5）人    5狼人     5村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊 1盗贼                    18张牌
14（4,5,5）人    4狼人     5村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 替罪羊1 盗贼                    17张牌
13（4,5,4）人    4狼人     5村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 盗贼		                     16张牌
12（4,4,4）人    4狼人     4村民        1预言家 1女巫   1丘比特 1守护 1猎人 1村长 1 盗贼		                     15张牌

盗贼是一个特殊身份：当某位玩家获得盗贼牌的时候，可以翻开底牌三张选择底牌中自己想要的身份（有狼人要选狼人）
要求：
	1.底牌可以没有狼人，如果有，最多只能有一个狼人；
	2.底牌不能有盗贼；
	3.输出如下：
        玩家手牌为：
	{01：村民，02：丘比特，03：盗贼，...  ，15：女巫}
	盗贼底牌为：
	{01：XX，02:XX ，03:XX}

* */
public class LangrenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player = scanner.nextInt();
        if (player > 18 || player < 12) {
            System.out.println("不符合游戏人数");
        }else {
            List<String> all = new ArrayList<>();
            List<String> play = new ArrayList<>();
            List<String> di = new ArrayList<>();
            init(all);
            pai(all,player);
            //盗贼一定在游戏的牌中 总牌中移除盗贼 放入游戏牌中
            all.remove("盗贼");
            play.add("盗贼");
            dipai(all,di);
            //将放完底牌的总牌全部放入游戏牌中
            play.addAll(all);
            //洗牌
            Collections.shuffle(play);
            System.out.println("手牌"+play);
            System.out.println("底牌"+di);
        }
    }
//游戏初始化12个人
    public static void init(List<String> list) {
        for(int i = 0;i<4;i++){
            list.add("狼人");
        }//循环添加四个村民
        for(int i = 0;i<4;i++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("猎人");
        list.add("村长");
        list.add("盗贼");
    }
//根据不同的游戏人数初始化不同牌
    public static void pai(List<String> list,int player){
        if (player > 12)
            list.add("村民");
        if (player > 13)
            list.add("替罪羊");
        if (player > 14)
            list.add("狼人");
        if (player > 15)
            list.add("村民");
        if (player > 16)
            list.add("村民");
        if (player > 17)
            list.add("吹笛者");
    }

//从总牌中随机拿三个底牌
    public static void dipai(List<String> list,List<String> di){
//狼人数应该<=1
        while (di.size()<3){
            //取list的一个随机下标
            Random random = new Random();
            int index = random.nextInt(list.size());
            if(di.contains("有狼人")&&list.get(index).equals("狼人"))
                continue;
            else
            di.add(list.remove(index));
        }
    }
}
