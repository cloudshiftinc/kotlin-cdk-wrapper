@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class JitterType(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.JitterType,
) {
  FULL(software.amazon.awscdk.services.stepfunctions.JitterType.FULL),
  NONE(software.amazon.awscdk.services.stepfunctions.JitterType.NONE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.JitterType):
        JitterType = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.JitterType.FULL -> JitterType.FULL
      software.amazon.awscdk.services.stepfunctions.JitterType.NONE -> JitterType.NONE
    }

    internal fun unwrap(wrapped: JitterType):
        software.amazon.awscdk.services.stepfunctions.JitterType = wrapped.cdkObject
  }
}
