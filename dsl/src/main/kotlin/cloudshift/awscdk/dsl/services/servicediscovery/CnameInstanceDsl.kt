@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicediscovery.CnameInstance
import software.amazon.awscdk.services.servicediscovery.IService
import software.constructs.Construct

/**
 * Instance that is accessible using a domain name (CNAME).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * Service service;
 * CnameInstance cnameInstance = CnameInstance.Builder.create(this, "MyCnameInstance")
 * .instanceCname("instanceCname")
 * .service(service)
 * // the properties below are optional
 * .customAttributes(Map.of(
 * "customAttributesKey", "customAttributes"))
 * .instanceId("instanceId")
 * .build();
 * ```
 */
@CdkDslMarker
public class CnameInstanceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CnameInstance.Builder = CnameInstance.Builder.create(scope, id)

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
   * If the service configuration includes a CNAME record, the domain name that you want Route 53 to
   * return in response to DNS queries, for example, example.com. This value is required if the service
   * specified by ServiceId includes settings for an CNAME record.
   *
   * @param instanceCname If the service configuration includes a CNAME record, the domain name that
   * you want Route 53 to return in response to DNS queries, for example, example.com. This value is
   * required if the service specified by ServiceId includes settings for an CNAME record. 
   */
  public fun instanceCname(instanceCname: String) {
    cdkBuilder.instanceCname(instanceCname)
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

  public fun build(): CnameInstance = cdkBuilder.build()
}
