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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.ServiceConnectService
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class ServiceConnectServiceDsl {
    private val cdkBuilder: ServiceConnectService.Builder = ServiceConnectService.builder()

    public fun discoveryName(discoveryName: String) {
        cdkBuilder.discoveryName(discoveryName)
    }

    public fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
    }

    public fun ingressPortOverride(ingressPortOverride: Number) {
        cdkBuilder.ingressPortOverride(ingressPortOverride)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun portMappingName(portMappingName: String) {
        cdkBuilder.portMappingName(portMappingName)
    }

    public fun build(): ServiceConnectService = cdkBuilder.build()
}
