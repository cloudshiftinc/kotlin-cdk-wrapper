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

  public fun features(block: InstanceEngineFeaturesDsl.() -> Unit = {}) {
    val builder = InstanceEngineFeaturesDsl()
    builder.apply(block)
    cdkBuilder.features(builder.build())
  }

  public fun features(features: InstanceEngineFeatures) {
    cdkBuilder.features(features)
  }

  public fun optionGroup(optionGroup: IOptionGroup) {
    cdkBuilder.optionGroup(optionGroup)
  }

  public fun build(): InstanceEngineConfig = cdkBuilder.build()
}
