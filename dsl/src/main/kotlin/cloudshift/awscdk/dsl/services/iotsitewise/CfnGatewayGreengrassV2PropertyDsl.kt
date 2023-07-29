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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnGateway

/**
 * Contains details for a gateway that runs on AWS IoT Greengrass V2.
 *
 * To create a gateway that runs on AWS IoT Greengrass V2, you must deploy the IoT SiteWise Edge
 * component to your gateway device. Your
 * [Greengrass device role](https://docs.aws.amazon.com/greengrass/v2/developerguide/device-service-role.html)
 * must use the `AWSIoTSiteWiseEdgeAccess` policy. For more information, see
 * [Using AWS IoT SiteWise at the edge](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/sw-gateways.html)
 * in the *AWS IoT SiteWise User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * GreengrassV2Property greengrassV2Property = GreengrassV2Property.builder()
 * .coreDeviceThingName("coreDeviceThingName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-greengrassv2.html)
 */
@CdkDslMarker
public class CfnGatewayGreengrassV2PropertyDsl {
    private val cdkBuilder: CfnGateway.GreengrassV2Property.Builder =
        CfnGateway.GreengrassV2Property.builder()

    /**
     * @param coreDeviceThingName The name of the AWS IoT thing for your AWS IoT Greengrass V2 core
     *   device.
     */
    public fun coreDeviceThingName(coreDeviceThingName: String) {
        cdkBuilder.coreDeviceThingName(coreDeviceThingName)
    }

    public fun build(): CfnGateway.GreengrassV2Property = cdkBuilder.build()
}
