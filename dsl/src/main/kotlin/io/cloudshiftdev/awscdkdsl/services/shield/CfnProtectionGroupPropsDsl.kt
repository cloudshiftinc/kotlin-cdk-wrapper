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

package io.cloudshiftdev.awscdkdsl.services.shield

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.shield.CfnProtectionGroupProps

/**
 * Properties for defining a `CfnProtectionGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.shield.*;
 * CfnProtectionGroupProps cfnProtectionGroupProps = CfnProtectionGroupProps.builder()
 * .aggregation("aggregation")
 * .pattern("pattern")
 * .protectionGroupId("protectionGroupId")
 * // the properties below are optional
 * .members(List.of("members"))
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html)
 */
@CdkDslMarker
public class CfnProtectionGroupPropsDsl {
    private val cdkBuilder: CfnProtectionGroupProps.Builder = CfnProtectionGroupProps.builder()

    private val _members: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param aggregation Defines how AWS Shield combines resource data for the group in order to
     *   detect, mitigate, and report events.
     * * Sum - Use the total traffic across the group. This is a good choice for most cases.
     *   Examples include Elastic IP addresses for EC2 instances that scale manually or
     *   automatically.
     * * Mean - Use the average of the traffic across the group. This is a good choice for resources
     *   that share traffic uniformly. Examples include accelerators and load balancers.
     * * Max - Use the highest traffic from each resource. This is useful for resources that don't
     *   share traffic and for resources that share that traffic in a non-uniform way. Examples
     *   include Amazon CloudFront distributions and origin resources for CloudFront distributions.
     */
    public fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
    }

    /**
     * @param members The ARNs (Amazon Resource Names) of the resources to include in the protection
     *   group. You must set this when you set `Pattern` to `ARBITRARY` and you must not set it for
     *   any other `Pattern` setting.
     */
    public fun members(vararg members: String) {
        _members.addAll(listOf(*members))
    }

    /**
     * @param members The ARNs (Amazon Resource Names) of the resources to include in the protection
     *   group. You must set this when you set `Pattern` to `ARBITRARY` and you must not set it for
     *   any other `Pattern` setting.
     */
    public fun members(members: Collection<String>) {
        _members.addAll(members)
    }

    /**
     * @param pattern The criteria to use to choose the protected resources for inclusion in the
     *   group. You can include all resources that have protections, provide a list of resource ARNs
     *   (Amazon Resource Names), or include all resources of a specified resource type.
     */
    public fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
    }

    /**
     * @param protectionGroupId The name of the protection group. You use this to identify the
     *   protection group in lists and to manage the protection group, for example to update,
     *   delete, or describe it.
     */
    public fun protectionGroupId(protectionGroupId: String) {
        cdkBuilder.protectionGroupId(protectionGroupId)
    }

    /**
     * @param resourceType The resource type to include in the protection group. All protected
     *   resources of this type are included in the protection group. You must set this when you set
     *   `Pattern` to `BY_RESOURCE_TYPE` and you must not set it for any other `Pattern` setting.
     */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource. The key:value pair can be
     *   anything you define. Typically, the tag key represents a category (such as "environment")
     *   and the tag value represents a specific value within that category (such as "test,"
     *   "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource. The key:value pair can be
     *   anything you define. Typically, the tag key represents a category (such as "environment")
     *   and the tag value represents a specific value within that category (such as "test,"
     *   "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProtectionGroupProps {
        if (_members.isNotEmpty()) cdkBuilder.members(_members)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
