# BottomSheetDialog
仿IOS底部弹框
🚀这是一个底部弹出框的库。可用作图片、性别等选择，支持添加头部，修改字体颜色，链式调用。使用方法也非常简单。
### 效果图，如下：
![正常样式](https://github.com/390057892/BottomSheetDialog/blob/master/yanshi.jpg)
![增加标题与颜色](https://github.com/390057892/BottomSheetDialog/blob/master/yanshi2.jpg)
### Step 1. 在项目的Build.Gradle中添加JitPack仓库
```java
	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
  ```
### Step 2. 在需要的模块中添加依赖
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