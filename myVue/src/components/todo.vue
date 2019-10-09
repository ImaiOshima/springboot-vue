<template>
    <li>{{todo.text}}</li>
</template>

<script>
    export default {
        name: "todo",
        props:['todo']
    }
</script>

<style scoped>

</style>
