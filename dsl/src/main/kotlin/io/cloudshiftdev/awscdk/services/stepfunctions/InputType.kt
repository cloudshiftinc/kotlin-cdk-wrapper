package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class InputType(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.InputType,
) {
  TEXT(software.amazon.awscdk.services.stepfunctions.InputType.TEXT),
  OBJECT(software.amazon.awscdk.services.stepfunctions.InputType.OBJECT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.InputType): InputType
        = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.InputType.TEXT -> InputType.TEXT
      software.amazon.awscdk.services.stepfunctions.InputType.OBJECT -> InputType.OBJECT
    }

    internal fun unwrap(wrapped: InputType): software.amazon.awscdk.services.stepfunctions.InputType
        = wrapped.cdkObject
  }
}
