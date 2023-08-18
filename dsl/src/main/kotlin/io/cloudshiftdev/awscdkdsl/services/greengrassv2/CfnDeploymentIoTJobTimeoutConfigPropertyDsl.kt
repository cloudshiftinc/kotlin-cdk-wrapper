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
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

/**
 * Contains information about the timeout configuration for a job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * IoTJobTimeoutConfigProperty ioTJobTimeoutConfigProperty = IoTJobTimeoutConfigProperty.builder()
 * .inProgressTimeoutInMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobtimeoutconfig.html)
 */
@CdkDslMarker
public class CfnDeploymentIoTJobTimeoutConfigPropertyDsl {
    private val cdkBuilder: CfnDeployment.IoTJobTimeoutConfigProperty.Builder =
        CfnDeployment.IoTJobTimeoutConfigProperty.builder()

    /**
     * @param inProgressTimeoutInMinutes The amount of time, in minutes, that devices have to
     *   complete the job. The timer starts when the job status is set to `IN_PROGRESS` . If the job
     *   status doesn't change to a terminal state before the time expires, then the job status is
     *   set to `TIMED_OUT` .
     *
     * The timeout interval must be between 1 minute and 7 days (10080 minutes).
     */
    public fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number) {
        cdkBuilder.inProgressTimeoutInMinutes(inProgressTimeoutInMinutes)
    }

    public fun build(): CfnDeployment.IoTJobTimeoutConfigProperty = cdkBuilder.build()
}
