@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstance
import software.amazon.awscdk.services.servicediscovery.IService
import software.constructs.Construct

@CdkDslMarker
public class AliasTargetInstanceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: AliasTargetInstance.Builder = AliasTargetInstance.Builder.create(scope,
      id)

  /**
   * Custom attributes of the instance.
   *
   * Default: none
   *
   * @param customAttributes Custom attributes of the instance. 
   */
  public fun customAttributes(customAttributes: Map<String, String>) {
    cdkBuilder.customAttributes(customAttributes)
  }

  /**
   * DNS name of the target.
   *
   * @param dnsName DNS name of the target. 
   */
  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  /**
   * The id of the instance resource.
   *
   * Default: Automatically generated name
   *
   * @param instanceId The id of the instance resource. 
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * The Cloudmap service this resource is registered to.
   *
   * @param service The Cloudmap service this resource is registered to. 
   */
  public fun service(service: IService) {
    cdkBuilder.service(service)
  }

  public fun build(): AliasTargetInstance = cdkBuilder.build()
}
