@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnContainer

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
