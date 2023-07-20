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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnContactListProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnContactListPropsDsl {
    private val cdkBuilder: CfnContactListProps.Builder = CfnContactListProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _topics: MutableList<Any> = mutableListOf()

    public fun contactListName(contactListName: String) {
        cdkBuilder.contactListName(contactListName)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun topics(vararg topics: Any) {
        _topics.addAll(listOf(*topics))
    }

    public fun topics(topics: Collection<Any>) {
        _topics.addAll(topics)
    }

    public fun topics(topics: IResolvable) {
        cdkBuilder.topics(topics)
    }

    public fun build(): CfnContactListProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_topics.isNotEmpty()) cdkBuilder.topics(_topics)
        return cdkBuilder.build()
    }
}
