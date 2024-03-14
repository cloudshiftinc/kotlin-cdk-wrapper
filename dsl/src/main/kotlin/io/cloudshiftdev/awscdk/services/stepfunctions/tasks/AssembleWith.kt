package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class AssembleWith(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith,
) {
  NONE(software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith.NONE),
  LINE(software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith.LINE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith):
        AssembleWith = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith.NONE -> AssembleWith.NONE
      software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith.LINE -> AssembleWith.LINE
    }

    internal fun unwrap(wrapped: AssembleWith):
        software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith = wrapped.cdkObject
  }
}
