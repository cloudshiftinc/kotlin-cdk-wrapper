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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

/**
 * A schedule configures how often and when a pipeline will automatically create a new image.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
 * .pipelineExecutionStartCondition("pipelineExecutionStartCondition")
 * .scheduleExpression("scheduleExpression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html)
 */
@CdkDslMarker
public class CfnImagePipelineSchedulePropertyDsl {
    private val cdkBuilder: CfnImagePipeline.ScheduleProperty.Builder =
        CfnImagePipeline.ScheduleProperty.builder()

    /**
     * @param pipelineExecutionStartCondition The condition configures when the pipeline should
     *   trigger a new image build. When the `pipelineExecutionStartCondition` is set to
     *   `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` , and you use semantic version filters
     *   on the base image or components in your image recipe, Image Builder will build a new image
     *   only when there are new versions of the image or components in your recipe that match the
     *   semantic version filter. When it is set to `EXPRESSION_MATCH_ONLY` , it will build a new
     *   image every time the CRON expression matches the current time. For semantic version syntax,
     *   see
     *   [CreateComponent](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html)
     *   in the *Image Builder API Reference* .
     */
    public fun pipelineExecutionStartCondition(pipelineExecutionStartCondition: String) {
        cdkBuilder.pipelineExecutionStartCondition(pipelineExecutionStartCondition)
    }

    /**
     * @param scheduleExpression The cron expression determines how often EC2 Image Builder
     *   evaluates your `pipelineExecutionStartCondition` . For information on how to format a cron
     *   expression in Image Builder, see
     *   [Use cron expressions in EC2 Image Builder](https://docs.aws.amazon.com/imagebuilder/latest/userguide/image-builder-cron.html)
     *   .
     */
    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    public fun build(): CfnImagePipeline.ScheduleProperty = cdkBuilder.build()
}
