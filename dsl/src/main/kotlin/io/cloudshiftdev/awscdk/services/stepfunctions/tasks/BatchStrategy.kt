package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class BatchStrategy(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy,
) {
  MULTI_RECORD(software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy.MULTI_RECORD),
  SINGLE_RECORD(software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy.SINGLE_RECORD),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy):
        BatchStrategy = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy.MULTI_RECORD ->
          BatchStrategy.MULTI_RECORD
      software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy.SINGLE_RECORD ->
          BatchStrategy.SINGLE_RECORD
    }

    internal fun unwrap(wrapped: BatchStrategy):
        software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy = wrapped.cdkObject
  }
}
