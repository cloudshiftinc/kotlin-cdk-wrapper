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
import software.amazon.awscdk.services.iot.CfnThing
import software.constructs.Construct

/**
 * Use the `AWS::IoT::Thing` resource to declare an AWS IoT thing.
 *
 * For information about working with things, see
 * [How AWS IoT Works](https://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html)
 * and
 * [Device Registry for AWS IoT](https://docs.aws.amazon.com/iot/latest/developerguide/thing-registry.html)
 * in the *AWS IoT Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnThing cfnThing = CfnThing.Builder.create(this, "MyCfnThing")
 * .attributePayload(AttributePayloadProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .build())
 * .thingName("thingName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html)
 */
@CdkDslMarker
public class CfnThingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnThing.Builder = CfnThing.Builder.create(scope, id)

    /**
     * A string that contains up to three key value pairs.
     *
     * Maximum length of 800. Duplicates not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
     *
     * @param attributePayload A string that contains up to three key value pairs.
     */
    public fun attributePayload(attributePayload: IResolvable) {
        cdkBuilder.attributePayload(attributePayload)
    }

    /**
     * A string that contains up to three key value pairs.
     *
     * Maximum length of 800. Duplicates not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-attributepayload)
     *
     * @param attributePayload A string that contains up to three key value pairs.
     */
    public fun attributePayload(attributePayload: CfnThing.AttributePayloadProperty) {
        cdkBuilder.attributePayload(attributePayload)
    }

    /**
     * The name of the thing to update.
     *
     * You can't change a thing's name. To change a thing's name, you must create a new thing, give
     * it the new name, and then delete the old thing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html#cfn-iot-thing-thingname)
     *
     * @param thingName The name of the thing to update.
     */
    public fun thingName(thingName: String) {
        cdkBuilder.thingName(thingName)
    }

    public fun build(): CfnThing = cdkBuilder.build()
}
