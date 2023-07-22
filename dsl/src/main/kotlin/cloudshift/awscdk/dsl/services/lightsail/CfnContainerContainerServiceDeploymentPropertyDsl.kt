@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnContainer

/**
 * `ContainerServiceDeployment` is a property of the
 * [AWS::Lightsail::Container](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-container.html)
 * resource. It describes a container deployment configuration of a container service.
 *
 * A deployment specifies the settings, such as the ports and launch command, of containers that are
 * deployed to your container service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * ContainerServiceDeploymentProperty containerServiceDeploymentProperty =
 * ContainerServiceDeploymentProperty.builder()
 * .containers(List.of(ContainerProperty.builder()
 * .command(List.of("command"))
 * .containerName("containerName")
 * .environment(List.of(EnvironmentVariableProperty.builder()
 * .value("value")
 * .variable("variable")
 * .build()))
 * .image("image")
 * .ports(List.of(PortInfoProperty.builder()
 * .port("port")
 * .protocol("protocol")
 * .build()))
 * .build()))
 * .publicEndpoint(PublicEndpointProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-containerservicedeployment.html)
 */
@CdkDslMarker
public class CfnContainerContainerServiceDeploymentPropertyDsl {
  private val cdkBuilder: CfnContainer.ContainerServiceDeploymentProperty.Builder =
      CfnContainer.ContainerServiceDeploymentProperty.builder()

  private val _containers: MutableList<Any> = mutableListOf()

  /**
   * @param containers An object that describes the configuration for the containers of the
   * deployment.
   */
  public fun containers(vararg containers: Any) {
    _containers.addAll(listOf(*containers))
  }

  /**
   * @param containers An object that describes the configuration for the containers of the
   * deployment.
   */
  public fun containers(containers: Collection<Any>) {
    _containers.addAll(containers)
  }

  /**
   * @param containers An object that describes the configuration for the containers of the
   * deployment.
   */
  public fun containers(containers: IResolvable) {
    cdkBuilder.containers(containers)
  }

  /**
   * @param publicEndpoint An object that describes the endpoint of the deployment.
   */
  public fun publicEndpoint(publicEndpoint: IResolvable) {
    cdkBuilder.publicEndpoint(publicEndpoint)
  }

  /**
   * @param publicEndpoint An object that describes the endpoint of the deployment.
   */
  public fun publicEndpoint(publicEndpoint: CfnContainer.PublicEndpointProperty) {
    cdkBuilder.publicEndpoint(publicEndpoint)
  }

  public fun build(): CfnContainer.ContainerServiceDeploymentProperty {
    if(_containers.isNotEmpty()) cdkBuilder.containers(_containers)
    return cdkBuilder.build()
  }
}
