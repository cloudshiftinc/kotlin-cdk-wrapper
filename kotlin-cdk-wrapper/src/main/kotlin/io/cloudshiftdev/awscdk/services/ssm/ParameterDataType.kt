@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

public enum class ParameterDataType(
  private val cdkObject: software.amazon.awscdk.services.ssm.ParameterDataType,
) {
  TEXT(software.amazon.awscdk.services.ssm.ParameterDataType.TEXT),
  AWS_EC2_IMAGE(software.amazon.awscdk.services.ssm.ParameterDataType.AWS_EC2_IMAGE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.ParameterDataType):
        ParameterDataType = when (cdkObject) {
      software.amazon.awscdk.services.ssm.ParameterDataType.TEXT -> ParameterDataType.TEXT
      software.amazon.awscdk.services.ssm.ParameterDataType.AWS_EC2_IMAGE ->
          ParameterDataType.AWS_EC2_IMAGE
    }

    internal fun unwrap(wrapped: ParameterDataType):
        software.amazon.awscdk.services.ssm.ParameterDataType = wrapped.cdkObject
  }
}
