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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnPipeline
import kotlin.Number

@CdkDslMarker
public class CfnPipelineParallelismConfigurationPropertyDsl {
    private val cdkBuilder: CfnPipeline.ParallelismConfigurationProperty.Builder =
        CfnPipeline.ParallelismConfigurationProperty.builder()

    public fun maxParallelExecutionSteps(maxParallelExecutionSteps: Number) {
        cdkBuilder.maxParallelExecutionSteps(maxParallelExecutionSteps)
    }

    public fun build(): CfnPipeline.ParallelismConfigurationProperty = cdkBuilder.build()
}
