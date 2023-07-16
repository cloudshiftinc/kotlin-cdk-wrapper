@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicediscovery.BaseInstanceProps

@CdkDslMarker
public class BaseInstancePropsDsl {
  private val cdkBuilder: BaseInstanceProps.Builder = BaseInstanceProps.builder()

  public fun customAttributes(customAttributes: Map<String, String>) {
    cdkBuilder.customAttributes(customAttributes)
  }

  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  public fun build(): BaseInstanceProps = cdkBuilder.build()
}
