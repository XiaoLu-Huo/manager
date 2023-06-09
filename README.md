# manager
存取款账户管理系统

### 表结构设计
* 储户表：用于保存储户的基本信息，包括姓名、电话、身份证号码等信息
* 单据表：用于保存用户的存取款记录，包括金额、存期、开始时间、结束时间、单号、储户信息等

### 功能实现

* 能够增删改查用户的基本信息
* 能够快速创建存取款单据
* 对存取款单据能够按照条件进行模糊/精确查询
* 用户存款的活期利息可计算

### 技术点

* 使用flyway对数据表进行管理
* 使用mybatis与JDBC进行读写分离
* 使用docker-compose进行容器管理**