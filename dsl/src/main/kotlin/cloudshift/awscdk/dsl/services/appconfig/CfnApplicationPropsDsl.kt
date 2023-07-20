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

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appconfig.CfnApplication
import software.amazon.awscdk.services.appconfig.CfnApplicationProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationPropsDsl {
    private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

    private val _tags: MutableList<CfnApplication.TagsProperty> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnApplicationTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnApplicationTagsPropertyDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnApplication.TagsProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnApplicationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
