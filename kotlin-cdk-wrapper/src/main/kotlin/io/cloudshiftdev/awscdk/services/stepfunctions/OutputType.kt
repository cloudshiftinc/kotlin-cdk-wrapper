@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class OutputType(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.OutputType,
) {
  JSON(software.amazon.awscdk.services.stepfunctions.OutputType.JSON),
  JSONL(software.amazon.awscdk.services.stepfunctions.OutputType.JSONL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.OutputType):
        OutputType = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.OutputType.JSON -> OutputType.JSON
      software.amazon.awscdk.services.stepfunctions.OutputType.JSONL -> OutputType.JSONL
    }

    internal fun unwrap(wrapped: OutputType):
        software.amazon.awscdk.services.stepfunctions.OutputType = wrapped.cdkObject
  }
}
