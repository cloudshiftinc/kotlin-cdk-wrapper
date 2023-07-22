@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourcegroups

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resourcegroups.CfnGroup

@CdkDslMarker
public class CfnGroupQueryPropertyDsl {
  private val cdkBuilder: CfnGroup.QueryProperty.Builder = CfnGroup.QueryProperty.builder()

  private val _resourceTypeFilters: MutableList<String> = mutableListOf()

  private val _tagFilters: MutableList<Any> = mutableListOf()

  /**
   * @param resourceTypeFilters Specifies limits to the types of resources that can be included in
   * the resource group.
   * For example, if `ResourceTypeFilters` is `["AWS::EC2::Instance", "AWS::DynamoDB::Table"]` ,
   * only EC2 instances or DynamoDB tables can be members of this resource group. The default value is
   * `["AWS::AllSupported"]` .
   */
  public fun resourceTypeFilters(vararg resourceTypeFilters: String) {
    _resourceTypeFilters.addAll(listOf(*resourceTypeFilters))
  }

  /**
   * @param resourceTypeFilters Specifies limits to the types of resources that can be included in
   * the resource group.
   * For example, if `ResourceTypeFilters` is `["AWS::EC2::Instance", "AWS::DynamoDB::Table"]` ,
   * only EC2 instances or DynamoDB tables can be members of this resource group. The default value is
   * `["AWS::AllSupported"]` .
   */
  public fun resourceTypeFilters(resourceTypeFilters: Collection<String>) {
    _resourceTypeFilters.addAll(resourceTypeFilters)
  }

  /**
   * @param stackIdentifier Specifies the ARN of a CloudFormation stack.
   * All supported resources of the CloudFormation stack are members of the resource group. If you
   * don't specify an ARN, this parameter defaults to the current stack that you are defining, which
   * means that all the resources of the current stack are grouped.
   *
   * You can specify a value for `StackIdentifier` only when the `ResourceQuery.Type` property is
   * `CLOUDFORMATION_STACK_1_0.`
   */
  public fun stackIdentifier(stackIdentifier: String) {
    cdkBuilder.stackIdentifier(stackIdentifier)
  }

  /**
   * @param tagFilters A list of key-value pair objects that limit which resources can be members of
   * the resource group.
   * This property is required when the `ResourceQuery.Type` property is `TAG_FILTERS_1_0` .
   *
   * A resource must have a tag that matches every filter that is provided in the `TagFilters` list.
   */
  public fun tagFilters(vararg tagFilters: Any) {
    _tagFilters.addAll(listOf(*tagFilters))
  }

  /**
   * @param tagFilters A list of key-value pair objects that limit which resources can be members of
   * the resource group.
   * This property is required when the `ResourceQuery.Type` property is `TAG_FILTERS_1_0` .
   *
   * A resource must have a tag that matches every filter that is provided in the `TagFilters` list.
   */
  public fun tagFilters(tagFilters: Collection<Any>) {
    _tagFilters.addAll(tagFilters)
  }

  /**
   * @param tagFilters A list of key-value pair objects that limit which resources can be members of
   * the resource group.
   * This property is required when the `ResourceQuery.Type` property is `TAG_FILTERS_1_0` .
   *
   * A resource must have a tag that matches every filter that is provided in the `TagFilters` list.
   */
  public fun tagFilters(tagFilters: IResolvable) {
    cdkBuilder.tagFilters(tagFilters)
  }

  public fun build(): CfnGroup.QueryProperty {
    if(_resourceTypeFilters.isNotEmpty()) cdkBuilder.resourceTypeFilters(_resourceTypeFilters)
    if(_tagFilters.isNotEmpty()) cdkBuilder.tagFilters(_tagFilters)
    return cdkBuilder.build()
  }
}
