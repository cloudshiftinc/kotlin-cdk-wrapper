@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup

@CdkDslMarker
public class CfnEndpointGroupPortOverridePropertyDsl {
  private val cdkBuilder: CfnEndpointGroup.PortOverrideProperty.Builder =
      CfnEndpointGroup.PortOverrideProperty.builder()

  public fun endpointPort(endpointPort: Number) {
    cdkBuilder.endpointPort(endpointPort)
  }

  public fun listenerPort(listenerPort: Number) {
    cdkBuilder.listenerPort(listenerPort)
  }

  public fun build(): CfnEndpointGroup.PortOverrideProperty = cdkBuilder.build()
}
