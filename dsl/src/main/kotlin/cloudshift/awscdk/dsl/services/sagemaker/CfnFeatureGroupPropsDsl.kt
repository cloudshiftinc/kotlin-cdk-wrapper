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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps

/**
 * Properties for defining a `CfnFeatureGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object offlineStoreConfig;
 * Object onlineStoreConfig;
 * CfnFeatureGroupProps cfnFeatureGroupProps = CfnFeatureGroupProps.builder()
 * .eventTimeFeatureName("eventTimeFeatureName")
 * .featureDefinitions(List.of(FeatureDefinitionProperty.builder()
 * .featureName("featureName")
 * .featureType("featureType")
 * .build()))
 * .featureGroupName("featureGroupName")
 * .recordIdentifierFeatureName("recordIdentifierFeatureName")
 * // the properties below are optional
 * .description("description")
 * .offlineStoreConfig(offlineStoreConfig)
 * .onlineStoreConfig(onlineStoreConfig)
 * .roleArn("roleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-featuregroup.html)
 */
@CdkDslMarker
public class CfnFeatureGroupPropsDsl {
    private val cdkBuilder: CfnFeatureGroupProps.Builder = CfnFeatureGroupProps.builder()

    private val _featureDefinitions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A free form description of a `FeatureGroup` . */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param eventTimeFeatureName The name of the feature that stores the `EventTime` of a Record
     *   in a `FeatureGroup` . A `EventTime` is point in time when a new event occurs that
     *   corresponds to the creation or update of a `Record` in `FeatureGroup` . All `Records` in
     *   the `FeatureGroup` must have a corresponding `EventTime` .
     */
    public fun eventTimeFeatureName(eventTimeFeatureName: String) {
        cdkBuilder.eventTimeFeatureName(eventTimeFeatureName)
    }

    /**
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     *   and a `FeatureType` . Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     */
    public fun featureDefinitions(vararg featureDefinitions: Any) {
        _featureDefinitions.addAll(listOf(*featureDefinitions))
    }

    /**
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     *   and a `FeatureType` . Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     */
    public fun featureDefinitions(featureDefinitions: Collection<Any>) {
        _featureDefinitions.addAll(featureDefinitions)
    }

    /**
     * @param featureDefinitions A list of `Feature` s. Each `Feature` must include a `FeatureName`
     *   and a `FeatureType` . Valid `FeatureType` s are `Integral` , `Fractional` and `String` .
     *
     * `FeatureName` s cannot be any of the following: `is_deleted` , `write_time` ,
     * `api_invocation_time` .
     *
     * You can create up to 2,500 `FeatureDefinition` s per `FeatureGroup` .
     */
    public fun featureDefinitions(featureDefinitions: IResolvable) {
        cdkBuilder.featureDefinitions(featureDefinitions)
    }

    /** @param featureGroupName The name of the `FeatureGroup` . */
    public fun featureGroupName(featureGroupName: String) {
        cdkBuilder.featureGroupName(featureGroupName)
    }

    /** @param offlineStoreConfig The configuration of an `OfflineStore` . */
    public fun offlineStoreConfig(offlineStoreConfig: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(offlineStoreConfig)
        cdkBuilder.offlineStoreConfig(builder.map)
    }

    /** @param offlineStoreConfig The configuration of an `OfflineStore` . */
    public fun offlineStoreConfig(offlineStoreConfig: Any) {
        cdkBuilder.offlineStoreConfig(offlineStoreConfig)
    }

    /** @param onlineStoreConfig The configuration of an `OnlineStore` . */
    public fun onlineStoreConfig(onlineStoreConfig: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(onlineStoreConfig)
        cdkBuilder.onlineStoreConfig(builder.map)
    }

    /** @param onlineStoreConfig The configuration of an `OnlineStore` . */
    public fun onlineStoreConfig(onlineStoreConfig: Any) {
        cdkBuilder.onlineStoreConfig(onlineStoreConfig)
    }

    /**
     * @param recordIdentifierFeatureName The name of the `Feature` whose value uniquely identifies
     *   a `Record` defined in the `FeatureGroup` `FeatureDefinitions` .
     */
    public fun recordIdentifierFeatureName(recordIdentifierFeatureName: String) {
        cdkBuilder.recordIdentifierFeatureName(recordIdentifierFeatureName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM execution role used to create the
     *   feature group.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param tags Tags used to define a `FeatureGroup` . */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Tags used to define a `FeatureGroup` . */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFeatureGroupProps {
        if (_featureDefinitions.isNotEmpty()) cdkBuilder.featureDefinitions(_featureDefinitions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
