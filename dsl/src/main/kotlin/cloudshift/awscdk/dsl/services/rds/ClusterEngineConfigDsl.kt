@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.rds.ClusterEngineConfig
import software.amazon.awscdk.services.rds.ClusterEngineFeatures
import software.amazon.awscdk.services.rds.IParameterGroup

@CdkDslMarker
public class ClusterEngineConfigDsl {
  private val cdkBuilder: ClusterEngineConfig.Builder = ClusterEngineConfig.builder()

  public fun features(block: ClusterEngineFeaturesDsl.() -> Unit = {}) {
    val builder = ClusterEngineFeaturesDsl()
    builder.apply(block)
    cdkBuilder.features(builder.build())
  }

  public fun features(features: ClusterEngineFeatures) {
    cdkBuilder.features(features)
  }

  public fun parameterGroup(parameterGroup: IParameterGroup) {
    cdkBuilder.parameterGroup(parameterGroup)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): ClusterEngineConfig = cdkBuilder.build()
}
