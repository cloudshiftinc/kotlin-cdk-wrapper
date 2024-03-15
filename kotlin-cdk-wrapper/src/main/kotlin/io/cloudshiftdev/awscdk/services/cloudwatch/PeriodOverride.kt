@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class PeriodOverride(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.PeriodOverride,
) {
  AUTO(software.amazon.awscdk.services.cloudwatch.PeriodOverride.AUTO),
  INHERIT(software.amazon.awscdk.services.cloudwatch.PeriodOverride.INHERIT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.PeriodOverride):
        PeriodOverride = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.PeriodOverride.AUTO -> PeriodOverride.AUTO
      software.amazon.awscdk.services.cloudwatch.PeriodOverride.INHERIT -> PeriodOverride.INHERIT
    }

    internal fun unwrap(wrapped: PeriodOverride):
        software.amazon.awscdk.services.cloudwatch.PeriodOverride = wrapped.cdkObject
  }
}
