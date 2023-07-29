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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

/**
 * Contains information about an AWS IoT job configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * Object rateIncreaseCriteria;
 * DeploymentIoTJobConfigurationProperty deploymentIoTJobConfigurationProperty =
 * DeploymentIoTJobConfigurationProperty.builder()
 * .abortConfig(IoTJobAbortConfigProperty.builder()
 * .criteriaList(List.of(IoTJobAbortCriteriaProperty.builder()
 * .action("action")
 * .failureType("failureType")
 * .minNumberOfExecutedThings(123)
 * .thresholdPercentage(123)
 * .build()))
 * .build())
 * .jobExecutionsRolloutConfig(IoTJobExecutionsRolloutConfigProperty.builder()
 * .exponentialRate(IoTJobExponentialRolloutRateProperty.builder()
 * .baseRatePerMinute(123)
 * .incrementFactor(123)
 * .rateIncreaseCriteria(rateIncreaseCriteria)
 * .build())
 * .maximumPerMinute(123)
 * .build())
 * .timeoutConfig(IoTJobTimeoutConfigProperty.builder()
 * .inProgressTimeoutInMinutes(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentiotjobconfiguration.html)
 */
@CdkDslMarker
public class CfnDeploymentDeploymentIoTJobConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeployment.DeploymentIoTJobConfigurationProperty.Builder =
        CfnDeployment.DeploymentIoTJobConfigurationProperty.builder()

    /**
     * @param abortConfig The stop configuration for the job. This configuration defines when and
     *   how to stop a job rollout.
     */
    public fun abortConfig(abortConfig: IResolvable) {
        cdkBuilder.abortConfig(abortConfig)
    }

    /**
     * @param abortConfig The stop configuration for the job. This configuration defines when and
     *   how to stop a job rollout.
     */
    public fun abortConfig(abortConfig: CfnDeployment.IoTJobAbortConfigProperty) {
        cdkBuilder.abortConfig(abortConfig)
    }

    /**
     * @param jobExecutionsRolloutConfig The rollout configuration for the job. This configuration
     *   defines the rate at which the job rolls out to the fleet of target devices.
     */
    public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IResolvable) {
        cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
    }

    /**
     * @param jobExecutionsRolloutConfig The rollout configuration for the job. This configuration
     *   defines the rate at which the job rolls out to the fleet of target devices.
     */
    public fun jobExecutionsRolloutConfig(
        jobExecutionsRolloutConfig: CfnDeployment.IoTJobExecutionsRolloutConfigProperty
    ) {
        cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
    }

    /**
     * @param timeoutConfig The timeout configuration for the job. This configuration defines the
     *   amount of time each device has to complete the job.
     */
    public fun timeoutConfig(timeoutConfig: IResolvable) {
        cdkBuilder.timeoutConfig(timeoutConfig)
    }

    /**
     * @param timeoutConfig The timeout configuration for the job. This configuration defines the
     *   amount of time each device has to complete the job.
     */
    public fun timeoutConfig(timeoutConfig: CfnDeployment.IoTJobTimeoutConfigProperty) {
        cdkBuilder.timeoutConfig(timeoutConfig)
    }

    public fun build(): CfnDeployment.DeploymentIoTJobConfigurationProperty = cdkBuilder.build()
}
