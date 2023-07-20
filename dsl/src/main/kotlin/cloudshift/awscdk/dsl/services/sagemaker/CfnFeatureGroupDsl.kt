@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFeatureGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFeatureGroup.Builder = CfnFeatureGroup.Builder.create(scope, id)

    private val _featureDefinitions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun eventTimeFeatureName(eventTimeFeatureName: String) {
        cdkBuilder.eventTimeFeatureName(eventTimeFeatureName)
    }

    public fun featureDefinitions(vararg featureDefinitions: Any) {
        _featureDefinitions.addAll(listOf(*featureDefinitions))
    }

    public fun featureDefinitions(featureDefinitions: Collection<Any>) {
        _featureDefinitions.addAll(featureDefinitions)
    }

    public fun featureDefinitions(featureDefinitions: IResolvable) {
        cdkBuilder.featureDefinitions(featureDefinitions)
    }

    public fun featureGroupName(featureGroupName: String) {
        cdkBuilder.featureGroupName(featureGroupName)
    }

    public fun offlineStoreConfig(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.offlineStoreConfig(builder.map)
    }

    public fun offlineStoreConfig(offlineStoreConfig: Any) {
        cdkBuilder.offlineStoreConfig(offlineStoreConfig)
    }

    public fun onlineStoreConfig(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.onlineStoreConfig(builder.map)
    }

    public fun onlineStoreConfig(onlineStoreConfig: Any) {
        cdkBuilder.onlineStoreConfig(onlineStoreConfig)
    }

    public fun recordIdentifierFeatureName(recordIdentifierFeatureName: String) {
        cdkBuilder.recordIdentifierFeatureName(recordIdentifierFeatureName)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFeatureGroup {
        if (_featureDefinitions.isNotEmpty()) cdkBuilder.featureDefinitions(_featureDefinitions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
