const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmn2tzw/",
            name: "ssmn2tzw",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmn2tzw/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "班级事务管理系统"
        } 
    }
}
export default base
