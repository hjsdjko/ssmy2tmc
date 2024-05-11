<template>
	<view class="content">
		<form class="app-update-pv">
			 
			<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(130, 163, 157, 1)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">预约编号</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.yuyuebianhao" v-model="ruleForm.yuyuebianhao" placeholder="预约编号"></input>
			</view>
			<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(130, 163, 157, 1)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">编号</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.bianhao" v-model="ruleForm.bianhao" placeholder="编号"></input>
			</view>
			<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(130, 163, 157, 1)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">费用</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.feiyong" v-model="ruleForm.feiyong" placeholder="费用"></input>
			</view>
			<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(130, 163, 157, 1)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">澡堂分类</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.zaotangfenlei" v-model="ruleForm.zaotangfenlei" placeholder="澡堂分类"></input>
			</view>
			<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(130, 163, 157, 1)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">用户账号</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.yonghuzhanghao" v-model="ruleForm.yonghuzhanghao" placeholder="用户账号"></input>
			</view>
			<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(130, 163, 157, 1)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">用户姓名</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.yonghuxingming" v-model="ruleForm.yonghuxingming" placeholder="用户姓名"></input>
			</view>
			<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(130, 163, 157, 1)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">联系电话</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.lianxidianhua" v-model="ruleForm.lianxidianhua" placeholder="联系电话"></input>
			</view>
			<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(130, 163, 157, 1)","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">取消时间</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.quxiaoshijian" placeholder="取消时间" @tap="toggleTab('quxiaoshijian')"></input>
			</view>
			
			<!-- 否 -->
 

			<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">取消原因</view>
				<textarea :style='{"padding":"20rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"16rpx","color":"rgba(161, 161, 161, 1)","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.quxiaoyuanyin" placeholder="取消原因"></textarea>
			</view>
			
			
			<view class="btn">
				<button :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","margin":"0","backgroundColor":"rgba(130, 163, 157, 1)","borderColor":"rgba(130, 163, 157, 1)","borderRadius":"80rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="quxiaoshijianConfirm" ref="quxiaoshijian" themeColor="#333333"></w-picker>
			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				yuyuebianhao: '',
				bianhao: '',
				feiyong: '',
				zaotangfenlei: '',
				yonghuzhanghao: '',
				yonghuxingming: '',
				lianxidianhua: '',
				quxiaoshijian: '',
				quxiaoyuanyin: '',
				crossuserid: '',
				crossrefid: '',
				sfsh: '',
				shhf: '',
				userid: '',
				},
				// 登陆用户信息
				user: {},
                                ro:{
                                   yuyuebianhao : false,
                                   bianhao : false,
                                   feiyong : false,
                                   zaotangfenlei : false,
                                   yonghuzhanghao : false,
                                   yonghuxingming : false,
                                   lianxidianhua : false,
                                   quxiaoshijian : false,
                                   quxiaoyuanyin : false,
                                   crossuserid : false,
                                   crossrefid : false,
                                   sfsh : false,
                                   shhf : false,
                                   userid : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		},
		async onLoad(options) {
        		this.ruleForm.quxiaoshijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.yonghuzhanghao = this.user.yonghuzhanghao
			this.ro.yonghuzhanghao = true;
			this.ruleForm.yonghuxingming = this.user.yonghuxingming
			this.ro.yonghuxingming = true;
			this.ruleForm.lianxidianhua = this.user.lianxidianhua
			this.ro.lianxidianhua = true;



			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`quxiaoyuyue`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='yuyuebianhao'){
					this.ruleForm.yuyuebianhao = obj[o];
					this.ro.yuyuebianhao = true;
					continue;
					}
					if(o=='bianhao'){
					this.ruleForm.bianhao = obj[o];
					this.ro.bianhao = true;
					continue;
					}
					if(o=='feiyong'){
					this.ruleForm.feiyong = obj[o];
					this.ro.feiyong = true;
					continue;
					}
					if(o=='zaotangfenlei'){
					this.ruleForm.zaotangfenlei = obj[o];
					this.ro.zaotangfenlei = true;
					continue;
					}
					if(o=='yonghuzhanghao'){
					this.ruleForm.yonghuzhanghao = obj[o];
					this.ro.yonghuzhanghao = true;
					continue;
					}
					if(o=='yonghuxingming'){
					this.ruleForm.yonghuxingming = obj[o];
					this.ro.yonghuxingming = true;
					continue;
					}
					if(o=='lianxidianhua'){
					this.ruleForm.lianxidianhua = obj[o];
					this.ro.lianxidianhua = true;
					continue;
					}
					if(o=='quxiaoshijian'){
					this.ruleForm.quxiaoshijian = obj[o];
					this.ro.quxiaoshijian = true;
					continue;
					}
					if(o=='quxiaoyuanyin'){
					this.ruleForm.quxiaoyuanyin = obj[o];
					this.ro.quxiaoyuanyin = true;
					continue;
					}
					if(o=='crossuserid'){
					this.ruleForm.crossuserid = obj[o];
					this.ro.crossuserid = true;
					continue;
					}
					if(o=='crossrefid'){
					this.ruleForm.crossrefid = obj[o];
					this.ro.crossrefid = true;
					continue;
					}
					if(o=='userid'){
					this.ruleForm.userid = obj[o];
					this.ro.userid = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数


			// 日长控件选择日期时间
			quxiaoshijianConfirm(val) {
				console.log(val)
				this.ruleForm.quxiaoshijian = val.result;
				this.$forceUpdate();
			},



			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {




























//跨表计算判断
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
						var obj = uni.getStorageSync('crossObj');
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`quxiaoyuyue`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`quxiaoyuyue`, this.ruleForm);
						}else{
							await this.$api.add(`quxiaoyuyue`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`quxiaoyuyue`, this.ruleForm);
					}else{
						await this.$api.add(`quxiaoyuyue`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-image: url(http://codegen.caihongy.cn/20220210/87bd12d356ac4a8e90125da208a7597e.png);
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 80rpx;
	}
	
	.select .uni-input {
		line-height: 80rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>
