@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class ProcessorType(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.ProcessorType,
) {
  STANDARD(software.amazon.awscdk.services.stepfunctions.ProcessorType.STANDARD),
  EXPRESS(software.amazon.awscdk.services.stepfunctions.ProcessorType.EXPRESS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ProcessorType):
        ProcessorType = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.ProcessorType.STANDARD -> ProcessorType.STANDARD
      software.amazon.awscdk.services.stepfunctions.ProcessorType.EXPRESS -> ProcessorType.EXPRESS
    }

    internal fun unwrap(wrapped: ProcessorType):
        software.amazon.awscdk.services.stepfunctions.ProcessorType = wrapped.cdkObject
  }
}
