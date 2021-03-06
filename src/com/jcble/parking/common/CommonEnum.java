package com.jcble.parking.common;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CommonEnum {

  /*
  *@name 返回代码
  *@return 常量数据类型为数字整型
  */
  public enum Rtn {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*成功*/Success {public String getValue(){return "0";}},
    /*失败*/Failure {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 通用有无或存在与否
  */
  public enum ExistFlg {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*无*/No {public String getValue(){return "0";}},
    /*有*/Yes {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 通用是或不是
  */
  public enum YesNoFlg {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*不是*/No {public String getValue(){return "0";}},
    /*是*/Yes {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 通用成功或者失败
  */
  public enum OPResult {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*成功*/Success {public String getValue(){return "0";}},
    /*失败*/Failure {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 车位状态
  */
  public enum ParkingStatus {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*空闲*/InUse {public String getValue(){return "0";}},
    /*占用*/Free {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 注册类型
  */
  public enum RegisterType {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*App*/App {public String getValue(){return "0";}},
    /*微信*/Wechat {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 车辆状态
  */
  public enum carStatus {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*未入场*/Out {public String getValue(){return "0";}},
    /*已预约*/Reservation {public String getValue(){return "1";}},
    /*已入场*/In {public String getValue(){return "2";}},
    /*已缴费未出场*/NotLeave {public String getValue(){return "3";}};
    public abstract String getValue();
  }

  /*
  *@name 管理员账号状态
  */
  public enum AdminStatus {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*未启用*/Unabled {public String getValue(){return "0";}},
    /*启用*/Enabled {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 活动状态
  */
  public enum ActivityStatus {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*未开始*/UnStart {public String getValue(){return "0";}},
    /*进行中*/Ing {public String getValue(){return "1";}},
    /*已结束*/End {public String getValue(){return "2";}};
    public abstract String getValue();
  }

  /*
  *@name 预约状态
  */
  public enum RevatationStatus {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*已预约*/Done {public String getValue(){return "0";}},
    /*已取消*/Cancel {public String getValue(){return "1";}},
    /*使用中*/Using {public String getValue(){return "2";}},
    /*预约过期*/OverTime {public String getValue(){return "3";}};
    public abstract String getValue();
  }

  /*
  *@name 支付方式
  */
  public enum PayWay {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*支付宝*/AliPay {public String getValue(){return "0";}},
    /*微信*/Wechat {public String getValue(){return "1";}},
    /*现金*/Cash {public String getValue(){return "2";}};
    public abstract String getValue();
  }

  /*
  *@name 反馈类型
  */
  public enum FeedbackType {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*软件Bug*/SoftwareBug {public String getValue(){return "0";}},
    /*建议*/Advice {public String getValue(){return "1";}},
    /*其他*/Other {public String getValue(){return "2";}};
    public abstract String getValue();
  }

  /*
  *@name 警告处理状态
  */
  public enum AlarmHandleStatus {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*未处理*/Unprocessed {public String getValue(){return "0";}},
    /*已处理*/Processed {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 订单来源
  */
  public enum OrderSource {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*道闸*/Barrier {public String getValue(){return "0";}},
    /*PDA*/PDA {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 车辆进出方向
  */
  public enum PassDirec {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*进*/In {public String getValue(){return "0";}},
    /*出*/Out {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 车辆类型
  */
  public enum carType {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*大型车*/Large {public String getValue(){return "0";}},
    /*中型车*/Mid {public String getValue(){return "1";}},
    /*小型车*/Small {public String getValue(){return "2";}},
    /*其他*/Other {public String getValue(){return "3";}};
    public abstract String getValue();
  }

  /*
  *@name 网关状态
  */
  public enum GatewayStatus {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*在线*/inline {public String getValue(){return "0";}},
    /*离线*/offline {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 车位锁状态
  */
  public enum ParkingLockStatus {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*无连接*/NoConnection {public String getValue(){return "0";}},
    /*升起*/Up {public String getValue(){return "1";}},
    /*降下*/Down {public String getValue(){return "2";}},
    /*外力撞击*/ExternalHit {public String getValue(){return "3";}},
    /*低电量*/LowPower {public String getValue(){return "4";}};
    public abstract String getValue();
  }

  /*
  *@name 地磁状态
  */
  public enum GeoStatus {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*初始化*/Initial {public String getValue(){return "0";}},
    /*空闲*/Free {public String getValue(){return "1";}},
    /*占用*/Use {public String getValue(){return "2";}},
    /*错误*/Error {public String getValue(){return "3";}},
    /*未知*/Unknow {public String getValue(){return "4";}},
    /*离线*/OffLine {public String getValue(){return "5";}};
    public abstract String getValue();
  }

 

  /*
  *@name 车位锁操作类型
  */
  public enum LockOpType {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*升起*/Up {public String getValue(){return "0";}},
    /*降下*/Down {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 地磁是否空闲
  */
  public enum GeoIsFree {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*空闲*/Yes {public String getValue(){return "0";}},
    /*占用*/No {public String getValue(){return "1";}};
    public abstract String getValue();
  }

  /*
  *@name 车位创建方式
  */
  public enum ParkingCreateWay {
    /*类型*/CLASSC{public String getValue(){return "-1";}},
    /*单个添加*/Single {public String getValue(){return "0";}},
    /*Excel批量导入*/excelBatch {public String getValue(){return "1";}},
    /*Paas批量导入*/PaasBatch {public String getValue(){return "2";}};
    public abstract String getValue();
  }
  
	public enum LockAlarmType {
		LowPower("0", "低电量"), Impact("1", "碰撞"), RiseBlocked("2", "升起受阻"), StatusException("3", "状态异常");
		public String code;
		public String name;

		LockAlarmType(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public static Map<String, String> codeMap = new HashMap<String, String>();

		static {
			for (int i = 0; i < values().length; i++) {
				codeMap.put(values()[i].code, values()[i].name);
			}
		}

		public String getCode() {
			return code;
		}

		public String getName() {
			return name;
		}
	}
  
  public enum GeoAlarmType {
	  LowPower("0", "低电量"), Interfere("1", "强磁干扰"), SensorDamage("2", "传感器损坏"),OffLine("3", "离线"),;
		public String code;
		public String name;

		GeoAlarmType(String code, String name) {
			this.code = code;
			this.name = name;
		}
		 /** The code map. */
      public static Map<String, String> codeMap = new HashMap<String, String>();

      static {
          for (int i = 0; i < values().length; i++) {
              codeMap.put(values()[i].code, values()[i].name);
          }
      }
      public String getCode() {
          return code;
      }
      public String getName() {
          return name;
      }
	}
  
  
   
   public enum DeviceType {
	   ParkingLock("0", "车位锁"), Geomagnetism("1", "地磁");
		public String code;
		public String name;

		DeviceType(String code, String name) {
			this.code = code;
			this.name = name;
		}
		 /** The code map. */
       public static Map<String, String> codeMap = new HashMap<String, String>();

       static {
           for (int i = 0; i < values().length; i++) {
               codeMap.put(values()[i].code, values()[i].name);
           }
       }
       public String getCode() {
           return code;
       }
       public String getName() {
           return name;
       }
	}
  
	public enum GeonStatus {
		Initial("0", "初始化"), Free("1", "空闲"), Use("2", "占用"), Error("3", "错误"), Unknow("4", "未知"), OffLine("5", "离线");
		public String code;
		public String name;

		GeonStatus(String code, String name) {
			this.code = code;
			this.name = name;
		}
        public static Map<String, String> codeMap = new HashMap<String, String>();

        static {
            for (int i = 0; i < values().length; i++) {
                codeMap.put(values()[i].code, values()[i].name);
            }
        }
        public String getCode() {
            return code;
        }
        public String getName() {
            return name;
        }
	}
	

  /*
   * 方法作用:通过枚举类型和标记值 返回对应枚举名称
   * 参数1 Enum :  EciEnum.残数确认状态.类型  |||参数2  flag:"1"
  */
  public static String getValueByFlag(Enum en,String flag) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
    Class<Object> clazz = en.getDeclaringClass();
    Method getValue = clazz.getMethod("getValue");
    Object[] objs = clazz.getEnumConstants();
    String  s="";
    for (Object obj : objs) {
      if(getValue.invoke(obj).equals(flag)){
        s=(String) obj.toString();
      }
    }
    return s;
  }
  

  /*
   * 方法作用:通过枚举类型和枚举名称 返回对应枚举值
   * 参数1 Enum :  EciEnum.残数确认状态.类型  |||参数2  value:""
  */
  public static String getFlagByValue(Enum en,String value) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
    Class<Object> clazz = en.getDeclaringClass();
    Method getValue = clazz.getMethod("getValue");
    Object[] objs = clazz.getEnumConstants();
    String  s="";
    for (Object obj : objs) {
      if((obj.toString()).equalsIgnoreCase(value)){
        s=(String) getValue.invoke(obj);
      }
    }
    return s;
  }
}
