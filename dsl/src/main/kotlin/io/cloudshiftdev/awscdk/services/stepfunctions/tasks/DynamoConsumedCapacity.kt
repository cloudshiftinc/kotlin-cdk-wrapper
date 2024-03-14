package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class DynamoConsumedCapacity(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity,
) {
    INDEXES(software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity.INDEXES),
    TOTAL(software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity.TOTAL),
    NONE(software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity.NONE),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity
        ): DynamoConsumedCapacity =
            when (cdkObject) {
                software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity
                    .INDEXES -> DynamoConsumedCapacity.INDEXES
                software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity.TOTAL ->
                    DynamoConsumedCapacity.TOTAL
                software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity.NONE ->
                    DynamoConsumedCapacity.NONE
            }

        internal fun unwrap(
            wrapped: DynamoConsumedCapacity
        ): software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity =
            wrapped.cdkObject
    }
}
