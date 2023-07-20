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
import software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class NonIpInstanceBasePropsDsl {
    private val cdkBuilder: NonIpInstanceBaseProps.Builder = NonIpInstanceBaseProps.builder()

    public fun customAttributes(customAttributes: Map<String, String>) {
        cdkBuilder.customAttributes(customAttributes)
    }

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun build(): NonIpInstanceBaseProps = cdkBuilder.build()
}
