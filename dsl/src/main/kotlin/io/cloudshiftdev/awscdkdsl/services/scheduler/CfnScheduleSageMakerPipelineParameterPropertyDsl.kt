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

package io.cloudshiftdev.awscdkdsl.services.scheduler

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

/**
 * The name and value pair of a parameter to use to start execution of a SageMaker Model Building
 * Pipeline.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
 * SageMakerPipelineParameterProperty sageMakerPipelineParameterProperty =
 * SageMakerPipelineParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameter.html)
 */
@CdkDslMarker
public class CfnScheduleSageMakerPipelineParameterPropertyDsl {
    private val cdkBuilder: CfnSchedule.SageMakerPipelineParameterProperty.Builder =
        CfnSchedule.SageMakerPipelineParameterProperty.builder()

    /** @param name Name of parameter to start execution of a SageMaker Model Building Pipeline. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param value Value of parameter to start execution of a SageMaker Model Building Pipeline.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnSchedule.SageMakerPipelineParameterProperty = cdkBuilder.build()
}
