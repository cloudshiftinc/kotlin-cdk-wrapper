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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig

/**
 * `SpotProvisioningSpecification` is a subproperty of the `InstanceFleetProvisioningSpecifications`
 * property type.
 *
 * `SpotProvisioningSpecification` determines the launch specification for Spot instances in the
 * instance fleet, which includes the defined duration and provisioning timeout behavior.
 *
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
 * excluding 5.0.x versions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * SpotProvisioningSpecificationProperty spotProvisioningSpecificationProperty =
 * SpotProvisioningSpecificationProperty.builder()
 * .timeoutAction("timeoutAction")
 * .timeoutDurationMinutes(123)
 * // the properties below are optional
 * .allocationStrategy("allocationStrategy")
 * .blockDurationMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-spotprovisioningspecification.html)
 */
@CdkDslMarker
public class CfnInstanceFleetConfigSpotProvisioningSpecificationPropertyDsl {
    private val cdkBuilder: CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder =
        CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.builder()

    /**
     * @param allocationStrategy Specifies one of the following strategies to launch Spot Instance
     *   fleets: `price-capacity-optimized` , `capacity-optimized` , `lowest-price` , or
     *   `diversified` . For more information on the provisioning strategies, see
     *   [Allocation strategies for Spot Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-allocation-strategy.html)
     *   in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * When you launch a Spot Instance fleet with the old console, it automatically launches with
     * the `capacity-optimized` strategy. You can't change the allocation strategy from the old
     * console.
     */
    public fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
    }

    /**
     * @param blockDurationMinutes The defined duration for Spot Instances (also known as Spot
     *   blocks) in minutes. When specified, the Spot Instance does not terminate before the defined
     *   duration expires, and defined duration pricing for Spot Instances applies. Valid values are
     *   60, 120, 180, 240, 300, or
     * 360. The duration period starts as soon as a Spot Instance receives its instance ID. At the
     *      end of the duration, Amazon EC2 marks the Spot Instance for termination and provides a
     *      Spot Instance termination notice, which gives the instance a two-minute warning before
     *      it terminates.
     *
     * Spot Instances with a defined duration (also known as Spot blocks) are no longer available to
     * new customers from July 1, 2021. For customers who have previously used the feature, we will
     * continue to support Spot Instances with a defined duration until December 31, 2022.
     */
    public fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
    }

    /**
     * @param timeoutAction The action to take when `TargetSpotCapacity` has not been fulfilled when
     *   the `TimeoutDurationMinutes` has expired;. that is, when all Spot Instances could not be
     *   provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and
     *   `SWITCH_TO_ON_DEMAND` . SWITCH_TO_ON_DEMAND specifies that if no Spot Instances are
     *   available, On-Demand Instances should be provisioned to fulfill any remaining Spot
     *   capacity.
     */
    public fun timeoutAction(timeoutAction: String) {
        cdkBuilder.timeoutAction(timeoutAction)
    }

    /**
     * @param timeoutDurationMinutes The Spot provisioning timeout period in minutes. If Spot
     *   Instances are not provisioned within this time period, the `TimeOutAction` is taken.
     *   Minimum value is 5 and maximum value is 1440. The timeout applies only during initial
     *   provisioning, when the cluster is first created.
     */
    public fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
        cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
    }

    public fun build(): CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty =
        cdkBuilder.build()
}
