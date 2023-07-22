@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.CfnService

@CdkDslMarker
public class CfnServiceHealthCheckConfigPropertyDsl {
  private val cdkBuilder: CfnService.HealthCheckConfigProperty.Builder =
      CfnService.HealthCheckConfigProperty.builder()

  /**
   * @param failureThreshold The number of consecutive health checks that an endpoint must pass or
   * fail for Route 53 to change the current status of the endpoint from unhealthy to healthy or the
   * other way around.
   * For more information, see [How Route 53 Determines Whether an Endpoint Is
   * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
   * in the *Route 53 Developer Guide* .
   */
  public fun failureThreshold(failureThreshold: Number) {
    cdkBuilder.failureThreshold(failureThreshold)
  }

  /**
   * @param resourcePath The path that you want Route 53 to request when performing health checks.
   * The path can be any value that your endpoint returns an HTTP status code of a 2xx or 3xx format
   * for when the endpoint is healthy. An example file is `/docs/route53-health-check.html` . Route 53
   * automatically adds the DNS name for the service. If you don't specify a value for `ResourcePath` ,
   * the default value is `/` .
   *
   * If you specify `TCP` for `Type` , you must *not* specify a value for `ResourcePath` .
   */
  public fun resourcePath(resourcePath: String) {
    cdkBuilder.resourcePath(resourcePath)
  }

  /**
   * @param type The type of health check that you want to create, which indicates how Route 53
   * determines whether an endpoint is healthy. 
   *
   * You can't change the value of `Type` after you create a health check.
   *
   *
   * You can create the following types of health checks:
   *
   * * *HTTP* : Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
   * HTTP request and waits for an HTTP status code of 200 or greater and less than 400.
   * * *HTTPS* : Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
   * HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.
   *
   *
   * If you specify HTTPS for the value of `Type` , the endpoint must support TLS v1.0 or later.
   *
   *
   * * *TCP* : Route 53 tries to establish a TCP connection.
   *
   * If you specify `TCP` for `Type` , don't specify a value for `ResourcePath` .
   *
   * For more information, see [How Route 53 Determines Whether an Endpoint Is
   * Healthy](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html)
   * in the *Route 53 Developer Guide* .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnService.HealthCheckConfigProperty = cdkBuilder.build()
}
