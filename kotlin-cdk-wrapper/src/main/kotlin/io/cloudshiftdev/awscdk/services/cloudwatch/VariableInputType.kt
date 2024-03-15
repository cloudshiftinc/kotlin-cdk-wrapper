@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class VariableInputType(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.VariableInputType,
) {
  INPUT(software.amazon.awscdk.services.cloudwatch.VariableInputType.INPUT),
  RADIO(software.amazon.awscdk.services.cloudwatch.VariableInputType.RADIO),
  SELECT(software.amazon.awscdk.services.cloudwatch.VariableInputType.SELECT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.VariableInputType):
        VariableInputType = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.VariableInputType.INPUT -> VariableInputType.INPUT
      software.amazon.awscdk.services.cloudwatch.VariableInputType.RADIO -> VariableInputType.RADIO
      software.amazon.awscdk.services.cloudwatch.VariableInputType.SELECT ->
          VariableInputType.SELECT
    }

    internal fun unwrap(wrapped: VariableInputType):
        software.amazon.awscdk.services.cloudwatch.VariableInputType = wrapped.cdkObject
  }
}
