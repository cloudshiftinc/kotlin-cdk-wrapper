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
 * An asset property value entry containing the following information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * PutAssetPropertyValueEntryProperty putAssetPropertyValueEntryProperty =
 * PutAssetPropertyValueEntryProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html)
 */
@CdkDslMarker
public class CfnTopicRulePutAssetPropertyValueEntryPropertyDsl {
    private val cdkBuilder: CfnTopicRule.PutAssetPropertyValueEntryProperty.Builder =
        CfnTopicRule.PutAssetPropertyValueEntryProperty.builder()

    private val _propertyValues: MutableList<Any> = mutableListOf()

    /**
     * @param assetId The ID of the AWS IoT SiteWise asset. You must specify either a
     *   `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts substitution templates.
     */
    public fun assetId(assetId: String) {
        cdkBuilder.assetId(assetId)
    }

    /**
     * @param entryId Optional. A unique identifier for this entry that you can define to better
     *   track which message caused an error in case of failure. Accepts substitution templates.
     *   Defaults to a new UUID.
     */
    public fun entryId(entryId: String) {
        cdkBuilder.entryId(entryId)
    }

    /**
     * @param propertyAlias The name of the property alias associated with your asset property. You
     *   must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
     *   substitution templates.
     */
    public fun propertyAlias(propertyAlias: String) {
        cdkBuilder.propertyAlias(propertyAlias)
    }

    /**
     * @param propertyId The ID of the asset's property. You must specify either a `propertyAlias`
     *   or both an `aliasId` and a `propertyId` . Accepts substitution templates.
     */
    public fun propertyId(propertyId: String) {
        cdkBuilder.propertyId(propertyId)
    }

    /**
     * @param propertyValues A list of property values to insert that each contain timestamp,
     *   quality, and value (TQV) information.
     */
    public fun propertyValues(vararg propertyValues: Any) {
        _propertyValues.addAll(listOf(*propertyValues))
    }

    /**
     * @param propertyValues A list of property values to insert that each contain timestamp,
     *   quality, and value (TQV) information.
     */
    public fun propertyValues(propertyValues: Collection<Any>) {
        _propertyValues.addAll(propertyValues)
    }

    /**
     * @param propertyValues A list of property values to insert that each contain timestamp,
     *   quality, and value (TQV) information.
     */
    public fun propertyValues(propertyValues: IResolvable) {
        cdkBuilder.propertyValues(propertyValues)
    }

    public fun build(): CfnTopicRule.PutAssetPropertyValueEntryProperty {
        if (_propertyValues.isNotEmpty()) cdkBuilder.propertyValues(_propertyValues)
        return cdkBuilder.build()
    }
}
