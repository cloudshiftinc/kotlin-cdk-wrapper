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

  /**
   * @param features Features supported by the database engine.
   */
  public fun features(features: ClusterEngineFeaturesDsl.() -> Unit = {}) {
    val builder = ClusterEngineFeaturesDsl()
    builder.apply(features)
    cdkBuilder.features(builder.build())
  }

  /**
   * @param features Features supported by the database engine.
   */
  public fun features(features: ClusterEngineFeatures) {
    cdkBuilder.features(features)
  }

  /**
   * @param parameterGroup The ParameterGroup to use for the cluster.
   */
  public fun parameterGroup(parameterGroup: IParameterGroup) {
    cdkBuilder.parameterGroup(parameterGroup)
  }

  /**
   * @param port The port to use for this cluster, unless the customer specified the port directly.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): ClusterEngineConfig = cdkBuilder.build()
}
