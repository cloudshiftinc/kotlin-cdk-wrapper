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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig

/**
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
 * excluding 5.0.x versions.
 *
 * `InstanceTypeConfig` is a sub-property of `InstanceFleetConfig` . `InstanceTypeConfig` determines
 * the EC2 instances that Amazon EMR attempts to provision to fulfill On-Demand and Spot target
 * capacities.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * InstanceFleetProvisioningSpecificationsProperty instanceFleetProvisioningSpecificationsProperty =
 * InstanceFleetProvisioningSpecificationsProperty.builder()
 * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
 * .allocationStrategy("allocationStrategy")
 * .build())
 * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
 * .timeoutAction("timeoutAction")
 * .timeoutDurationMinutes(123)
 * // the properties below are optional
 * .allocationStrategy("allocationStrategy")
 * .blockDurationMinutes(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-instancefleetprovisioningspecifications.html)
 */
@CdkDslMarker
public class CfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsPropertyDsl {
    private val cdkBuilder:
        CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder =
        CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.builder()

    /**
     * @param onDemandSpecification The launch specification for On-Demand Instances in the instance
     *   fleet, which determines the allocation strategy.
     *
     * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
     * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
     * releases 5.12.1 and later.
     */
    public fun onDemandSpecification(onDemandSpecification: IResolvable) {
        cdkBuilder.onDemandSpecification(onDemandSpecification)
    }

    /**
     * @param onDemandSpecification The launch specification for On-Demand Instances in the instance
     *   fleet, which determines the allocation strategy.
     *
     * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
     * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
     * releases 5.12.1 and later.
     */
    public fun onDemandSpecification(
        onDemandSpecification: CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty
    ) {
        cdkBuilder.onDemandSpecification(onDemandSpecification)
    }

    /**
     * @param spotSpecification The launch specification for Spot instances in the fleet, which
     *   determines the defined duration, provisioning timeout behavior, and allocation strategy.
     */
    public fun spotSpecification(spotSpecification: IResolvable) {
        cdkBuilder.spotSpecification(spotSpecification)
    }

    /**
     * @param spotSpecification The launch specification for Spot instances in the fleet, which
     *   determines the defined duration, provisioning timeout behavior, and allocation strategy.
     */
    public fun spotSpecification(
        spotSpecification: CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty
    ) {
        cdkBuilder.spotSpecification(spotSpecification)
    }

    public fun build(): CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty =
        cdkBuilder.build()
}
