@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnPipePipeSourceKinesisStreamParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeSourceKinesisStreamParametersProperty.Builder =
        CfnPipe.PipeSourceKinesisStreamParametersProperty.builder()

    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    public fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    public fun deadLetterConfig(deadLetterConfig: CfnPipe.DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
    }

    public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    public fun onPartialBatchItemFailure(onPartialBatchItemFailure: String) {
        cdkBuilder.onPartialBatchItemFailure(onPartialBatchItemFailure)
    }

    public fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    public fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
    }

    public fun startingPositionTimestamp(startingPositionTimestamp: String) {
        cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    public fun build(): CfnPipe.PipeSourceKinesisStreamParametersProperty = cdkBuilder.build()
}
