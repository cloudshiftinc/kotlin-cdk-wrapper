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

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector
import software.amazon.awscdk.services.guardduty.CfnDetectorProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDetectorPropsDsl {
    private val cdkBuilder: CfnDetectorProps.Builder = CfnDetectorProps.builder()

    private val _features: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun dataSources(dataSources: IResolvable) {
        cdkBuilder.dataSources(dataSources)
    }

    public fun dataSources(dataSources: CfnDetector.CFNDataSourceConfigurationsProperty) {
        cdkBuilder.dataSources(dataSources)
    }

    public fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
    }

    public fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable)
    }

    public fun features(vararg features: Any) {
        _features.addAll(listOf(*features))
    }

    public fun features(features: Collection<Any>) {
        _features.addAll(features)
    }

    public fun features(features: IResolvable) {
        cdkBuilder.features(features)
    }

    public fun findingPublishingFrequency(findingPublishingFrequency: String) {
        cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDetectorProps {
        if (_features.isNotEmpty()) cdkBuilder.features(_features)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
