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
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig

@CdkDslMarker
public class CfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsPropertyDsl {
    private val cdkBuilder:
        CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder =
        CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.builder()

    public fun onDemandSpecification(onDemandSpecification: IResolvable) {
        cdkBuilder.onDemandSpecification(onDemandSpecification)
    }

    public fun onDemandSpecification(onDemandSpecification: CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty) {
        cdkBuilder.onDemandSpecification(onDemandSpecification)
    }

    public fun spotSpecification(spotSpecification: IResolvable) {
        cdkBuilder.spotSpecification(spotSpecification)
    }

    public fun spotSpecification(spotSpecification: CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty) {
        cdkBuilder.spotSpecification(spotSpecification)
    }

    public fun build(): CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty =
        cdkBuilder.build()
}
