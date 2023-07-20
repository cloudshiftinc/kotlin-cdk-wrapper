@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps
import software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps

@CdkDslMarker
public class AppMeshProxyConfigurationConfigPropsDsl {
  private val cdkBuilder: AppMeshProxyConfigurationConfigProps.Builder =
      AppMeshProxyConfigurationConfigProps.builder()

  public fun containerName(containerName: String) {
    cdkBuilder.containerName(containerName)
  }

  public fun properties(block: AppMeshProxyConfigurationPropsDsl.() -> Unit = {}) {
    val builder = AppMeshProxyConfigurationPropsDsl()
    builder.apply(block)
    cdkBuilder.properties(builder.build())
  }

  public fun properties(properties: AppMeshProxyConfigurationProps) {
    cdkBuilder.properties(properties)
  }

  public fun build(): AppMeshProxyConfigurationConfigProps = cdkBuilder.build()
}
