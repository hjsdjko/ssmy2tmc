const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmy2tmc/",
            name: "ssmy2tmc",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmy2tmc/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "澡堂预订的微信小程序"
        } 
    }
}
export default base
