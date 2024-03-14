package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class InputMode(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.InputMode,
) {
  PIPE(software.amazon.awscdk.services.stepfunctions.tasks.InputMode.PIPE),
  FILE(software.amazon.awscdk.services.stepfunctions.tasks.InputMode.FILE),
  FAST_FILE(software.amazon.awscdk.services.stepfunctions.tasks.InputMode.FAST_FILE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.InputMode):
        InputMode = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.InputMode.PIPE -> InputMode.PIPE
      software.amazon.awscdk.services.stepfunctions.tasks.InputMode.FILE -> InputMode.FILE
      software.amazon.awscdk.services.stepfunctions.tasks.InputMode.FAST_FILE -> InputMode.FAST_FILE
    }

    internal fun unwrap(wrapped: InputMode):
        software.amazon.awscdk.services.stepfunctions.tasks.InputMode = wrapped.cdkObject
  }
}
