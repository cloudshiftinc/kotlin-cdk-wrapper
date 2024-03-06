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

package io.cloudshiftdev.awscdkdsl.services.mediapackagev2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.mediapackagev2.CfnChannelGroupProps

/**
 * Properties for defining a `CfnChannelGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * CfnChannelGroupProps cfnChannelGroupProps = CfnChannelGroupProps.builder()
 * .channelGroupName("channelGroupName")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelgroup.html)
 */
@CdkDslMarker
public class CfnChannelGroupPropsDsl {
    private val cdkBuilder: CfnChannelGroupProps.Builder = CfnChannelGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param channelGroupName The name of the channel group. */
    public fun channelGroupName(channelGroupName: String) {
        cdkBuilder.channelGroupName(channelGroupName)
    }

    /** @param description The configuration for a MediaPackage V2 channel group. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param tags The tags associated with the channel group. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags associated with the channel group. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnChannelGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
