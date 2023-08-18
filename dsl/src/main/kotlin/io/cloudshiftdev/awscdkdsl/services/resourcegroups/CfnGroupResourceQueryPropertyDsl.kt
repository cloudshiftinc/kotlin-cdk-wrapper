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

package io.cloudshiftdev.awscdkdsl.services.resourcegroups

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resourcegroups.CfnGroup

/**
 * The query used to dynamically define the members of a group.
 *
 * For more information about how to construct a query, see
 * [Build queries and groups in AWS Resource Groups](https://docs.aws.amazon.com//ARG/latest/userguide/gettingstarted-query.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resourcegroups.*;
 * ResourceQueryProperty resourceQueryProperty = ResourceQueryProperty.builder()
 * .query(QueryProperty.builder()
 * .resourceTypeFilters(List.of("resourceTypeFilters"))
 * .stackIdentifier("stackIdentifier")
 * .tagFilters(List.of(TagFilterProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-resourcequery.html)
 */
@CdkDslMarker
public class CfnGroupResourceQueryPropertyDsl {
    private val cdkBuilder: CfnGroup.ResourceQueryProperty.Builder =
        CfnGroup.ResourceQueryProperty.builder()

    /**
     * @param query The query that defines the membership of the group. This is a structure with
     *   properties that depend on the `Type` .
     *
     * The `Query` structure must be included in the following scenarios:
     * * When the `Type` is `TAG_FILTERS_1_0` , you must specify a `Query` structure that contains a
     *   `TagFilters` list of tags. Resources with tags that match those in the `TagFilter` list
     *   become members of the resource group.
     * * When the `Type` is `CLOUDFORMATION_STACK_1_0` then this field is required only when you
     *   must specify a CloudFormation stack other than the one you are defining. To do this, the
     *   `Query` structure must contain the `StackIdentifier` property. If you don't specify either
     *   a `Query` structure or a `StackIdentifier` within that `Query` , then it defaults to the
     *   CloudFormation stack that you're currently constructing.
     */
    public fun query(query: IResolvable) {
        cdkBuilder.query(query)
    }

    /**
     * @param query The query that defines the membership of the group. This is a structure with
     *   properties that depend on the `Type` .
     *
     * The `Query` structure must be included in the following scenarios:
     * * When the `Type` is `TAG_FILTERS_1_0` , you must specify a `Query` structure that contains a
     *   `TagFilters` list of tags. Resources with tags that match those in the `TagFilter` list
     *   become members of the resource group.
     * * When the `Type` is `CLOUDFORMATION_STACK_1_0` then this field is required only when you
     *   must specify a CloudFormation stack other than the one you are defining. To do this, the
     *   `Query` structure must contain the `StackIdentifier` property. If you don't specify either
     *   a `Query` structure or a `StackIdentifier` within that `Query` , then it defaults to the
     *   CloudFormation stack that you're currently constructing.
     */
    public fun query(query: CfnGroup.QueryProperty) {
        cdkBuilder.query(query)
    }

    /**
     * @param type Specifies the type of resource query that determines this group's membership.
     *   There are two valid query types:.
     * * `TAG_FILTERS_1_0` indicates that the group is a tag-based group. To complete the group
     *   membership, you must include the `TagFilters` property to specify the tag filters to use in
     *   the query.
     * * `CLOUDFORMATION_STACK_1_0` , the default, indicates that the group is a CloudFormation
     *   stack-based group. Group membership is based on the CloudFormation stack. You must specify
     *   the `StackIdentifier` property in the query to define which stack to associate the group
     *   with, or leave it empty to default to the stack where the group is defined.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnGroup.ResourceQueryProperty = cdkBuilder.build()
}
