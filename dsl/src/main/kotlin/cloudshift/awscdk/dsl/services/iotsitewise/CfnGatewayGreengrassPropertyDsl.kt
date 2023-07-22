@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnGateway

/**
 * Contains details for a gateway that runs on AWS IoT Greengrass .
 *
 * To create a gateway that runs on AWS IoT Greengrass , you must add the IoT SiteWise connector to
 * a Greengrass group and deploy it. Your Greengrass group must also have permissions to upload data to
 * AWS IoT SiteWise . For more information, see [Ingesting data using a
 * gateway](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html) in the
 * *AWS IoT SiteWise User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * GreengrassProperty greengrassProperty = GreengrassProperty.builder()
 * .groupArn("groupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-greengrass.html)
 */
@CdkDslMarker
public class CfnGatewayGreengrassPropertyDsl {
  private val cdkBuilder: CfnGateway.GreengrassProperty.Builder =
      CfnGateway.GreengrassProperty.builder()

  /**
   * @param groupArn The
   * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the
   * Greengrass group. For more information about how to find a group's ARN, see
   * [ListGroups](https://docs.aws.amazon.com/greengrass/latest/apireference/listgroups-get.html) and
   * [GetGroup](https://docs.aws.amazon.com/greengrass/latest/apireference/getgroup-get.html) in the
   * *AWS IoT Greengrass API Reference* . 
   */
  public fun groupArn(groupArn: String) {
    cdkBuilder.groupArn(groupArn)
  }

  public fun build(): CfnGateway.GreengrassProperty = cdkBuilder.build()
}
