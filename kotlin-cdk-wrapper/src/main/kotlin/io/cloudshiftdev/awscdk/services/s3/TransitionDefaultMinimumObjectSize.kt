@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

public enum class TransitionDefaultMinimumObjectSize(
  private val cdkObject: software.amazon.awscdk.services.s3.TransitionDefaultMinimumObjectSize,
) {
  ALL_STORAGE_CLASSES_128_K(software.amazon.awscdk.services.s3.TransitionDefaultMinimumObjectSize.ALL_STORAGE_CLASSES_128_K),
  VARIES_BY_STORAGE_CLASS(software.amazon.awscdk.services.s3.TransitionDefaultMinimumObjectSize.VARIES_BY_STORAGE_CLASS),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.TransitionDefaultMinimumObjectSize):
        TransitionDefaultMinimumObjectSize = when (cdkObject) {
      software.amazon.awscdk.services.s3.TransitionDefaultMinimumObjectSize.ALL_STORAGE_CLASSES_128_K ->
          TransitionDefaultMinimumObjectSize.ALL_STORAGE_CLASSES_128_K
      software.amazon.awscdk.services.s3.TransitionDefaultMinimumObjectSize.VARIES_BY_STORAGE_CLASS ->
          TransitionDefaultMinimumObjectSize.VARIES_BY_STORAGE_CLASS
    }

    internal fun unwrap(wrapped: TransitionDefaultMinimumObjectSize):
        software.amazon.awscdk.services.s3.TransitionDefaultMinimumObjectSize = wrapped.cdkObject
  }
}
