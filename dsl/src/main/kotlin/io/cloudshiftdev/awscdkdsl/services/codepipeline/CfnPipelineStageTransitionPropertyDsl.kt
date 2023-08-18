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

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * The name of the pipeline in which you want to disable the flow of artifacts from one stage to
 * another.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * StageTransitionProperty stageTransitionProperty = StageTransitionProperty.builder()
 * .reason("reason")
 * .stageName("stageName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-stagetransition.html)
 */
@CdkDslMarker
public class CfnPipelineStageTransitionPropertyDsl {
    private val cdkBuilder: CfnPipeline.StageTransitionProperty.Builder =
        CfnPipeline.StageTransitionProperty.builder()

    /**
     * @param reason The reason given to the user that a stage is disabled, such as waiting for
     *   manual approval or manual tests. This message is displayed in the pipeline console UI.
     */
    public fun reason(reason: String) {
        cdkBuilder.reason(reason)
    }

    /**
     * @param stageName The name of the stage where you want to disable the inbound or outbound
     *   transition of artifacts.
     */
    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun build(): CfnPipeline.StageTransitionProperty = cdkBuilder.build()
}
