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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeServiceDiscoveryPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ServiceDiscoveryProperty.Builder =
        CfnVirtualNode.ServiceDiscoveryProperty.builder()

    public fun awsCloudMap(awsCloudMap: IResolvable) {
        cdkBuilder.awsCloudMap(awsCloudMap)
    }

    public fun awsCloudMap(awsCloudMap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty) {
        cdkBuilder.awsCloudMap(awsCloudMap)
    }

    public fun dns(dns: IResolvable) {
        cdkBuilder.dns(dns)
    }

    public fun dns(dns: CfnVirtualNode.DnsServiceDiscoveryProperty) {
        cdkBuilder.dns(dns)
    }

    public fun build(): CfnVirtualNode.ServiceDiscoveryProperty = cdkBuilder.build()
}
