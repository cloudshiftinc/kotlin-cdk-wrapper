@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

public enum class DefaultResult(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.DefaultResult,
) {
  CONTINUE(software.amazon.awscdk.services.autoscaling.DefaultResult.CONTINUE),
  ABANDON(software.amazon.awscdk.services.autoscaling.DefaultResult.ABANDON),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.DefaultResult):
        DefaultResult = when (cdkObject) {
      software.amazon.awscdk.services.autoscaling.DefaultResult.CONTINUE -> DefaultResult.CONTINUE
      software.amazon.awscdk.services.autoscaling.DefaultResult.ABANDON -> DefaultResult.ABANDON
    }

    internal fun unwrap(wrapped: DefaultResult):
        software.amazon.awscdk.services.autoscaling.DefaultResult = wrapped.cdkObject
  }
}
