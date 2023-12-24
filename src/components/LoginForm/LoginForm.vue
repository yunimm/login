<template>
    <ElForm ref="loginRef" :model="form" :rules="loginRules" class="login-form">
        <h1>登入</h1>
        <ElFormItem prop="username">
            <ElInput
                placeholder="請輸入帳號"
                :prefix-icon="User"
                v-model="form.username"
            >
            </ElInput>
        </ElFormItem>
        <ElFormItem prop="password">
            <ElInput
                placeholder="請輸入密碼"
                :prefix-icon="Lock"
                v-model="form.password"
                show-password
            >
            </ElInput>
        </ElFormItem>
        <ElFormItem>
            <ElButton @click="submitForm(loginRef)" type="primary">
                登入</ElButton
            >
        </ElFormItem>
    </ElForm>
</template>

<script setup lang="ts">
import { User, Lock } from '@element-plus/icons-vue';
import type { FormInstance, FormRules } from 'element-plus';
import { reactive, ref } from 'vue';
import { LoginReq } from '@/interface/user';

const form: LoginReq = reactive({
    username: '',
    password: '',
});

const loginRef = ref<FormInstance>();
// FIXME: 補驗證規則
const loginRules = reactive<FormRules<LoginReq>>({
    username: [
        {
            required: true,
            message: '帳號不能為空',
            trigger: 'blur',
        },
    ],
    password: [
        {
            required: true,
            message: '密碼不能為空',
            trigger: 'blur',
        },
    ],
});

const submitForm = async (formEl: FormInstance | undefined) => {
    if (!formEl) return;
    await formEl.validate((valid, fields) => {
        if (valid) {
            console.log('submit!');
        } else {
            console.log('error submit!', fields);
        }
    });
};
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
    z-index: 1;
}
.login-form.sign-up-model {
    opacity: 0;
    transition: 1s ease-in-out;
    transition-delay: 0.3s;
    pointer-events: none;
}
</style>
