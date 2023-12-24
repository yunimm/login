<template>
    <ElForm
        ref="registerRef"
        :model="form"
        :rules="registerRules"
        class="register-form"
    >
        <h1>註冊</h1>
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
        <ElFormItem prop="email">
            <ElInput
                placeholder="請輸入電子信箱"
                :prefix-icon="Message"
                v-model="form.email"
            >
            </ElInput>
        </ElFormItem>
        <ElFormItem>
            <ElButton @click="submitForm(registerRef)" type="primary"
                >註冊</ElButton
            >
        </ElFormItem>
    </ElForm>
</template>

<script setup lang="ts">
import { reactive, ref } from 'vue';
import { User, Lock, Message } from '@element-plus/icons-vue';
import type { FormInstance, FormRules } from 'element-plus';
import { RegisterReq } from '@/interface/user';

const form: RegisterReq = reactive({
    username: '',
    password: '',
    email: '',
});

const registerRef = ref<FormInstance>();
// FIXME: 補驗證規則
const registerRules = reactive<FormRules<RegisterReq>>({
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
    email: [
        {
            required: true,
            message: '信箱不能為空',
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
.register-form {
    grid-column: 1;
    grid-row: 1;
    opacity: 0;
    transition: 1s ease-in-out;
    transition-delay: 0.3s;
    padding: 1% 25%;
    z-index: 0;
}
.register-form.sign-up-model {
    opacity: 1;
    transition: 1s ease-in-out;
    transition-delay: 0.3s;
    pointer-events: all;
    z-index: 1;
}
</style>
