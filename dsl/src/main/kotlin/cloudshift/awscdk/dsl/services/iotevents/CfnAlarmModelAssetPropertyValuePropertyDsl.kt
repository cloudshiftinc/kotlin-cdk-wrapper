@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

/**
 * A structure that contains value information. For more information, see
 * [AssetPropertyValue](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetPropertyValue.html)
 * in the *AWS IoT SiteWise API Reference* .
 *
 * You must use expressions for all parameters in `AssetPropertyValue` . The expressions accept
 * literals, operators, functions, references, and substitution templates.
 *
 * **Examples** - For literal values, the expressions must contain single quotes. For example, the
 * value for the `quality` parameter can be `'GOOD'` .
 * * For references, you must specify either variables or input values. For example, the value for
 *   the `quality` parameter can be `$input.TemperatureInput.sensorData.quality` .
 *
 * For more information, see
 * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
 * in the *AWS IoT Events Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * AssetPropertyValueProperty assetPropertyValueProperty = AssetPropertyValueProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvalue.html)
 */
@CdkDslMarker
public class CfnAlarmModelAssetPropertyValuePropertyDsl {
    private val cdkBuilder: CfnAlarmModel.AssetPropertyValueProperty.Builder =
        CfnAlarmModel.AssetPropertyValueProperty.builder()

    /**
     * @param quality The quality of the asset property value. The value must be `'GOOD'` , `'BAD'`
     *   , or `'UNCERTAIN'` .
     */
    public fun quality(quality: String) {
        cdkBuilder.quality(quality)
    }

    /**
     * @param timestamp The timestamp associated with the asset property value. The default is the
     *   current event time.
     */
    public fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp)
    }

    /**
     * @param timestamp The timestamp associated with the asset property value. The default is the
     *   current event time.
     */
    public fun timestamp(timestamp: CfnAlarmModel.AssetPropertyTimestampProperty) {
        cdkBuilder.timestamp(timestamp)
    }

    /** @param value The value to send to an asset property. */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value The value to send to an asset property. */
    public fun `value`(`value`: CfnAlarmModel.AssetPropertyVariantProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAlarmModel.AssetPropertyValueProperty = cdkBuilder.build()
}
