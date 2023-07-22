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
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinitionProps

@CdkDslMarker
public class CfnCalculatedAttributeDefinitionPropsDsl {
  private val cdkBuilder: CfnCalculatedAttributeDefinitionProps.Builder =
      CfnCalculatedAttributeDefinitionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param attributeDetails Mathematical expression and a list of attribute items specified in that
   * expression. 
   */
  public fun attributeDetails(attributeDetails: IResolvable) {
    cdkBuilder.attributeDetails(attributeDetails)
  }

  /**
   * @param attributeDetails Mathematical expression and a list of attribute items specified in that
   * expression. 
   */
  public
      fun attributeDetails(attributeDetails: CfnCalculatedAttributeDefinition.AttributeDetailsProperty) {
    cdkBuilder.attributeDetails(attributeDetails)
  }

  /**
   * @param calculatedAttributeName The name of an attribute defined in a profile object type. 
   */
  public fun calculatedAttributeName(calculatedAttributeName: String) {
    cdkBuilder.calculatedAttributeName(calculatedAttributeName)
  }

  /**
   * @param conditions The conditions including range, object count, and threshold for the
   * calculated attribute.
   */
  public fun conditions(conditions: IResolvable) {
    cdkBuilder.conditions(conditions)
  }

  /**
   * @param conditions The conditions including range, object count, and threshold for the
   * calculated attribute.
   */
  public fun conditions(conditions: CfnCalculatedAttributeDefinition.ConditionsProperty) {
    cdkBuilder.conditions(conditions)
  }

  /**
   * @param description The description of the calculated attribute.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param displayName The display name of the calculated attribute.
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * @param domainName The unique name of the domain. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param statistic The aggregation operation to perform for the calculated attribute. 
   */
  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCalculatedAttributeDefinitionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
