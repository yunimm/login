<template>
    <ElForm class="register-form">
        <h1>註冊</h1>
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
            <ElInput
                placeholder="請輸入電子信箱"
                :prefix-icon="Message"
                v-model="form.email"
            >
            </ElInput>
        </ElFormItem>
        <ElFormItem>
            <ElButton type="primary">註冊</ElButton>
        </ElFormItem>
    </ElForm>
</template>

<script setup lang="ts">
import { User, Lock, Message } from '@element-plus/icons-vue';
import { reactive } from 'vue';
import { RegisterReq } from '@/interface/user';

const form: RegisterReq = reactive({
    username: '',
    password: '',
    email: '',
});
</script>

<style lang="scss" scoped>
.register-form {
    grid-column: 1;
    grid-row: 1;
    opacity: 0;
    transition: 1s ease-in-out;
    transition-delay: 0.3s;
    padding: 1% 25%;
    pointer-events: none;
}
.register-form.sign-up-model {
    opacity: 1;
    transition: 1s ease-in-out;
    transition-delay: 0.3s;
    pointer-events: all;
}
</style>
