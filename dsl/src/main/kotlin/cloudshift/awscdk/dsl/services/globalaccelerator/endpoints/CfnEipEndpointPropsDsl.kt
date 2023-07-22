@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpointProps

@CdkDslMarker
public class CfnEipEndpointPropsDsl {
  private val cdkBuilder: CfnEipEndpointProps.Builder = CfnEipEndpointProps.builder()

  /**
   * @param weight Endpoint weight across all endpoints in the group.
   * Must be a value between 0 and 255.
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnEipEndpointProps = cdkBuilder.build()
}
