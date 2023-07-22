@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourcegroups

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resourcegroups.CfnGroup
import software.amazon.awscdk.services.resourcegroups.CfnGroupProps

@CdkDslMarker
public class CfnGroupPropsDsl {
  private val cdkBuilder: CfnGroupProps.Builder = CfnGroupProps.builder()

  private val _configuration: MutableList<Any> = mutableListOf()

  private val _resources: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param configuration The service configuration currently associated with the resource group and
   * in effect for the members of the resource group.
   * A `Configuration` consists of one or more `ConfigurationItem` entries. For information about
   * service configurations for resource groups and how to construct them, see [Service configurations
   * for resource groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the
   * *AWS Resource Groups User Guide* .
   *
   *
   * You can include either a `Configuration` or a `ResourceQuery` , but not both.
   */
  public fun configuration(vararg configuration: Any) {
    _configuration.addAll(listOf(*configuration))
  }

  /**
   * @param configuration The service configuration currently associated with the resource group and
   * in effect for the members of the resource group.
   * A `Configuration` consists of one or more `ConfigurationItem` entries. For information about
   * service configurations for resource groups and how to construct them, see [Service configurations
   * for resource groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the
   * *AWS Resource Groups User Guide* .
   *
   *
   * You can include either a `Configuration` or a `ResourceQuery` , but not both.
   */
  public fun configuration(configuration: Collection<Any>) {
    _configuration.addAll(configuration)
  }

  /**
   * @param configuration The service configuration currently associated with the resource group and
   * in effect for the members of the resource group.
   * A `Configuration` consists of one or more `ConfigurationItem` entries. For information about
   * service configurations for resource groups and how to construct them, see [Service configurations
   * for resource groups](https://docs.aws.amazon.com//ARG/latest/APIReference/about-slg.html) in the
   * *AWS Resource Groups User Guide* .
   *
   *
   * You can include either a `Configuration` or a `ResourceQuery` , but not both.
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param description The description of the resource group.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of a resource group. 
   * The name must be unique within the AWS Region in which you create the resource. To create
   * multiple resource groups based on the same CloudFormation stack, you must generate unique names
   * for each.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param resourceQuery The resource query structure that is used to dynamically determine which
   * AWS resources are members of the associated resource group.
   * For more information about queries and how to construct them, see [Build queries and groups in
   * AWS Resource Groups](https://docs.aws.amazon.com//ARG/latest/userguide/gettingstarted-query.html)
   * in the *AWS Resource Groups User Guide*
   *
   *
   * * You can include either a `ResourceQuery` or a `Configuration` , but not both.
   * * You can specify the group's membership either by using a `ResourceQuery` or by using a list
   * of `Resources` , but not both.
   */
  public fun resourceQuery(resourceQuery: IResolvable) {
    cdkBuilder.resourceQuery(resourceQuery)
  }

  /**
   * @param resourceQuery The resource query structure that is used to dynamically determine which
   * AWS resources are members of the associated resource group.
   * For more information about queries and how to construct them, see [Build queries and groups in
   * AWS Resource Groups](https://docs.aws.amazon.com//ARG/latest/userguide/gettingstarted-query.html)
   * in the *AWS Resource Groups User Guide*
   *
   *
   * * You can include either a `ResourceQuery` or a `Configuration` , but not both.
   * * You can specify the group's membership either by using a `ResourceQuery` or by using a list
   * of `Resources` , but not both.
   */
  public fun resourceQuery(resourceQuery: CfnGroup.ResourceQueryProperty) {
    cdkBuilder.resourceQuery(resourceQuery)
  }

  /**
   * @param resources A list of the Amazon Resource Names (ARNs) of AWS resources that you want to
   * add to the specified group.
   *
   * * You can specify the group membership either by using a list of `Resources` or by using a
   * `ResourceQuery` , but not both.
   * * You can include a `Resources` property only if you also specify a `Configuration` property.
   */
  public fun resources(vararg resources: String) {
    _resources.addAll(listOf(*resources))
  }

  /**
   * @param resources A list of the Amazon Resource Names (ARNs) of AWS resources that you want to
   * add to the specified group.
   *
   * * You can specify the group membership either by using a list of `Resources` or by using a
   * `ResourceQuery` , but not both.
   * * You can include a `Resources` property only if you also specify a `Configuration` property.
   */
  public fun resources(resources: Collection<String>) {
    _resources.addAll(resources)
  }

  /**
   * @param tags The tag key and value pairs that are attached to the resource group.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tag key and value pairs that are attached to the resource group.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnGroupProps {
    if(_configuration.isNotEmpty()) cdkBuilder.configuration(_configuration)
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
