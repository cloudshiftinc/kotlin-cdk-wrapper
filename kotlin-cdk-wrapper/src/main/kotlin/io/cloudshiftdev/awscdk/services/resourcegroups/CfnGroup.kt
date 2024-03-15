@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourcegroups

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a resource group with the specified name and description.
 *
 * You can optionally include either a resource query or a service configuration. For more
 * information about constructing a resource query, see [Build queries and groups in AWS Resource
 * Groups](https://docs.aws.amazon.com//ARG/latest/userguide/getting_started-query.html) in the *AWS
 * Resource Groups User Guide* . For more information about service-linked groups and service
 * configurations, see [Service configurations for Resource
 * Groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) .
 *
 * *Minimum permissions*
 *
 * To run this command, you must have the following permissions:
 *
 * * `resource-groups:CreateGroup`
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.resourcegroups.*;
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
public open class CfnGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the new resource group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The service configuration currently associated with the resource group and in effect for the
   * members of the resource group.
   */
  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * The service configuration currently associated with the resource group and in effect for the
   * members of the resource group.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The service configuration currently associated with the resource group and in effect for the
   * members of the resource group.
   */
  public open fun configuration(_idx_ac66f0: List<Any>) {
    unwrap(this).setConfiguration(_idx_ac66f0)
  }

  /**
   * The service configuration currently associated with the resource group and in effect for the
   * members of the resource group.
   */
  public open fun configuration(vararg _idx_ac66f0: Any): Unit = configuration(_idx_ac66f0.toList())

  /**
   * The description of the resource group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the resource group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of a resource group.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of a resource group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The resource query structure that is used to dynamically determine which AWS resources are
   * members of the associated resource group.
   */
  public open fun resourceQuery(): Any? = unwrap(this).getResourceQuery()

  /**
   * The resource query structure that is used to dynamically determine which AWS resources are
   * members of the associated resource group.
   */
  public open fun resourceQuery(`value`: IResolvable) {
    unwrap(this).setResourceQuery(`value`.let(IResolvable::unwrap))
  }

  /**
   * The resource query structure that is used to dynamically determine which AWS resources are
   * members of the associated resource group.
   */
  public open fun resourceQuery(`value`: ResourceQueryProperty) {
    unwrap(this).setResourceQuery(`value`.let(ResourceQueryProperty::unwrap))
  }

  /**
   * The resource query structure that is used to dynamically determine which AWS resources are
   * members of the associated resource group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d8ee51f4d4d8442631a9f5c118f7e42605a7ed23d6022c31e00a498e95d9b2a0")
  public open fun resourceQuery(`value`: ResourceQueryProperty.Builder.() -> Unit): Unit =
      resourceQuery(ResourceQueryProperty(`value`))

  /**
   * A list of the Amazon Resource Names (ARNs) of AWS resources that you want to add to the
   * specified group.
   */
  public open fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  /**
   * A list of the Amazon Resource Names (ARNs) of AWS resources that you want to add to the
   * specified group.
   */
  public open fun resources(`value`: List<String>) {
    unwrap(this).setResources(`value`)
  }

  /**
   * A list of the Amazon Resource Names (ARNs) of AWS resources that you want to add to the
   * specified group.
   */
  public open fun resources(vararg `value`: String): Unit = resources(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tag key and value pairs that are attached to the resource group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tag key and value pairs that are attached to the resource group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tag key and value pairs that are attached to the resource group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.resourcegroups.CfnGroup].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param configuration The service configuration currently associated with the resource group
     * and in effect for the members of the resource group. 
     */
    public fun configuration(configuration: IResolvable)

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
     * @param configuration The service configuration currently associated with the resource group
     * and in effect for the members of the resource group. 
     */
    public fun configuration(configuration: List<Any>)

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
     * @param configuration The service configuration currently associated with the resource group
     * and in effect for the members of the resource group. 
     */
    public fun configuration(vararg configuration: Any)

    /**
     * The description of the resource group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-description)
     * @param description The description of the resource group. 
     */
    public fun description(description: String)

    /**
     * The name of a resource group.
     *
     * The name must be unique within the AWS Region in which you create the resource. To create
     * multiple resource groups based on the same CloudFormation stack, you must generate unique names
     * for each.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-name)
     * @param name The name of a resource group. 
     */
    public fun name(name: String)

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
     * @param resourceQuery The resource query structure that is used to dynamically determine which
     * AWS resources are members of the associated resource group. 
     */
    public fun resourceQuery(resourceQuery: IResolvable)

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
     * @param resourceQuery The resource query structure that is used to dynamically determine which
     * AWS resources are members of the associated resource group. 
     */
    public fun resourceQuery(resourceQuery: ResourceQueryProperty)

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
     * @param resourceQuery The resource query structure that is used to dynamically determine which
     * AWS resources are members of the associated resource group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4732f3df54ba438975b7e4ed5106216fc121d4b1ec4be1eb1d1162caa68037ab")
    public fun resourceQuery(resourceQuery: ResourceQueryProperty.Builder.() -> Unit)

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
     * @param resources A list of the Amazon Resource Names (ARNs) of AWS resources that you want to
     * add to the specified group. 
     */
    public fun resources(resources: List<String>)

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
     * @param resources A list of the Amazon Resource Names (ARNs) of AWS resources that you want to
     * add to the specified group. 
     */
    public fun resources(vararg resources: String)

    /**
     * The tag key and value pairs that are attached to the resource group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-tags)
     * @param tags The tag key and value pairs that are attached to the resource group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tag key and value pairs that are attached to the resource group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-tags)
     * @param tags The tag key and value pairs that are attached to the resource group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resourcegroups.CfnGroup.Builder =
        software.amazon.awscdk.services.resourcegroups.CfnGroup.Builder.create(scope, id)

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
     * @param configuration The service configuration currently associated with the resource group
     * and in effect for the members of the resource group. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

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
     * @param configuration The service configuration currently associated with the resource group
     * and in effect for the members of the resource group. 
     */
    override fun configuration(configuration: List<Any>) {
      cdkBuilder.configuration(configuration)
    }

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
     * @param configuration The service configuration currently associated with the resource group
     * and in effect for the members of the resource group. 
     */
    override fun configuration(vararg configuration: Any): Unit =
        configuration(configuration.toList())

    /**
     * The description of the resource group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-description)
     * @param description The description of the resource group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of a resource group.
     *
     * The name must be unique within the AWS Region in which you create the resource. To create
     * multiple resource groups based on the same CloudFormation stack, you must generate unique names
     * for each.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-name)
     * @param name The name of a resource group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param resourceQuery The resource query structure that is used to dynamically determine which
     * AWS resources are members of the associated resource group. 
     */
    override fun resourceQuery(resourceQuery: IResolvable) {
      cdkBuilder.resourceQuery(resourceQuery.let(IResolvable::unwrap))
    }

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
     * @param resourceQuery The resource query structure that is used to dynamically determine which
     * AWS resources are members of the associated resource group. 
     */
    override fun resourceQuery(resourceQuery: ResourceQueryProperty) {
      cdkBuilder.resourceQuery(resourceQuery.let(ResourceQueryProperty::unwrap))
    }

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
     * @param resourceQuery The resource query structure that is used to dynamically determine which
     * AWS resources are members of the associated resource group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4732f3df54ba438975b7e4ed5106216fc121d4b1ec4be1eb1d1162caa68037ab")
    override fun resourceQuery(resourceQuery: ResourceQueryProperty.Builder.() -> Unit): Unit =
        resourceQuery(ResourceQueryProperty(resourceQuery))

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
     * @param resources A list of the Amazon Resource Names (ARNs) of AWS resources that you want to
     * add to the specified group. 
     */
    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

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
     * @param resources A list of the Amazon Resource Names (ARNs) of AWS resources that you want to
     * add to the specified group. 
     */
    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    /**
     * The tag key and value pairs that are attached to the resource group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-tags)
     * @param tags The tag key and value pairs that are attached to the resource group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tag key and value pairs that are attached to the resource group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourcegroups-group.html#cfn-resourcegroups-group-tags)
     * @param tags The tag key and value pairs that are attached to the resource group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.resourcegroups.CfnGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.resourcegroups.CfnGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup): CfnGroup
        = CfnGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGroup): software.amazon.awscdk.services.resourcegroups.CfnGroup
        = wrapped.cdkObject
  }

  /**
   * The query used to dynamically define the members of a group.
   *
   * For more information about how to construct a query, see [Build queries and groups in AWS
   * Resource Groups](https://docs.aws.amazon.com//ARG/latest/userguide/gettingstarted-query.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.resourcegroups.*;
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
  public interface ResourceQueryProperty {
    /**
     * The query that defines the membership of the group.
     *
     * This is a structure with properties that depend on the `Type` .
     *
     * The `Query` structure must be included in the following scenarios:
     *
     * * When the `Type` is `TAG_FILTERS_1_0` , you must specify a `Query` structure that contains a
     * `TagFilters` list of tags. Resources with tags that match those in the `TagFilter` list become
     * members of the resource group.
     * * When the `Type` is `CLOUDFORMATION_STACK_1_0` then this field is required only when you
     * must specify a CloudFormation stack other than the one you are defining. To do this, the `Query`
     * structure must contain the `StackIdentifier` property. If you don't specify either a `Query`
     * structure or a `StackIdentifier` within that `Query` , then it defaults to the CloudFormation
     * stack that you're currently constructing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-resourcequery.html#cfn-resourcegroups-group-resourcequery-query)
     */
    public fun query(): Any? = unwrap(this).getQuery()

    /**
     * Specifies the type of resource query that determines this group's membership. There are two
     * valid query types:.
     *
     * * `TAG_FILTERS_1_0` indicates that the group is a tag-based group. To complete the group
     * membership, you must include the `TagFilters` property to specify the tag filters to use in the
     * query.
     * * `CLOUDFORMATION_STACK_1_0` , the default, indicates that the group is a CloudFormation
     * stack-based group. Group membership is based on the CloudFormation stack. You must specify the
     * `StackIdentifier` property in the query to define which stack to associate the group with, or
     * leave it empty to default to the stack where the group is defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-resourcequery.html#cfn-resourcegroups-group-resourcequery-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ResourceQueryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param query The query that defines the membership of the group.
       * This is a structure with properties that depend on the `Type` .
       *
       * The `Query` structure must be included in the following scenarios:
       *
       * * When the `Type` is `TAG_FILTERS_1_0` , you must specify a `Query` structure that contains
       * a `TagFilters` list of tags. Resources with tags that match those in the `TagFilter` list
       * become members of the resource group.
       * * When the `Type` is `CLOUDFORMATION_STACK_1_0` then this field is required only when you
       * must specify a CloudFormation stack other than the one you are defining. To do this, the
       * `Query` structure must contain the `StackIdentifier` property. If you don't specify either a
       * `Query` structure or a `StackIdentifier` within that `Query` , then it defaults to the
       * CloudFormation stack that you're currently constructing.
       */
      public fun query(query: IResolvable)

      /**
       * @param query The query that defines the membership of the group.
       * This is a structure with properties that depend on the `Type` .
       *
       * The `Query` structure must be included in the following scenarios:
       *
       * * When the `Type` is `TAG_FILTERS_1_0` , you must specify a `Query` structure that contains
       * a `TagFilters` list of tags. Resources with tags that match those in the `TagFilter` list
       * become members of the resource group.
       * * When the `Type` is `CLOUDFORMATION_STACK_1_0` then this field is required only when you
       * must specify a CloudFormation stack other than the one you are defining. To do this, the
       * `Query` structure must contain the `StackIdentifier` property. If you don't specify either a
       * `Query` structure or a `StackIdentifier` within that `Query` , then it defaults to the
       * CloudFormation stack that you're currently constructing.
       */
      public fun query(query: QueryProperty)

      /**
       * @param query The query that defines the membership of the group.
       * This is a structure with properties that depend on the `Type` .
       *
       * The `Query` structure must be included in the following scenarios:
       *
       * * When the `Type` is `TAG_FILTERS_1_0` , you must specify a `Query` structure that contains
       * a `TagFilters` list of tags. Resources with tags that match those in the `TagFilter` list
       * become members of the resource group.
       * * When the `Type` is `CLOUDFORMATION_STACK_1_0` then this field is required only when you
       * must specify a CloudFormation stack other than the one you are defining. To do this, the
       * `Query` structure must contain the `StackIdentifier` property. If you don't specify either a
       * `Query` structure or a `StackIdentifier` within that `Query` , then it defaults to the
       * CloudFormation stack that you're currently constructing.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5f4652e493f93af8130a6eb2ac9332223eea6a60935ee3b8c65ab7fae91ec69")
      public fun query(query: QueryProperty.Builder.() -> Unit)

      /**
       * @param type Specifies the type of resource query that determines this group's membership.
       * There are two valid query types:.
       * * `TAG_FILTERS_1_0` indicates that the group is a tag-based group. To complete the group
       * membership, you must include the `TagFilters` property to specify the tag filters to use in
       * the query.
       * * `CLOUDFORMATION_STACK_1_0` , the default, indicates that the group is a CloudFormation
       * stack-based group. Group membership is based on the CloudFormation stack. You must specify the
       * `StackIdentifier` property in the query to define which stack to associate the group with, or
       * leave it empty to default to the stack where the group is defined.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty.Builder =
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty.builder()

      /**
       * @param query The query that defines the membership of the group.
       * This is a structure with properties that depend on the `Type` .
       *
       * The `Query` structure must be included in the following scenarios:
       *
       * * When the `Type` is `TAG_FILTERS_1_0` , you must specify a `Query` structure that contains
       * a `TagFilters` list of tags. Resources with tags that match those in the `TagFilter` list
       * become members of the resource group.
       * * When the `Type` is `CLOUDFORMATION_STACK_1_0` then this field is required only when you
       * must specify a CloudFormation stack other than the one you are defining. To do this, the
       * `Query` structure must contain the `StackIdentifier` property. If you don't specify either a
       * `Query` structure or a `StackIdentifier` within that `Query` , then it defaults to the
       * CloudFormation stack that you're currently constructing.
       */
      override fun query(query: IResolvable) {
        cdkBuilder.query(query.let(IResolvable::unwrap))
      }

      /**
       * @param query The query that defines the membership of the group.
       * This is a structure with properties that depend on the `Type` .
       *
       * The `Query` structure must be included in the following scenarios:
       *
       * * When the `Type` is `TAG_FILTERS_1_0` , you must specify a `Query` structure that contains
       * a `TagFilters` list of tags. Resources with tags that match those in the `TagFilter` list
       * become members of the resource group.
       * * When the `Type` is `CLOUDFORMATION_STACK_1_0` then this field is required only when you
       * must specify a CloudFormation stack other than the one you are defining. To do this, the
       * `Query` structure must contain the `StackIdentifier` property. If you don't specify either a
       * `Query` structure or a `StackIdentifier` within that `Query` , then it defaults to the
       * CloudFormation stack that you're currently constructing.
       */
      override fun query(query: QueryProperty) {
        cdkBuilder.query(query.let(QueryProperty::unwrap))
      }

      /**
       * @param query The query that defines the membership of the group.
       * This is a structure with properties that depend on the `Type` .
       *
       * The `Query` structure must be included in the following scenarios:
       *
       * * When the `Type` is `TAG_FILTERS_1_0` , you must specify a `Query` structure that contains
       * a `TagFilters` list of tags. Resources with tags that match those in the `TagFilter` list
       * become members of the resource group.
       * * When the `Type` is `CLOUDFORMATION_STACK_1_0` then this field is required only when you
       * must specify a CloudFormation stack other than the one you are defining. To do this, the
       * `Query` structure must contain the `StackIdentifier` property. If you don't specify either a
       * `Query` structure or a `StackIdentifier` within that `Query` , then it defaults to the
       * CloudFormation stack that you're currently constructing.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5f4652e493f93af8130a6eb2ac9332223eea6a60935ee3b8c65ab7fae91ec69")
      override fun query(query: QueryProperty.Builder.() -> Unit): Unit =
          query(QueryProperty(query))

      /**
       * @param type Specifies the type of resource query that determines this group's membership.
       * There are two valid query types:.
       * * `TAG_FILTERS_1_0` indicates that the group is a tag-based group. To complete the group
       * membership, you must include the `TagFilters` property to specify the tag filters to use in
       * the query.
       * * `CLOUDFORMATION_STACK_1_0` , the default, indicates that the group is a CloudFormation
       * stack-based group. Group membership is based on the CloudFormation stack. You must specify the
       * `StackIdentifier` property in the query to define which stack to associate the group with, or
       * leave it empty to default to the stack where the group is defined.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty,
    ) : CdkObject(cdkObject), ResourceQueryProperty {
      /**
       * The query that defines the membership of the group.
       *
       * This is a structure with properties that depend on the `Type` .
       *
       * The `Query` structure must be included in the following scenarios:
       *
       * * When the `Type` is `TAG_FILTERS_1_0` , you must specify a `Query` structure that contains
       * a `TagFilters` list of tags. Resources with tags that match those in the `TagFilter` list
       * become members of the resource group.
       * * When the `Type` is `CLOUDFORMATION_STACK_1_0` then this field is required only when you
       * must specify a CloudFormation stack other than the one you are defining. To do this, the
       * `Query` structure must contain the `StackIdentifier` property. If you don't specify either a
       * `Query` structure or a `StackIdentifier` within that `Query` , then it defaults to the
       * CloudFormation stack that you're currently constructing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-resourcequery.html#cfn-resourcegroups-group-resourcequery-query)
       */
      override fun query(): Any? = unwrap(this).getQuery()

      /**
       * Specifies the type of resource query that determines this group's membership. There are two
       * valid query types:.
       *
       * * `TAG_FILTERS_1_0` indicates that the group is a tag-based group. To complete the group
       * membership, you must include the `TagFilters` property to specify the tag filters to use in
       * the query.
       * * `CLOUDFORMATION_STACK_1_0` , the default, indicates that the group is a CloudFormation
       * stack-based group. Group membership is based on the CloudFormation stack. You must specify the
       * `StackIdentifier` property in the query to define which stack to associate the group with, or
       * leave it empty to default to the stack where the group is defined.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-resourcequery.html#cfn-resourcegroups-group-resourcequery-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceQueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty):
          ResourceQueryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceQueryProperty):
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty
    }
  }

  /**
   * Specifies details within a `ResourceQuery` structure that determines the membership of the
   * resource group.
   *
   * The contents required in the `Query` structure are determined by the `Type` property of the
   * containing `ResourceQuery` structure.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.resourcegroups.*;
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
  public interface QueryProperty {
    /**
     * Specifies limits to the types of resources that can be included in the resource group.
     *
     * For example, if `ResourceTypeFilters` is `["AWS::EC2::Instance", "AWS::DynamoDB::Table"]` ,
     * only EC2 instances or DynamoDB tables can be members of this resource group. The default value
     * is `["AWS::AllSupported"]` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-resourcetypefilters)
     */
    public fun resourceTypeFilters(): List<String> = unwrap(this).getResourceTypeFilters() ?:
        emptyList()

    /**
     * Specifies the ARN of a CloudFormation stack.
     *
     * All supported resources of the CloudFormation stack are members of the resource group. If you
     * don't specify an ARN, this parameter defaults to the current stack that you are defining, which
     * means that all the resources of the current stack are grouped.
     *
     * You can specify a value for `StackIdentifier` only when the `ResourceQuery.Type` property is
     * `CLOUDFORMATION_STACK_1_0.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-stackidentifier)
     */
    public fun stackIdentifier(): String? = unwrap(this).getStackIdentifier()

    /**
     * A list of key-value pair objects that limit which resources can be members of the resource
     * group.
     *
     * This property is required when the `ResourceQuery.Type` property is `TAG_FILTERS_1_0` .
     *
     * A resource must have a tag that matches every filter that is provided in the `TagFilters`
     * list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-tagfilters)
     */
    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    /**
     * A builder for [QueryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceTypeFilters Specifies limits to the types of resources that can be included
       * in the resource group.
       * For example, if `ResourceTypeFilters` is `["AWS::EC2::Instance", "AWS::DynamoDB::Table"]` ,
       * only EC2 instances or DynamoDB tables can be members of this resource group. The default value
       * is `["AWS::AllSupported"]` .
       */
      public fun resourceTypeFilters(resourceTypeFilters: List<String>)

      /**
       * @param resourceTypeFilters Specifies limits to the types of resources that can be included
       * in the resource group.
       * For example, if `ResourceTypeFilters` is `["AWS::EC2::Instance", "AWS::DynamoDB::Table"]` ,
       * only EC2 instances or DynamoDB tables can be members of this resource group. The default value
       * is `["AWS::AllSupported"]` .
       */
      public fun resourceTypeFilters(vararg resourceTypeFilters: String)

      /**
       * @param stackIdentifier Specifies the ARN of a CloudFormation stack.
       * All supported resources of the CloudFormation stack are members of the resource group. If
       * you don't specify an ARN, this parameter defaults to the current stack that you are defining,
       * which means that all the resources of the current stack are grouped.
       *
       * You can specify a value for `StackIdentifier` only when the `ResourceQuery.Type` property
       * is `CLOUDFORMATION_STACK_1_0.`
       */
      public fun stackIdentifier(stackIdentifier: String)

      /**
       * @param tagFilters A list of key-value pair objects that limit which resources can be
       * members of the resource group.
       * This property is required when the `ResourceQuery.Type` property is `TAG_FILTERS_1_0` .
       *
       * A resource must have a tag that matches every filter that is provided in the `TagFilters`
       * list.
       */
      public fun tagFilters(tagFilters: IResolvable)

      /**
       * @param tagFilters A list of key-value pair objects that limit which resources can be
       * members of the resource group.
       * This property is required when the `ResourceQuery.Type` property is `TAG_FILTERS_1_0` .
       *
       * A resource must have a tag that matches every filter that is provided in the `TagFilters`
       * list.
       */
      public fun tagFilters(tagFilters: List<Any>)

      /**
       * @param tagFilters A list of key-value pair objects that limit which resources can be
       * members of the resource group.
       * This property is required when the `ResourceQuery.Type` property is `TAG_FILTERS_1_0` .
       *
       * A resource must have a tag that matches every filter that is provided in the `TagFilters`
       * list.
       */
      public fun tagFilters(vararg tagFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty.Builder =
          software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty.builder()

      /**
       * @param resourceTypeFilters Specifies limits to the types of resources that can be included
       * in the resource group.
       * For example, if `ResourceTypeFilters` is `["AWS::EC2::Instance", "AWS::DynamoDB::Table"]` ,
       * only EC2 instances or DynamoDB tables can be members of this resource group. The default value
       * is `["AWS::AllSupported"]` .
       */
      override fun resourceTypeFilters(resourceTypeFilters: List<String>) {
        cdkBuilder.resourceTypeFilters(resourceTypeFilters)
      }

      /**
       * @param resourceTypeFilters Specifies limits to the types of resources that can be included
       * in the resource group.
       * For example, if `ResourceTypeFilters` is `["AWS::EC2::Instance", "AWS::DynamoDB::Table"]` ,
       * only EC2 instances or DynamoDB tables can be members of this resource group. The default value
       * is `["AWS::AllSupported"]` .
       */
      override fun resourceTypeFilters(vararg resourceTypeFilters: String): Unit =
          resourceTypeFilters(resourceTypeFilters.toList())

      /**
       * @param stackIdentifier Specifies the ARN of a CloudFormation stack.
       * All supported resources of the CloudFormation stack are members of the resource group. If
       * you don't specify an ARN, this parameter defaults to the current stack that you are defining,
       * which means that all the resources of the current stack are grouped.
       *
       * You can specify a value for `StackIdentifier` only when the `ResourceQuery.Type` property
       * is `CLOUDFORMATION_STACK_1_0.`
       */
      override fun stackIdentifier(stackIdentifier: String) {
        cdkBuilder.stackIdentifier(stackIdentifier)
      }

      /**
       * @param tagFilters A list of key-value pair objects that limit which resources can be
       * members of the resource group.
       * This property is required when the `ResourceQuery.Type` property is `TAG_FILTERS_1_0` .
       *
       * A resource must have a tag that matches every filter that is provided in the `TagFilters`
       * list.
       */
      override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      /**
       * @param tagFilters A list of key-value pair objects that limit which resources can be
       * members of the resource group.
       * This property is required when the `ResourceQuery.Type` property is `TAG_FILTERS_1_0` .
       *
       * A resource must have a tag that matches every filter that is provided in the `TagFilters`
       * list.
       */
      override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      /**
       * @param tagFilters A list of key-value pair objects that limit which resources can be
       * members of the resource group.
       * This property is required when the `ResourceQuery.Type` property is `TAG_FILTERS_1_0` .
       *
       * A resource must have a tag that matches every filter that is provided in the `TagFilters`
       * list.
       */
      override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

      public fun build(): software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty,
    ) : CdkObject(cdkObject), QueryProperty {
      /**
       * Specifies limits to the types of resources that can be included in the resource group.
       *
       * For example, if `ResourceTypeFilters` is `["AWS::EC2::Instance", "AWS::DynamoDB::Table"]` ,
       * only EC2 instances or DynamoDB tables can be members of this resource group. The default value
       * is `["AWS::AllSupported"]` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-resourcetypefilters)
       */
      override fun resourceTypeFilters(): List<String> = unwrap(this).getResourceTypeFilters() ?:
          emptyList()

      /**
       * Specifies the ARN of a CloudFormation stack.
       *
       * All supported resources of the CloudFormation stack are members of the resource group. If
       * you don't specify an ARN, this parameter defaults to the current stack that you are defining,
       * which means that all the resources of the current stack are grouped.
       *
       * You can specify a value for `StackIdentifier` only when the `ResourceQuery.Type` property
       * is `CLOUDFORMATION_STACK_1_0.`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-stackidentifier)
       */
      override fun stackIdentifier(): String? = unwrap(this).getStackIdentifier()

      /**
       * A list of key-value pair objects that limit which resources can be members of the resource
       * group.
       *
       * This property is required when the `ResourceQuery.Type` property is `TAG_FILTERS_1_0` .
       *
       * A resource must have a tag that matches every filter that is provided in the `TagFilters`
       * list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-query.html#cfn-resourcegroups-group-query-tagfilters)
       */
      override fun tagFilters(): Any? = unwrap(this).getTagFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty):
          QueryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryProperty):
          software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty
    }
  }

  /**
   * Specifies a single tag key and optional values that you can use to specify membership in a
   * tag-based group.
   *
   * An AWS resource that doesn't have a matching tag key and value is rejected as a member of the
   * group.
   *
   * A `TagFilter` object includes two properties: `Key` (a string) and `Values` (a list of
   * strings). Only resources in the account that are tagged with a matching key-value pair are members
   * of the group. The `Values` property of `TagFilter` is optional, but specifying it narrows the
   * query results.
   *
   * As an example, suppose the `TagFilters` string is `[{"Key": "Stage", "Values": ["Test",
   * "Beta"]}, {"Key": "Storage"}]` . In this case, only resources with all of the following tags are
   * members of the group:
   *
   * * `Stage` tag key with a value of either `Test` or `Beta`
   * * `Storage` tag key with any value
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.resourcegroups.*;
   * TagFilterProperty tagFilterProperty = TagFilterProperty.builder()
   * .key("key")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-tagfilter.html)
   */
  public interface TagFilterProperty {
    /**
     * A string that defines a tag key.
     *
     * Only resources in the account that are tagged with a specified tag key are members of the
     * tag-based resource group.
     *
     * This field is required when the `ResourceQuery` structure's `Type` property is
     * `TAG_FILTERS_1_0` . You must specify at least one tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-tagfilter.html#cfn-resourcegroups-group-tagfilter-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * A list of tag values that can be included in the tag-based resource group.
     *
     * This is optional. If you don't specify a value or values for a key, then an AWS resource with
     * any value for that key is a member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-tagfilter.html#cfn-resourcegroups-group-tagfilter-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [TagFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key A string that defines a tag key.
       * Only resources in the account that are tagged with a specified tag key are members of the
       * tag-based resource group.
       *
       * This field is required when the `ResourceQuery` structure's `Type` property is
       * `TAG_FILTERS_1_0` . You must specify at least one tag key.
       */
      public fun key(key: String)

      /**
       * @param values A list of tag values that can be included in the tag-based resource group.
       * This is optional. If you don't specify a value or values for a key, then an AWS resource
       * with any value for that key is a member.
       */
      public fun values(values: List<String>)

      /**
       * @param values A list of tag values that can be included in the tag-based resource group.
       * This is optional. If you don't specify a value or values for a key, then an AWS resource
       * with any value for that key is a member.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty.Builder =
          software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty.builder()

      /**
       * @param key A string that defines a tag key.
       * Only resources in the account that are tagged with a specified tag key are members of the
       * tag-based resource group.
       *
       * This field is required when the `ResourceQuery` structure's `Type` property is
       * `TAG_FILTERS_1_0` . You must specify at least one tag key.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param values A list of tag values that can be included in the tag-based resource group.
       * This is optional. If you don't specify a value or values for a key, then an AWS resource
       * with any value for that key is a member.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values A list of tag values that can be included in the tag-based resource group.
       * This is optional. If you don't specify a value or values for a key, then an AWS resource
       * with any value for that key is a member.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty,
    ) : CdkObject(cdkObject), TagFilterProperty {
      /**
       * A string that defines a tag key.
       *
       * Only resources in the account that are tagged with a specified tag key are members of the
       * tag-based resource group.
       *
       * This field is required when the `ResourceQuery` structure's `Type` property is
       * `TAG_FILTERS_1_0` . You must specify at least one tag key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-tagfilter.html#cfn-resourcegroups-group-tagfilter-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * A list of tag values that can be included in the tag-based resource group.
       *
       * This is optional. If you don't specify a value or values for a key, then an AWS resource
       * with any value for that key is a member.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-tagfilter.html#cfn-resourcegroups-group-tagfilter-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty):
          TagFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagFilterProperty):
          software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty
    }
  }

  /**
   * One of the items in the service configuration assigned to a resource group.
   *
   * A service configuration can consist of one or more items. For details service configurations
   * and how to construct them, see [Service configurations for resource
   * groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the *AWS Resource
   * Groups User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.resourcegroups.*;
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
  public interface ConfigurationItemProperty {
    /**
     * A collection of parameters for this configuration item.
     *
     * For the list of parameters that you can use with each configuration item `Type` , see
     * [Supported resource types and
     * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types)
     * in the *AWS Resource Groups User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-configurationitem.html#cfn-resourcegroups-group-configurationitem-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * Specifies the type of configuration item.
     *
     * Each item must have a unique value for type. For the list of the types that you can specify
     * for a configuration item, see [Supported resource types and
     * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types)
     * in the *AWS Resource Groups User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-configurationitem.html#cfn-resourcegroups-group-configurationitem-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ConfigurationItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameters A collection of parameters for this configuration item.
       * For the list of parameters that you can use with each configuration item `Type` , see
       * [Supported resource types and
       * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters A collection of parameters for this configuration item.
       * For the list of parameters that you can use with each configuration item `Type` , see
       * [Supported resource types and
       * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       */
      public fun parameters(parameters: List<Any>)

      /**
       * @param parameters A collection of parameters for this configuration item.
       * For the list of parameters that you can use with each configuration item `Type` , see
       * [Supported resource types and
       * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       */
      public fun parameters(vararg parameters: Any)

      /**
       * @param type Specifies the type of configuration item.
       * Each item must have a unique value for type. For the list of the types that you can specify
       * for a configuration item, see [Supported resource types and
       * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty.Builder
          =
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty.builder()

      /**
       * @param parameters A collection of parameters for this configuration item.
       * For the list of parameters that you can use with each configuration item `Type` , see
       * [Supported resource types and
       * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters A collection of parameters for this configuration item.
       * For the list of parameters that you can use with each configuration item `Type` , see
       * [Supported resource types and
       * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       */
      override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param parameters A collection of parameters for this configuration item.
       * For the list of parameters that you can use with each configuration item `Type` , see
       * [Supported resource types and
       * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       */
      override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

      /**
       * @param type Specifies the type of configuration item.
       * Each item must have a unique value for type. For the list of the types that you can specify
       * for a configuration item, see [Supported resource types and
       * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty,
    ) : CdkObject(cdkObject), ConfigurationItemProperty {
      /**
       * A collection of parameters for this configuration item.
       *
       * For the list of parameters that you can use with each configuration item `Type` , see
       * [Supported resource types and
       * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-configurationitem.html#cfn-resourcegroups-group-configurationitem-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * Specifies the type of configuration item.
       *
       * Each item must have a unique value for type. For the list of the types that you can specify
       * for a configuration item, see [Supported resource types and
       * parameters](https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-configurationitem.html#cfn-resourcegroups-group-configurationitem-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty):
          ConfigurationItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationItemProperty):
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty
    }
  }

  /**
   * One parameter for a group configuration item.
   *
   * For details about service configurations and how to construct them, see [Service configurations
   * for resource groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the
   * *AWS Resource Groups User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.resourcegroups.*;
   * ConfigurationParameterProperty configurationParameterProperty =
   * ConfigurationParameterProperty.builder()
   * .name("name")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-configurationparameter.html)
   */
  public interface ConfigurationParameterProperty {
    /**
     * The name of the group configuration parameter.
     *
     * For the list of parameters that you can use with each configuration item type, see [Supported
     * resource types and
     * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types)
     * in the *AWS Resource Groups User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-configurationparameter.html#cfn-resourcegroups-group-configurationparameter-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value or values to be used for the specified parameter.
     *
     * For the list of values you can use with each parameter, see [Supported resource types and
     * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-configurationparameter.html#cfn-resourcegroups-group-configurationparameter-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [ConfigurationParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the group configuration parameter.
       * For the list of parameters that you can use with each configuration item type, see
       * [Supported resource types and
       * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       */
      public fun name(name: String)

      /**
       * @param values The value or values to be used for the specified parameter.
       * For the list of values you can use with each parameter, see [Supported resource types and
       * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types)
       * .
       */
      public fun values(values: List<String>)

      /**
       * @param values The value or values to be used for the specified parameter.
       * For the list of values you can use with each parameter, see [Supported resource types and
       * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types)
       * .
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty.Builder
          =
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty.builder()

      /**
       * @param name The name of the group configuration parameter.
       * For the list of parameters that you can use with each configuration item type, see
       * [Supported resource types and
       * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param values The value or values to be used for the specified parameter.
       * For the list of values you can use with each parameter, see [Supported resource types and
       * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types)
       * .
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The value or values to be used for the specified parameter.
       * For the list of values you can use with each parameter, see [Supported resource types and
       * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types)
       * .
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty,
    ) : CdkObject(cdkObject), ConfigurationParameterProperty {
      /**
       * The name of the group configuration parameter.
       *
       * For the list of parameters that you can use with each configuration item type, see
       * [Supported resource types and
       * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types)
       * in the *AWS Resource Groups User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-configurationparameter.html#cfn-resourcegroups-group-configurationparameter-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value or values to be used for the specified parameter.
       *
       * For the list of values you can use with each parameter, see [Supported resource types and
       * parameters](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html#about-slg-types)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-configurationparameter.html#cfn-resourcegroups-group-configurationparameter-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty):
          ConfigurationParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationParameterProperty):
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty
    }
  }
}
