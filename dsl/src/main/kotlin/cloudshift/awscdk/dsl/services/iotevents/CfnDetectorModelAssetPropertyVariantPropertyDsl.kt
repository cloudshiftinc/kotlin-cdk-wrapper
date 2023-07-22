@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelAssetPropertyVariantPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.AssetPropertyVariantProperty.Builder =
      CfnDetectorModel.AssetPropertyVariantProperty.builder()

  /**
   * @param booleanValue The asset property value is a Boolean value that must be `'TRUE'` or
   * `'FALSE'` .
   * You must use an expression, and the evaluated result should be a Boolean value.
   */
  public fun booleanValue(booleanValue: String) {
    cdkBuilder.booleanValue(booleanValue)
  }

  /**
   * @param doubleValue The asset property value is a double.
   * You must use an expression, and the evaluated result should be a double.
   */
  public fun doubleValue(doubleValue: String) {
    cdkBuilder.doubleValue(doubleValue)
  }

  /**
   * @param integerValue The asset property value is an integer.
   * You must use an expression, and the evaluated result should be an integer.
   */
  public fun integerValue(integerValue: String) {
    cdkBuilder.integerValue(integerValue)
  }

  /**
   * @param stringValue The asset property value is a string.
   * You must use an expression, and the evaluated result should be a string.
   */
  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  public fun build(): CfnDetectorModel.AssetPropertyVariantProperty = cdkBuilder.build()
}
