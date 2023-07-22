@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.servicediscovery.DiscoveryType
import software.amazon.awscdk.services.servicediscovery.DnsRecordType
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
import software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig
import software.amazon.awscdk.services.servicediscovery.INamespace
import software.amazon.awscdk.services.servicediscovery.RoutingPolicy
import software.amazon.awscdk.services.servicediscovery.Service
import software.constructs.Construct

/**
 * Define a CloudMap Service.
 *
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
public class ServiceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Service.Builder = Service.Builder.create(scope, id)

  /**
   * Structure containing failure threshold for a custom health checker.
   *
   * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
   * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
   *
   * Default: none
   *
   * @param customHealthCheck Structure containing failure threshold for a custom health checker. 
   */
  public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfigDsl.() -> Unit = {}) {
    val builder = HealthCheckCustomConfigDsl()
    builder.apply(customHealthCheck)
    cdkBuilder.customHealthCheck(builder.build())
  }

  /**
   * Structure containing failure threshold for a custom health checker.
   *
   * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
   * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
   *
   * Default: none
   *
   * @param customHealthCheck Structure containing failure threshold for a custom health checker. 
   */
  public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
    cdkBuilder.customHealthCheck(customHealthCheck)
  }

  /**
   * A description of the service.
   *
   * Default: none
   *
   * @param description A description of the service. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Controls how instances within this service can be discovered.
   *
   * Default: DNS_AND_API
   *
   * @param discoveryType Controls how instances within this service can be discovered. 
   */
  public fun discoveryType(discoveryType: DiscoveryType) {
    cdkBuilder.discoveryType(discoveryType)
  }

  /**
   * The DNS type of the record that you want AWS Cloud Map to create.
   *
   * Supported record types
   * include A, AAAA, A and AAAA (A_AAAA), CNAME, and SRV.
   *
   * Default: A
   *
   * @param dnsRecordType The DNS type of the record that you want AWS Cloud Map to create. 
   */
  public fun dnsRecordType(dnsRecordType: DnsRecordType) {
    cdkBuilder.dnsRecordType(dnsRecordType)
  }

  /**
   * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this
   * record.
   *
   * Default: Duration.minutes(1)
   *
   * @param dnsTtl The amount of time, in seconds, that you want DNS resolvers to cache the settings
   * for this record. 
   */
  public fun dnsTtl(dnsTtl: Duration) {
    cdkBuilder.dnsTtl(dnsTtl)
  }

  /**
   * Settings for an optional health check.
   *
   * If you specify health check settings, AWS Cloud Map associates the health
   * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
   * healthCheckCustomConfig can
   * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only register
   * IP instances to
   * this service.
   *
   * Default: none
   *
   * @param healthCheck Settings for an optional health check. 
   */
  public fun healthCheck(healthCheck: HealthCheckConfigDsl.() -> Unit = {}) {
    val builder = HealthCheckConfigDsl()
    builder.apply(healthCheck)
    cdkBuilder.healthCheck(builder.build())
  }

  /**
   * Settings for an optional health check.
   *
   * If you specify health check settings, AWS Cloud Map associates the health
   * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
   * healthCheckCustomConfig can
   * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only register
   * IP instances to
   * this service.
   *
   * Default: none
   *
   * @param healthCheck Settings for an optional health check. 
   */
  public fun healthCheck(healthCheck: HealthCheckConfig) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * Whether or not this service will have an Elastic LoadBalancer registered to it as an
   * AliasTargetInstance.
   *
   * Setting this to `true` correctly configures the `routingPolicy`
   * and performs some additional validation.
   *
   * Default: false
   *
   * @param loadBalancer Whether or not this service will have an Elastic LoadBalancer registered to
   * it as an AliasTargetInstance. 
   */
  public fun loadBalancer(loadBalancer: Boolean) {
    cdkBuilder.loadBalancer(loadBalancer)
  }

  /**
   * A name for the Service.
   *
   * Default: CloudFormation-generated name
   *
   * @param name A name for the Service. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The namespace that you want to use for DNS configuration.
   *
   * @param namespace The namespace that you want to use for DNS configuration. 
   */
  public fun namespace(namespace: INamespace) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * The routing policy that you want to apply to all DNS records that AWS Cloud Map creates when
   * you register an instance and specify this service.
   *
   * Default: WEIGHTED for CNAME records and when loadBalancer is true, MULTIVALUE otherwise
   *
   * @param routingPolicy The routing policy that you want to apply to all DNS records that AWS
   * Cloud Map creates when you register an instance and specify this service. 
   */
  public fun routingPolicy(routingPolicy: RoutingPolicy) {
    cdkBuilder.routingPolicy(routingPolicy)
  }

  public fun build(): Service = cdkBuilder.build()
}
