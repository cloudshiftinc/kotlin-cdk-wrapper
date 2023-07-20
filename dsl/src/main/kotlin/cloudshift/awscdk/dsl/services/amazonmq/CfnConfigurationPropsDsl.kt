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

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.amazonmq.CfnConfiguration
import software.amazon.awscdk.services.amazonmq.CfnConfigurationProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnConfigurationPropsDsl {
    private val cdkBuilder: CfnConfigurationProps.Builder = CfnConfigurationProps.builder()

    private val _tags: MutableList<CfnConfiguration.TagsEntryProperty> = mutableListOf()

    public fun authenticationStrategy(authenticationStrategy: String) {
        cdkBuilder.authenticationStrategy(authenticationStrategy)
    }

    public fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun engineType(engineType: String) {
        cdkBuilder.engineType(engineType)
    }

    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnConfigurationTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnConfigurationTagsEntryPropertyDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnConfiguration.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnConfigurationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
