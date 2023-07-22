@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps
import software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps

/**
 * The configuration to use when setting an App Mesh proxy configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * AppMeshProxyConfigurationConfigProps appMeshProxyConfigurationConfigProps =
 * AppMeshProxyConfigurationConfigProps.builder()
 * .containerName("containerName")
 * .properties(AppMeshProxyConfigurationProps.builder()
 * .appPorts(List.of(123))
 * .proxyEgressPort(123)
 * .proxyIngressPort(123)
 * // the properties below are optional
 * .egressIgnoredIPs(List.of("egressIgnoredIPs"))
 * .egressIgnoredPorts(List.of(123))
 * .ignoredGID(123)
 * .ignoredUID(123)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class AppMeshProxyConfigurationConfigPropsDsl {
  private val cdkBuilder: AppMeshProxyConfigurationConfigProps.Builder =
      AppMeshProxyConfigurationConfigProps.builder()

  /**
   * @param containerName The name of the container that will serve as the App Mesh proxy. 
   */
  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  /**
   * @param properties The set of network configuration parameters to provide the Container Network
   * Interface (CNI) plugin. 
   */
  public fun properties(properties: AppMeshProxyConfigurationPropsDsl.() -> Unit = {}) {
    val builder = AppMeshProxyConfigurationPropsDsl()
    builder.apply(properties)
    cdkBuilder.properties(builder.build())
  }

  /**
   * @param properties The set of network configuration parameters to provide the Container Network
   * Interface (CNI) plugin. 
   */
  public fun properties(properties: AppMeshProxyConfigurationProps) {
    cdkBuilder.properties(properties)
  }

  public fun build(): AppMeshProxyConfigurationConfigProps = cdkBuilder.build()
}
