@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig

@CdkDslMarker
public class ShuffleConfigDsl {
  private val cdkBuilder: ShuffleConfig.Builder = ShuffleConfig.builder()

  /**
   * @param seed Determines the shuffling order. 
   */
  public fun seed(seed: Number) {
    cdkBuilder.seed(seed)
  }

  public fun build(): ShuffleConfig = cdkBuilder.build()
}
