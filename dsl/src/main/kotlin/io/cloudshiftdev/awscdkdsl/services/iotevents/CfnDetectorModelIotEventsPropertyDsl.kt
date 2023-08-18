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

package io.cloudshiftdev.awscdkdsl.services.iotevents

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

/**
 * Sends an AWS IoT Events input, passing in information about the detector model instance and the
 * event that triggered the action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * IotEventsProperty iotEventsProperty = IotEventsProperty.builder()
 * .inputName("inputName")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html)
 */
@CdkDslMarker
public class CfnDetectorModelIotEventsPropertyDsl {
    private val cdkBuilder: CfnDetectorModel.IotEventsProperty.Builder =
        CfnDetectorModel.IotEventsProperty.builder()

    /** @param inputName The name of the AWS IoT Events input where the data is sent. */
    public fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
    }

    /**
     * @param payload You can configure the action payload when you send a message to an AWS IoT
     *   Events input.
     */
    public fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload)
    }

    /**
     * @param payload You can configure the action payload when you send a message to an AWS IoT
     *   Events input.
     */
    public fun payload(payload: CfnDetectorModel.PayloadProperty) {
        cdkBuilder.payload(payload)
    }

    public fun build(): CfnDetectorModel.IotEventsProperty = cdkBuilder.build()
}
