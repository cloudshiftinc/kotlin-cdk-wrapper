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

package io.cloudshiftdev.awscdkdsl.services.networkmanager

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps

/**
 * Properties for defining a `CfnGlobalNetwork`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnGlobalNetworkProps cfnGlobalNetworkProps = CfnGlobalNetworkProps.builder()
 * .createdAt("createdAt")
 * .description("description")
 * .state("state")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html)
 */
@CdkDslMarker
public class CfnGlobalNetworkPropsDsl {
    private val cdkBuilder: CfnGlobalNetworkProps.Builder = CfnGlobalNetworkProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param createdAt The date and time that the global network was created. */
    public fun createdAt(createdAt: String) {
        cdkBuilder.createdAt(createdAt)
    }

    /**
     * @param description A description of the global network. Constraints: Maximum length of 256
     *   characters.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param state The state of the global network. */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    /** @param tags The tags for the global network. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the global network. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnGlobalNetworkProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
