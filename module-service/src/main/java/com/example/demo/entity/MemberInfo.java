package com.example.demo.entity;

import java.util.Date;

/**
 * 描述:memberinfo表的实体类
 * @version
 * @author:  admin
 * @创建时间: 2019-02-24
 */
public class MemberInfo {
    /**
     * 记录编号
     */
    private Long id;

    /**
     * 会员所属商家ID
     */
    private Long vendorId;

    /**
     * 会员号
     */
    private String memNo;

    /**
     * 会员登录用户名
     */
    private String memPin;

    /**
     * 会员登录密码
     */
    private String memPwd;

    /**
     * 会员来源区域编码
     */
    private String organCode;

    /**
     * 会员来源区域名称
     */
    private String organName;

    /**
     * 会员来源门店
     */
    private String storeCode;

    /**
     * 会员来源门店名称
     */
    private String storeName;

    /**
     * 会员所属微店编码
     */
    private String wdStoreCode;

    /**
     * 会员姓名
     */
    private String memName;

    /**
     * 会员助记码
     */
    private String memHelpCode;

    /**
     * 会员昵称
     */
    private String nickName;

    /**
     * 会员手机号
     */
    private String mobileNo;

    /**
     * 账户余额
     */
    private Double balance;

    /**
     * 积分
     */
    private Double memPoint;

    /**
     * 余额累计消费
     */
    private Double consumeAmount;

    /**
     * 累计消费(会员所有消费金额)
     */
    private Double allConsumeAmount;

    /**
     * 累计赠送金额
     */
    private Double presentAmount;

    /**
     * 累计充值金额(不含赠送)
     */
    private Double rechargeAmount;

    /**
     * 累计积分
     */
    private Double memPointAmount;

    /**
     * 累计充值总金额(含赠送)
     */
    private Double allRechargeAmount;

    /**
     * 信誉额度
     */
    private Double creditLine;

    /**
     * 0正常 1冻结 2过期
     */
    private Byte status;

    /**
     * 0不需要密码 1表示需要密码
     */
    private Byte needPwdFlag;

    /**
     * 性别 0女 1男
     */
    private Byte gender;

    /**
     * 会员类别
     */
    private String memCatCode;

    /**
     * 省级编码
     */
    private String provinceCode;

    /**
     * 市级编码
     */
    private String cityCode;

    /**
     * 地区编码
     */
    private String regionCode;

    /**
     * 详细地址
     */
    private String memAddress;

    /**
     * 会员生日
     */
    private Date birthday;

    /**
     * 头像图片url
     */
    private String headImg;

    /**
     * 微信注册区域
     */
    private String wxAddress;

    /**
     * 是否已删除1删除 0正常
     */
    private Byte df;

    /**
     * 备注
     */
    private String memo;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 修改日期
     */
    private Date modifyDate;

    /**
     * 推荐会员pin
     */
    private String parentMemPin;

    /**
     * 推荐人手机号
     */
    private String parentMobileNo;

    /**
     * 会员一维码
     */
    private String barCodeUrl;

    /**
     * 会员二维码
     */
    private String QRCodeUrl;

    /**
     * 会员二维码值(uuid 农场闸机扫码需求)
     */
    private String QRCodeValue;

    /**
     * 储值卡号
     */
    private String cardNo;

    /**
     * 储值卡ID(磁条卡和IC卡可能cardid和cardno不一样)
     */
    private String cardId;

    /**
     * 微信唯一标识
     */
    private String unionid;

    /**
     * 业务员(推荐人姓名)
     */
    private String reference;

    /**
     * 年龄段 （18-24）
     */
    private String ageGroup;

    /**
     * 会员来源 0微信 1微博 2逛街路过 3朋友推荐 4其他媒体
     */
    private Byte memberSource;

    /**
     * 会员有效开始时间
     */
    private Date startDate;

    /**
     * 会员有效结束时间
     */
    private Date endDate;

    /**
     * 冻结积分
     */
    private Double frozenPoint;

    /**
     * 积分、储值支付密码
     */
    private String payPwd;

    /**
     * 累计冻结积分
     */
    private Double frozenPointAmount;

    /**
     * 合伙人级别编码
     */
    private String partnerCode;

    /**
     * 合伙人级别名称
     */
    private String partnerName;

    /**
     * 合伙人注册日期
     */
    private Date partnerCreate;

    /**
     * 身份证号
     */
    private String memIDCardNo;

    /**
     * 是否有下单 1是 0否
     */
    private Byte hasOrder;

    /**
     * 首次下单时间
     */
    private Date hasOrderDate;

    /**
     * 人脸识别ID
     */
    private String certId;

    /**
     * 自定义字段1
     */
    private String customFields1;

    /**
     * 自定义字段2
     */
    private String customFields2;

    /**
     * 自定义字段3
     */
    private String customFields3;

    /**
     * 自定义字段4
     */
    private String customFields4;

    /**
     * 自定义字段5
     */
    private String customFields5;

    /**
     * 打印购物小票：0关闭 1开启
     */
    private Byte shoppingTicket;

    /**
     * 打印小票开启时间
     */
    private Date ticketedDate;

    /**
     * 记录编号
     * @return id 记录编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 记录编号
     * @param id 记录编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 会员所属商家ID
     * @return vendorId 会员所属商家ID
     */
    public Long getVendorId() {
        return vendorId;
    }

    /**
     * 会员所属商家ID
     * @param vendorId 会员所属商家ID
     */
    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * 会员号
     * @return memNo 会员号
     */
    public String getMemNo() {
        return memNo;
    }

    /**
     * 会员号
     * @param memNo 会员号
     */
    public void setMemNo(String memNo) {
        this.memNo = memNo == null ? null : memNo.trim();
    }

    /**
     * 会员登录用户名
     * @return memPin 会员登录用户名
     */
    public String getMemPin() {
        return memPin;
    }

    /**
     * 会员登录用户名
     * @param memPin 会员登录用户名
     */
    public void setMemPin(String memPin) {
        this.memPin = memPin == null ? null : memPin.trim();
    }

    /**
     * 会员登录密码
     * @return memPwd 会员登录密码
     */
    public String getMemPwd() {
        return memPwd;
    }

    /**
     * 会员登录密码
     * @param memPwd 会员登录密码
     */
    public void setMemPwd(String memPwd) {
        this.memPwd = memPwd == null ? null : memPwd.trim();
    }

    /**
     * 会员来源区域编码
     * @return organCode 会员来源区域编码
     */
    public String getOrganCode() {
        return organCode;
    }

    /**
     * 会员来源区域编码
     * @param organCode 会员来源区域编码
     */
    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    /**
     * 会员来源区域名称
     * @return organName 会员来源区域名称
     */
    public String getOrganName() {
        return organName;
    }

    /**
     * 会员来源区域名称
     * @param organName 会员来源区域名称
     */
    public void setOrganName(String organName) {
        this.organName = organName == null ? null : organName.trim();
    }

    /**
     * 会员来源门店
     * @return storeCode 会员来源门店
     */
    public String getStoreCode() {
        return storeCode;
    }

    /**
     * 会员来源门店
     * @param storeCode 会员来源门店
     */
    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode == null ? null : storeCode.trim();
    }

    /**
     * 会员来源门店名称
     * @return storeName 会员来源门店名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 会员来源门店名称
     * @param storeName 会员来源门店名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 会员所属微店编码
     * @return wdStoreCode 会员所属微店编码
     */
    public String getWdStoreCode() {
        return wdStoreCode;
    }

    /**
     * 会员所属微店编码
     * @param wdStoreCode 会员所属微店编码
     */
    public void setWdStoreCode(String wdStoreCode) {
        this.wdStoreCode = wdStoreCode == null ? null : wdStoreCode.trim();
    }

    /**
     * 会员姓名
     * @return memName 会员姓名
     */
    public String getMemName() {
        return memName;
    }

    /**
     * 会员姓名
     * @param memName 会员姓名
     */
    public void setMemName(String memName) {
        this.memName = memName == null ? null : memName.trim();
    }

    /**
     * 会员助记码
     * @return memHelpCode 会员助记码
     */
    public String getMemHelpCode() {
        return memHelpCode;
    }

    /**
     * 会员助记码
     * @param memHelpCode 会员助记码
     */
    public void setMemHelpCode(String memHelpCode) {
        this.memHelpCode = memHelpCode == null ? null : memHelpCode.trim();
    }

    /**
     * 会员昵称
     * @return nickName 会员昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 会员昵称
     * @param nickName 会员昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 会员手机号
     * @return mobileNo 会员手机号
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 会员手机号
     * @param mobileNo 会员手机号
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    /**
     * 账户余额
     * @return balance 账户余额
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 账户余额
     * @param balance 账户余额
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * 积分
     * @return memPoint 积分
     */
    public Double getMemPoint() {
        return memPoint;
    }

    /**
     * 积分
     * @param memPoint 积分
     */
    public void setMemPoint(Double memPoint) {
        this.memPoint = memPoint;
    }

    /**
     * 余额累计消费
     * @return consumeAmount 余额累计消费
     */
    public Double getConsumeAmount() {
        return consumeAmount;
    }

    /**
     * 余额累计消费
     * @param consumeAmount 余额累计消费
     */
    public void setConsumeAmount(Double consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    /**
     * 累计消费(会员所有消费金额)
     * @return allConsumeAmount 累计消费(会员所有消费金额)
     */
    public Double getAllConsumeAmount() {
        return allConsumeAmount;
    }

    /**
     * 累计消费(会员所有消费金额)
     * @param allConsumeAmount 累计消费(会员所有消费金额)
     */
    public void setAllConsumeAmount(Double allConsumeAmount) {
        this.allConsumeAmount = allConsumeAmount;
    }

    /**
     * 累计赠送金额
     * @return presentAmount 累计赠送金额
     */
    public Double getPresentAmount() {
        return presentAmount;
    }

    /**
     * 累计赠送金额
     * @param presentAmount 累计赠送金额
     */
    public void setPresentAmount(Double presentAmount) {
        this.presentAmount = presentAmount;
    }

    /**
     * 累计充值金额(不含赠送)
     * @return rechargeAmount 累计充值金额(不含赠送)
     */
    public Double getRechargeAmount() {
        return rechargeAmount;
    }

    /**
     * 累计充值金额(不含赠送)
     * @param rechargeAmount 累计充值金额(不含赠送)
     */
    public void setRechargeAmount(Double rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    /**
     * 累计积分
     * @return memPointAmount 累计积分
     */
    public Double getMemPointAmount() {
        return memPointAmount;
    }

    /**
     * 累计积分
     * @param memPointAmount 累计积分
     */
    public void setMemPointAmount(Double memPointAmount) {
        this.memPointAmount = memPointAmount;
    }

    /**
     * 累计充值总金额(含赠送)
     * @return allRechargeAmount 累计充值总金额(含赠送)
     */
    public Double getAllRechargeAmount() {
        return allRechargeAmount;
    }

    /**
     * 累计充值总金额(含赠送)
     * @param allRechargeAmount 累计充值总金额(含赠送)
     */
    public void setAllRechargeAmount(Double allRechargeAmount) {
        this.allRechargeAmount = allRechargeAmount;
    }

    /**
     * 信誉额度
     * @return creditLine 信誉额度
     */
    public Double getCreditLine() {
        return creditLine;
    }

    /**
     * 信誉额度
     * @param creditLine 信誉额度
     */
    public void setCreditLine(Double creditLine) {
        this.creditLine = creditLine;
    }

    /**
     * 0正常 1冻结 2过期
     * @return status 0正常 1冻结 2过期
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 0正常 1冻结 2过期
     * @param status 0正常 1冻结 2过期
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 0不需要密码 1表示需要密码
     * @return needPwdFlag 0不需要密码 1表示需要密码
     */
    public Byte getNeedPwdFlag() {
        return needPwdFlag;
    }

    /**
     * 0不需要密码 1表示需要密码
     * @param needPwdFlag 0不需要密码 1表示需要密码
     */
    public void setNeedPwdFlag(Byte needPwdFlag) {
        this.needPwdFlag = needPwdFlag;
    }

    /**
     * 性别 0女 1男
     * @return gender 性别 0女 1男
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * 性别 0女 1男
     * @param gender 性别 0女 1男
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * 会员类别
     * @return memCatCode 会员类别
     */
    public String getMemCatCode() {
        return memCatCode;
    }

    /**
     * 会员类别
     * @param memCatCode 会员类别
     */
    public void setMemCatCode(String memCatCode) {
        this.memCatCode = memCatCode == null ? null : memCatCode.trim();
    }

    /**
     * 省级编码
     * @return provinceCode 省级编码
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 省级编码
     * @param provinceCode 省级编码
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * 市级编码
     * @return cityCode 市级编码
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 市级编码
     * @param cityCode 市级编码
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * 地区编码
     * @return regionCode 地区编码
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 地区编码
     * @param regionCode 地区编码
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    /**
     * 详细地址
     * @return memAddress 详细地址
     */
    public String getMemAddress() {
        return memAddress;
    }

    /**
     * 详细地址
     * @param memAddress 详细地址
     */
    public void setMemAddress(String memAddress) {
        this.memAddress = memAddress == null ? null : memAddress.trim();
    }

    /**
     * 会员生日
     * @return birthday 会员生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 会员生日
     * @param birthday 会员生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 头像图片url
     * @return headImg 头像图片url
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 头像图片url
     * @param headImg 头像图片url
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    /**
     * 微信注册区域
     * @return wxAddress 微信注册区域
     */
    public String getWxAddress() {
        return wxAddress;
    }

    /**
     * 微信注册区域
     * @param wxAddress 微信注册区域
     */
    public void setWxAddress(String wxAddress) {
        this.wxAddress = wxAddress == null ? null : wxAddress.trim();
    }

    /**
     * 是否已删除1删除 0正常
     * @return df 是否已删除1删除 0正常
     */
    public Byte getDf() {
        return df;
    }

    /**
     * 是否已删除1删除 0正常
     * @param df 是否已删除1删除 0正常
     */
    public void setDf(Byte df) {
        this.df = df;
    }

    /**
     * 备注
     * @return memo 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 备注
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * 创建日期
     * @return createDate 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建日期
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 修改日期
     * @return modifyDate 修改日期
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 修改日期
     * @param modifyDate 修改日期
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 推荐会员pin
     * @return parentMemPin 推荐会员pin
     */
    public String getParentMemPin() {
        return parentMemPin;
    }

    /**
     * 推荐会员pin
     * @param parentMemPin 推荐会员pin
     */
    public void setParentMemPin(String parentMemPin) {
        this.parentMemPin = parentMemPin == null ? null : parentMemPin.trim();
    }

    /**
     * 推荐人手机号
     * @return parentMobileNo 推荐人手机号
     */
    public String getParentMobileNo() {
        return parentMobileNo;
    }

    /**
     * 推荐人手机号
     * @param parentMobileNo 推荐人手机号
     */
    public void setParentMobileNo(String parentMobileNo) {
        this.parentMobileNo = parentMobileNo == null ? null : parentMobileNo.trim();
    }

    /**
     * 会员一维码
     * @return barCodeUrl 会员一维码
     */
    public String getBarCodeUrl() {
        return barCodeUrl;
    }

    /**
     * 会员一维码
     * @param barCodeUrl 会员一维码
     */
    public void setBarCodeUrl(String barCodeUrl) {
        this.barCodeUrl = barCodeUrl == null ? null : barCodeUrl.trim();
    }

    /**
     * 会员二维码
     * @return QRCodeUrl 会员二维码
     */
    public String getQRCodeUrl() {
        return QRCodeUrl;
    }

    /**
     * 会员二维码
     * @param QRCodeUrl 会员二维码
     */
    public void setQRCodeUrl(String QRCodeUrl) {
        this.QRCodeUrl = QRCodeUrl == null ? null : QRCodeUrl.trim();
    }

    /**
     * 会员二维码值(uuid 农场闸机扫码需求)
     * @return QRCodeValue 会员二维码值(uuid 农场闸机扫码需求)
     */
    public String getQRCodeValue() {
        return QRCodeValue;
    }

    /**
     * 会员二维码值(uuid 农场闸机扫码需求)
     * @param QRCodeValue 会员二维码值(uuid 农场闸机扫码需求)
     */
    public void setQRCodeValue(String QRCodeValue) {
        this.QRCodeValue = QRCodeValue == null ? null : QRCodeValue.trim();
    }

    /**
     * 储值卡号
     * @return cardNo 储值卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 储值卡号
     * @param cardNo 储值卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 储值卡ID(磁条卡和IC卡可能cardid和cardno不一样)
     * @return cardId 储值卡ID(磁条卡和IC卡可能cardid和cardno不一样)
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 储值卡ID(磁条卡和IC卡可能cardid和cardno不一样)
     * @param cardId 储值卡ID(磁条卡和IC卡可能cardid和cardno不一样)
     */
    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    /**
     * 微信唯一标识
     * @return unionid 微信唯一标识
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * 微信唯一标识
     * @param unionid 微信唯一标识
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * 业务员(推荐人姓名)
     * @return reference 业务员(推荐人姓名)
     */
    public String getReference() {
        return reference;
    }

    /**
     * 业务员(推荐人姓名)
     * @param reference 业务员(推荐人姓名)
     */
    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    /**
     * 年龄段 （18-24）
     * @return ageGroup 年龄段 （18-24）
     */
    public String getAgeGroup() {
        return ageGroup;
    }

    /**
     * 年龄段 （18-24）
     * @param ageGroup 年龄段 （18-24）
     */
    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup == null ? null : ageGroup.trim();
    }

    /**
     * 会员来源 0微信 1微博 2逛街路过 3朋友推荐 4其他媒体
     * @return memberSource 会员来源 0微信 1微博 2逛街路过 3朋友推荐 4其他媒体
     */
    public Byte getMemberSource() {
        return memberSource;
    }

    /**
     * 会员来源 0微信 1微博 2逛街路过 3朋友推荐 4其他媒体
     * @param memberSource 会员来源 0微信 1微博 2逛街路过 3朋友推荐 4其他媒体
     */
    public void setMemberSource(Byte memberSource) {
        this.memberSource = memberSource;
    }

    /**
     * 会员有效开始时间
     * @return startDate 会员有效开始时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 会员有效开始时间
     * @param startDate 会员有效开始时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 会员有效结束时间
     * @return endDate 会员有效结束时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 会员有效结束时间
     * @param endDate 会员有效结束时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 冻结积分
     * @return frozenPoint 冻结积分
     */
    public Double getFrozenPoint() {
        return frozenPoint;
    }

    /**
     * 冻结积分
     * @param frozenPoint 冻结积分
     */
    public void setFrozenPoint(Double frozenPoint) {
        this.frozenPoint = frozenPoint;
    }

    /**
     * 积分、储值支付密码
     * @return payPwd 积分、储值支付密码
     */
    public String getPayPwd() {
        return payPwd;
    }

    /**
     * 积分、储值支付密码
     * @param payPwd 积分、储值支付密码
     */
    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd == null ? null : payPwd.trim();
    }

    /**
     * 累计冻结积分
     * @return frozenPointAmount 累计冻结积分
     */
    public Double getFrozenPointAmount() {
        return frozenPointAmount;
    }

    /**
     * 累计冻结积分
     * @param frozenPointAmount 累计冻结积分
     */
    public void setFrozenPointAmount(Double frozenPointAmount) {
        this.frozenPointAmount = frozenPointAmount;
    }

    /**
     * 合伙人级别编码
     * @return partnerCode 合伙人级别编码
     */
    public String getPartnerCode() {
        return partnerCode;
    }

    /**
     * 合伙人级别编码
     * @param partnerCode 合伙人级别编码
     */
    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode == null ? null : partnerCode.trim();
    }

    /**
     * 合伙人级别名称
     * @return partnerName 合伙人级别名称
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * 合伙人级别名称
     * @param partnerName 合伙人级别名称
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }

    /**
     * 合伙人注册日期
     * @return partnerCreate 合伙人注册日期
     */
    public Date getPartnerCreate() {
        return partnerCreate;
    }

    /**
     * 合伙人注册日期
     * @param partnerCreate 合伙人注册日期
     */
    public void setPartnerCreate(Date partnerCreate) {
        this.partnerCreate = partnerCreate;
    }

    /**
     * 身份证号
     * @return memIDCardNo 身份证号
     */
    public String getMemIDCardNo() {
        return memIDCardNo;
    }

    /**
     * 身份证号
     * @param memIDCardNo 身份证号
     */
    public void setMemIDCardNo(String memIDCardNo) {
        this.memIDCardNo = memIDCardNo == null ? null : memIDCardNo.trim();
    }

    /**
     * 是否有下单 1是 0否
     * @return hasOrder 是否有下单 1是 0否
     */
    public Byte getHasOrder() {
        return hasOrder;
    }

    /**
     * 是否有下单 1是 0否
     * @param hasOrder 是否有下单 1是 0否
     */
    public void setHasOrder(Byte hasOrder) {
        this.hasOrder = hasOrder;
    }

    /**
     * 首次下单时间
     * @return hasOrderDate 首次下单时间
     */
    public Date getHasOrderDate() {
        return hasOrderDate;
    }

    /**
     * 首次下单时间
     * @param hasOrderDate 首次下单时间
     */
    public void setHasOrderDate(Date hasOrderDate) {
        this.hasOrderDate = hasOrderDate;
    }

    /**
     * 人脸识别ID
     * @return certId 人脸识别ID
     */
    public String getCertId() {
        return certId;
    }

    /**
     * 人脸识别ID
     * @param certId 人脸识别ID
     */
    public void setCertId(String certId) {
        this.certId = certId == null ? null : certId.trim();
    }

    /**
     * 自定义字段1
     * @return customFields1 自定义字段1
     */
    public String getCustomFields1() {
        return customFields1;
    }

    /**
     * 自定义字段1
     * @param customFields1 自定义字段1
     */
    public void setCustomFields1(String customFields1) {
        this.customFields1 = customFields1 == null ? null : customFields1.trim();
    }

    /**
     * 自定义字段2
     * @return customFields2 自定义字段2
     */
    public String getCustomFields2() {
        return customFields2;
    }

    /**
     * 自定义字段2
     * @param customFields2 自定义字段2
     */
    public void setCustomFields2(String customFields2) {
        this.customFields2 = customFields2 == null ? null : customFields2.trim();
    }

    /**
     * 自定义字段3
     * @return customFields3 自定义字段3
     */
    public String getCustomFields3() {
        return customFields3;
    }

    /**
     * 自定义字段3
     * @param customFields3 自定义字段3
     */
    public void setCustomFields3(String customFields3) {
        this.customFields3 = customFields3 == null ? null : customFields3.trim();
    }

    /**
     * 自定义字段4
     * @return customFields4 自定义字段4
     */
    public String getCustomFields4() {
        return customFields4;
    }

    /**
     * 自定义字段4
     * @param customFields4 自定义字段4
     */
    public void setCustomFields4(String customFields4) {
        this.customFields4 = customFields4 == null ? null : customFields4.trim();
    }

    /**
     * 自定义字段5
     * @return customFields5 自定义字段5
     */
    public String getCustomFields5() {
        return customFields5;
    }

    /**
     * 自定义字段5
     * @param customFields5 自定义字段5
     */
    public void setCustomFields5(String customFields5) {
        this.customFields5 = customFields5 == null ? null : customFields5.trim();
    }

    /**
     * 打印购物小票：0关闭 1开启
     * @return shoppingTicket 打印购物小票：0关闭 1开启
     */
    public Byte getShoppingTicket() {
        return shoppingTicket;
    }

    /**
     * 打印购物小票：0关闭 1开启
     * @param shoppingTicket 打印购物小票：0关闭 1开启
     */
    public void setShoppingTicket(Byte shoppingTicket) {
        this.shoppingTicket = shoppingTicket;
    }

    /**
     * 打印小票开启时间
     * @return ticketedDate 打印小票开启时间
     */
    public Date getTicketedDate() {
        return ticketedDate;
    }

    /**
     * 打印小票开启时间
     * @param ticketedDate 打印小票开启时间
     */
    public void setTicketedDate(Date ticketedDate) {
        this.ticketedDate = ticketedDate;
    }
}