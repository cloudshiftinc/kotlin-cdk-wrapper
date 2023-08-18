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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resourcegroups.CfnGroup
import software.amazon.awscdk.services.resourcegroups.CfnGroupProps
import software.constructs.Construct

public object resourcegroups {
    /**
     * Creates a resource group with the specified name and description.
     *
     * You can optionally include either a resource query or a service configuration. For more
     * information about constructing a resource query, see
     * [Build queries and groups in AWS Resource Groups](https://docs.aws.amazon.com//ARG/latest/userguide/getting_started-query.html)
     * in the *AWS Resource Groups User Guide* . For more information about service-linked groups
     * and service configurations, see
     * [Service configurations for Resource Groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html)
     * .
     *
     * *Minimum permissions*
     *
     * To run this command, you must have the following permissions:
     * * `resource-groups:CreateGroup`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resourcegroups.*;
     * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
     * .name("name")
     * // the properties below are optional
     * .configuration(List.of(ConfigurationItemProperty.builder()
     * .parameters(List.of(ConfigurationParameterProperty.builder()
     * .name("name")
     * .values(List.of("values"))
     * .build()))
     * .type("type")
     * .build()))
     * .description("description")
     * .resourceQuery(ResourceQueryProperty.builder()
     * .query(QueryProperty.builder()
     * .resourceTypeFilters(List.of("resourceTypeFilters"))
     * .stackIdentifier("stackIdentifier")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .type("type")
     * .build())
     * .resources(List.of("resources"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html)
     */
    public inline fun cfnGroup(
        scope: Construct,
        id: String,
        block: CfnGroupDsl.() -> Unit = {},
    ): CfnGroup {
        val builder = CfnGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * One of the items in the service configuration assigned to a resource group.
     *
     * A service configuration can consist of one or more items. For details service configurations
     * and how to construct them, see
     * [Service configurations for resource groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html)
     * in the *AWS Resource Groups User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resourcegroups.*;
     * ConfigurationItemProperty configurationItemProperty = ConfigurationItemProperty.builder()
     * .parameters(List.of(ConfigurationParameterProperty.builder()
     * .name("name")
     * .values(List.of("values"))
     * .build()))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-configurationitem.html)
     */
    public inline fun cfnGroupConfigurationItemProperty(
        block: CfnGroupConfigurationItemPropertyDsl.() -> Unit = {}
    ): CfnGroup.ConfigurationItemProperty {
        val builder = CfnGroupConfigurationItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * One parameter for a group configuration item.
     *
     * For details about service configurations and how to construct them, see
     * [Service configurations for resource groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html)
     * in the *AWS Resource Groups User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resourcegroups.*;
     * ConfigurationParameterProperty configurationParameterProperty =
     * ConfigurationParameterProperty.builder()
     * .name("name")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-configurationparameter.html)
     */
    public inline fun cfnGroupConfigurationParameterProperty(
        block: CfnGroupConfigurationParameterPropertyDsl.() -> Unit = {}
    ): CfnGroup.ConfigurationParameterProperty {
        val builder = CfnGroupConfigurationParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resourcegroups.*;
     * CfnGroupProps cfnGroupProps = CfnGroupProps.builder()
     * .name("name")
     * // the properties below are optional
     * .configuration(List.of(ConfigurationItemProperty.builder()
     * .parameters(List.of(ConfigurationParameterProperty.builder()
     * .name("name")
     * .values(List.of("values"))
     * .build()))
     * .type("type")
     * .build()))
     * .description("description")
     * .resourceQuery(ResourceQueryProperty.builder()
     * .query(QueryProperty.builder()
     * .resourceTypeFilters(List.of("resourceTypeFilters"))
     * .stackIdentifier("stackIdentifier")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build())
     * .type("type")
     * .build())
     * .resources(List.of("resources"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html)
     */
    public inline fun cfnGroupProps(block: CfnGroupPropsDsl.() -> Unit = {}): CfnGroupProps {
        val builder = CfnGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies details within a `ResourceQuery` structure that determines the membership of the
     * resource group.
     *
     * The contents required in the `Query` structure are determined by the `Type` property of the
     * containing `ResourceQuery` structure.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resourcegroups.*;
     * QueryProperty queryProperty = QueryProperty.builder()
     * .resourceTypeFilters(List.of("resourceTypeFilters"))
     * .stackIdentifier("stackIdentifier")
     * .tagFilters(List.of(TagFilterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html)
     */
    public inline fun cfnGroupQueryProperty(
        block: CfnGroupQueryPropertyDsl.() -> Unit = {}
    ): CfnGroup.QueryProperty {
        val builder = CfnGroupQueryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnGroupResourceQueryProperty(
        block: CfnGroupResourceQueryPropertyDsl.() -> Unit = {}
    ): CfnGroup.ResourceQueryProperty {
        val builder = CfnGroupResourceQueryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a single tag key and optional values that you can use to specify membership in a
     * tag-based group.
     *
     * An AWS resource that doesn't have a matching tag key and value is rejected as a member of the
     * group.
     *
     * A `TagFilter` object includes two properties: `Key` (a string) and `Values` (a list of
     * strings). Only resources in the account that are tagged with a matching key-value pair are
     * members of the group. The `Values` property of `TagFilter` is optional, but specifying it
     * narrows the query results.
     *
     * As an example, suppose the `TagFilters` string is `[{"Key": "Stage", "Values":
     * ["Test", "Beta"]}, {"Key": "Storage"}]` . In this case, only resources with all of the
     * following tags are members of the group:
     * * `Stage` tag key with a value of either `Test` or `Beta`
     * * `Storage` tag key with any value
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.resourcegroups.*;
     * TagFilterProperty tagFilterProperty = TagFilterProperty.builder()
     * .key("key")
     * .values(List.of("values"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-tagfilter.html)
     */
    public inline fun cfnGroupTagFilterProperty(
        block: CfnGroupTagFilterPropertyDsl.() -> Unit = {}
    ): CfnGroup.TagFilterProperty {
        val builder = CfnGroupTagFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
