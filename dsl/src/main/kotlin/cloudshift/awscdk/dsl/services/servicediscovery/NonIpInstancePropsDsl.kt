@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicediscovery.IService
import software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps

@CdkDslMarker
public class NonIpInstancePropsDsl {
  private val cdkBuilder: NonIpInstanceProps.Builder = NonIpInstanceProps.builder()

  /**
   * @param customAttributes Custom attributes of the instance.
   */
  public fun customAttributes(customAttributes: Map<String, String>) {
    cdkBuilder.customAttributes(customAttributes)
  }

  /**
   * @param instanceId The id of the instance resource.
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * @param service The Cloudmap service this resource is registered to. 
   */
  public fun service(service: IService) {
    cdkBuilder.service(service)
  }

  public fun build(): NonIpInstanceProps = cdkBuilder.build()
}
