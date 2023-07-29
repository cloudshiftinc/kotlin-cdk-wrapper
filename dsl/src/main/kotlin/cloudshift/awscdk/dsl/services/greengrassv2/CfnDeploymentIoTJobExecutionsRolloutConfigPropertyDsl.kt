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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

/**
 * Contains information about the rollout configuration for a job.
 *
 * This configuration defines the rate at which the job deploys a configuration to a fleet of target
 * devices.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * Object rateIncreaseCriteria;
 * IoTJobExecutionsRolloutConfigProperty ioTJobExecutionsRolloutConfigProperty =
 * IoTJobExecutionsRolloutConfigProperty.builder()
 * .exponentialRate(IoTJobExponentialRolloutRateProperty.builder()
 * .baseRatePerMinute(123)
 * .incrementFactor(123)
 * .rateIncreaseCriteria(rateIncreaseCriteria)
 * .build())
 * .maximumPerMinute(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexecutionsrolloutconfig.html)
 */
@CdkDslMarker
public class CfnDeploymentIoTJobExecutionsRolloutConfigPropertyDsl {
    private val cdkBuilder: CfnDeployment.IoTJobExecutionsRolloutConfigProperty.Builder =
        CfnDeployment.IoTJobExecutionsRolloutConfigProperty.builder()

    /** @param exponentialRate The exponential rate to increase the job rollout rate. */
    public fun exponentialRate(exponentialRate: IResolvable) {
        cdkBuilder.exponentialRate(exponentialRate)
    }

    /** @param exponentialRate The exponential rate to increase the job rollout rate. */
    public fun exponentialRate(
        exponentialRate: CfnDeployment.IoTJobExponentialRolloutRateProperty
    ) {
        cdkBuilder.exponentialRate(exponentialRate)
    }

    /**
     * @param maximumPerMinute The maximum number of devices that receive a pending job
     *   notification, per minute.
     */
    public fun maximumPerMinute(maximumPerMinute: Number) {
        cdkBuilder.maximumPerMinute(maximumPerMinute)
    }

    public fun build(): CfnDeployment.IoTJobExecutionsRolloutConfigProperty = cdkBuilder.build()
}
