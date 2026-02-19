---
tags:
  - CSS
  - 网页布局
  - 布局
  - CSS定位
  - CSS精灵
  - 定位
  - position
  - CSS图片定位
---
## 介绍
CSS精灵是一种把多个小图片整合到一张大图片的CSS技术,通过 ***background-position***属性定位每个图片在大图上的位置来展示每个小图片,优点是: ***减少浏览器请求次数,加快网页加载速度***
## 实现步骤：
1. 创建盒子，**盒子尺寸**与**小图**尺寸**相同**
2. 设置盒子**背景图**为精灵图
3. 添加 **background-position** 属性，改变**背景图位置**
​       3.1 使用 PxCook 测量小图片**左上角坐标**
​       3.2 取**负数**坐标为 background-position 属性值（向左上移动图片位置）
## 语法
``` css title:background-position属性值
background-position:水平 垂直
```