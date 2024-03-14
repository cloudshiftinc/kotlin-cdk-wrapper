package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class ComparisonOperator(
    private val cdkObject: software.amazon.awscdk.services.cloudwatch.ComparisonOperator,
) {
    GREATER_THAN_OR_EQUAL_TO_THRESHOLD(
        software.amazon.awscdk.services.cloudwatch.ComparisonOperator
            .GREATER_THAN_OR_EQUAL_TO_THRESHOLD
    ),
    GREATER_THAN_THRESHOLD(
        software.amazon.awscdk.services.cloudwatch.ComparisonOperator.GREATER_THAN_THRESHOLD
    ),
    LESS_THAN_THRESHOLD(
        software.amazon.awscdk.services.cloudwatch.ComparisonOperator.LESS_THAN_THRESHOLD
    ),
    LESS_THAN_OR_EQUAL_TO_THRESHOLD(
        software.amazon.awscdk.services.cloudwatch.ComparisonOperator
            .LESS_THAN_OR_EQUAL_TO_THRESHOLD
    ),
    LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD(
        software.amazon.awscdk.services.cloudwatch.ComparisonOperator
            .LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD
    ),
    GREATER_THAN_UPPER_THRESHOLD(
        software.amazon.awscdk.services.cloudwatch.ComparisonOperator.GREATER_THAN_UPPER_THRESHOLD
    ),
    LESS_THAN_LOWER_THRESHOLD(
        software.amazon.awscdk.services.cloudwatch.ComparisonOperator.LESS_THAN_LOWER_THRESHOLD
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudwatch.ComparisonOperator
        ): ComparisonOperator =
            when (cdkObject) {
                software.amazon.awscdk.services.cloudwatch.ComparisonOperator
                    .GREATER_THAN_OR_EQUAL_TO_THRESHOLD ->
                    ComparisonOperator.GREATER_THAN_OR_EQUAL_TO_THRESHOLD
                software.amazon.awscdk.services.cloudwatch.ComparisonOperator
                    .GREATER_THAN_THRESHOLD -> ComparisonOperator.GREATER_THAN_THRESHOLD
                software.amazon.awscdk.services.cloudwatch.ComparisonOperator.LESS_THAN_THRESHOLD ->
                    ComparisonOperator.LESS_THAN_THRESHOLD
                software.amazon.awscdk.services.cloudwatch.ComparisonOperator
                    .LESS_THAN_OR_EQUAL_TO_THRESHOLD ->
                    ComparisonOperator.LESS_THAN_OR_EQUAL_TO_THRESHOLD
                software.amazon.awscdk.services.cloudwatch.ComparisonOperator
                    .LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD ->
                    ComparisonOperator.LESS_THAN_LOWER_OR_GREATER_THAN_UPPER_THRESHOLD
                software.amazon.awscdk.services.cloudwatch.ComparisonOperator
                    .GREATER_THAN_UPPER_THRESHOLD -> ComparisonOperator.GREATER_THAN_UPPER_THRESHOLD
                software.amazon.awscdk.services.cloudwatch.ComparisonOperator
                    .LESS_THAN_LOWER_THRESHOLD -> ComparisonOperator.LESS_THAN_LOWER_THRESHOLD
            }

        internal fun unwrap(
            wrapped: ComparisonOperator
        ): software.amazon.awscdk.services.cloudwatch.ComparisonOperator = wrapped.cdkObject
    }
}
