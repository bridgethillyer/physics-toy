/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody */

#ifndef _Included_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
#define _Included_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
 * Method:    nUpdateData
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody_nUpdateData
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
 * Method:    nCreateBox
 * Signature: (IFFFFFF)I
 */
JNIEXPORT jint JNICALL Java_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody_nCreateBox
  (JNIEnv *, jobject, jint, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
 * Method:    nCreateShape
 * Signature: (IF[F)I
 */
JNIEXPORT jint JNICALL Java_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody_nCreateShape
  (JNIEnv *, jobject, jint, jfloat, jfloatArray);

/*
 * Class:     com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
 * Method:    nApplyForce
 * Signature: (IFFFF)V
 */
JNIEXPORT void JNICALL Java_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody_nApplyForce
  (JNIEnv *, jobject, jint, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
 * Method:    nApplyTorque
 * Signature: (IF)V
 */
JNIEXPORT void JNICALL Java_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody_nApplyTorque
  (JNIEnv *, jobject, jint, jfloat);

/*
 * Class:     com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
 * Method:    nAssociateJNIObject
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody_nAssociateJNIObject
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
 * Method:    nSetMassFromShapes
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody_nSetMassFromShapes
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
 * Method:    nSetDamping
 * Signature: (IFF)V
 */
JNIEXPORT void JNICALL Java_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody_nSetDamping
  (JNIEnv *, jobject, jint, jfloat, jfloat);

/*
 * Class:     com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
 * Method:    nRefilter
 * Signature: (IIII)V
 */
JNIEXPORT void JNICALL Java_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody_nRefilter
  (JNIEnv *, jobject, jint, jint, jint, jint);

/*
 * Class:     com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
 * Method:    nGetFilterData
 * Signature: (ILorg/jbox2d/collision/FilterData;)V
 */
JNIEXPORT void JNICALL Java_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody_nGetFilterData
  (JNIEnv *, jobject, jint, jobject);

/*
 * Class:     com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
 * Method:    nDestroyShape
 * Signature: (II)V
 */
JNIEXPORT void JNICALL Java_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody_nDestroyShape
  (JNIEnv *, jobject, jint, jint);

/*
 * Class:     com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody
 * Method:    nSetPosition
 * Signature: (IFF)V
 */
JNIEXPORT void JNICALL Java_com_kristianlm_robotanks_box2dbridge_jnibox2d_JNIBox2DBody_nSetPosition
  (JNIEnv *, jobject, jint, jfloat, jfloat);

#ifdef __cplusplus
}
#endif
#endif
