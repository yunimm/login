<template>
    <div :class="{ container: true, 'sign-up-model': isToggle }">
        <div class="inner-left-container">
            <div class="login-content">
                <h1>阿貓數學</h1>
                <ElButton type="primary" @click="handleToggle">去註冊</ElButton>
            </div>
        </div>
        <div class="inner-right-container">
            <h1>阿貓數學</h1>
            <ElButton type="primary" @click="handleToggle">去登入</ElButton>
        </div>
    </div>
</template>

<script setup lang="ts">
import { ref } from 'vue';
let isToggle = ref<boolean>(false);

const handleToggle = () => {
    console.log('213');
    isToggle.value = !isToggle.value;
};
</script>

<style lang="scss" scoped>
.container {
    width: 100vw;
    height: 100vh;
    background-color: white;
    overflow: hidden;
    position: relative;
    display: flex;
    flex-direction: row;
}

.container::before {
    content: '';
    width: 2000px;
    height: 2000px;
    background-color: #a5dee4;
    position: absolute;
    border-radius: 50%;
    transform: translateY(-50%);
    right: 48%;
    top: -10%;
    transition: 1.8s ease-in-out;
}

.inner-left-container {
    width: 0;
    flex: 1;
    z-index: 1;
}

.inner-right-container {
    width: 0;
    flex: 1;
}

/* 動畫樣式 */
.container.sign-up-model::before {
    transform: translate(100%, -50%);
    transition: 1.8s ease-in-out;
}
</style>
