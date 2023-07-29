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
import kotlin.String
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig

/**
 * The launch specification for On-Demand Instances in the instance fleet, which determines the
 * allocation strategy.
 *
 * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
 * excluding 5.0.x versions. On-Demand Instances allocation strategy is available in Amazon EMR
 * releases 5.12.1 and later.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * OnDemandProvisioningSpecificationProperty onDemandProvisioningSpecificationProperty =
 * OnDemandProvisioningSpecificationProperty.builder()
 * .allocationStrategy("allocationStrategy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ondemandprovisioningspecification.html)
 */
@CdkDslMarker
public class CfnInstanceFleetConfigOnDemandProvisioningSpecificationPropertyDsl {
    private val cdkBuilder:
        CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty.Builder =
        CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty.builder()

    /**
     * @param allocationStrategy Specifies the strategy to use in launching On-Demand instance
     *   fleets.
     *
     * Currently, the only option is `lowest-price` (the default), which launches the lowest price
     * first.
     */
    public fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
    }

    public fun build(): CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty =
        cdkBuilder.build()
}
