@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnStaticIpProps

@CdkDslMarker
public class CfnStaticIpPropsDsl {
  private val cdkBuilder: CfnStaticIpProps.Builder = CfnStaticIpProps.builder()

  /**
   * @param attachedTo The instance that the static IP is attached to.
   */
  public fun attachedTo(attachedTo: String) {
    cdkBuilder.attachedTo(attachedTo)
  }

  /**
   * @param staticIpName The name of the static IP. 
   */
  public fun staticIpName(staticIpName: String) {
    cdkBuilder.staticIpName(staticIpName)
  }

  public fun build(): CfnStaticIpProps = cdkBuilder.build()
}
