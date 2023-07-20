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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.servicediscovery.CfnInstance
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInstance.Builder = CfnInstance.Builder.create(scope, id)

    public fun instanceAttributes(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.instanceAttributes(builder.map)
    }

    public fun instanceAttributes(instanceAttributes: Any) {
        cdkBuilder.instanceAttributes(instanceAttributes)
    }

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun serviceId(serviceId: String) {
        cdkBuilder.serviceId(serviceId)
    }

    public fun build(): CfnInstance = cdkBuilder.build()
}
