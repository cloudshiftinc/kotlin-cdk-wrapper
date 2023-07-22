@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

/**
 * The minimum and maximum number of network interfaces.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * NetworkInterfaceCountRequestProperty networkInterfaceCountRequestProperty =
 * NetworkInterfaceCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-networkinterfacecountrequest.html)
 */
@CdkDslMarker
public class CfnEC2FleetNetworkInterfaceCountRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.NetworkInterfaceCountRequestProperty.Builder =
      CfnEC2Fleet.NetworkInterfaceCountRequestProperty.builder()

  /**
   * @param max The maximum number of network interfaces.
   * To specify no maximum limit, omit this parameter.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum number of network interfaces.
   * To specify no minimum limit, omit this parameter.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnEC2Fleet.NetworkInterfaceCountRequestProperty = cdkBuilder.build()
}
