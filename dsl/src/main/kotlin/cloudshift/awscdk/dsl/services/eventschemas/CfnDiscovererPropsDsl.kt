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

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eventschemas.CfnDiscoverer
import software.amazon.awscdk.services.eventschemas.CfnDiscovererProps

/**
 * Properties for defining a `CfnDiscoverer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eventschemas.*;
 * CfnDiscovererProps cfnDiscovererProps = CfnDiscovererProps.builder()
 * .sourceArn("sourceArn")
 * // the properties below are optional
 * .crossAccount(false)
 * .description("description")
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html)
 */
@CdkDslMarker
public class CfnDiscovererPropsDsl {
    private val cdkBuilder: CfnDiscovererProps.Builder = CfnDiscovererProps.builder()

    private val _tags: MutableList<CfnDiscoverer.TagsEntryProperty> = mutableListOf()

    /**
     * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
     *   bus from another account.
     */
    public fun crossAccount(crossAccount: Boolean) {
        cdkBuilder.crossAccount(crossAccount)
    }

    /**
     * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
     *   bus from another account.
     */
    public fun crossAccount(crossAccount: IResolvable) {
        cdkBuilder.crossAccount(crossAccount)
    }

    /** @param description A description for the discoverer. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param sourceArn The ARN of the event bus. */
    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    /** @param tags Tags associated with the resource. */
    public fun tags(tags: CfnDiscovererTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnDiscovererTagsEntryPropertyDsl().apply(tags).build())
    }

    /** @param tags Tags associated with the resource. */
    public fun tags(tags: Collection<CfnDiscoverer.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDiscovererProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
