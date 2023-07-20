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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterConnectivityInfoPropertyDsl {
    private val cdkBuilder: CfnCluster.ConnectivityInfoProperty.Builder =
        CfnCluster.ConnectivityInfoProperty.builder()

    public fun publicAccess(publicAccess: IResolvable) {
        cdkBuilder.publicAccess(publicAccess)
    }

    public fun publicAccess(publicAccess: CfnCluster.PublicAccessProperty) {
        cdkBuilder.publicAccess(publicAccess)
    }

    public fun vpcConnectivity(vpcConnectivity: IResolvable) {
        cdkBuilder.vpcConnectivity(vpcConnectivity)
    }

    public fun vpcConnectivity(vpcConnectivity: CfnCluster.VpcConnectivityProperty) {
        cdkBuilder.vpcConnectivity(vpcConnectivity)
    }

    public fun build(): CfnCluster.ConnectivityInfoProperty = cdkBuilder.build()
}
