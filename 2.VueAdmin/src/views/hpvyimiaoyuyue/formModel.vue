<template>
	<div>
		<el-dialog v-model="formVisible" :title="formTitle" width="80%" destroy-on-close :fullscreen='false'>
			<el-form class="formModel_form" ref="formRef" :model="form" label-width="$template2.back.add.form.base.labelWidth" :rules="rules">
				<el-row>
					<el-col :span="24">
						<el-form-item label="疫苗编号" prop="yimiaobianhao">
							<el-input class="list_inp" v-model="form.yimiaobianhao" placeholder="疫苗编号"
								 type="text" 								:readonly="!isAdd||disabledForm.yimiaobianhao?true:false" />
						</el-form-item>
					</el-col>

					<el-col :span="24">
						<el-form-item label="疫苗名称" prop="yimiaomingcheng">
							<el-input class="list_inp" v-model="form.yimiaomingcheng" placeholder="疫苗名称"
								 type="text" 								:readonly="!isAdd||disabledForm.yimiaomingcheng?true:false" />
						</el-form-item>
					</el-col>

					<el-col :span="24">
						<el-form-item label="疫苗类型" prop="yimiaoleixing">
							<el-input class="list_inp" v-model="form.yimiaoleixing" placeholder="疫苗类型"
								 type="text" 								:readonly="!isAdd||disabledForm.yimiaoleixing?true:false" />
						</el-form-item>
					</el-col>

					<el-col :span="24">
						<el-form-item label="批次号" prop="picihao">
							<el-input class="list_inp" v-model="form.picihao" placeholder="批次号"
								 type="text" 								:readonly="!isAdd||disabledForm.picihao?true:false" />
						</el-form-item>
					</el-col>

					<el-col :span="24">
						<el-form-item label="生产日期" prop="shengchanriqi">
							<el-input class="list_inp" v-model="form.shengchanriqi" placeholder="生产日期"
								 type="text" 								:readonly="!isAdd||disabledForm.shengchanriqi?true:false" />
						</el-form-item>
					</el-col>

					<el-col :span="24">
						<el-form-item label="保质期" prop="baozhiqi">
							<el-input class="list_inp" v-model="form.baozhiqi" placeholder="保质期"
								 type="text" 								:readonly="!isAdd||disabledForm.baozhiqi?true:false" />
						</el-form-item>
					</el-col>

					<el-col :span="24">
						<el-form-item label="生产厂商" prop="shengchanchangshang">
							<el-input class="list_inp" v-model="form.shengchanchangshang" placeholder="生产厂商"
								 type="text" 								:readonly="!isAdd||disabledForm.shengchanchangshang?true:false" />
						</el-form-item>
					</el-col>

					<el-col :span="24">
						<el-form-item label="预约时间" prop="yuyueshijian">
							<el-date-picker
								class="list_date"
								v-model="form.yuyueshijian"
								format="YYYY-MM-DD HH:mm:ss"
								value-format="YYYY-MM-DD HH:mm:ss"
								type="datetime"
								:readonly="!isAdd||disabledForm.yuyueshijian?true:false"
								placeholder="请选择预约时间" />
						</el-form-item>
					</el-col>
					<el-col :span="24">
						<el-form-item label="用户账号" prop="yonghuzhanghao">
							<el-input class="list_inp" v-model="form.yonghuzhanghao" placeholder="用户账号"
								 type="text" 								:readonly="!isAdd||disabledForm.yonghuzhanghao?true:false" />
						</el-form-item>
					</el-col>

					<el-col :span="24">
						<el-form-item label="用户姓名" prop="yonghuxingming">
							<el-input class="list_inp" v-model="form.yonghuxingming" placeholder="用户姓名"
								 type="text" 								:readonly="!isAdd||disabledForm.yonghuxingming?true:false" />
						</el-form-item>
					</el-col>

					<el-col :span="24">
						<el-form-item label="性别" prop="xingbie">
							<el-input class="list_inp" v-model="form.xingbie" placeholder="性别"
								 type="text" 								:readonly="!isAdd||disabledForm.xingbie?true:false" />
						</el-form-item>
					</el-col>

				</el-row>
			</el-form>
			<template #footer v-if="isAdd||type=='logistics'||type=='reply'">
				<span class="formModel_btn_box">
					<el-button class="formModel_cancel" @click="closeClick">取消</el-button>
					<el-button class="formModel_confirm" type="primary" @click="save"
						>
						提交
					</el-button>
				</span>
			</template>
		</el-dialog>
	</div>
</template>
<script setup>
	import {
		reactive,
		ref,
		getCurrentInstance,
		nextTick,
		computed,
		defineEmits
	} from 'vue'
	const context = getCurrentInstance()?.appContext.config.globalProperties;	
	const emit = defineEmits(['formModelChange'])
	//基础信息
	const tableName = 'hpvyimiaoyuyue'
	const formName = 'hpv疫苗预约'
	//基础信息
	//form表单
	const form = ref({})
	const disabledForm = ref({
		yimiaobianhao : false,
		yimiaomingcheng : false,
		yimiaoleixing : false,
		picihao : false,
		shengchanriqi : false,
		baozhiqi : false,
		shengchanchangshang : false,
		yuyueshijian : false,
		yonghuzhanghao : false,
		yonghuxingming : false,
		xingbie : false,
	})
	const formVisible = ref(false)
	const isAdd = ref(false)
	const formTitle = ref('')
	//表单验证
	//匹配整数
	const validateIntNumber = (rule, value, callback) => {
		if (!value) {
			callback();
		} else if (!context?.$toolUtil.isIntNumer(value)) {
			callback(new Error("请输入整数"));
		} else {
			callback();
		}
	}
	//匹配数字
	const validateNumber = (rule, value, callback) => {
		if(!value){
			callback();
		} else if (!context?.$toolUtil.isNumber(value)) {
			callback(new Error("请输入数字"));
		} else {
			callback();
		}
	}
	//匹配手机号码
	const validateMobile = (rule, value, callback) => {
		if(!value){
			callback();
		} else if (!context?.$toolUtil.isMobile(value)) {
			callback(new Error("请输入正确的手机号码"));
		} else {
			callback();
		}
	}
	//匹配电话号码
	const validatePhone = (rule, value, callback) => {
		if(!value){
			callback();
		} else if (!context?.$toolUtil.isPhone(value)) {
			callback(new Error("请输入正确的电话号码"));
		} else {
			callback();
		}
	}
	//匹配邮箱
	const validateEmail = (rule, value, callback) => {
		if(!value){
			callback();
		} else if (!context?.$toolUtil.isEmail(value)) {
			callback(new Error("请输入正确的邮箱地址"));
		} else {
			callback();
		}
	}
	//匹配身份证
	const validateIdCard = (rule, value, callback) => {
		if(!value){
			callback();
		} else if (!context?.$toolUtil.checkIdCard(value)) {
			callback(new Error("请输入正确的身份证号码"));
		} else {
			callback();
		}
	}
	//匹配网站地址
	const validateUrl = (rule, value, callback) => {
		if(!value){
			callback();
		} else if (!context?.$toolUtil.isURL(value)) {
			callback(new Error("请输入正确的URL地址"));
		} else {
			callback();
		}
	}
	const rules = ref({
		yimiaobianhao: [
		],
		yimiaomingcheng: [
		],
		yimiaoleixing: [
		],
		picihao: [
		],
		shengchanriqi: [
		],
		baozhiqi: [
		],
		shengchanchangshang: [
		],
		yuyueshijian: [
		],
		yonghuzhanghao: [
		],
		yonghuxingming: [
		],
		xingbie: [
		],
	})
	//表单验证
	
	const formRef = ref(null)
	const id = ref(0)
	const type = ref('')
	//methods

	//获取唯一标识
	const getUUID =()=> {
      return new Date().getTime();
    }
	//重置
	const resetForm = () => {
		form.value = {
			yimiaobianhao: '',
			yimiaomingcheng: '',
			yimiaoleixing: '',
			picihao: '',
			shengchanriqi: '',
			baozhiqi: '',
			shengchanchangshang: '',
			yuyueshijian: '',
			yonghuzhanghao: '',
			yonghuxingming: '',
			xingbie: '',
		}
	}
	//获取info
	const getInfo = ()=>{
		context?.$http({
			url: `${tableName}/info/${id.value}`,
			method: 'get'
		}).then(res => {
			let reg=new RegExp('../../../file','g')
			form.value = res.data.data
			formVisible.value = true
		})
	}
	const crossRow = ref('')
	const crossTable = ref('')
	const crossTips = ref('')
	const crossColumnName = ref('')
	const crossColumnValue = ref('')
	//初始化
	const init=(formId=null,formType='add',formNames='',row=null,table=null,statusColumnName=null,tips=null,statusColumnValue=null)=>{
		resetForm()
			form.value.yuyueshijian = context?.$toolUtil.getCurDateTime()
		if(formId){
			id.value = formId
			type.value = formType
		}
		if(formType == 'add'){
			isAdd.value = true
			formTitle.value = '新增' + formName
			formVisible.value = true
		}else if(formType == 'info'){
			isAdd.value = false
			formTitle.value = '查看' + formName
			getInfo()
		}else if(formType == 'edit'){
			isAdd.value = true
			formTitle.value = '修改' + formName
			getInfo()
		}
		else if(formType == 'cross'){
			isAdd.value = true
			formTitle.value = formNames
			// getInfo()
			for(let x in row){
				if(x=='yimiaobianhao'){
					form.value.yimiaobianhao = row[x];
					disabledForm.value.yimiaobianhao = true;
					continue;
				}
				if(x=='yimiaomingcheng'){
					form.value.yimiaomingcheng = row[x];
					disabledForm.value.yimiaomingcheng = true;
					continue;
				}
				if(x=='yimiaoleixing'){
					form.value.yimiaoleixing = row[x];
					disabledForm.value.yimiaoleixing = true;
					continue;
				}
				if(x=='picihao'){
					form.value.picihao = row[x];
					disabledForm.value.picihao = true;
					continue;
				}
				if(x=='shengchanriqi'){
					form.value.shengchanriqi = row[x];
					disabledForm.value.shengchanriqi = true;
					continue;
				}
				if(x=='baozhiqi'){
					form.value.baozhiqi = row[x];
					disabledForm.value.baozhiqi = true;
					continue;
				}
				if(x=='shengchanchangshang'){
					form.value.shengchanchangshang = row[x];
					disabledForm.value.shengchanchangshang = true;
					continue;
				}
				if(x=='yuyueshijian'){
					form.value.yuyueshijian = row[x];
					disabledForm.value.yuyueshijian = true;
					continue;
				}
				if(x=='yonghuzhanghao'){
					form.value.yonghuzhanghao = row[x];
					disabledForm.value.yonghuzhanghao = true;
					continue;
				}
				if(x=='yonghuxingming'){
					form.value.yonghuxingming = row[x];
					disabledForm.value.yonghuxingming = true;
					continue;
				}
				if(x=='xingbie'){
					form.value.xingbie = row[x];
					disabledForm.value.xingbie = true;
					continue;
				}
			}
			if(row){
				crossRow.value = row
			}
			if(table){
				crossTable.value = table
			}
			if(tips){
				crossTips.value = tips
			}
			if(statusColumnName){
				crossColumnName.value = statusColumnName
			}
			if(statusColumnValue){
				crossColumnValue.value = statusColumnValue
			}
			formVisible.value = true
		}

		context?.$http({
			url: `${context?.$toolUtil.storageGet('sessionTable')}/session`,
			method: 'get'
		}).then(res => {
			var json = res.data.data
			if(json.hasOwnProperty('yonghuzhanghao')&& context?.$toolUtil.storageGet("role")!="管理员"){
				form.value.yonghuzhanghao = json.yonghuzhanghao
				disabledForm.value.yonghuzhanghao = true;
			}
			if(json.hasOwnProperty('yonghuxingming')&& context?.$toolUtil.storageGet("role")!="管理员"){
				form.value.yonghuxingming = json.yonghuxingming
				disabledForm.value.yonghuxingming = true;
			}
			if(json.hasOwnProperty('xingbie')&& context?.$toolUtil.storageGet("role")!="管理员"){
				form.value.xingbie = json.xingbie
				disabledForm.value.xingbie = true;
			}
		})
	}
	//初始化
	//声明父级调用
	defineExpose({
		init
	})
	//关闭
	const closeClick = () => {
		formVisible.value = false
	}
	//富文本
	const editorChange = (e,name) =>{
		form.value[name] = e
	}
	//提交
	const save=()=>{
		var table = crossTable.value
		var objcross = JSON.parse(JSON.stringify(crossRow.value))
		let crossUserId = ''
		let crossRefId = ''
		let crossOptNum = ''
		if(type.value == 'cross'){
			if(crossColumnName.value!=''){
				if(!crossColumnName.value.startsWith('[')){
					for(let o in objcross){
						if(o == crossColumnName.value){
							objcross[o] = crossColumnValue.value
						}
					}
					//修改跨表数据
					changeCrossData(objcross)
				}else{
					crossUserId = context?.$toolUtil.storageGet('userid')
					crossRefId = objcross['id']
					crossOptNum = crossColumnName.value.replace(/\[/,"").replace(/\]/,"")
				}
			}
		}
		formRef.value.validate((valid)=>{
			if(valid){
				if(crossUserId&&crossRefId){
					form.value.crossuserid = crossUserId
					form.value.crossrefid = crossRefId
					let params = {
						page: 1,
						limit: 1000, 
						crossuserid:form.value.crossuserid,
						crossrefid:form.value.crossrefid,
					}
					context?.$http({
						url: `${tableName}/page`,
						method: 'get', 
						params: params 
					}).then(res=>{
						if(res.data.data.total>=crossOptNum){
							context?.$toolUtil.message(`${crossTips.value}`,'error')
							return false
						}else{
							context?.$http({
								url: `${tableName}/${!form.value.id ? "save" : "update"}`,
								method: 'post', 
								data: form.value 
							}).then(res=>{
								context?.$toolUtil.message(`操作成功`,'success',()=>{
									formVisible.value = false
									emit('formModelChange')
								})
							})
						}
					})
				}else{
					context?.$http({
						url: `${tableName}/${!form.value.id ? "save" : "update"}`,
						method: 'post', 
						data: form.value 
					}).then(res=>{
						context?.$toolUtil.message(`操作成功`,'success',()=>{
							formVisible.value = false
							emit('formModelChange')
						})
					})
				}
			}
		})
	}
	//修改跨表数据
	const changeCrossData=(row)=>{
		context?.$http({
			url: `${crossTable.value}/update`,
			method: 'post',
			data: row
		}).then(res=>{})
	}
</script>
<style lang="scss" scoped>
	// 表单
	.formModel_form{
		border-radius: 6px;
		padding: 30px;
		// form item
		:deep(.el-form-item) {
			margin: 0 0 20px 0;
			display: flex;
			//label
			.el-form-item__label {
			 color: #9E9E9E;
			 display: block;
			 width: 90px;
			 text-align: center;
			}
			// 内容盒子
			.el-form-item__content {
				display: flex;
				width: calc(100% - 90px);
				justify-content: flex-start;
				align-items: center;
				flex-wrap: wrap;
				// 输入框
				.list_inp {
					border: 2px solid #5FB7FF;
					border-radius: 20px;
					padding: 0 10px;
					background: #fff;
					width: 100%;
					line-height: 36px;
					box-sizing: border-box;
					height: 36px;
					//去掉默认样式
					.el-input__wrapper{
						border: none;
						box-shadow: none;
						background: none;
						border-radius: 0;
						height: 100%;
						padding: 0;
					}
					.is-focus {
						box-shadow: none !important;
					}
				}
				//日期选择器
				.list_date {
					border: 2px solid #5FB7FF;
					border-radius: 20px;
					background: #fff;
					width: 100%;
					line-height: 36px;
					box-sizing: border-box;
					//去掉默认样式
					.el-input__wrapper{
						border: none;
						box-shadow: none;
						background: none;
						border-radius: 0;
						height: 100%;
					}
				}
			}
		}
	}
	// 按钮盒子
	.formModel_btn_box {
		display: flex;
		width: 100%;
		justify-content: center;
		align-items: center;
		.formModel_cancel {
			border: 0;
			cursor: pointer;
			border-radius: 4px;
			padding: 0 24px;
			margin: 0 10px 0 0;
			outline: none;
			color: #B8B8B8;
			background: #CDE9FF;
			width: auto;
			font-size: 14px;
			height: 40px;
		}
		.formModel_cancel:hover {
			color: #333;
			background: rgba(205, 233, 255, 0.5);
			font-size: 16px;
		}
		
		.formModel_confirm {
			border: 0;
			cursor: pointer;
			border-radius: 4px;
			padding: 0 24px;
			box-shadow: inset 0px 4px 10px 0px rgba(147,147,147,0.302);
			outline: 4px solid #EAF5FF;
			margin: 0 20px;
			color: #2C2C2C;
			background: #96C6EE;
			width: auto;
			font-size: 14px;
			height: 40px;
		}
		.formModel_confirm:hover {
			background: rgba(150, 198, 238, 0.5);
			font-size: 16px;
		}
	}
</style>