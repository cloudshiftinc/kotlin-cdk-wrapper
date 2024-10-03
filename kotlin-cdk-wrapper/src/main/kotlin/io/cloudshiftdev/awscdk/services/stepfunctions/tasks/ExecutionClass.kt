@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class ExecutionClass(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ExecutionClass,
) {
  FLEX(software.amazon.awscdk.services.stepfunctions.tasks.ExecutionClass.FLEX),
  STANDARD(software.amazon.awscdk.services.stepfunctions.tasks.ExecutionClass.STANDARD),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ExecutionClass):
        ExecutionClass = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.ExecutionClass.FLEX -> ExecutionClass.FLEX
      software.amazon.awscdk.services.stepfunctions.tasks.ExecutionClass.STANDARD ->
          ExecutionClass.STANDARD
    }

    internal fun unwrap(wrapped: ExecutionClass):
        software.amazon.awscdk.services.stepfunctions.tasks.ExecutionClass = wrapped.cdkObject
  }
}
