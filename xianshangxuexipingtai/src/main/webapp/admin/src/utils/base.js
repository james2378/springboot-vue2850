const base = {
    get() {
        return {
            url : "http://localhost:8080/xianshangxuexipingtai/",
            name: "xianshangxuexipingtai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xianshangxuexipingtai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "线上学习平台系统"
        } 
    }
}
export default base
