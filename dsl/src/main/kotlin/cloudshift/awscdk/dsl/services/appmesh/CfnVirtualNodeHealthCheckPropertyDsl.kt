@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the health check policy for a virtual node's listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HealthCheckProperty healthCheckProperty = HealthCheckProperty.builder()
 * .healthyThreshold(123)
 * .intervalMillis(123)
 * .protocol("protocol")
 * .timeoutMillis(123)
 * .unhealthyThreshold(123)
 * // the properties below are optional
 * .path("path")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html)
 */
@CdkDslMarker
public class CfnVirtualNodeHealthCheckPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.HealthCheckProperty.Builder =
      CfnVirtualNode.HealthCheckProperty.builder()

  /**
   * @param healthyThreshold The number of consecutive successful health checks that must occur
   * before declaring listener healthy. 
   */
  public fun healthyThreshold(healthyThreshold: Number) {
    cdkBuilder.healthyThreshold(healthyThreshold)
  }

  /**
   * @param intervalMillis The time period in milliseconds between each health check execution. 
   */
  public fun intervalMillis(intervalMillis: Number) {
    cdkBuilder.intervalMillis(intervalMillis)
  }

  /**
   * @param path The destination path for the health check request.
   * This value is only used if the specified protocol is HTTP or HTTP/2. For any other protocol,
   * this value is ignored.
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * @param port The destination port for the health check request.
   * This port must match the port defined in the `PortMapping` for the listener.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The protocol for the health check request. 
   * If you specify `grpc` , then your service must conform to the [GRPC Health Checking
   * Protocol](https://docs.aws.amazon.com/https://github.com/grpc/grpc/blob/master/doc/health-checking.md)
   * .
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param timeoutMillis The amount of time to wait when receiving a response from the health
   * check, in milliseconds. 
   */
  public fun timeoutMillis(timeoutMillis: Number) {
    cdkBuilder.timeoutMillis(timeoutMillis)
  }

  /**
   * @param unhealthyThreshold The number of consecutive failed health checks that must occur before
   * declaring a virtual node unhealthy. 
   */
  public fun unhealthyThreshold(unhealthyThreshold: Number) {
    cdkBuilder.unhealthyThreshold(unhealthyThreshold)
  }

  public fun build(): CfnVirtualNode.HealthCheckProperty = cdkBuilder.build()
}
