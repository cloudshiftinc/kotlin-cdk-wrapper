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

package io.cloudshiftdev.awscdkdsl.services.eventschemas

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eventschemas.CfnDiscoverer
import software.constructs.Construct

/**
 * Use the `AWS::EventSchemas::Discoverer` resource to specify a *discoverer* that is associated
 * with an event bus.
 *
 * A discoverer allows the Amazon EventBridge Schema Registry to automatically generate schemas
 * based on events on an event bus.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eventschemas.*;
 * CfnDiscoverer cfnDiscoverer = CfnDiscoverer.Builder.create(this, "MyCfnDiscoverer")
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
public class CfnDiscovererDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDiscoverer.Builder = CfnDiscoverer.Builder.create(scope, id)

    private val _tags: MutableList<CfnDiscoverer.TagsEntryProperty> = mutableListOf()

    /**
     * Allows for the discovery of the event schemas that are sent to the event bus from another
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-crossaccount)
     *
     * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
     *   bus from another account.
     */
    public fun crossAccount(crossAccount: Boolean) {
        cdkBuilder.crossAccount(crossAccount)
    }

    /**
     * Allows for the discovery of the event schemas that are sent to the event bus from another
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-crossaccount)
     *
     * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
     *   bus from another account.
     */
    public fun crossAccount(crossAccount: IResolvable) {
        cdkBuilder.crossAccount(crossAccount)
    }

    /**
     * A description for the discoverer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-description)
     *
     * @param description A description for the discoverer.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ARN of the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-sourcearn)
     *
     * @param sourceArn The ARN of the event bus.
     */
    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    /**
     * Tags associated with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-tags)
     *
     * @param tags Tags associated with the resource.
     */
    public fun tags(tags: CfnDiscovererTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnDiscovererTagsEntryPropertyDsl().apply(tags).build())
    }

    /**
     * Tags associated with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-tags)
     *
     * @param tags Tags associated with the resource.
     */
    public fun tags(tags: Collection<CfnDiscoverer.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDiscoverer {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
