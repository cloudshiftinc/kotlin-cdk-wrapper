package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class DynamoItemCollectionMetrics(
  private val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics,
) {
  SIZE(software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics.SIZE),
  NONE(software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics.NONE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics):
        DynamoItemCollectionMetrics = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics.SIZE ->
          DynamoItemCollectionMetrics.SIZE
      software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics.NONE ->
          DynamoItemCollectionMetrics.NONE
    }

    internal fun unwrap(wrapped: DynamoItemCollectionMetrics):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics =
        wrapped.cdkObject
  }
}
