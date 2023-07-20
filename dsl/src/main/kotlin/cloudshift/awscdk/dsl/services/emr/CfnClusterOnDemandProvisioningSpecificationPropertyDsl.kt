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
import software.amazon.awscdk.services.emr.CfnCluster
import kotlin.String

@CdkDslMarker
public class CfnClusterOnDemandProvisioningSpecificationPropertyDsl {
    private val cdkBuilder: CfnCluster.OnDemandProvisioningSpecificationProperty.Builder =
        CfnCluster.OnDemandProvisioningSpecificationProperty.builder()

    public fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
    }

    public fun build(): CfnCluster.OnDemandProvisioningSpecificationProperty = cdkBuilder.build()
}
