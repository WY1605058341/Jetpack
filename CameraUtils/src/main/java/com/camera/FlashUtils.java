//package com.camera;
//
//
//import android.annotation.TargetApi;
//import android.content.Context;
//import android.hardware.Camera;
//import android.hardware.camera2.CameraAccessException;
//import android.hardware.camera2.CameraCharacteristics;
//import android.hardware.camera2.CameraManager;
//import android.os.Build;
//
//import androidx.annotation.RequiresApi;
//
///**
// * 闪光灯操作类
// */
//public class FlashUtils {
//
//
//    public static Camera camera;
//    public static Camera.Parameters parameters;
//
//
//    @TargetApi(Build.VERSION_CODES.N)
//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//    public static void changeFlashLight(Context context, boolean openOrClose) {
//        //判断API是否大于24（安卓7.0系统对应的API）
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            try {
//                //获取CameraManager
//                CameraManager mCameraManager = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
//                //获取当前手机所有摄像头设备ID
//                String[] ids = mCameraManager.getCameraIdList();
//                for (String id : ids) {
//                    CameraCharacteristics c = mCameraManager.getCameraCharacteristics(id);
//                    //查询该摄像头组件是否包含闪光灯
//                    Boolean flashAvailable = c.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
//                    Integer lensFacing = c.get(CameraCharacteristics.LENS_FACING);
//                    if (flashAvailable != null && flashAvailable
//                            && lensFacing != null && lensFacing == CameraCharacteristics.LENS_FACING_BACK) {
//                        //打开或关闭手电筒
//                        mCameraManager.setTorchMode(id, openOrClose);
//
//                    }
//                }
//            } catch (CameraAccessException e) {
//                e.printStackTrace();
//            }
//        } else {
//
//            if (null == camera || null == parameters) {
//                camera = Camera.open();
//                parameters = camera.getParameters();
//            }
//
//            //打开闪光灯
//            parameters.setFlashMode(openOrClose ? Camera.Parameters.FLASH_MODE_TORCH : Camera.Parameters.FLASH_MODE_OFF);//开启或者关闭
//            camera.setParameters(parameters);
//
//
//        }
//    }
//
//}
