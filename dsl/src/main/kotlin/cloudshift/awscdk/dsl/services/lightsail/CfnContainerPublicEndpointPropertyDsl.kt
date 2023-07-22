@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnContainer

/**
 * `PublicEndpoint` is a property of the
 * [ContainerServiceDeployment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html)
 * property. It describes describes the settings of the public endpoint of a container on a container
 * service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * PublicEndpointProperty publicEndpointProperty = PublicEndpointProperty.builder()
 * .containerName("containerName")
 * .containerPort(123)
 * .healthCheckConfig(HealthCheckConfigProperty.builder()
 * .healthyThreshold(123)
 * .intervalSeconds(123)
 * .path("path")
 * .successCodes("successCodes")
 * .timeoutSeconds(123)
 * .unhealthyThreshold(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-publicendpoint.html)
 */
@CdkDslMarker
public class CfnContainerPublicEndpointPropertyDsl {
  private val cdkBuilder: CfnContainer.PublicEndpointProperty.Builder =
      CfnContainer.PublicEndpointProperty.builder()

  /**
   * @param containerName The name of the container entry of the deployment that the endpoint
   * configuration applies to.
   */
  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  /**
   * @param containerPort The port of the specified container to which traffic is forwarded to.
   */
  public fun containerPort(containerPort: Number) {
    cdkBuilder.containerPort(containerPort)
  }

  /**
   * @param healthCheckConfig An object that describes the health check configuration of the
   * container.
   */
  public fun healthCheckConfig(healthCheckConfig: IResolvable) {
    cdkBuilder.healthCheckConfig(healthCheckConfig)
  }

  /**
   * @param healthCheckConfig An object that describes the health check configuration of the
   * container.
   */
  public fun healthCheckConfig(healthCheckConfig: CfnContainer.HealthCheckConfigProperty) {
    cdkBuilder.healthCheckConfig(healthCheckConfig)
  }

  public fun build(): CfnContainer.PublicEndpointProperty = cdkBuilder.build()
}
