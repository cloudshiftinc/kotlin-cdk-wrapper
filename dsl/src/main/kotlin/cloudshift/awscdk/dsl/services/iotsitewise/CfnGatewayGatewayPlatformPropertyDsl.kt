@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnGateway

/**
 * Contains a gateway's platform information.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * GatewayPlatformProperty gatewayPlatformProperty = GatewayPlatformProperty.builder()
 * .greengrass(GreengrassProperty.builder()
 * .groupArn("groupArn")
 * .build())
 * .greengrassV2(GreengrassV2Property.builder()
 * .coreDeviceThingName("coreDeviceThingName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewayplatform.html)
 */
@CdkDslMarker
public class CfnGatewayGatewayPlatformPropertyDsl {
  private val cdkBuilder: CfnGateway.GatewayPlatformProperty.Builder =
      CfnGateway.GatewayPlatformProperty.builder()

  /**
   * @param greengrass A gateway that runs on AWS IoT Greengrass .
   */
  public fun greengrass(greengrass: IResolvable) {
    cdkBuilder.greengrass(greengrass)
  }

  /**
   * @param greengrass A gateway that runs on AWS IoT Greengrass .
   */
  public fun greengrass(greengrass: CfnGateway.GreengrassProperty) {
    cdkBuilder.greengrass(greengrass)
  }

  /**
   * @param greengrassV2 A gateway that runs on AWS IoT Greengrass V2.
   */
  public fun greengrassV2(greengrassV2: IResolvable) {
    cdkBuilder.greengrassV2(greengrassV2)
  }

  /**
   * @param greengrassV2 A gateway that runs on AWS IoT Greengrass V2.
   */
  public fun greengrassV2(greengrassV2: CfnGateway.GreengrassV2Property) {
    cdkBuilder.greengrassV2(greengrassV2)
  }

  public fun build(): CfnGateway.GatewayPlatformProperty = cdkBuilder.build()
}
