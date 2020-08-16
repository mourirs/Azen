const userformlogin = {
    template: "#userformlogin",
    data() {
        return {
            userNameEmail: "",
            userPassword: "",
            retNameEmail: "",
            retPassword: "",
            dialogFormVisible: false,
            reEmail: "",
            rePassword: "",
            arePassword: "",
            innerVisible: false
        }
    },
    methods: {
        userLogin() {
            axios({
                method: "post",
                url: "/userLogin",
                transformRequest: [
                    function (data) {
                        return parseParams(data);
                    }
                ],
                data: {
                    uName: this.userNameTest(this.userNameEmail),
                    uPwd: this.userPassword,
                    uEmail: this.userEmailTest(this.userNameEmail),
                }
            }).then((response) => {
                if (response.data) {
                    window.location.replace("http://localhost/index");
                } else {
                    this.$notify.error({
                        title: '登录失败',
                        message: '请检查账号名、邮箱、密码是否正确',
                        position: 'bottom-right'
                    });
                }
            })
        },
        userRetrieve() {
            axios({
                method: "post",
                url: "/userRetrieve",
                transformRequest: [
                    function (data) {
                        return parseParams(data);
                    }
                ],
                data: {
                    uName: this.userNameTest(this.retNameEmail),
                    uPwd: this.retPassword,
                    uEmail: this.userEmailTest(this.retNameEmail),
                }
            }).then((response) => {
                if (response.data) {
                    this.dialogFormVisible = true;
                } else {
                    this.$notify.error({
                        title: '找回失败',
                        message: '请检查账号名、邮箱、密码是否正确',
                        position: 'bottom-right'
                    });
                }
            })
        },
        resetPassword() {
            let regEmail = /^[A-Za-z0-9]+([_\.][A-Za-z0-9]+)*@([A-Za-z0-9\-]+\.)+[A-Za-z]{2,6}$/;
            if (this.rePassword === this.arePassword && regEmail.test(this.reEmail)) {
                axios({
                    method: "post",
                    url: "/userResetPwd",
                    transformRequest: [
                        function (data) {
                            return parseParams(data);
                        }
                    ],
                    data: {
                        uPwd: this.rePassword,
                        uEmail: this.reEmail
                    }
                }).then((response) => {
                    if (response.data) {
                        this.dialogFormVisible = false;
                        this.$notify({
                            title: '重置密码成功',
                            message: '密码重置成功！',
                            position: 'bottom-right'
                        });
                    } else {
                        this.innerVisible = true;
                    }
                })
            } else {
                this.innerVisible = true;
            }
        },
        userNameTest(data) {
            if (data.indexOf("@") === -1) {
                return data;
            } else {
                return "";
            }
        },
        userEmailTest(data) {
            if (data.indexOf("@") === -1) {
                return "";
            } else {
                return data;
            }
        }
    }
};
const userformregister = {
    template: "#userformregister",
    data() {
        return {
            regEmail: "",
            regName: "",
            regPassword: ""
        };
    },
    methods: {
        userRegister() {
            axios({
                method: "post",
                url: "/userRegister",
                transformRequest: [
                    function (data) {
                        return parseParams(data);
                    }
                ],
                data: {
                    uName: this.regName,
                    uPwd: this.regPassword,
                    uEmail: this.regEmail,
                }
            }).then((response) => {
                if (response.data) {
                    this.$notify({
                        title: '注册成功',
                        message: '感谢您的注册！',
                        position: 'bottom-right'
                    });
                } else {
                    this.$notify.error({
                        title: '注册失败',
                        message: '请检查账号名、邮箱、密码是否正确',
                        position: 'bottom-right'
                    });
                }
            })
        }
    }
};
const app = new Vue({
    el: "#app",
    components: {
        userformlogin, userformregister
    }
});