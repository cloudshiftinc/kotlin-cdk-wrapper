@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps

@CdkDslMarker
public class IpInstanceBasePropsDsl {
  private val cdkBuilder: IpInstanceBaseProps.Builder = IpInstanceBaseProps.builder()

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
   * @param ipv4 If the service that you specify contains a template for an A record, the IPv4
   * address that you want AWS Cloud Map to use for the value of the A record.
   */
  public fun ipv4(ipv4: String) {
    cdkBuilder.ipv4(ipv4)
  }

  /**
   * @param ipv6 If the service that you specify contains a template for an AAAA record, the IPv6
   * address that you want AWS Cloud Map to use for the value of the AAAA record.
   */
  public fun ipv6(ipv6: String) {
    cdkBuilder.ipv6(ipv6)
  }

  /**
   * @param port The port on the endpoint that you want AWS Cloud Map to perform health checks on.
   * This value is also used for
   * the port value in an SRV record if the service that you specify includes an SRV record. You can
   * also specify a
   * default port that is applied to all instances in the Service configuration.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): IpInstanceBaseProps = cdkBuilder.build()
}
