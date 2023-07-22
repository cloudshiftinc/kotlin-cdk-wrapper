@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps

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
 * .dnsRecordType(DnsRecordType.A)
 * .dnsTtl(Duration.seconds(30))
 * .healthCheck(HealthCheckConfig.builder()
 * .type(HealthCheckType.HTTPS)
 * .resourcePath("/healthcheck")
 * .failureThreshold(2)
 * .build())
 * .build());
 * service.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
 * .ipv4("54.239.25.192")
 * .port(443)
 * .build());
 * app.synth();
 * ```
 */
@CdkDslMarker
public class PublicDnsNamespacePropsDsl {
  private val cdkBuilder: PublicDnsNamespaceProps.Builder = PublicDnsNamespaceProps.builder()

  /**
   * @param description A description of the Namespace.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name A name for the Namespace. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): PublicDnsNamespaceProps = cdkBuilder.build()
}
