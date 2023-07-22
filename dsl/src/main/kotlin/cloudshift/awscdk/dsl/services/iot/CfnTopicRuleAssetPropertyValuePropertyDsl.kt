@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * An asset property value entry containing the following information.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * AssetPropertyValueProperty assetPropertyValueProperty = AssetPropertyValueProperty.builder()
 * .timestamp(AssetPropertyTimestampProperty.builder()
 * .timeInSeconds("timeInSeconds")
 * // the properties below are optional
 * .offsetInNanos("offsetInNanos")
 * .build())
 * .value(AssetPropertyVariantProperty.builder()
 * .booleanValue("booleanValue")
 * .doubleValue("doubleValue")
 * .integerValue("integerValue")
 * .stringValue("stringValue")
 * .build())
 * // the properties below are optional
 * .quality("quality")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html)
 */
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
