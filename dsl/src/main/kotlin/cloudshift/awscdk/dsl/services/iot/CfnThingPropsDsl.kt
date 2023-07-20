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
import software.amazon.awscdk.services.iot.CfnThing
import software.amazon.awscdk.services.iot.CfnThingProps
import kotlin.String

@CdkDslMarker
public class CfnThingPropsDsl {
    private val cdkBuilder: CfnThingProps.Builder = CfnThingProps.builder()

    public fun attributePayload(attributePayload: IResolvable) {
        cdkBuilder.attributePayload(attributePayload)
    }

    public fun attributePayload(attributePayload: CfnThing.AttributePayloadProperty) {
        cdkBuilder.attributePayload(attributePayload)
    }

    public fun thingName(thingName: String) {
        cdkBuilder.thingName(thingName)
    }

    public fun build(): CfnThingProps = cdkBuilder.build()
}
