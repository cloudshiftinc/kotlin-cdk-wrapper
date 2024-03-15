@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class VariableType(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.VariableType,
) {
  PROPERTY(software.amazon.awscdk.services.cloudwatch.VariableType.PROPERTY),
  PATTERN(software.amazon.awscdk.services.cloudwatch.VariableType.PATTERN),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.VariableType):
        VariableType = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.VariableType.PROPERTY -> VariableType.PROPERTY
      software.amazon.awscdk.services.cloudwatch.VariableType.PATTERN -> VariableType.PATTERN
    }

    internal fun unwrap(wrapped: VariableType):
        software.amazon.awscdk.services.cloudwatch.VariableType = wrapped.cdkObject
  }
}
