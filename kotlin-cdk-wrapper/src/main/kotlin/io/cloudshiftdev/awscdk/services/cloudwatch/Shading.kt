@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class Shading(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.Shading,
) {
  NONE(software.amazon.awscdk.services.cloudwatch.Shading.NONE),
  ABOVE(software.amazon.awscdk.services.cloudwatch.Shading.ABOVE),
  BELOW(software.amazon.awscdk.services.cloudwatch.Shading.BELOW),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Shading): Shading = when
        (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.Shading.NONE -> Shading.NONE
      software.amazon.awscdk.services.cloudwatch.Shading.ABOVE -> Shading.ABOVE
      software.amazon.awscdk.services.cloudwatch.Shading.BELOW -> Shading.BELOW
    }

    internal fun unwrap(wrapped: Shading): software.amazon.awscdk.services.cloudwatch.Shading =
        wrapped.cdkObject
  }
}
