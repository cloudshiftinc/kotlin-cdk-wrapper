@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.PortOverride

@CdkDslMarker
public class PortOverrideDsl {
  private val cdkBuilder: PortOverride.Builder = PortOverride.builder()

  public fun endpointPort(endpointPort: Number) {
    cdkBuilder.endpointPort(endpointPort)
  }

  public fun listenerPort(listenerPort: Number) {
    cdkBuilder.listenerPort(listenerPort)
  }

  public fun build(): PortOverride = cdkBuilder.build()
}
