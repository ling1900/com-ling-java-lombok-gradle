package com.ling.mybatis.begin.dglgutil;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "命令编号。编号六位，前三位为组编号，后三位为组内编号")
public class CmdCode {

//    public static final int QueryPermission = 100_001;
//    public static final int InsertPermission = 100_002;
//    public static final int UpdatePermission = 100_003;
//    public static final int DeletePermission = 100_004;

    public static final int RoleQuery = 101_001;
    public static final int RoleInsert = 101_002;
    public static final int RoleUpdate = 101_003;
    public static final int RoleDelete = 101_004;
    public static final int RoleQueryPmss = 101_005;

//    public static final int UpdateRolePermission = 102_001;
//    public static final int UpdateUserRole = 102_002;

    public static final int UserQuery = 103_001;
    public static final int UserInsert = 103_002;
    public static final int UserUpdate = 103_003;
    public static final int UserDelete = 103_004;

    public static final int UserLogin = 103_005;
    public static final int UserLogout = 103_006;
    public static final int UserLoginInfo = 103_007;

    public static final int SysPropertyQuery = 113_001;
    public static final int SysPropertyCreateWithTransaction = 113_002;
    public static final int SysPropertyCreateWithoutTransaction = 113_003;
    public static final int SysPropertyUpdate = 113_004;
    public static final int SysPropertyDelete = 113_005;

}
