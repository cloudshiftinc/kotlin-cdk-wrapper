@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class DynamoReturnValues(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues,
) {
  NONE(software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.NONE),
  ALL_OLD(software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.ALL_OLD),
  UPDATED_OLD(software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.UPDATED_OLD),
  ALL_NEW(software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.ALL_NEW),
  UPDATED_NEW(software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.UPDATED_NEW),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues):
        DynamoReturnValues = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.NONE ->
          DynamoReturnValues.NONE
      software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.ALL_OLD ->
          DynamoReturnValues.ALL_OLD
      software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.UPDATED_OLD ->
          DynamoReturnValues.UPDATED_OLD
      software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.ALL_NEW ->
          DynamoReturnValues.ALL_NEW
      software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.UPDATED_NEW ->
          DynamoReturnValues.UPDATED_NEW
    }

    internal fun unwrap(wrapped: DynamoReturnValues):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues = wrapped.cdkObject
  }
}
