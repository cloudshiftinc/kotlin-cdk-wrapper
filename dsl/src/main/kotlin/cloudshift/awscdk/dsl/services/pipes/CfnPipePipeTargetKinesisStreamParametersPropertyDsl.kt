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
public class CfnPipePipeTargetKinesisStreamParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetKinesisStreamParametersProperty.Builder =
        CfnPipe.PipeTargetKinesisStreamParametersProperty.builder()

    public fun partitionKey(partitionKey: String) {
        cdkBuilder.partitionKey(partitionKey)
    }

    public fun build(): CfnPipe.PipeTargetKinesisStreamParametersProperty = cdkBuilder.build()
}
