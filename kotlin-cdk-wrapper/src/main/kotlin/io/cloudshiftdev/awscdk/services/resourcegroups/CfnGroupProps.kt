@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourcegroups

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.resourcegroups.*;
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
public interface CfnGroupProps {
  /**
   * The service configuration currently associated with the resource group and in effect for the
   * members of the resource group.
   *
   * A `Configuration` consists of one or more `ConfigurationItem` entries. For information about
   * service configurations for resource groups and how to construct them, see [Service configurations
   * for resource groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the
   * *AWS Resource Groups User Guide* .
   *
   *
   * You can include either a `Configuration` or a `ResourceQuery` , but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-configuration)
   */
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * The description of the resource group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of a resource group.
   *
   * The name must be unique within the AWS Region in which you create the resource. To create
   * multiple resource groups based on the same CloudFormation stack, you must generate unique names
   * for each.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-name)
   */
  public fun name(): String

  /**
   * The resource query structure that is used to dynamically determine which AWS resources are
   * members of the associated resource group.
   *
   * For more information about queries and how to construct them, see [Build queries and groups in
   * AWS Resource Groups](https://docs.aws.amazon.com//ARG/latest/userguide/gettingstarted-query.html)
   * in the *AWS Resource Groups User Guide*
   *
   *
   * * You can include either a `ResourceQuery` or a `Configuration` , but not both.
   * * You can specify the group's membership either by using a `ResourceQuery` or by using a list
   * of `Resources` , but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-resourcequery)
   */
  public fun resourceQuery(): Any? = unwrap(this).getResourceQuery()

  /**
   * A list of the Amazon Resource Names (ARNs) of AWS resources that you want to add to the
   * specified group.
   *
   *
   * * You can specify the group membership either by using a list of `Resources` or by using a
   * `ResourceQuery` , but not both.
   * * You can include a `Resources` property only if you also specify a `Configuration` property.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-resources)
   */
  public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  /**
   * The tag key and value pairs that are attached to the resource group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuration The service configuration currently associated with the resource group
     * and in effect for the members of the resource group.
     * A `Configuration` consists of one or more `ConfigurationItem` entries. For information about
     * service configurations for resource groups and how to construct them, see [Service
     * configurations for resource
     * groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the *AWS
     * Resource Groups User Guide* .
     *
     *
     * You can include either a `Configuration` or a `ResourceQuery` , but not both.
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration The service configuration currently associated with the resource group
     * and in effect for the members of the resource group.
     * A `Configuration` consists of one or more `ConfigurationItem` entries. For information about
     * service configurations for resource groups and how to construct them, see [Service
     * configurations for resource
     * groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the *AWS
     * Resource Groups User Guide* .
     *
     *
     * You can include either a `Configuration` or a `ResourceQuery` , but not both.
     */
    public fun configuration(configuration: List<Any>)

    /**
     * @param configuration The service configuration currently associated with the resource group
     * and in effect for the members of the resource group.
     * A `Configuration` consists of one or more `ConfigurationItem` entries. For information about
     * service configurations for resource groups and how to construct them, see [Service
     * configurations for resource
     * groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the *AWS
     * Resource Groups User Guide* .
     *
     *
     * You can include either a `Configuration` or a `ResourceQuery` , but not both.
     */
    public fun configuration(vararg configuration: Any)

    /**
     * @param description The description of the resource group.
     */
    public fun description(description: String)

    /**
     * @param name The name of a resource group. 
     * The name must be unique within the AWS Region in which you create the resource. To create
     * multiple resource groups based on the same CloudFormation stack, you must generate unique names
     * for each.
     */
    public fun name(name: String)

    /**
     * @param resourceQuery The resource query structure that is used to dynamically determine which
     * AWS resources are members of the associated resource group.
     * For more information about queries and how to construct them, see [Build queries and groups
     * in AWS Resource
     * Groups](https://docs.aws.amazon.com//ARG/latest/userguide/gettingstarted-query.html) in the *AWS
     * Resource Groups User Guide*
     *
     *
     * * You can include either a `ResourceQuery` or a `Configuration` , but not both.
     * * You can specify the group's membership either by using a `ResourceQuery` or by using a list
     * of `Resources` , but not both.
     */
    public fun resourceQuery(resourceQuery: IResolvable)

    /**
     * @param resourceQuery The resource query structure that is used to dynamically determine which
     * AWS resources are members of the associated resource group.
     * For more information about queries and how to construct them, see [Build queries and groups
     * in AWS Resource
     * Groups](https://docs.aws.amazon.com//ARG/latest/userguide/gettingstarted-query.html) in the *AWS
     * Resource Groups User Guide*
     *
     *
     * * You can include either a `ResourceQuery` or a `Configuration` , but not both.
     * * You can specify the group's membership either by using a `ResourceQuery` or by using a list
     * of `Resources` , but not both.
     */
    public fun resourceQuery(resourceQuery: CfnGroup.ResourceQueryProperty)

    /**
     * @param resourceQuery The resource query structure that is used to dynamically determine which
     * AWS resources are members of the associated resource group.
     * For more information about queries and how to construct them, see [Build queries and groups
     * in AWS Resource
     * Groups](https://docs.aws.amazon.com//ARG/latest/userguide/gettingstarted-query.html) in the *AWS
     * Resource Groups User Guide*
     *
     *
     * * You can include either a `ResourceQuery` or a `Configuration` , but not both.
     * * You can specify the group's membership either by using a `ResourceQuery` or by using a list
     * of `Resources` , but not both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04f0cd737f2749c89b1160d907b3af835166900af06845e37fc00a0e7fc24b56")
    public fun resourceQuery(resourceQuery: CfnGroup.ResourceQueryProperty.Builder.() -> Unit)

    /**
     * @param resources A list of the Amazon Resource Names (ARNs) of AWS resources that you want to
     * add to the specified group.
     *
     * * You can specify the group membership either by using a list of `Resources` or by using a
     * `ResourceQuery` , but not both.
     * * You can include a `Resources` property only if you also specify a `Configuration` property.
     */
    public fun resources(resources: List<String>)

    /**
     * @param resources A list of the Amazon Resource Names (ARNs) of AWS resources that you want to
     * add to the specified group.
     *
     * * You can specify the group membership either by using a list of `Resources` or by using a
     * `ResourceQuery` , but not both.
     * * You can include a `Resources` property only if you also specify a `Configuration` property.
     */
    public fun resources(vararg resources: String)

    /**
     * @param tags The tag key and value pairs that are attached to the resource group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tag key and value pairs that are attached to the resource group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resourcegroups.CfnGroupProps.Builder =
        software.amazon.awscdk.services.resourcegroups.CfnGroupProps.builder()

    /**
     * @param configuration The service configuration currently associated with the resource group
     * and in effect for the members of the resource group.
     * A `Configuration` consists of one or more `ConfigurationItem` entries. For information about
     * service configurations for resource groups and how to construct them, see [Service
     * configurations for resource
     * groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the *AWS
     * Resource Groups User Guide* .
     *
     *
     * You can include either a `Configuration` or a `ResourceQuery` , but not both.
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * @param configuration The service configuration currently associated with the resource group
     * and in effect for the members of the resource group.
     * A `Configuration` consists of one or more `ConfigurationItem` entries. For information about
     * service configurations for resource groups and how to construct them, see [Service
     * configurations for resource
     * groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the *AWS
     * Resource Groups User Guide* .
     *
     *
     * You can include either a `Configuration` or a `ResourceQuery` , but not both.
     */
    override fun configuration(configuration: List<Any>) {
      cdkBuilder.configuration(configuration)
    }

    /**
     * @param configuration The service configuration currently associated with the resource group
     * and in effect for the members of the resource group.
     * A `Configuration` consists of one or more `ConfigurationItem` entries. For information about
     * service configurations for resource groups and how to construct them, see [Service
     * configurations for resource
     * groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the *AWS
     * Resource Groups User Guide* .
     *
     *
     * You can include either a `Configuration` or a `ResourceQuery` , but not both.
     */
    override fun configuration(vararg configuration: Any): Unit =
        configuration(configuration.toList())

    /**
     * @param description The description of the resource group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of a resource group. 
     * The name must be unique within the AWS Region in which you create the resource. To create
     * multiple resource groups based on the same CloudFormation stack, you must generate unique names
     * for each.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param resourceQuery The resource query structure that is used to dynamically determine which
     * AWS resources are members of the associated resource group.
     * For more information about queries and how to construct them, see [Build queries and groups
     * in AWS Resource
     * Groups](https://docs.aws.amazon.com//ARG/latest/userguide/gettingstarted-query.html) in the *AWS
     * Resource Groups User Guide*
     *
     *
     * * You can include either a `ResourceQuery` or a `Configuration` , but not both.
     * * You can specify the group's membership either by using a `ResourceQuery` or by using a list
     * of `Resources` , but not both.
     */
    override fun resourceQuery(resourceQuery: IResolvable) {
      cdkBuilder.resourceQuery(resourceQuery.let(IResolvable::unwrap))
    }

    /**
     * @param resourceQuery The resource query structure that is used to dynamically determine which
     * AWS resources are members of the associated resource group.
     * For more information about queries and how to construct them, see [Build queries and groups
     * in AWS Resource
     * Groups](https://docs.aws.amazon.com//ARG/latest/userguide/gettingstarted-query.html) in the *AWS
     * Resource Groups User Guide*
     *
     *
     * * You can include either a `ResourceQuery` or a `Configuration` , but not both.
     * * You can specify the group's membership either by using a `ResourceQuery` or by using a list
     * of `Resources` , but not both.
     */
    override fun resourceQuery(resourceQuery: CfnGroup.ResourceQueryProperty) {
      cdkBuilder.resourceQuery(resourceQuery.let(CfnGroup.ResourceQueryProperty::unwrap))
    }

    /**
     * @param resourceQuery The resource query structure that is used to dynamically determine which
     * AWS resources are members of the associated resource group.
     * For more information about queries and how to construct them, see [Build queries and groups
     * in AWS Resource
     * Groups](https://docs.aws.amazon.com//ARG/latest/userguide/gettingstarted-query.html) in the *AWS
     * Resource Groups User Guide*
     *
     *
     * * You can include either a `ResourceQuery` or a `Configuration` , but not both.
     * * You can specify the group's membership either by using a `ResourceQuery` or by using a list
     * of `Resources` , but not both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04f0cd737f2749c89b1160d907b3af835166900af06845e37fc00a0e7fc24b56")
    override fun resourceQuery(resourceQuery: CfnGroup.ResourceQueryProperty.Builder.() -> Unit):
        Unit = resourceQuery(CfnGroup.ResourceQueryProperty(resourceQuery))

    /**
     * @param resources A list of the Amazon Resource Names (ARNs) of AWS resources that you want to
     * add to the specified group.
     *
     * * You can specify the group membership either by using a list of `Resources` or by using a
     * `ResourceQuery` , but not both.
     * * You can include a `Resources` property only if you also specify a `Configuration` property.
     */
    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    /**
     * @param resources A list of the Amazon Resource Names (ARNs) of AWS resources that you want to
     * add to the specified group.
     *
     * * You can specify the group membership either by using a list of `Resources` or by using a
     * `ResourceQuery` , but not both.
     * * You can include a `Resources` property only if you also specify a `Configuration` property.
     */
    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    /**
     * @param tags The tag key and value pairs that are attached to the resource group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tag key and value pairs that are attached to the resource group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.resourcegroups.CfnGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroupProps,
  ) : CdkObject(cdkObject), CfnGroupProps {
    /**
     * The service configuration currently associated with the resource group and in effect for the
     * members of the resource group.
     *
     * A `Configuration` consists of one or more `ConfigurationItem` entries. For information about
     * service configurations for resource groups and how to construct them, see [Service
     * configurations for resource
     * groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the *AWS
     * Resource Groups User Guide* .
     *
     *
     * You can include either a `Configuration` or a `ResourceQuery` , but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-configuration)
     */
    override fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * The description of the resource group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of a resource group.
     *
     * The name must be unique within the AWS Region in which you create the resource. To create
     * multiple resource groups based on the same CloudFormation stack, you must generate unique names
     * for each.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The resource query structure that is used to dynamically determine which AWS resources are
     * members of the associated resource group.
     *
     * For more information about queries and how to construct them, see [Build queries and groups
     * in AWS Resource
     * Groups](https://docs.aws.amazon.com//ARG/latest/userguide/gettingstarted-query.html) in the *AWS
     * Resource Groups User Guide*
     *
     *
     * * You can include either a `ResourceQuery` or a `Configuration` , but not both.
     * * You can specify the group's membership either by using a `ResourceQuery` or by using a list
     * of `Resources` , but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-resourcequery)
     */
    override fun resourceQuery(): Any? = unwrap(this).getResourceQuery()

    /**
     * A list of the Amazon Resource Names (ARNs) of AWS resources that you want to add to the
     * specified group.
     *
     *
     * * You can specify the group membership either by using a list of `Resources` or by using a
     * `ResourceQuery` , but not both.
     * * You can include a `Resources` property only if you also specify a `Configuration` property.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-resources)
     */
    override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    /**
     * The tag key and value pairs that are attached to the resource group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroupProps):
        CfnGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProps):
        software.amazon.awscdk.services.resourcegroups.CfnGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.resourcegroups.CfnGroupProps
  }
}
