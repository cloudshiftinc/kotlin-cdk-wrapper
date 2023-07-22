@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleAssetPropertyValuePropertyDsl {
  private val cdkBuilder: CfnTopicRule.AssetPropertyValueProperty.Builder =
      CfnTopicRule.AssetPropertyValueProperty.builder()

  /**
   * @param quality Optional.
   * A string that describes the quality of the value. Accepts substitution templates. Must be
   * `GOOD` , `BAD` , or `UNCERTAIN` .
   */
  public fun quality(quality: String) {
    cdkBuilder.quality(quality)
  }

  /**
   * @param timestamp The asset property value timestamp. 
   */
  public fun timestamp(timestamp: IResolvable) {
    cdkBuilder.timestamp(timestamp)
  }

  /**
   * @param timestamp The asset property value timestamp. 
   */
  public fun timestamp(timestamp: CfnTopicRule.AssetPropertyTimestampProperty) {
    cdkBuilder.timestamp(timestamp)
  }

  /**
   * @param value The value of the asset property. 
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value The value of the asset property. 
   */
  public fun `value`(`value`: CfnTopicRule.AssetPropertyVariantProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTopicRule.AssetPropertyValueProperty = cdkBuilder.build()
}
