@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

public enum class ParameterType(
  private val cdkObject: software.amazon.awscdk.services.ssm.ParameterType,
) {
  STRING(software.amazon.awscdk.services.ssm.ParameterType.STRING),
  SECURE_STRING(software.amazon.awscdk.services.ssm.ParameterType.SECURE_STRING),
  STRING_LIST(software.amazon.awscdk.services.ssm.ParameterType.STRING_LIST),
  AWS_EC2_IMAGE_ID(software.amazon.awscdk.services.ssm.ParameterType.AWS_EC2_IMAGE_ID),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.ParameterType): ParameterType =
        when (cdkObject) {
      software.amazon.awscdk.services.ssm.ParameterType.STRING -> ParameterType.STRING
      software.amazon.awscdk.services.ssm.ParameterType.SECURE_STRING -> ParameterType.SECURE_STRING
      software.amazon.awscdk.services.ssm.ParameterType.STRING_LIST -> ParameterType.STRING_LIST
      software.amazon.awscdk.services.ssm.ParameterType.AWS_EC2_IMAGE_ID ->
          ParameterType.AWS_EC2_IMAGE_ID
    }

    internal fun unwrap(wrapped: ParameterType): software.amazon.awscdk.services.ssm.ParameterType =
        wrapped.cdkObject
  }
}
