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

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicediscovery.IService
import software.amazon.awscdk.services.servicediscovery.IpInstance
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class IpInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: IpInstance.Builder = IpInstance.Builder.create(scope, id)

    public fun customAttributes(customAttributes: Map<String, String>) {
        cdkBuilder.customAttributes(customAttributes)
    }

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun ipv4(ipv4: String) {
        cdkBuilder.ipv4(ipv4)
    }

    public fun ipv6(ipv6: String) {
        cdkBuilder.ipv6(ipv6)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun service(service: IService) {
        cdkBuilder.service(service)
    }

    public fun build(): IpInstance = cdkBuilder.build()
}
