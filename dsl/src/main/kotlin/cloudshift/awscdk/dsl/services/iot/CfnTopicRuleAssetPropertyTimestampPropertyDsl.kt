@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleAssetPropertyTimestampPropertyDsl {
  private val cdkBuilder: CfnTopicRule.AssetPropertyTimestampProperty.Builder =
      CfnTopicRule.AssetPropertyTimestampProperty.builder()

  /**
   * @param offsetInNanos Optional.
   * A string that contains the nanosecond time offset. Accepts substitution templates.
   */
  public fun offsetInNanos(offsetInNanos: String) {
    cdkBuilder.offsetInNanos(offsetInNanos)
  }

  /**
   * @param timeInSeconds A string that contains the time in seconds since epoch. 
   * Accepts substitution templates.
   */
  public fun timeInSeconds(timeInSeconds: String) {
    cdkBuilder.timeInSeconds(timeInSeconds)
  }

  public fun build(): CfnTopicRule.AssetPropertyTimestampProperty = cdkBuilder.build()
}
