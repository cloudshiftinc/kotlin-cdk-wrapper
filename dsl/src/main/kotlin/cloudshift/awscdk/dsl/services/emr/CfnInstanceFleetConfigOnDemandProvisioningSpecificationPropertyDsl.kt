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
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig
import kotlin.String

@CdkDslMarker
public class CfnInstanceFleetConfigOnDemandProvisioningSpecificationPropertyDsl {
    private val cdkBuilder: CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty.Builder =
        CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty.builder()

    public fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
    }

    public fun build(): CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty =
        cdkBuilder.build()
}
