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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnContactListProps

/**
 * Properties for defining a `CfnContactList`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnContactListProps cfnContactListProps = CfnContactListProps.builder()
 * .contactListName("contactListName")
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .topics(List.of(TopicProperty.builder()
 * .defaultSubscriptionStatus("defaultSubscriptionStatus")
 * .displayName("displayName")
 * .topicName("topicName")
 * // the properties below are optional
 * .description("description")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html)
 */
@CdkDslMarker
public class CfnContactListPropsDsl {
    private val cdkBuilder: CfnContactListProps.Builder = CfnContactListProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _topics: MutableList<Any> = mutableListOf()

    /** @param contactListName The name of the contact list. */
    public fun contactListName(contactListName: String) {
        cdkBuilder.contactListName(contactListName)
    }

    /** @param description A description of what the contact list is about. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param tags The tags associated with a contact list. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags associated with a contact list. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param topics An interest group, theme, or label within a list. A contact list can have
     *   multiple topics.
     */
    public fun topics(vararg topics: Any) {
        _topics.addAll(listOf(*topics))
    }

    /**
     * @param topics An interest group, theme, or label within a list. A contact list can have
     *   multiple topics.
     */
    public fun topics(topics: Collection<Any>) {
        _topics.addAll(topics)
    }

    /**
     * @param topics An interest group, theme, or label within a list. A contact list can have
     *   multiple topics.
     */
    public fun topics(topics: IResolvable) {
        cdkBuilder.topics(topics)
    }

    public fun build(): CfnContactListProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_topics.isNotEmpty()) cdkBuilder.topics(_topics)
        return cdkBuilder.build()
    }
}
