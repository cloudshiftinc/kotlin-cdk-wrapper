@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnCluster

@CdkDslMarker
public class CfnClusterClusterSettingsPropertyDsl {
  private val cdkBuilder: CfnCluster.ClusterSettingsProperty.Builder =
      CfnCluster.ClusterSettingsProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnCluster.ClusterSettingsProperty = cdkBuilder.build()
}
