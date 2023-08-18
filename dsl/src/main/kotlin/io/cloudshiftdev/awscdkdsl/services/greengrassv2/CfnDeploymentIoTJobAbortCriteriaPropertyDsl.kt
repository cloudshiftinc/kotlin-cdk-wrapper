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

package io.cloudshiftdev.awscdkdsl.services.greengrassv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

/**
 * Contains criteria that define when and how to cancel a job.
 *
 * The deployment stops if the following conditions are true:
 * * The number of things that receive the deployment exceeds the `minNumberOfExecutedThings` .
 * * The percentage of failures with type `failureType` exceeds the `thresholdPercentage` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * IoTJobAbortCriteriaProperty ioTJobAbortCriteriaProperty = IoTJobAbortCriteriaProperty.builder()
 * .action("action")
 * .failureType("failureType")
 * .minNumberOfExecutedThings(123)
 * .thresholdPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortcriteria.html)
 */
@CdkDslMarker
public class CfnDeploymentIoTJobAbortCriteriaPropertyDsl {
    private val cdkBuilder: CfnDeployment.IoTJobAbortCriteriaProperty.Builder =
        CfnDeployment.IoTJobAbortCriteriaProperty.builder()

    /** @param action The action to perform when the criteria are met. */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /** @param failureType The type of job deployment failure that can cancel a job. */
    public fun failureType(failureType: String) {
        cdkBuilder.failureType(failureType)
    }

    /**
     * @param minNumberOfExecutedThings The minimum number of things that receive the configuration
     *   before the job can cancel.
     */
    public fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number) {
        cdkBuilder.minNumberOfExecutedThings(minNumberOfExecutedThings)
    }

    /**
     * @param thresholdPercentage The minimum percentage of `failureType` failures that occur before
     *   the job can cancel. This parameter supports up to two digits after the decimal (for
     *   example, you can specify `10.9` or `10.99` , but not `10.999` ).
     */
    public fun thresholdPercentage(thresholdPercentage: Number) {
        cdkBuilder.thresholdPercentage(thresholdPercentage)
    }

    public fun build(): CfnDeployment.IoTJobAbortCriteriaProperty = cdkBuilder.build()
}
