<template>
    <div :class="{ container: true, 'sign-up-model': isToggle }">
        <div class="inner-left-container">
            <div class="login-content">
                <h1>阿貓數學</h1>
                <ElButton type="primary" @click="handleToggle">去註冊</ElButton>
            </div>
            <img src="@/assets/home01.png" class="image" />
        </div>
        <div class="inner-right-container">
            <div class="register-content">
                <h1>阿貓數學</h1>
                <ElButton type="primary" @click="handleToggle">去登入</ElButton>
            </div>
            <img src="@/assets/home02.png" class="image" />
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
    background-color: #fad689;
    position: absolute;
    border-radius: 50%;
    transform: translateY(-50%);
    right: 48%;
    top: -10%;
    transition: 1s ease-in-out;
}

.inner-left-container {
    width: 0;
    flex: 1;
    z-index: 1;
    align-items: center;
    display: flex;
    justify-content: space-around;
    flex-direction: column;
    padding: 3rem 10% 2rem 10%;
}

.inner-right-container {
    width: 0;
    flex: 1;
    align-items: center;
    display: flex;
    justify-content: space-around;
    flex-direction: column;
    padding: 3rem 10% 2rem 10%;
}
.container .inner-right-container .register-content,
.container .inner-right-container .image {
    transform: translateX(1000px);
    transition: 1s ease-in-out;
    transition-delay: 0.2s;
}

/* 動畫樣式 */
.container.sign-up-model::before {
    transform: translate(100%, -50%);
    transition: 1s ease-in-out;
    right: 52%;
}
.container .inner-left-container .login-content,
.container .inner-left-container .image {
    transition: 1s ease-in-out;
    transition-delay: 0.2s;
}

.image {
    width: 500px;
    z-index: 2;
}

.container.sign-up-model .inner-right-container .register-content,
.container.sign-up-model .inner-right-container .image {
    transform: translateX(0);
    transition: 1s ease-in-out;
    transition-delay: 0.2s;
}

.container.sign-up-model .inner-left-container .login-content,
.container.sign-up-model .inner-left-container .image {
    transform: translateX(-1000px);
    transition: 1s ease-in-out;
    transition-delay: 0.2s;
}
</style>
