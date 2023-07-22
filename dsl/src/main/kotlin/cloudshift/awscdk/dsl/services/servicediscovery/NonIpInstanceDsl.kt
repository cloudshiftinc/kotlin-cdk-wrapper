@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicediscovery.IService
import software.amazon.awscdk.services.servicediscovery.NonIpInstance
import software.constructs.Construct

/**
 * Instance accessible using values other than an IP address or a domain name (CNAME).
 *
 * Specify the other values in Custom attributes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * Service service;
 * NonIpInstance nonIpInstance = NonIpInstance.Builder.create(this, "MyNonIpInstance")
 * .service(service)
 * // the properties below are optional
 * .customAttributes(Map.of(
 * "customAttributesKey", "customAttributes"))
 * .instanceId("instanceId")
 * .build();
 * ```
 */
@CdkDslMarker
public class NonIpInstanceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: NonIpInstance.Builder = NonIpInstance.Builder.create(scope, id)

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

  public fun build(): NonIpInstance = cdkBuilder.build()
}
