@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

public enum class ParameterTier(
  private val cdkObject: software.amazon.awscdk.services.ssm.ParameterTier,
) {
  ADVANCED(software.amazon.awscdk.services.ssm.ParameterTier.ADVANCED),
  INTELLIGENT_TIERING(software.amazon.awscdk.services.ssm.ParameterTier.INTELLIGENT_TIERING),
  STANDARD(software.amazon.awscdk.services.ssm.ParameterTier.STANDARD),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.ParameterTier): ParameterTier =
        when (cdkObject) {
      software.amazon.awscdk.services.ssm.ParameterTier.ADVANCED -> ParameterTier.ADVANCED
      software.amazon.awscdk.services.ssm.ParameterTier.INTELLIGENT_TIERING ->
          ParameterTier.INTELLIGENT_TIERING
      software.amazon.awscdk.services.ssm.ParameterTier.STANDARD -> ParameterTier.STANDARD
    }

    internal fun unwrap(wrapped: ParameterTier): software.amazon.awscdk.services.ssm.ParameterTier =
        wrapped.cdkObject
  }
}
