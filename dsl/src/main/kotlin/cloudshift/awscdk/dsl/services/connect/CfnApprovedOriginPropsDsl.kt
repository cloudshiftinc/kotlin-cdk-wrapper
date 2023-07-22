@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnApprovedOriginProps

@CdkDslMarker
public class CfnApprovedOriginPropsDsl {
  private val cdkBuilder: CfnApprovedOriginProps.Builder = CfnApprovedOriginProps.builder()

  /**
   * @param instanceId The Amazon Resource Name (ARN) of the instance. 
   * *Minimum* : `1`
   *
   * *Maximum* : `100`
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * @param origin Domain name to be added to the allow-list of the instance. 
   * *Maximum* : `267`
   */
  public fun origin(origin: String) {
    cdkBuilder.origin(origin)
  }

  public fun build(): CfnApprovedOriginProps = cdkBuilder.build()
}
