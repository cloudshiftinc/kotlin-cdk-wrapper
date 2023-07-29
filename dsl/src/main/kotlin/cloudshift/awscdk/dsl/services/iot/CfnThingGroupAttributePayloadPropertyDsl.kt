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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnThingGroup

/**
 * The attribute payload.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * AttributePayloadProperty attributePayloadProperty = AttributePayloadProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thinggroup-attributepayload.html)
 */
@CdkDslMarker
public class CfnThingGroupAttributePayloadPropertyDsl {
    private val cdkBuilder: CfnThingGroup.AttributePayloadProperty.Builder =
        CfnThingGroup.AttributePayloadProperty.builder()

    /**
     * @param attributes A JSON string containing up to three key-value pair in JSON format. For
     *   example:. `{\"attributes\":{\"string1\":\"string2\"}}`
     */
    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param attributes A JSON string containing up to three key-value pair in JSON format. For
     *   example:. `{\"attributes\":{\"string1\":\"string2\"}}`
     */
    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    public fun build(): CfnThingGroup.AttributePayloadProperty = cdkBuilder.build()
}
