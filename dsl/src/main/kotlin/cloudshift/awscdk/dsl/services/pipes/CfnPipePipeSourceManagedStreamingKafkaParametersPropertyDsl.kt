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
public class CfnPipePipeSourceManagedStreamingKafkaParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty.Builder =
        CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty.builder()

    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    public fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
    }

    public fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials)
    }

    public fun credentials(credentials: CfnPipe.MSKAccessCredentialsProperty) {
        cdkBuilder.credentials(credentials)
    }

    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    public fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
    }

    public fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
    }

    public fun build(): CfnPipe.PipeSourceManagedStreamingKafkaParametersProperty = cdkBuilder.build()
}
