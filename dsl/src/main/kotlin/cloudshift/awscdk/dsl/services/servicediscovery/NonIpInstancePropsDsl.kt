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
import software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class NonIpInstancePropsDsl {
    private val cdkBuilder: NonIpInstanceProps.Builder = NonIpInstanceProps.builder()

    public fun customAttributes(customAttributes: Map<String, String>) {
        cdkBuilder.customAttributes(customAttributes)
    }

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun service(service: IService) {
        cdkBuilder.service(service)
    }

    public fun build(): NonIpInstanceProps = cdkBuilder.build()
}
