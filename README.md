# ExpandableTextView
android 可"折叠""打开"或者"全文""收起"的TextView

#####效果图如下：
 ![image](https://github.com/imflyn/ExpandableTextView/raw/master/screenshots/1.gif)
 ![image](https://github.com/imflyn/ExpandableTextView/raw/master/screenshots/2.gif)
 
#####使用方法：
布局文件
```
    <packname.ExpandableTextView
        android:id="@+id/textView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
```
文本框中
```
expandableTextView.setText("your text")
```
recycleView或listview中
```
//collapsedStatusMap是为了防止错位存储缓存的map,必须为全局变量
HashMap<Integer, Integer> collapsedStatusMap = new HashMap();

expandableTextView.setCollapsedStatus(collapsedStatusMap);
expandableTextView.setTextViewWidthPx(文本框的宽度);//设置文本框宽度                             
expandableTextView.setText("your text", position);     

```

##原理：
首先Textview的宽度并必须是已知并且是固定的。利用Paint.measureText()方法来计算文本总共需要的宽度，文本多于一行的宽度则计算文本行数总数加一。当超过预定的最大行数时通过TextView.setMaxLine()来设置textview最大的显示行数，并且将状态设置为“收起”状态。

##优点：
1. 相比通过Textview.getLineCount()和getViewTreeObserver().addOnPreDrawListener()等方法来获取TextView行数性能较好，不用多次渲染视图
2. recycleView中不会错位

##缺点：
1. TextView的宽度必须是已知且固定的
2. Demo中没有对Textview自定义样式进行过多的封装，需要开发者自己扩展。





