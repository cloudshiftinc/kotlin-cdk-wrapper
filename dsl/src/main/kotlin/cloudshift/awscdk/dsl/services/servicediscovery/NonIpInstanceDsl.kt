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
import software.amazon.awscdk.services.servicediscovery.NonIpInstance
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class NonIpInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: NonIpInstance.Builder = NonIpInstance.Builder.create(scope, id)

    public fun customAttributes(customAttributes: Map<String, String>) {
        cdkBuilder.customAttributes(customAttributes)
    }

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun service(service: IService) {
        cdkBuilder.service(service)
    }

    public fun build(): NonIpInstance = cdkBuilder.build()
}
