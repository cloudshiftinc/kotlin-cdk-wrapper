@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnInstanceProps

@CdkDslMarker
public class CfnInstancePropsDsl {
  private val cdkBuilder: CfnInstanceProps.Builder = CfnInstanceProps.builder()

  public fun instanceAttributes(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.instanceAttributes(builder.map)
  }

  public fun instanceAttributes(instanceAttributes: Any) {
    cdkBuilder.instanceAttributes(instanceAttributes)
  }

  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  public fun serviceId(serviceId: String) {
    cdkBuilder.serviceId(serviceId)
  }

  public fun build(): CfnInstanceProps = cdkBuilder.build()
}
