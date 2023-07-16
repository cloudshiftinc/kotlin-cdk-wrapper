@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.globalaccelerator.RawEndpointProps

@CdkDslMarker
public class RawEndpointPropsDsl {
  private val cdkBuilder: RawEndpointProps.Builder = RawEndpointProps.builder()

  public fun endpointId(endpointId: String) {
    cdkBuilder.endpointId(endpointId)
  }

  public fun preserveClientIp(preserveClientIp: Boolean) {
    cdkBuilder.preserveClientIp(preserveClientIp)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): RawEndpointProps = cdkBuilder.build()
}
