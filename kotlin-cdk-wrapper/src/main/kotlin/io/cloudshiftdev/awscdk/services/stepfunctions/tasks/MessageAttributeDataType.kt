@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class MessageAttributeDataType(
  private val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType,
) {
  STRING(software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType.STRING),
  STRING_ARRAY(software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType.STRING_ARRAY),
  NUMBER(software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType.NUMBER),
  BINARY(software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType.BINARY),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType):
        MessageAttributeDataType = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType.STRING ->
          MessageAttributeDataType.STRING
      software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType.STRING_ARRAY ->
          MessageAttributeDataType.STRING_ARRAY
      software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType.NUMBER ->
          MessageAttributeDataType.NUMBER
      software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType.BINARY ->
          MessageAttributeDataType.BINARY
    }

    internal fun unwrap(wrapped: MessageAttributeDataType):
        software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType =
        wrapped.cdkObject
  }
}
