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

package io.cloudshiftdev.awscdkdsl.services.evidently

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnExperiment

/**
 * Use this structure to start and stop the experiment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * RunningStatusObjectProperty runningStatusObjectProperty = RunningStatusObjectProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .analysisCompleteTime("analysisCompleteTime")
 * .desiredState("desiredState")
 * .reason("reason")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-runningstatusobject.html)
 */
@CdkDslMarker
public class CfnExperimentRunningStatusObjectPropertyDsl {
    private val cdkBuilder: CfnExperiment.RunningStatusObjectProperty.Builder =
        CfnExperiment.RunningStatusObjectProperty.builder()

    /**
     * @param analysisCompleteTime If you are using AWS CloudFormation to start the experiment, use
     *   this field to specify when the experiment is to end. The format is as a UNIX timestamp. For
     *   more information about this format, see
     *   [The Current Epoch Unix Timestamp](https://docs.aws.amazon.com/https://www.unixtimestamp.com/index.php)
     *   .
     */
    public fun analysisCompleteTime(analysisCompleteTime: String) {
        cdkBuilder.analysisCompleteTime(analysisCompleteTime)
    }

    /**
     * @param desiredState If you are using AWS CloudFormation to stop this experiment, specify
     *   either `COMPLETED` or `CANCELLED` here to indicate how to classify this experiment.
     */
    public fun desiredState(desiredState: String) {
        cdkBuilder.desiredState(desiredState)
    }

    /**
     * @param reason If you are using AWS CloudFormation to stop this experiment, this is an
     *   optional field that you can use to record why the experiment is being stopped or cancelled.
     */
    public fun reason(reason: String) {
        cdkBuilder.reason(reason)
    }

    /**
     * @param status To start the experiment now, specify `START` for this parameter. If this
     *   experiment is currently running and you want to stop it now, specify `STOP` .
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnExperiment.RunningStatusObjectProperty = cdkBuilder.build()
}
