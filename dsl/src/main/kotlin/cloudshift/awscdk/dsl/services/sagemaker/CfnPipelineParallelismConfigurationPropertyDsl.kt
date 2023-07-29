@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnPipeline

/**
 * Configuration that controls the parallelism of the pipeline.
 *
 * By default, the parallelism configuration specified applies to all executions of the pipeline
 * unless overridden.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ParallelismConfigurationProperty parallelismConfigurationProperty =
 * ParallelismConfigurationProperty.builder()
 * .maxParallelExecutionSteps(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-parallelismconfiguration.html)
 */
@CdkDslMarker
public class CfnPipelineParallelismConfigurationPropertyDsl {
    private val cdkBuilder: CfnPipeline.ParallelismConfigurationProperty.Builder =
        CfnPipeline.ParallelismConfigurationProperty.builder()

    /**
     * @param maxParallelExecutionSteps The max number of steps that can be executed in parallel.
     */
    public fun maxParallelExecutionSteps(maxParallelExecutionSteps: Number) {
        cdkBuilder.maxParallelExecutionSteps(maxParallelExecutionSteps)
    }

    public fun build(): CfnPipeline.ParallelismConfigurationProperty = cdkBuilder.build()
}
