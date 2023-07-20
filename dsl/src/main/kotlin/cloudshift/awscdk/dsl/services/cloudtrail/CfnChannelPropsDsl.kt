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

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudtrail.CfnChannelProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnChannelPropsDsl {
    private val cdkBuilder: CfnChannelProps.Builder = CfnChannelProps.builder()

    private val _destinations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun destinations(vararg destinations: Any) {
        _destinations.addAll(listOf(*destinations))
    }

    public fun destinations(destinations: Collection<Any>) {
        _destinations.addAll(destinations)
    }

    public fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnChannelProps {
        if (_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
