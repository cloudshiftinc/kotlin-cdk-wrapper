@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnThingGroup

/**
 * Thing group properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * ThingGroupPropertiesProperty thingGroupPropertiesProperty =
 * ThingGroupPropertiesProperty.builder()
 * .attributePayload(AttributePayloadProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .build())
 * .thingGroupDescription("thingGroupDescription")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thinggroup-thinggroupproperties.html)
 */
@CdkDslMarker
public class CfnThingGroupThingGroupPropertiesPropertyDsl {
    private val cdkBuilder: CfnThingGroup.ThingGroupPropertiesProperty.Builder =
        CfnThingGroup.ThingGroupPropertiesProperty.builder()

    /** @param attributePayload The thing group attributes in JSON format. */
    public fun attributePayload(attributePayload: IResolvable) {
        cdkBuilder.attributePayload(attributePayload)
    }

    /** @param attributePayload The thing group attributes in JSON format. */
    public fun attributePayload(attributePayload: CfnThingGroup.AttributePayloadProperty) {
        cdkBuilder.attributePayload(attributePayload)
    }

    /** @param thingGroupDescription The thing group description. */
    public fun thingGroupDescription(thingGroupDescription: String) {
        cdkBuilder.thingGroupDescription(thingGroupDescription)
    }

    public fun build(): CfnThingGroup.ThingGroupPropertiesProperty = cdkBuilder.build()
}
