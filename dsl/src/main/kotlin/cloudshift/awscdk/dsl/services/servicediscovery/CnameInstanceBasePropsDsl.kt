@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps

/**
 * Example:
 *
 * ```
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.*;
 * App app = new App();
 * Stack stack = new Stack(app, "aws-servicediscovery-integ");
 * PublicDnsNamespace namespace = PublicDnsNamespace.Builder.create(stack, "Namespace")
 * .name("foobar.com")
 * .build();
 * Service service = namespace.createService("Service", DnsServiceProps.builder()
 * .name("foo")
 * .dnsRecordType(DnsRecordType.CNAME)
 * .dnsTtl(Duration.seconds(30))
 * .build());
 * service.registerCnameInstance("CnameInstance", CnameInstanceBaseProps.builder()
 * .instanceCname("service.pizza")
 * .build());
 * app.synth();
 * ```
 */
@CdkDslMarker
public class CnameInstanceBasePropsDsl {
  private val cdkBuilder: CnameInstanceBaseProps.Builder = CnameInstanceBaseProps.builder()

  /**
   * @param customAttributes Custom attributes of the instance.
   */
  public fun customAttributes(customAttributes: Map<String, String>) {
    cdkBuilder.customAttributes(customAttributes)
  }

  /**
   * @param instanceCname If the service configuration includes a CNAME record, the domain name that
   * you want Route 53 to return in response to DNS queries, for example, example.com. This value is
   * required if the service specified by ServiceId includes settings for an CNAME record. 
   */
  public fun instanceCname(instanceCname: String) {
    cdkBuilder.instanceCname(instanceCname)
  }

  /**
   * @param instanceId The id of the instance resource.
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  public fun build(): CnameInstanceBaseProps = cdkBuilder.build()
}
