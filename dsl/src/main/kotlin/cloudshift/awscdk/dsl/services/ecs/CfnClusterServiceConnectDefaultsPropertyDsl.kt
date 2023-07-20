@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnCluster

@CdkDslMarker
public class CfnClusterServiceConnectDefaultsPropertyDsl {
  private val cdkBuilder: CfnCluster.ServiceConnectDefaultsProperty.Builder =
      CfnCluster.ServiceConnectDefaultsProperty.builder()

  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun build(): CfnCluster.ServiceConnectDefaultsProperty = cdkBuilder.build()
}
