<template>
    <ElForm class="login-form">
        <h1>登入</h1>
        <ElFormItem>
            <ElInput
                placeholder="請輸入帳號"
                :prefix-icon="User"
                v-model="form.username"
            >
            </ElInput>
        </ElFormItem>
        <ElFormItem>
            <ElInput
                placeholder="請輸入密碼"
                :prefix-icon="Lock"
                v-model="form.password"
            >
            </ElInput>
        </ElFormItem>
        <ElFormItem>
            <ElButton type="primary"> 登入</ElButton>
        </ElFormItem>
    </ElForm>
</template>

<script setup lang="ts">
import { User, Lock } from '@element-plus/icons-vue';
import { reactive } from 'vue';
import { LoginReq } from '@/interface/user';

const form: LoginReq = reactive({
    username: '',
    password: '',
});
</script>

<style lang="scss" scoped>
.login-form {
    grid-column: 1;
    grid-row: 1;
    opacity: 1;
    transition: 1s ease-in-out;
    transition-delay: 0.3s;
    padding: 1% 25%;
    pointer-events: all;
}
.login-form.sign-up-model {
    opacity: 0;
    transition: 1s ease-in-out;
    transition-delay: 0.3s;
    pointer-events: none;
}
</style>
