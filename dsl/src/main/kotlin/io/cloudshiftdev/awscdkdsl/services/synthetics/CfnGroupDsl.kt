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

package io.cloudshiftdev.awscdkdsl.services.synthetics

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.synthetics.CfnGroup
import software.constructs.Construct

/**
 * Creates or updates a group which you can use to associate canaries with each other, including
 * cross-Region canaries.
 *
 * Using groups can help you with managing and automating your canaries, and you can also view
 * aggregated run results and statistics for all canaries in a group.
 *
 * Groups are global resources. When you create a group, it is replicated across all AWS Regions,
 * and you can add canaries from any Region to it, and view it in any Region. Although the group ARN
 * format reflects the Region name where it was created, a group is not constrained to any Region.
 * This means that you can put canaries from multiple Regions into the same group, and then use that
 * group to view and manage all of those canaries in a single view.
 *
 * Each group can contain as many as 10 canaries. You can have as many as 20 groups in your account.
 * Any single canary can be a member of up to 10 groups.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.synthetics.*;
 * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
 * .name("name")
 * // the properties below are optional
 * .resourceArns(List.of("resourceArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html)
 */
@CdkDslMarker
public class CfnGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGroup.Builder = CfnGroup.Builder.create(scope, id)

    private val _resourceArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A name for the group. It can include any Unicode characters.
     *
     * The names for all groups in your account, across all Regions, must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-name)
     *
     * @param name A name for the group. It can include any Unicode characters.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The ARNs of the canaries that you want to associate with this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-resourcearns)
     *
     * @param resourceArns The ARNs of the canaries that you want to associate with this group.
     */
    public fun resourceArns(vararg resourceArns: String) {
        _resourceArns.addAll(listOf(*resourceArns))
    }

    /**
     * The ARNs of the canaries that you want to associate with this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-resourcearns)
     *
     * @param resourceArns The ARNs of the canaries that you want to associate with this group.
     */
    public fun resourceArns(resourceArns: Collection<String>) {
        _resourceArns.addAll(resourceArns)
    }

    /**
     * The list of key-value pairs that are associated with the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-tags)
     *
     * @param tags The list of key-value pairs that are associated with the group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The list of key-value pairs that are associated with the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-group.html#cfn-synthetics-group-tags)
     *
     * @param tags The list of key-value pairs that are associated with the group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnGroup {
        if (_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
