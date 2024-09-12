package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 广告签署
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 20:23:17
 */
@TableName("guanggaoqianshu")
public class GuanggaoqianshuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuanggaoqianshuEntity() {
		
	}
	
	public GuanggaoqianshuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 广告名称
	 */
					
	private String guanggaomingcheng;
	
	/**
	 * 广告封面
	 */
					
	private String guanggaofengmian;
	
	/**
	 * 投放渠道
	 */
					
	private String toufangqudao;
	
	/**
	 * 广告要求
	 */
					
	private String guanggaoyaoqiu;
	
	/**
	 * 广告商名称
	 */
					
	private String guanggaoshangmingcheng;
	
	/**
	 * 广告总费用
	 */
					
	private Integer guanggaozongfeiyong;
	
	/**
	 * 签署时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date qianshushijian;
	
	/**
	 * 协议内容
	 */
					
	private String xieyineirong;
	
	/**
	 * 客户账号
	 */
					
	private String kehuzhanghao;
	
	/**
	 * 客户姓名
	 */
					
	private String kehuxingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：广告名称
	 */
	public void setGuanggaomingcheng(String guanggaomingcheng) {
		this.guanggaomingcheng = guanggaomingcheng;
	}
	/**
	 * 获取：广告名称
	 */
	public String getGuanggaomingcheng() {
		return guanggaomingcheng;
	}
	/**
	 * 设置：广告封面
	 */
	public void setGuanggaofengmian(String guanggaofengmian) {
		this.guanggaofengmian = guanggaofengmian;
	}
	/**
	 * 获取：广告封面
	 */
	public String getGuanggaofengmian() {
		return guanggaofengmian;
	}
	/**
	 * 设置：投放渠道
	 */
	public void setToufangqudao(String toufangqudao) {
		this.toufangqudao = toufangqudao;
	}
	/**
	 * 获取：投放渠道
	 */
	public String getToufangqudao() {
		return toufangqudao;
	}
	/**
	 * 设置：广告要求
	 */
	public void setGuanggaoyaoqiu(String guanggaoyaoqiu) {
		this.guanggaoyaoqiu = guanggaoyaoqiu;
	}
	/**
	 * 获取：广告要求
	 */
	public String getGuanggaoyaoqiu() {
		return guanggaoyaoqiu;
	}
	/**
	 * 设置：广告商名称
	 */
	public void setGuanggaoshangmingcheng(String guanggaoshangmingcheng) {
		this.guanggaoshangmingcheng = guanggaoshangmingcheng;
	}
	/**
	 * 获取：广告商名称
	 */
	public String getGuanggaoshangmingcheng() {
		return guanggaoshangmingcheng;
	}
	/**
	 * 设置：广告总费用
	 */
	public void setGuanggaozongfeiyong(Integer guanggaozongfeiyong) {
		this.guanggaozongfeiyong = guanggaozongfeiyong;
	}
	/**
	 * 获取：广告总费用
	 */
	public Integer getGuanggaozongfeiyong() {
		return guanggaozongfeiyong;
	}
	/**
	 * 设置：签署时间
	 */
	public void setQianshushijian(Date qianshushijian) {
		this.qianshushijian = qianshushijian;
	}
	/**
	 * 获取：签署时间
	 */
	public Date getQianshushijian() {
		return qianshushijian;
	}
	/**
	 * 设置：协议内容
	 */
	public void setXieyineirong(String xieyineirong) {
		this.xieyineirong = xieyineirong;
	}
	/**
	 * 获取：协议内容
	 */
	public String getXieyineirong() {
		return xieyineirong;
	}
	/**
	 * 设置：客户账号
	 */
	public void setKehuzhanghao(String kehuzhanghao) {
		this.kehuzhanghao = kehuzhanghao;
	}
	/**
	 * 获取：客户账号
	 */
	public String getKehuzhanghao() {
		return kehuzhanghao;
	}
	/**
	 * 设置：客户姓名
	 */
	public void setKehuxingming(String kehuxingming) {
		this.kehuxingming = kehuxingming;
	}
	/**
	 * 获取：客户姓名
	 */
	public String getKehuxingming() {
		return kehuxingming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
