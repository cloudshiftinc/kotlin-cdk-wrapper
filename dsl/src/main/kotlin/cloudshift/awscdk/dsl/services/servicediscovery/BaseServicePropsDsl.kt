@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.BaseServiceProps
import software.amazon.awscdk.services.servicediscovery.HealthCheckConfig
import software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig

@CdkDslMarker
public class BaseServicePropsDsl {
  private val cdkBuilder: BaseServiceProps.Builder = BaseServiceProps.builder()

  /**
   * @param customHealthCheck Structure containing failure threshold for a custom health checker.
   * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
   * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
   */
  public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfigDsl.() -> Unit = {}) {
    val builder = HealthCheckCustomConfigDsl()
    builder.apply(customHealthCheck)
    cdkBuilder.customHealthCheck(builder.build())
  }

  /**
   * @param customHealthCheck Structure containing failure threshold for a custom health checker.
   * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
   * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
   */
  public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
    cdkBuilder.customHealthCheck(customHealthCheck)
  }

  /**
   * @param description A description of the service.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param healthCheck Settings for an optional health check.
   * If you specify health check settings, AWS Cloud Map associates the health
   * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
   * healthCheckCustomConfig can
   * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only register
   * IP instances to
   * this service.
   */
  public fun healthCheck(healthCheck: HealthCheckConfigDsl.() -> Unit = {}) {
    val builder = HealthCheckConfigDsl()
    builder.apply(healthCheck)
    cdkBuilder.healthCheck(builder.build())
  }

  /**
   * @param healthCheck Settings for an optional health check.
   * If you specify health check settings, AWS Cloud Map associates the health
   * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
   * healthCheckCustomConfig can
   * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only register
   * IP instances to
   * this service.
   */
  public fun healthCheck(healthCheck: HealthCheckConfig) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * @param name A name for the Service.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): BaseServiceProps = cdkBuilder.build()
}
