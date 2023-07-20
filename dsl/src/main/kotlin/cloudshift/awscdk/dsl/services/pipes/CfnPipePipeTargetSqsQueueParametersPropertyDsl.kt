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
import kotlin.String

@CdkDslMarker
public class CfnPipePipeTargetSqsQueueParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetSqsQueueParametersProperty.Builder =
        CfnPipe.PipeTargetSqsQueueParametersProperty.builder()

    public fun messageDeduplicationId(messageDeduplicationId: String) {
        cdkBuilder.messageDeduplicationId(messageDeduplicationId)
    }

    public fun messageGroupId(messageGroupId: String) {
        cdkBuilder.messageGroupId(messageGroupId)
    }

    public fun build(): CfnPipe.PipeTargetSqsQueueParametersProperty = cdkBuilder.build()
}
