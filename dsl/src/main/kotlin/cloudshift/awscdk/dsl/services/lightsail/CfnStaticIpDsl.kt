@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnStaticIp
import software.constructs.Construct

@CdkDslMarker
public class CfnStaticIpDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStaticIp.Builder = CfnStaticIp.Builder.create(scope, id)

  /**
   * The instance that the static IP is attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html#cfn-lightsail-staticip-attachedto)
   * @param attachedTo The instance that the static IP is attached to. 
   */
  public fun attachedTo(attachedTo: String) {
    cdkBuilder.attachedTo(attachedTo)
  }

  /**
   * The name of the static IP.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html#cfn-lightsail-staticip-staticipname)
   * @param staticIpName The name of the static IP. 
   */
  public fun staticIpName(staticIpName: String) {
    cdkBuilder.staticIpName(staticIpName)
  }

  public fun build(): CfnStaticIp = cdkBuilder.build()
}
