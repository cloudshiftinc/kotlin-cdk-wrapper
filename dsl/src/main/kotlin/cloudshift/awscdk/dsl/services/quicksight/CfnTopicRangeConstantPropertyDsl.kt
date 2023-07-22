@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicRangeConstantPropertyDsl {
  private val cdkBuilder: CfnTopic.RangeConstantProperty.Builder =
      CfnTopic.RangeConstantProperty.builder()

  /**
   * @param maximum The maximum value for a range constant.
   */
  public fun maximum(maximum: String) {
    cdkBuilder.maximum(maximum)
  }

  /**
   * @param minimum The minimum value for a range constant.
   */
  public fun minimum(minimum: String) {
    cdkBuilder.minimum(minimum)
  }

  public fun build(): CfnTopic.RangeConstantProperty = cdkBuilder.build()
}
