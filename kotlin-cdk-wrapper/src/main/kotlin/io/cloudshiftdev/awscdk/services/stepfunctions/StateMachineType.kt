@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class StateMachineType(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.StateMachineType,
) {
  EXPRESS(software.amazon.awscdk.services.stepfunctions.StateMachineType.EXPRESS),
  STANDARD(software.amazon.awscdk.services.stepfunctions.StateMachineType.STANDARD),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.StateMachineType):
        StateMachineType = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.StateMachineType.EXPRESS ->
          StateMachineType.EXPRESS
      software.amazon.awscdk.services.stepfunctions.StateMachineType.STANDARD ->
          StateMachineType.STANDARD
    }

    internal fun unwrap(wrapped: StateMachineType):
        software.amazon.awscdk.services.stepfunctions.StateMachineType = wrapped.cdkObject
  }
}
