# BottomSheetDialog
仿IOS底部弹框
这是一个底部弹出框的库。支持添加头部，修改字体颜色，链式调用。使用方法也非常简单。
### 效果图，如下：
![image][https://github.com/390057892/BottomSheetDialog/blob/master/yanshi.jpg]
![image][https://github.com/390057892/BottomSheetDialog/blob/master/yanshi2.jpg]
### Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
```java
	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
  ```
### Step 2. Add the dependency
```java
	dependencies {
	        implementation 'com.github.390057892:BottomSheetDialog:v1.0.0'
	}
  ```
### Step 3. 开始使用
```java
    public void showPicDialog() {
        ActionSheetDialog dialog = new ActionSheetDialog(this).builder();
        dialog.setCancelable(true).setCanceledOnTouchOutside(true)
                .addSheetItem("拍照", ActionSheetDialog.SheetItemColor.Normal, new ActionSheetDialog.OnSheetItemClickListener() {
                    @Override
                    public void onClick(int which) {
                        takePhoto();
                    }
                })
                .addSheetItem("相册", ActionSheetDialog.SheetItemColor.Normal, new ActionSheetDialog.OnSheetItemClickListener() {
                    @Override
                    public void onClick(int which) {
                        selectPhoto();
                    }
                }).show();
    }  
```

Add it in your root build.gradle at the end of repositories: