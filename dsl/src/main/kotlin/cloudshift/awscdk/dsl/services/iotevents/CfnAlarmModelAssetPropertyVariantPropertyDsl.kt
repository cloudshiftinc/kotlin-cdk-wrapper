@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

/**
 * A structure that contains an asset property value.
 *
 * For more information, see
 * [Variant](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_Variant.html) in the *AWS
 * IoT SiteWise API Reference* .
 *
 * You must use expressions for all parameters in `AssetPropertyVariant` . The expressions accept
 * literals, operators, functions, references, and substitution templates.
 *
 * **Examples** - For literal values, the expressions must contain single quotes. For example, the
 * value for the `integerValue` parameter can be `'100'` .
 *
 * * For references, you must specify either variables or parameters. For example, the value for the
 * `booleanValue` parameter can be `$variable.offline` .
 * * For a substitution template, you must use `${}` , and the template must be in single quotes. A
 * substitution template can also contain a combination of literals, operators, functions, references,
 * and substitution templates.
 *
 * In the following example, the value for the `doubleValue` parameter uses a substitution template.
 *
 * `'${$input.TemperatureInput.sensorData.temperature * 6 / 5 + 32}'`
 *
 * For more information, see
 * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
 * in the *AWS IoT Events Developer Guide* .
 *
 * You must specify one of the following value types, depending on the `dataType` of the specified
 * asset property. For more information, see
 * [AssetProperty](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetProperty.html)
 * in the *AWS IoT SiteWise API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * AssetPropertyVariantProperty assetPropertyVariantProperty =
 * AssetPropertyVariantProperty.builder()
 * .booleanValue("booleanValue")
 * .doubleValue("doubleValue")
 * .integerValue("integerValue")
 * .stringValue("stringValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvariant.html)
 */
@CdkDslMarker
public class CfnAlarmModelAssetPropertyVariantPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.AssetPropertyVariantProperty.Builder =
      CfnAlarmModel.AssetPropertyVariantProperty.builder()

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

  public fun build(): CfnAlarmModel.AssetPropertyVariantProperty = cdkBuilder.build()
}
