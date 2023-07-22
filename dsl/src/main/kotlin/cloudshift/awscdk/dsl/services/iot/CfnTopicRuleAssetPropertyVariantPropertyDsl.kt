@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleAssetPropertyVariantPropertyDsl {
  private val cdkBuilder: CfnTopicRule.AssetPropertyVariantProperty.Builder =
      CfnTopicRule.AssetPropertyVariantProperty.builder()

  /**
   * @param booleanValue Optional.
   * A string that contains the boolean value ( `true` or `false` ) of the value entry. Accepts
   * substitution templates.
   */
  public fun booleanValue(booleanValue: String) {
    cdkBuilder.booleanValue(booleanValue)
  }

  /**
   * @param doubleValue Optional.
   * A string that contains the double value of the value entry. Accepts substitution templates.
   */
  public fun doubleValue(doubleValue: String) {
    cdkBuilder.doubleValue(doubleValue)
  }

  /**
   * @param integerValue Optional.
   * A string that contains the integer value of the value entry. Accepts substitution templates.
   */
  public fun integerValue(integerValue: String) {
    cdkBuilder.integerValue(integerValue)
  }

  /**
   * @param stringValue Optional.
   * The string value of the value entry. Accepts substitution templates.
   */
  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  public fun build(): CfnTopicRule.AssetPropertyVariantProperty = cdkBuilder.build()
}
