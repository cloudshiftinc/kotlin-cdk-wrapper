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
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

/**
 * The start and end times of an inference experiment.
 *
 * The maximum duration that you can set for an inference experiment is 30 days.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * InferenceExperimentScheduleProperty inferenceExperimentScheduleProperty =
 * InferenceExperimentScheduleProperty.builder()
 * .endTime("endTime")
 * .startTime("startTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-inferenceexperimentschedule.html)
 */
@CdkDslMarker
public class CfnInferenceExperimentInferenceExperimentSchedulePropertyDsl {
    private val cdkBuilder: CfnInferenceExperiment.InferenceExperimentScheduleProperty.Builder =
        CfnInferenceExperiment.InferenceExperimentScheduleProperty.builder()

    /** @param endTime The timestamp at which the inference experiment ended or will end. */
    public fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
    }

    /** @param startTime The timestamp at which the inference experiment started or will start. */
    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    public fun build(): CfnInferenceExperiment.InferenceExperimentScheduleProperty =
        cdkBuilder.build()
}
