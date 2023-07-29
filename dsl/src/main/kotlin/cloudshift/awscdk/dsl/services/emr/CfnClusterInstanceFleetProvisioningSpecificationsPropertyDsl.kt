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
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * `InstanceFleetProvisioningSpecification` is a subproperty of `InstanceFleetConfig` .
 *
 * `InstanceFleetProvisioningSpecification` defines the launch specification for Spot instances in
 * an instance fleet, which determines the defined duration and provisioning timeout behavior for
 * Spot instances.
 *
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
 * excluding 5.0.x versions.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-instancefleetprovisioningspecifications.html)
 */
@CdkDslMarker
public class CfnClusterInstanceFleetProvisioningSpecificationsPropertyDsl {
    private val cdkBuilder: CfnCluster.InstanceFleetProvisioningSpecificationsProperty.Builder =
        CfnCluster.InstanceFleetProvisioningSpecificationsProperty.builder()

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
        onDemandSpecification: CfnCluster.OnDemandProvisioningSpecificationProperty
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
        spotSpecification: CfnCluster.SpotProvisioningSpecificationProperty
    ) {
        cdkBuilder.spotSpecification(spotSpecification)
    }

    public fun build(): CfnCluster.InstanceFleetProvisioningSpecificationsProperty =
        cdkBuilder.build()
}
