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

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection
import kotlin.String

@CdkDslMarker
public class CfnVpcIngressConnectionIngressVpcConfigurationPropertyDsl {
    private val cdkBuilder: CfnVpcIngressConnection.IngressVpcConfigurationProperty.Builder =
        CfnVpcIngressConnection.IngressVpcConfigurationProperty.builder()

    public fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnVpcIngressConnection.IngressVpcConfigurationProperty = cdkBuilder.build()
}
