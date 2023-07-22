@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.CfnAutoScalingScheduledAction

@CdkDslMarker
public class CfnAutoScalingScheduledActionDsl {
  private val cdkBuilder: CfnAutoScalingScheduledAction.Builder =
      CfnAutoScalingScheduledAction.builder()

  /**
   * @param ignoreUnmodifiedGroupSizeProperties the value to be set.
   */
  public fun ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties: Boolean) {
    cdkBuilder.ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties)
  }

  public fun build(): CfnAutoScalingScheduledAction = cdkBuilder.build()
}
