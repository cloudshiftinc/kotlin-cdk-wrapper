@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

public enum class ScalingMode(
  private val cdkObject: software.amazon.awscdk.services.ses.ScalingMode,
) {
  STANDARD(software.amazon.awscdk.services.ses.ScalingMode.STANDARD),
  MANAGED(software.amazon.awscdk.services.ses.ScalingMode.MANAGED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ScalingMode): ScalingMode =
        when (cdkObject) {
      software.amazon.awscdk.services.ses.ScalingMode.STANDARD -> ScalingMode.STANDARD
      software.amazon.awscdk.services.ses.ScalingMode.MANAGED -> ScalingMode.MANAGED
    }

    internal fun unwrap(wrapped: ScalingMode): software.amazon.awscdk.services.ses.ScalingMode =
        wrapped.cdkObject
  }
}
