@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class RecordWrapperType(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType,
) {
  NONE(software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType.NONE),
  RECORD_IO(software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType.RECORD_IO),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType):
        RecordWrapperType = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType.NONE ->
          RecordWrapperType.NONE
      software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType.RECORD_IO ->
          RecordWrapperType.RECORD_IO
    }

    internal fun unwrap(wrapped: RecordWrapperType):
        software.amazon.awscdk.services.stepfunctions.tasks.RecordWrapperType = wrapped.cdkObject
  }
}
