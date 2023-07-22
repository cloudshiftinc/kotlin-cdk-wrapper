@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import software.constructs.Construct

@CdkDslMarker
public class CfnCalculatedAttributeDefinitionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCalculatedAttributeDefinition.Builder =
      CfnCalculatedAttributeDefinition.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Mathematical expression and a list of attribute items specified in that expression.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails)
   * @param attributeDetails Mathematical expression and a list of attribute items specified in that
   * expression. 
   */
  public fun attributeDetails(attributeDetails: IResolvable) {
    cdkBuilder.attributeDetails(attributeDetails)
  }

  /**
   * Mathematical expression and a list of attribute items specified in that expression.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-attributedetails)
   * @param attributeDetails Mathematical expression and a list of attribute items specified in that
   * expression. 
   */
  public
      fun attributeDetails(attributeDetails: CfnCalculatedAttributeDefinition.AttributeDetailsProperty) {
    cdkBuilder.attributeDetails(attributeDetails)
  }

  /**
   * The name of an attribute defined in a profile object type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-calculatedattributename)
   * @param calculatedAttributeName The name of an attribute defined in a profile object type. 
   */
  public fun calculatedAttributeName(calculatedAttributeName: String) {
    cdkBuilder.calculatedAttributeName(calculatedAttributeName)
  }

  /**
   * The conditions including range, object count, and threshold for the calculated attribute.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-conditions)
   * @param conditions The conditions including range, object count, and threshold for the
   * calculated attribute. 
   */
  public fun conditions(conditions: IResolvable) {
    cdkBuilder.conditions(conditions)
  }

  /**
   * The conditions including range, object count, and threshold for the calculated attribute.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-conditions)
   * @param conditions The conditions including range, object count, and threshold for the
   * calculated attribute. 
   */
  public fun conditions(conditions: CfnCalculatedAttributeDefinition.ConditionsProperty) {
    cdkBuilder.conditions(conditions)
  }

  /**
   * The description of the calculated attribute.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-description)
   * @param description The description of the calculated attribute. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The display name of the calculated attribute.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-displayname)
   * @param displayName The display name of the calculated attribute. 
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * The unique name of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-domainname)
   * @param domainName The unique name of the domain. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * The aggregation operation to perform for the calculated attribute.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-statistic)
   * @param statistic The aggregation operation to perform for the calculated attribute. 
   */
  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-calculatedattributedefinition.html#cfn-customerprofiles-calculatedattributedefinition-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCalculatedAttributeDefinition {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
