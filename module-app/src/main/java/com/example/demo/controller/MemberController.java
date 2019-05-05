package com.example.demo.controller;

import com.example.demo.entity.MemberInfo;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 描述：${DESCRITION}
 * 创建人：liuyong@dianxiaohuo.net
 * 创建时间： 2019-02-27:14:49
 */
@Api(description = "会员管理",value = "会员管理")
@RestController
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/list")
    @ApiOperation(value = "列表查询",notes = "列表查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "vendorId",value = "商户号",required = true,dataType = "Long",paramType = "query"),
            @ApiImplicitParam(name = "storeCode",value = "门店号",required = true,dataType = "String",paramType = "query")
    })
    public List<MemberInfo> list(Long vendorId,String storeCode){
        return new ArrayList<>();
    }


    @PostMapping("/post/postUser")
    @ApiOperation(value = "创建会员",notes = "创建会员")
    @ApiImplicitParam(name = "memberinfo",value = "会员实体",required = true,dataType = "MemberInfo")
    public String postUser(@RequestBody MemberInfo memberInfo){
        return "success";
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "查询会员",notes = "根据url的id来查询会员详细信息")
    @ApiImplicitParam(name = "id",value = "会员ID",required = true,dataType = "Long")
    public MemberInfo getMember(@PathVariable Long id){
        return new MemberInfo();
    }


    @PutMapping("/put/{id}")
    @ApiOperation(value = "修改会员",notes = "根据url的id来指定更新对象,并根据传过来的memberinfo信息来更新会员")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "会员ID",required = true,dataType = "Long"),
            @ApiImplicitParam(name = "memberInfo",value = "会员实体",required = true,dataType = "MemberInfo")
    })
    public String putMember(@PathVariable Long id,@RequestBody MemberInfo memberInfo){
        return "success";
    }


    @DeleteMapping("/del/{id}")
    @ApiOperation(value = "删除会员",notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id",value = "会员ID",required = true,dataType = "Long")
    public String delMember(@PathVariable Long id){
        return "Success";
    }
}
