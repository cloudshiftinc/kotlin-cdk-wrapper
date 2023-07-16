@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicediscovery.CnameInstanceProps
import software.amazon.awscdk.services.servicediscovery.IService

@CdkDslMarker
public class CnameInstancePropsDsl {
  private val cdkBuilder: CnameInstanceProps.Builder = CnameInstanceProps.builder()

  public fun customAttributes(customAttributes: Map<String, String>) {
    cdkBuilder.customAttributes(customAttributes)
  }

  public fun instanceCname(instanceCname: String) {
    cdkBuilder.instanceCname(instanceCname)
  }

  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  public fun service(service: IService) {
    cdkBuilder.service(service)
  }

  public fun build(): CnameInstanceProps = cdkBuilder.build()
}
