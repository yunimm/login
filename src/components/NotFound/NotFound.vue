<template>
    <el-result
        icon="warning"
        title="Warning Tip"
        sub-title="Please follow the instructions"
    >
        <template #extra>
            <el-button type="primary" @click="$router.push('/home')"
                >Back to home</el-button
            >
        </template>
    </el-result>
</template>

<script setup lang="ts"></script>

<style lang="scss" scoped></style>
