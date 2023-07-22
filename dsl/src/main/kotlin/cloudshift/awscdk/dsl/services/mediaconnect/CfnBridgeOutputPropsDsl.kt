@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps

/**
 * Properties for defining a `CfnBridgeOutput`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * CfnBridgeOutputProps cfnBridgeOutputProps = CfnBridgeOutputProps.builder()
 * .bridgeArn("bridgeArn")
 * .name("name")
 * .networkOutput(BridgeNetworkOutputProperty.builder()
 * .ipAddress("ipAddress")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .ttl(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html)
 */
@CdkDslMarker
public class CfnBridgeOutputPropsDsl {
  private val cdkBuilder: CfnBridgeOutputProps.Builder = CfnBridgeOutputProps.builder()

  /**
   * @param bridgeArn The ARN of the bridge that you want to describe. 
   */
  public fun bridgeArn(bridgeArn: String) {
    cdkBuilder.bridgeArn(bridgeArn)
  }

  /**
   * @param name The network output name. 
   * This name is used to reference the output and must be unique among outputs in this bridge.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param networkOutput Add a network output to an existing bridge. 
   */
  public fun networkOutput(networkOutput: IResolvable) {
    cdkBuilder.networkOutput(networkOutput)
  }

  /**
   * @param networkOutput Add a network output to an existing bridge. 
   */
  public fun networkOutput(networkOutput: CfnBridgeOutput.BridgeNetworkOutputProperty) {
    cdkBuilder.networkOutput(networkOutput)
  }

  public fun build(): CfnBridgeOutputProps = cdkBuilder.build()
}
