@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup

@CdkDslMarker
public class CfnEndpointGroupPortOverridePropertyDsl {
  private val cdkBuilder: CfnEndpointGroup.PortOverrideProperty.Builder =
      CfnEndpointGroup.PortOverrideProperty.builder()

  /**
   * @param endpointPort The endpoint port that you want a listener port to be mapped to. 
   * This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
   */
  public fun endpointPort(endpointPort: Number) {
    cdkBuilder.endpointPort(endpointPort)
  }

  /**
   * @param listenerPort The listener port that you want to map to a specific endpoint port. 
   * This is the port that user traffic arrives to the Global Accelerator on.
   */
  public fun listenerPort(listenerPort: Number) {
    cdkBuilder.listenerPort(listenerPort)
  }

  public fun build(): CfnEndpointGroup.PortOverrideProperty = cdkBuilder.build()
}
