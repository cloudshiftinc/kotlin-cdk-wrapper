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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnMultiplexprogram

/**
 * The current source for one of the pipelines in the multiplex.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MultiplexProgramPipelineDetailProperty multiplexProgramPipelineDetailProperty =
 * MultiplexProgramPipelineDetailProperty.builder()
 * .activeChannelPipeline("activeChannelPipeline")
 * .pipelineId("pipelineId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampipelinedetail.html)
 */
@CdkDslMarker
public class CfnMultiplexprogramMultiplexProgramPipelineDetailPropertyDsl {
    private val cdkBuilder: CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty.Builder =
        CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty.builder()

    /**
     * @param activeChannelPipeline Identifies the channel pipeline that is currently active for the
     *   pipeline (identified by PipelineId) in the multiplex.
     */
    public fun activeChannelPipeline(activeChannelPipeline: String) {
        cdkBuilder.activeChannelPipeline(activeChannelPipeline)
    }

    /** @param pipelineId Identifies a specific pipeline in the multiplex. */
    public fun pipelineId(pipelineId: String) {
        cdkBuilder.pipelineId(pipelineId)
    }

    public fun build(): CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty =
        cdkBuilder.build()
}
