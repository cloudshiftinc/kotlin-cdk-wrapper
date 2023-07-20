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
public class CfnVirtualNodeListenerPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ListenerProperty.Builder =
        CfnVirtualNode.ListenerProperty.builder()

    public fun connectionPool(connectionPool: IResolvable) {
        cdkBuilder.connectionPool(connectionPool)
    }

    public fun connectionPool(connectionPool: CfnVirtualNode.VirtualNodeConnectionPoolProperty) {
        cdkBuilder.connectionPool(connectionPool)
    }

    public fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun healthCheck(healthCheck: CfnVirtualNode.HealthCheckProperty) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun outlierDetection(outlierDetection: IResolvable) {
        cdkBuilder.outlierDetection(outlierDetection)
    }

    public fun outlierDetection(outlierDetection: CfnVirtualNode.OutlierDetectionProperty) {
        cdkBuilder.outlierDetection(outlierDetection)
    }

    public fun portMapping(portMapping: IResolvable) {
        cdkBuilder.portMapping(portMapping)
    }

    public fun portMapping(portMapping: CfnVirtualNode.PortMappingProperty) {
        cdkBuilder.portMapping(portMapping)
    }

    public fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout)
    }

    public fun timeout(timeout: CfnVirtualNode.ListenerTimeoutProperty) {
        cdkBuilder.timeout(timeout)
    }

    public fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls)
    }

    public fun tls(tls: CfnVirtualNode.ListenerTlsProperty) {
        cdkBuilder.tls(tls)
    }

    public fun build(): CfnVirtualNode.ListenerProperty = cdkBuilder.build()
}
