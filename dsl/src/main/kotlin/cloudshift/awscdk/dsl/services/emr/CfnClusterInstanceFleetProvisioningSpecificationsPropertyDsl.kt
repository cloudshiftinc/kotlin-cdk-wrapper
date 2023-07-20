@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterInstanceFleetProvisioningSpecificationsPropertyDsl {
    private val cdkBuilder: CfnCluster.InstanceFleetProvisioningSpecificationsProperty.Builder =
        CfnCluster.InstanceFleetProvisioningSpecificationsProperty.builder()

    public fun onDemandSpecification(onDemandSpecification: IResolvable) {
        cdkBuilder.onDemandSpecification(onDemandSpecification)
    }

    public fun onDemandSpecification(onDemandSpecification: CfnCluster.OnDemandProvisioningSpecificationProperty) {
        cdkBuilder.onDemandSpecification(onDemandSpecification)
    }

    public fun spotSpecification(spotSpecification: IResolvable) {
        cdkBuilder.spotSpecification(spotSpecification)
    }

    public fun spotSpecification(spotSpecification: CfnCluster.SpotProvisioningSpecificationProperty) {
        cdkBuilder.spotSpecification(spotSpecification)
    }

    public fun build(): CfnCluster.InstanceFleetProvisioningSpecificationsProperty =
        cdkBuilder.build()
}
