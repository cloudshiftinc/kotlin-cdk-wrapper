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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnThingGroup
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnThingGroupAttributePayloadPropertyDsl {
    private val cdkBuilder: CfnThingGroup.AttributePayloadProperty.Builder =
        CfnThingGroup.AttributePayloadProperty.builder()

    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    public fun build(): CfnThingGroup.AttributePayloadProperty = cdkBuilder.build()
}
