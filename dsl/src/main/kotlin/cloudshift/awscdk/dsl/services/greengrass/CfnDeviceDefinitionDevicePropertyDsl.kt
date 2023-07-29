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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition

/**
 * A device is an AWS IoT device (thing) that's added to a Greengrass group.
 *
 * Greengrass devices can communicate with the Greengrass core in the same group. For more
 * information, see
 * [What Is AWS IoT Greengrass ?](https://docs.aws.amazon.com/greengrass/latest/developerguide/what-is-gg.html)
 * in the *Developer Guide* .
 *
 * In an AWS CloudFormation template, the `Devices` property of the
 * [`DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html)
 * property type contains a list of `Device` property types.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * DeviceProperty deviceProperty = DeviceProperty.builder()
 * .certificateArn("certificateArn")
 * .id("id")
 * .thingArn("thingArn")
 * // the properties below are optional
 * .syncShadow(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
 */
@CdkDslMarker
public class CfnDeviceDefinitionDevicePropertyDsl {
    private val cdkBuilder: CfnDeviceDefinition.DeviceProperty.Builder =
        CfnDeviceDefinition.DeviceProperty.builder()

    /**
     * @param certificateArn The Amazon Resource Name (ARN) of the device certificate for the
     *   device. This X.509 certificate is used to authenticate the device with AWS IoT and AWS IoT
     *   Greengrass services.
     */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * @param id A descriptive or arbitrary ID for the device. This value must be unique within the
     *   device definition version. Maximum length is 128 characters with pattern `[a-zA-Z0-9:_-]+`
     *   .
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param syncShadow Indicates whether the device's local shadow is synced with the cloud
     *   automatically.
     */
    public fun syncShadow(syncShadow: Boolean) {
        cdkBuilder.syncShadow(syncShadow)
    }

    /**
     * @param syncShadow Indicates whether the device's local shadow is synced with the cloud
     *   automatically.
     */
    public fun syncShadow(syncShadow: IResolvable) {
        cdkBuilder.syncShadow(syncShadow)
    }

    /** @param thingArn The ARN of the device, which is an AWS IoT device (thing). */
    public fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
    }

    public fun build(): CfnDeviceDefinition.DeviceProperty = cdkBuilder.build()
}
