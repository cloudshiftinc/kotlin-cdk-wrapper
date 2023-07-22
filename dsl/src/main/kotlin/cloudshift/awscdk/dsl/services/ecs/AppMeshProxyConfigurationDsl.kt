@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration
import software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps

@CdkDslMarker
public class AppMeshProxyConfigurationDsl {
  private val cdkBuilder: AppMeshProxyConfiguration.Builder =
      AppMeshProxyConfiguration.Builder.create()

  /**
   * The name of the container that will serve as the App Mesh proxy.
   *
   * @param containerName The name of the container that will serve as the App Mesh proxy. 
   */
  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  /**
   * The set of network configuration parameters to provide the Container Network Interface (CNI)
   * plugin.
   *
   * @param properties The set of network configuration parameters to provide the Container Network
   * Interface (CNI) plugin. 
   */
  public fun properties(properties: AppMeshProxyConfigurationPropsDsl.() -> Unit = {}) {
    val builder = AppMeshProxyConfigurationPropsDsl()
    builder.apply(properties)
    cdkBuilder.properties(builder.build())
  }

  /**
   * The set of network configuration parameters to provide the Container Network Interface (CNI)
   * plugin.
   *
   * @param properties The set of network configuration parameters to provide the Container Network
   * Interface (CNI) plugin. 
   */
  public fun properties(properties: AppMeshProxyConfigurationProps) {
    cdkBuilder.properties(properties)
  }

  public fun build(): AppMeshProxyConfiguration = cdkBuilder.build()
}
