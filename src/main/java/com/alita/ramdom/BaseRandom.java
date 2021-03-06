package com.alita.ramdom;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Description: 基础随机数据
 * @Author: Luancx
 * @Date: 2022/02/15
 * @Version: 1.0.0
 */
public class BaseRandom {

    /**
     * 常见英文姓氏
     */
    protected static final String[] FIRST_NAME = ("Davis,Miller,Garcia,Rodriguez,Smith,Johnson,Wilson,Martinez,Anderson," +
            "Taylor,Williams,Martin,Jackson,Thompson,White,Brown,Jones,Thomas,Clark,Lewis,Robinson,Walker,Perez," +
            "Hernandez,Moore,Lopez,Lee,Gonzalez,Harris,Hall,Wright,King,Scott,Young,Allen,Nelson,Hill,Ramirez,Carter," +
            "Phillips,Evans,Turner,Torres,Campbell,Mitchell,Roberts,Sanchez,Green,Baker,Adams").split(",");
    /**
     * 用于随机选的数字
     */
    protected static final String BASE_NUMBER = "0123456789";
    /**
     * 用于随机选的字符_小写
     */
    protected static final String BASE_CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    /**
     * 用于随机选的字符_大写
     */
    protected static final String BASE_CHAR_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    /**
     * 用于随机选的字符和数字
     */
    protected static final String BASE_CHAR_NUMBER = BASE_CHAR_LOWER + BASE_CHAR_UPPER + BASE_NUMBER;
    /**
     * 常见英文名
     */
    protected static final String[] LAST_NAME = ("Mary,Patricia,Linda,Barbara,Elizabeth,Jennifer,Maria,Susan,Margaret," +
            "Dorothy,Lisa,Nancy,Karen,Betty,Helen,Sandra,Donna,Carol,Ruth,Sharon,Michelle,James,John,Robert,Michael," +
            "William,David,Richard,Charles,Joseph,Thomas,Christopher,Daniel,Paul,Mark,Donald,George,Kenneth,Steven," +
            "Edward,Brian").split(",");
    /**
     * 常见中文姓氏
     */
    protected static final String C_SURNAME = "李王张刘陈杨黄赵周吴徐孙朱马胡郭林何高梁郑罗宋谢唐韩曹许邓萧史石叶";
    /**
     * 常用名字
     */
    protected static final String C_NAME = "怀耀堂清帅帆嘉吉昊栋萌昌同萍明成向少民树阔世刚业琛娜东娟星春娥倩利谭启爱水永常琼丽" +
            "举桂居扈义汉行衍才虎鹏乐桑晓汝瑞健书鑫景良山艳平遵婷智顺白百广鹿鲁梅庆炎源云皓沙抚炜颜芝骞增钟功加红钢邢窦岩芬京亮纲" +
            "芳炳岳仁勇泉磊立勋风经苏苑滔滕法苗付盛胜郝飞惠章波拥若雪绪士铭峰英仲曲维银延建国能泽开洁茂范有锋洋夏崔焕霞伟生传锡蔡" +
            "圣贤洪太夫振田锰由强礼允兆商升效光蕊华奎魏敏齐子村青杜煜潜赟孟荣正季坤来祥学武车慧全浩彩卫敬公彬杰兰佳兴兵轶海好腾蕾" +
            "松长卿宁征善薄超文辉玉安冉斌美福宏宗龙香厚涛军薛辛宝群润涧宫玮妮冯侯新冰辰玲莲冲涵段家德冷边莹方殿秀淄毅寇俊秋富双巍" +
            "金发淑近燕志姚姜远连迟忠翠信姣凤巨巩召旭路可凯柱菲";
    /**
     * 常用中文
     */
    protected static final String CHINESE_CHARACTER = C_SURNAME + C_NAME + "退老态送适考逃者逆选而耍倍怎透耐逐怒倒递途怕" +
            "耕怖耗逗倘候倚通怜思逝速借怠造倡逢急倦性怨怪逮耳债总耻值逼耽倾假遇恋聋职灌遍偏恐恒道联遗做聚停恢遣遥恨恩聪火灭恭遭" +
            "遮灯息灰恰恳灵灶恶偶偷恼灾灿偿避邀肃悄傅肆肉炉悉炊肌傍炒悔炕肚肝悟肠悠股肢那患肤肥悦您储肩邪悬催炭邮炮肯育悲傲炸点" +
            "肺邻傻炼悼肾肿胀胁烂胃情胆烈郊惊背郎像惑惕胖烘僚烛惜胞烟烤烦烧惧部惨惩烫热惭惯惰胳想僵胶胸惹僻都愁脂脆愈脉愉脊脏意" +
            "脑脖鄙脚愚感愤焦愧焰脱然脸脾儿愿元兄充先慈腊克慌煌免配煎慎腐酒兔腔慕党慢煤入腥照慨八酬六煮腰慰共酱关其具酷典酸腹养" +
            "兼兽腿酿膀熄内冈醉膊熊醋册再膏冒醒熔写膛农膜膝熟冠冤膨冬决况冶冻净懂臂燃准采凉释里重野减量凑懒凝几凡臣燥自凭臭至凳" +
            "致凶出击刀刃舅分爆切刊舌舍戏刑我划戒舒或列战则戚创初舞舟删判爪航截别爬般刮到舰舱戴父制户爷刷爸券爹船刺刻爽房所扁剂" +
            "剃片扇艇版削手牌前扎扑剑扒打扔剖托艘牙牛扛牢扣剥执牧剧扩物剩剪扫扬扭扮扯副扰艰色牲割鉴牵扶批特艺牺找承技犁节抄劈把" +
            "芒抓投抖抗折力抛劝办务抢劣护报芦动助努劫披犬抬犯花励抱劲劳抵状芹犹抹押芽抽势狂担拆拉勉拌苍拍拐狐拒勒拔拖狗拘招拜狠" +
            "狡拢拣勤拦苦拨择括独狭狮狱拳拴狸苹勺拼狼勾拾勿拿匀持挂茄包茅匆指按茎挎猎挑化挖北匙猛猜匠挠挡挣挤挥茧挨挪匪猪茫猫献" +
            "猴茶匹区挺医挽猾十千捆午草捉半捎协捏荐捐荒单捕卖南博卜捞损占卡荡捡换卧捧据药印危即却卵卷荷捷卸掀厂厅历率授厉掉压厌" +
            "掌掏排厕厘掘原掠探接厦控推厨玩掩莫环现获去玻县参又叉揉及菊友菌反珍描提插叔取受变叙叛菜珠菠叠握口古句另叨只揪叫班揭" +
            "叮台右援号司叹叼搁搂吃球各萄搅理合吊名后搏吐吓吗君搜萝吞搞营否吧吨吩含听搬搭琴吵吸吹携吼落呀摄呆摆摇呈告摊摔著员摘" +
            "葛呜葡呢董摧摩葬葱味葵摸呼命璃撇针钉和咏咐撑撒钓撕蒙蒜钞撞撤钥钩咬播咱钱咳钳咸蒸钻咽哀品铁铃哄蓄铅哈响操哑哗瓜铜蓝" +
            "瓣哥瓦擦哨哪蓬哭哲铲瓶铸铺链销攀锁锄锅唇锈唉锐蔑甘错甚甜锣唤锤锦用甩蔬售键支唯锯唱甲申电收男改锹画攻锻蔽放政啄畅故" +
            "镇蕉啊界敌畏救留教畜镜敞敢散略啦番数镰敲整喂疆喇喉喊疏斑疑斗疗喘料斜喜喝斤疤斥斧斩薪疫断疮疯斯薯疲喷疼施疾旁病旅症" +
            "旋族藏痒嗓痕旗痛无既日旦旧门旨早闪旬闭问闯痰旱闲间时旷闷闸闹旺闻嗽阀阁昂阅昆昏易队映瘦昨是嘱防阳阴嘴阵阶阻昼显阿晃" +
            "附际陆晋晌降虏限虑晒陕晕虚晚陡院除晨器险陪虫普晴陵陶晶陷虹登虽虾蚀蚁皂蚂暂的皆隆皇蚊随隐暑隔蚕暖暗隙障皮暮皱暴隶嚷" +
            "嚼难雀雁雄雅盆集蛇盈益囊蛋盏盐监盒雕盖盗盘蛙四蛛回盟因团雨园目蛮盯困盲更围直零雷相雹固盼图盾曾雾蛾替最需省蜂圆震月" +
            "圈眉霉朋看服蜓朗蜘望蜜霜朝土真期眠蜡木在眨未末本术眯地露朴朵霸场机蜻眼朽圾杀址着睁杂权杆均蝇坊坏杏材坐坑块静坚坛睛" +
            "坝非坟束杠靠条坡睡面督坦革睬杯蝴蝶板极垂垃构垄型鞋融瞎析垒瞒枕果枝鞠枣垦瞧枪垫鞭垮枯架螺柄埋城柏某染柔矛柜域知查矩" +
            "短矮柳音柴韵培基矿柿码堆标砌砍栏研砖栗校堡蠢堤株堪破堵样核根格栽血础桃框案桌塌桐塑衔塔街塘塞衡衣档补桥表桨衫填衬硬" +
            "确衰页顶桶顷项须顽顾顿颂境袄预领颈袋碌袍碍碎碑墓袖碗颗题墙袜额颠梢颤梦碧梨墨被袭梯械碰梳检裁磁壁裂装棉棋棍棒棕裕飘" +
            "裙棚食裤壤磨壮森声壳裳棵壶裹处椅备复植餐椒夕外多夜够大天央失头夸夹示夺社奇奉奋奏奔奖祖套楚祝神饥奥票饭饮饰饱饲女奴" +
            "奶饶奸祸她饺饼楼西饿要禁如概妄馅馆榆覆妇妈馋馒妖首妙榜妥妨榨榴妹妻离禽禾见私观秃规秆视览觉始种姐槐姑科角秒姓委秘租" +
            "解秤姥触秧姨秩积称姻移槽姿言稀威娃娇程稍税娘稠模横娱樱稳稻稼稿婆穗橘婚橡驰驱驳穴驴究驶婶穷空驻驼驾穿突骂窃骄窄骆誉" +
            "验窑骑誓窗骗窜窝骡骤骨嫁嫂嫌竖站竞竟童嫩竭端竹竿笋笑笔笛欠次欢欣符欧笨第欲欺鬼笼款魂魄歇等歉筋歌筐筑筒孔答魔孕策字" +
            "存筛孝筝止此孤步警孩歪筹死歼签简它殃宅宇守殊残完殖算官宙定宜实计审管订客宣认室讨让箩宪训箭议讯记宰箱讲害宴宵容论讽" +
            "宽设宾访宿证毁评寄识密篇诉诊母词每译毒寒比毕试诗毙诚毛话诞察询该详寨毫语篮误毯诱说诵请寸诸对寺寻读导课寿封谁调射谅" +
            "将谈谊尊谋谎小氏气尖尘尚谜尝谣尤谦氧谨就谱谷尸尺尼尽尾尿局汁求层豆汇屈届屋籍屑展汗属江池屠污象屡汤汪豪屯米类鱼汽屿" +
            "岁岂沃沈沉粉貌粒岔岗粗粘岛鲜沟没粥粪沫岭粮粱河岸沸油治沾精沿泄泊糊糕糖泛糟糠泡峡泥注泪泰泳系泻泼崇洒崖洗贝贞洞负素" +
            "贡财索责败津货紧质贩贪贫紫购崭贯累贱洲贴贵贷贸费贺活贼洽派贿流资浅浆浇浊测赌济赏浑浓赔赖浙赚赛赞赠赢赤浪浮絮走赴浴" +
            "赶起浸趁涂消涉越趋涌涝趟趣涨液足趴跃淋跌跑淘川距州跟巡淡工左巧跨跪差己深已跳巴践巷混淹添巾一丁币市七布万丈师三上下" +
            "希不与踏帐渐丑专且渔帖渗丘帘丙丛帜丝帝鸟渠鸡渡丢踢鸣渣两严带鸦丧温踩个踪中鸭席帮港丰串临渴丸游丹为主鸽帽繁乃蹄久幅" +
            "鹅么蹈鹊之乌乎乏乒乓乔幕乖湖乘乙九乞也习乡蹦买鹰乱干蹲乳年并幸幻幼湾湿躁庄了予争溉床事二于亏序互库五应井底店庙亚些" +
            "府溜废纠亡交纤亦约麦度产级座亩纪溪身享躬亭庭纯纱亲躲纳纵纷康纸庸纹人纺躺麻纽亿线什练组仅仆细仇织终廉今廊介滋仍绍从" +
            "黎绑黑滑绒仓结仔绕他仗绘默仙给滚络绝绞统满绢代绣令滤以滥继滨绩滩仪们续仰绳滴绵件价绸任份仿绿企异漂弃弄漆弊伍缎式伏" +
            "漏伐休弓缓鼓演引编众优缘伙会缝伞弟鼠漠缠伤弦缩伪漫伯弯估弱伴缴伶伸缸弹缺鼻似但位低住罐网归当体录余罚佛作你形罢佣轧" +
            "轨佩罩罪转轮置潮软轰影役彻轻彼载齿使轿往较侄径龄待辅辆很辈羊例律侍徒输得供辜依羞辞龟辟御羡澡辣侦侧侨辨辩循辫侮微辱" +
            "侵辽羽达便激迁翁心促必迅翅忆过迈忌忍迎运返俗还忘俘忙这进违保忧俩快迫俭修俯述俱念迷迹翻翼忽追";

    /**
     * 获取随机数生成器对象<br>
     * ThreadLocalRandom是JDK 7之后提供并发产生随机数，能够解决多个线程发生的竞争争夺。
     *
     * <p>
     * 注意：此方法返回的{@link ThreadLocalRandom}不可以在多线程环境下共享对象，否则有重复随机数问题。
     * 见：https://www.jianshu.com/p/89dfe990295c
     * </p>
     *
     * @return {@link ThreadLocalRandom}
     * @since 3.1.2
     */
    protected static ThreadLocalRandom getRandom() {
        return ThreadLocalRandom.current();
    }


}
