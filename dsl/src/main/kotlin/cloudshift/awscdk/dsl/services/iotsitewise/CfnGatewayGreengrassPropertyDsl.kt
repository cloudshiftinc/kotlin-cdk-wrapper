@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnGateway

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
