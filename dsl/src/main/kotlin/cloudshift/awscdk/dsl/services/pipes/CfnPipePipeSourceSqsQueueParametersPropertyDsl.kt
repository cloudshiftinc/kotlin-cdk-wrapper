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
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.Number

@CdkDslMarker
public class CfnPipePipeSourceSqsQueueParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeSourceSqsQueueParametersProperty.Builder =
        CfnPipe.PipeSourceSqsQueueParametersProperty.builder()

    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    public fun build(): CfnPipe.PipeSourceSqsQueueParametersProperty = cdkBuilder.build()
}
