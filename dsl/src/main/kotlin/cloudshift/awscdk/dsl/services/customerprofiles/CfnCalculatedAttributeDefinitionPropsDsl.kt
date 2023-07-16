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

  public fun attributeDetails(attributeDetails: IResolvable) {
    cdkBuilder.attributeDetails(attributeDetails)
  }

  public
      fun attributeDetails(attributeDetails: CfnCalculatedAttributeDefinition.AttributeDetailsProperty) {
    cdkBuilder.attributeDetails(attributeDetails)
  }

  public fun calculatedAttributeName(calculatedAttributeName: String) {
    cdkBuilder.calculatedAttributeName(calculatedAttributeName)
  }

  public fun conditions(conditions: IResolvable) {
    cdkBuilder.conditions(conditions)
  }

  public fun conditions(conditions: CfnCalculatedAttributeDefinition.ConditionsProperty) {
    cdkBuilder.conditions(conditions)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCalculatedAttributeDefinitionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
