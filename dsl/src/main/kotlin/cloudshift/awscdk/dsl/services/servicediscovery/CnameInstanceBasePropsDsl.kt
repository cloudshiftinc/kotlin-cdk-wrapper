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
import software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CnameInstanceBasePropsDsl {
    private val cdkBuilder: CnameInstanceBaseProps.Builder = CnameInstanceBaseProps.builder()

    public fun customAttributes(customAttributes: Map<String, String>) {
        cdkBuilder.customAttributes(customAttributes)
    }

    public fun instanceCname(instanceCname: String) {
        cdkBuilder.instanceCname(instanceCname)
    }

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun build(): CnameInstanceBaseProps = cdkBuilder.build()
}
