@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

/**
 * Sends information about the detector model instance and the event that triggered the action to a
 * specified asset property in AWS IoT SiteWise .
 *
 * You must use expressions for all parameters in `IotSiteWiseAction` . The expressions accept
 * literals, operators, functions, references, and substitutions templates.
 *
 * **Examples** - For literal values, the expressions must contain single quotes. For example, the
 * value for the `propertyAlias` parameter can be `'/company/windfarm/3/turbine/7/temperature'` .
 *
 * * For references, you must specify either variables or input values. For example, the value for
 * the `assetId` parameter can be `$input.TurbineInput.assetId1` .
 * * For a substitution template, you must use `${}` , and the template must be in single quotes. A
 * substitution template can also contain a combination of literals, operators, functions, references,
 * and substitution templates.
 *
 * In the following example, the value for the `propertyAlias` parameter uses a substitution
 * template.
 *
 * `'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/
 * ${$input.TemperatureInput.sensorData.turbineID}/temperature'`
 *
 * You must specify either `propertyAlias` or both `assetId` and `propertyId` to identify the target
 * asset property in AWS IoT SiteWise .
 *
 * For more information, see
 * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
 * in the *AWS IoT Events Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * IotSiteWiseProperty iotSiteWiseProperty = IotSiteWiseProperty.builder()
 * .assetId("assetId")
 * .entryId("entryId")
 * .propertyAlias("propertyAlias")
 * .propertyId("propertyId")
 * .propertyValue(AssetPropertyValueProperty.builder()
 * .value(AssetPropertyVariantProperty.builder()
 * .booleanValue("booleanValue")
 * .doubleValue("doubleValue")
 * .integerValue("integerValue")
 * .stringValue("stringValue")
 * .build())
 * // the properties below are optional
 * .quality("quality")
 * .timestamp(AssetPropertyTimestampProperty.builder()
 * .timeInSeconds("timeInSeconds")
 * // the properties below are optional
 * .offsetInNanos("offsetInNanos")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html)
 */
@CdkDslMarker
public class CfnAlarmModelIotSiteWisePropertyDsl {
  private val cdkBuilder: CfnAlarmModel.IotSiteWiseProperty.Builder =
      CfnAlarmModel.IotSiteWiseProperty.builder()

  /**
   * @param assetId The ID of the asset that has the specified property.
   */
  public fun assetId(assetId: String) {
    cdkBuilder.assetId(assetId)
  }

  /**
   * @param entryId A unique identifier for this entry.
   * You can use the entry ID to track which data entry causes an error in case of failure. The
   * default is a new unique identifier.
   */
  public fun entryId(entryId: String) {
    cdkBuilder.entryId(entryId)
  }

  /**
   * @param propertyAlias The alias of the asset property.
   */
  public fun propertyAlias(propertyAlias: String) {
    cdkBuilder.propertyAlias(propertyAlias)
  }

  /**
   * @param propertyId The ID of the asset property.
   */
  public fun propertyId(propertyId: String) {
    cdkBuilder.propertyId(propertyId)
  }

  /**
   * @param propertyValue The value to send to the asset property.
   * This value contains timestamp, quality, and value (TQV) information.
   */
  public fun propertyValue(propertyValue: IResolvable) {
    cdkBuilder.propertyValue(propertyValue)
  }

  /**
   * @param propertyValue The value to send to the asset property.
   * This value contains timestamp, quality, and value (TQV) information.
   */
  public fun propertyValue(propertyValue: CfnAlarmModel.AssetPropertyValueProperty) {
    cdkBuilder.propertyValue(propertyValue)
  }

  public fun build(): CfnAlarmModel.IotSiteWiseProperty = cdkBuilder.build()
}
