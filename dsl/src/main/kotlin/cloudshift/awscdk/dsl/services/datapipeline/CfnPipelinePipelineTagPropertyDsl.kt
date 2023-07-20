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

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.datapipeline.CfnPipeline
import kotlin.String

@CdkDslMarker
public class CfnPipelinePipelineTagPropertyDsl {
    private val cdkBuilder: CfnPipeline.PipelineTagProperty.Builder =
        CfnPipeline.PipelineTagProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnPipeline.PipelineTagProperty = cdkBuilder.build()
}
