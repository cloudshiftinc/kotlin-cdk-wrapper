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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action to send data from an MQTT message that triggered the rule to AWS IoT SiteWise
 * asset properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * IotSiteWiseActionProperty iotSiteWiseActionProperty = IotSiteWiseActionProperty.builder()
 * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
 * .propertyValues(List.of(AssetPropertyValueProperty.builder()
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
 * .build()))
 * // the properties below are optional
 * .assetId("assetId")
 * .entryId("entryId")
 * .propertyAlias("propertyAlias")
 * .propertyId("propertyId")
 * .build()))
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleIotSiteWiseActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.IotSiteWiseActionProperty.Builder =
        CfnTopicRule.IotSiteWiseActionProperty.builder()

    private val _putAssetPropertyValueEntries: MutableList<Any> = mutableListOf()

    /** @param putAssetPropertyValueEntries A list of asset property value entries. */
    public fun putAssetPropertyValueEntries(vararg putAssetPropertyValueEntries: Any) {
        _putAssetPropertyValueEntries.addAll(listOf(*putAssetPropertyValueEntries))
    }

    /** @param putAssetPropertyValueEntries A list of asset property value entries. */
    public fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: Collection<Any>) {
        _putAssetPropertyValueEntries.addAll(putAssetPropertyValueEntries)
    }

    /** @param putAssetPropertyValueEntries A list of asset property value entries. */
    public fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: IResolvable) {
        cdkBuilder.putAssetPropertyValueEntries(putAssetPropertyValueEntries)
    }

    /**
     * @param roleArn The ARN of the role that grants AWS IoT permission to send an asset property
     *   value to AWS IoT SiteWise. ( `"Action": "iotsitewise:BatchPutAssetPropertyValue"` ). The
     *   trust policy can restrict access to specific asset hierarchy paths.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTopicRule.IotSiteWiseActionProperty {
        if (_putAssetPropertyValueEntries.isNotEmpty())
            cdkBuilder.putAssetPropertyValueEntries(_putAssetPropertyValueEntries)
        return cdkBuilder.build()
    }
}
