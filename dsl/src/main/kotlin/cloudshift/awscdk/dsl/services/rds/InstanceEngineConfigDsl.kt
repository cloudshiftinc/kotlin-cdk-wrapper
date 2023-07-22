@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.rds.IOptionGroup
import software.amazon.awscdk.services.rds.InstanceEngineConfig
import software.amazon.awscdk.services.rds.InstanceEngineFeatures

@CdkDslMarker
public class InstanceEngineConfigDsl {
  private val cdkBuilder: InstanceEngineConfig.Builder = InstanceEngineConfig.builder()

  /**
   * @param features Features supported by the database engine.
   */
  public fun features(features: InstanceEngineFeaturesDsl.() -> Unit = {}) {
    val builder = InstanceEngineFeaturesDsl()
    builder.apply(features)
    cdkBuilder.features(builder.build())
  }

  /**
   * @param features Features supported by the database engine.
   */
  public fun features(features: InstanceEngineFeatures) {
    cdkBuilder.features(features)
  }

  /**
   * @param optionGroup Option group of the database.
   */
  public fun optionGroup(optionGroup: IOptionGroup) {
    cdkBuilder.optionGroup(optionGroup)
  }

  public fun build(): InstanceEngineConfig = cdkBuilder.build()
}
