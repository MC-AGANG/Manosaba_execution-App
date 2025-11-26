package org.agang.execution;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "org.agang.execution.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", org.agang.execution.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public long _holdtime = 0L;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public boolean _done = false;
public boolean _pressed = false;
public org.agang.execution.main _main = null;
public org.agang.execution.starter _starter = null;
public org.agang.execution.b4xpages _b4xpages = null;
public org.agang.execution.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 28;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 29;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 30;BA.debugLine="Panel1.Left = (Root.Width-Panel1.Width)/2";
_panel1.setLeft((int) ((_root.getWidth()-_panel1.getWidth())/(double)2));
 //BA.debugLineNum = 31;BA.debugLine="Panel2.Left = (Root.Width-Panel2.Width)/2";
_panel2.setLeft((int) ((_root.getWidth()-_panel2.getWidth())/(double)2));
 //BA.debugLineNum = 32;BA.debugLine="Panel2.Top = (Root.Height-Panel2.Height)/2";
_panel2.setTop((int) ((_root.getHeight()-_panel2.getHeight())/(double)2));
 //BA.debugLineNum = 33;BA.debugLine="Panel1.Top=Panel2.top";
_panel1.setTop(_panel2.getTop());
 //BA.debugLineNum = 34;BA.debugLine="Timer1.Initialize(\"Timer1\", 50)";
_timer1.Initialize(ba,"Timer1",(long) (50));
 //BA.debugLineNum = 35;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 13;BA.debugLine="Private HoldTime As Long";
_holdtime = 0L;
 //BA.debugLineNum = 14;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private ImageView2 As ImageView";
_imageview2 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private Panel2 As Panel";
_panel2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private Done As Boolean = False";
_done = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Private Pressed As Boolean = False";
_pressed = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _panel1_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Private Sub Panel1_Touch (Action As Int, X As Floa";
 //BA.debugLineNum = 79;BA.debugLine="If Done = False Then";
if (_done==__c.False) { 
 //BA.debugLineNum = 80;BA.debugLine="Select Action";
switch (_action) {
case 0: {
 //BA.debugLineNum = 82;BA.debugLine="Pressed = True";
_pressed = __c.True;
 //BA.debugLineNum = 83;BA.debugLine="ImageView1.Gravity=Gravity.CENTER";
_imageview1.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 84;BA.debugLine="ImageView2.Gravity=Gravity.CENTER";
_imageview2.setGravity(__c.Gravity.CENTER);
 break; }
case 1: {
 //BA.debugLineNum = 86;BA.debugLine="Pressed=False";
_pressed = __c.False;
 //BA.debugLineNum = 87;BA.debugLine="ImageView1.Gravity=Gravity.FILL";
_imageview1.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 88;BA.debugLine="ImageView2.Gravity=Gravity.FILL";
_imageview2.setGravity(__c.Gravity.FILL);
 break; }
}
;
 };
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _panel2_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Private Sub Panel2_Touch (Action As Int, X As Floa";
 //BA.debugLineNum = 95;BA.debugLine="If Done = False Then";
if (_done==__c.False) { 
 //BA.debugLineNum = 96;BA.debugLine="Select Action";
switch (_action) {
case 0: {
 //BA.debugLineNum = 98;BA.debugLine="Pressed = True";
_pressed = __c.True;
 //BA.debugLineNum = 99;BA.debugLine="ImageView1.Gravity=Gravity.CENTER";
_imageview1.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 100;BA.debugLine="ImageView2.Gravity=Gravity.CENTER";
_imageview2.setGravity(__c.Gravity.CENTER);
 break; }
case 1: {
 //BA.debugLineNum = 102;BA.debugLine="Pressed=False";
_pressed = __c.False;
 //BA.debugLineNum = 103;BA.debugLine="ImageView1.Gravity=Gravity.FILL";
_imageview1.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 104;BA.debugLine="ImageView2.Gravity=Gravity.FILL";
_imageview2.setGravity(__c.Gravity.FILL);
 break; }
}
;
 };
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Private Sub Timer1_Tick()";
 //BA.debugLineNum = 40;BA.debugLine="If Pressed Then";
if (_pressed) { 
 //BA.debugLineNum = 41;BA.debugLine="If HoldTime <100 Then";
if (_holdtime<100) { 
 //BA.debugLineNum = 42;BA.debugLine="HoldTime = HoldTime + 1";
_holdtime = (long) (_holdtime+1);
 }else {
 //BA.debugLineNum = 44;BA.debugLine="ImageView2.Bitmap = LoadBitmap(File.DirAssets,\"";
_imageview2.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"btn2.png").getObject()));
 //BA.debugLineNum = 45;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 46;BA.debugLine="Done=True";
_done = __c.True;
 //BA.debugLineNum = 47;BA.debugLine="ImageView1.Gravity=Gravity.FILL";
_imageview1.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 48;BA.debugLine="ImageView2.Gravity=Gravity.FILL";
_imageview2.setGravity(__c.Gravity.FILL);
 };
 //BA.debugLineNum = 50;BA.debugLine="Panel1.Height =Panel2.Height- HoldTime*Panel2.He";
_panel1.setHeight((int) (_panel2.getHeight()-_holdtime*_panel2.getHeight()/(double)100));
 //BA.debugLineNum = 51;BA.debugLine="VibrateWithAmplitude(50,HoldTime*2)";
_vibratewithamplitude((long) (50),(int) (_holdtime*2));
 }else {
 //BA.debugLineNum = 53;BA.debugLine="If HoldTime > 0 Then";
if (_holdtime>0) { 
 //BA.debugLineNum = 54;BA.debugLine="HoldTime = HoldTime -1";
_holdtime = (long) (_holdtime-1);
 //BA.debugLineNum = 55;BA.debugLine="Panel1.Height =Panel2.Height- HoldTime*Panel2.H";
_panel1.setHeight((int) (_panel2.getHeight()-_holdtime*_panel2.getHeight()/(double)100));
 };
 };
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _vibratewithamplitude(long _duration,int _amplitude) throws Exception{
anywheresoftware.b4j.object.JavaObject _ctxt = null;
anywheresoftware.b4j.object.JavaObject _vibrator = null;
anywheresoftware.b4j.object.JavaObject _effect = null;
 //BA.debugLineNum = 62;BA.debugLine="Sub VibrateWithAmplitude(duration As Long, amplitu";
 //BA.debugLineNum = 63;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 64;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(ba);
 //BA.debugLineNum = 66;BA.debugLine="Dim vibrator As JavaObject = ctxt.RunMethod(\"getS";
_vibrator = new anywheresoftware.b4j.object.JavaObject();
_vibrator = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_ctxt.RunMethod("getSystemService",new Object[]{(Object)("vibrator")})));
 //BA.debugLineNum = 68;BA.debugLine="If vibrator.IsInitialized Then";
if (_vibrator.IsInitialized()) { 
 //BA.debugLineNum = 69;BA.debugLine="If vibrator.RunMethod(\"hasVibrator\", Null) = Tru";
if ((_vibrator.RunMethod("hasVibrator",(Object[])(__c.Null))).equals((Object)(__c.True))) { 
 //BA.debugLineNum = 70;BA.debugLine="Dim effect As JavaObject";
_effect = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 71;BA.debugLine="effect = effect.InitializeStatic(\"android.os.Vi";
_effect = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_effect.InitializeStatic("android.os.VibrationEffect").RunMethod("createOneShot",new Object[]{(Object)(_duration),(Object)(_amplitude)})));
 //BA.debugLineNum = 73;BA.debugLine="vibrator.RunMethod(\"vibrate\", Array(effect))";
_vibrator.RunMethod("vibrate",new Object[]{(Object)(_effect.getObject())});
 };
 };
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
