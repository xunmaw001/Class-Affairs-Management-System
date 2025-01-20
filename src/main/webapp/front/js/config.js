
var projectName = '班级事务管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '班会组织',
	url: './pages/banhuizuzhi/list.html'
}, 
{
	name: '党员发展',
	url: './pages/dangyuanfazhan/list.html'
}, 
{
	name: '党员培训',
	url: './pages/dangyuanpeixun/list.html'
}, 
{
	name: '活动信息',
	url: './pages/huodongxinxi/list.html'
}, 
{
	name: '文化学习',
	url: './pages/wenhuaxuexi/list.html'
}, 

{
	name: '通知公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmn2tzw/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除"],"menu":"班委","menuJump":"列表","tableName":"banwei"}],"menu":"班委管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除","查看评论"],"menu":"班会组织","menuJump":"列表","tableName":"banhuizuzhi"}],"menu":"班会组织管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改","删除"],"menu":"健康档案","menuJump":"列表","tableName":"jiankangdangan"}],"menu":"健康档案管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"党员发展","menuJump":"列表","tableName":"dangyuanfazhan"}],"menu":"党员发展管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"党员培训","menuJump":"列表","tableName":"dangyuanpeixun"}],"menu":"党员培训管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","删除","修改"],"menu":"学生成绩","menuJump":"列表","tableName":"xueshengchengji"}],"menu":"学生成绩管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除","查看评论"],"menu":"活动信息","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","删除"],"menu":"班费通知","menuJump":"列表","tableName":"banfeitongzhi"}],"menu":"班费通知管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除","查看评论"],"menu":"文化学习","menuJump":"列表","tableName":"wenhuaxuexi"}],"menu":"文化学习管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"通知公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"班会组织列表","menuJump":"列表","tableName":"banhuizuzhi"}],"menu":"班会组织模块"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"党员发展列表","menuJump":"列表","tableName":"dangyuanfazhan"}],"menu":"党员发展模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"党员培训列表","menuJump":"列表","tableName":"dangyuanpeixun"}],"menu":"党员培训模块"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"活动信息列表","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息模块"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看"],"menu":"文化学习列表","menuJump":"列表","tableName":"wenhuaxuexi"}],"menu":"文化学习模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["新增","查看","修改","删除"],"menu":"健康档案","menuJump":"列表","tableName":"jiankangdangan"}],"menu":"健康档案管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"学生成绩","menuJump":"列表","tableName":"xueshengchengji"}],"menu":"学生成绩管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","支付"],"menu":"班费通知","menuJump":"列表","tableName":"banfeitongzhi"}],"menu":"班费通知管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"班会组织列表","menuJump":"列表","tableName":"banhuizuzhi"}],"menu":"班会组织模块"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"党员发展列表","menuJump":"列表","tableName":"dangyuanfazhan"}],"menu":"党员发展模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"党员培训列表","menuJump":"列表","tableName":"dangyuanpeixun"}],"menu":"党员培训模块"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"活动信息列表","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息模块"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看"],"menu":"文化学习列表","menuJump":"列表","tableName":"wenhuaxuexi"}],"menu":"文化学习模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除"],"menu":"学生成绩","menuJump":"列表","tableName":"xueshengchengji"}],"menu":"学生成绩管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","删除"],"menu":"活动信息","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"班费通知","menuJump":"列表","tableName":"banfeitongzhi"}],"menu":"班费通知管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"班会组织列表","menuJump":"列表","tableName":"banhuizuzhi"}],"menu":"班会组织模块"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"党员发展列表","menuJump":"列表","tableName":"dangyuanfazhan"}],"menu":"党员发展模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看"],"menu":"党员培训列表","menuJump":"列表","tableName":"dangyuanpeixun"}],"menu":"党员培训模块"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"活动信息列表","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息模块"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看"],"menu":"文化学习列表","menuJump":"列表","tableName":"wenhuaxuexi"}],"menu":"文化学习模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"班委","tableName":"banwei"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
