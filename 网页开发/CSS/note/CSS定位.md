---
tags:
  - 布局
  - 网页布局
  - CSS
  - 定位
  - position
  - CSS定位
aliases:
  - CSS_Position
---


> 定位的作用就是为了让盒子从一个参照物(通常是自己)偏移到需要的位置

---

## 常见值
| 定位方式          | 脱离文档流 | 定位基准            | 可用的偏移属性                  | 层叠上下文 | 滚动影响 |
| ------------- | ----- | --------------- | ------------------------ | ----- | ---- |
| `static` (默认) | 否     | 正常文档流中的位置       | 无                        | 不创建   | 受影响  |
| `relative`    | 否     | 自身原始位置          | top, right, bottom, left | 可创建*  | 受影响  |
| `absolute`    | 是     | 最近的定位祖先元素       | top, right, bottom, left | 可创建   | 不受影响 |
| `fixed`       | 是     | 浏览器视口(viewport) | top, right, bottom, left | 可创建   | 不受影响 |
| `sticky`      | 否/是   | 最近的滚动祖先和视口      | top, right, bottom, left | 可创建   | 部分影响 |
``` css title:定位移动常见值
div {
	top: 0; /* 相对于自身原来的位置向下移动 */
	left: 0;  /* 相对于自身原来的位置向右移动 */
    right: 0;  /* 相对于自身原来的位置向左移动 */
    bottom: 0;  /* 相对于自身原来的位置向上移动 */
}
```

---
## 静态定位
### 介绍
是元素自己的定位方式是**position的默认值**,按照默认的文档流排列,**不受top、bottom、left、right和z-index属性的影响**
### 特点
- 元素按照HTML中的出现顺序依次排列
- 块级元素从上到下排列
- 行内元素从左到右排列
- 忽略定位属性的设置
- 无法创建新的层叠上下文
---
## 相对定位
### 语法
``` css title:相对定位
div {
	position: relative;
	top: 100px;
	left: 100px;
}	
```
### 特点
- 不脱标，占用自己原来位置
- 显示模式特点保持不变
- 设置偏移则相对自己原来位置移动

---
## 绝对定位
### 特点
- 脱标，不占位
- 显示模式具备行内块特点
- 设置偏移则相对最近的已经定位的祖先元素改变位置
- 如果祖先元素都未定位，则相对浏览器可视区改变位置
### 使用场景
因为绝对定位会寻找里的最近的定位元素且不占位,通常会设置为子级绝对定位，父级相对定位（**子绝父相**）
### 语法
``` css title:相对定位
div {
	position: absolute;
	top: 100px;
	left: 100px;
}	
```

``` css title:子绝父相
body div#father {
  width: 300px;
  height: 300px;
  background-color: pink;
  position: relative;
  top: 300px;
  left: 100px;
}
body div#son {
  width: 50px;
  height: 50px;
  background-color: blue;
  position: absolute;
  top: 100px;
  left: 100px;
}
```

---
## 定位居中

### 语法
``` css title:定位居中
body div#father {
  width: 300px;
  height: 300px;
  background-color: pink;
  /* 父级必须设置相对定位 */
  position: relative;
  top: 300px;
  left: 100px;
}
body div#son {
  width: 50px;
  height: 50px;
  background-color: blue;
  position: absolute;
  top: 50%;
  left: 50%;
  /* 拉回自身左和上的一半 */
  transform: translate(-50%, -50%);
}
```

---
## 固定定位

### 特点
- 脱标，不占位
- 显示模式具备行内块特点
- 设置偏移相对浏览器窗口改变位置
### 使用场景
元素的位置在网页滚动时不会改变
### 语法

``` css title:固定定位
body div {
  position: fixed;
  top: 100px;
  left: 100px;
}
```

---

## 粘性定位
### 介绍
浏览器视口在没有超出偏移值之前跟随浏览器视口移动,**超过偏移值后不跟随浏览器视口移动**
### 语法
``` css title:粘性定位
div.box1{
    width: 100px;
    height: 100px;
    background-color: red;
    position: sticky;
    top: 100px;
}
```

---

## 堆叠层级z-index

![[1680340281795.png]]
### 特定
- 数字越大越优先显示（默认值为0，取值越大，层级越高）
### 使用场景
标签的默认形式是后来者居上,默认堆叠,使用 ***z-index*** 属性可以帮助你完成标签的前者居上

### 语法

``` css title:堆叠层级z-index
body div {
  width: 100px;
  height: 100px;
  background-color: pink;
  position: absolute;
  top: 100px;
  left: 100px;
}
body div.red {
  /* 取值是整数，默认是0，取值越大显示顺序越靠上 */
  z-index: 1;
  background-color: red;
}
```

