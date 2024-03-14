package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class SplitType(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SplitType,
) {
  NONE(software.amazon.awscdk.services.stepfunctions.tasks.SplitType.NONE),
  LINE(software.amazon.awscdk.services.stepfunctions.tasks.SplitType.LINE),
  RECORD_IO(software.amazon.awscdk.services.stepfunctions.tasks.SplitType.RECORD_IO),
  TF_RECORD(software.amazon.awscdk.services.stepfunctions.tasks.SplitType.TF_RECORD),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.SplitType):
        SplitType = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.SplitType.NONE -> SplitType.NONE
      software.amazon.awscdk.services.stepfunctions.tasks.SplitType.LINE -> SplitType.LINE
      software.amazon.awscdk.services.stepfunctions.tasks.SplitType.RECORD_IO -> SplitType.RECORD_IO
      software.amazon.awscdk.services.stepfunctions.tasks.SplitType.TF_RECORD -> SplitType.TF_RECORD
    }

    internal fun unwrap(wrapped: SplitType):
        software.amazon.awscdk.services.stepfunctions.tasks.SplitType = wrapped.cdkObject
  }
}
