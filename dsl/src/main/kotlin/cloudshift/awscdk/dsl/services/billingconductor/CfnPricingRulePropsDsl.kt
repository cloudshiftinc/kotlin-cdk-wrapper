@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnPricingRule
import software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps

@CdkDslMarker
public class CfnPricingRulePropsDsl {
  private val cdkBuilder: CfnPricingRuleProps.Builder = CfnPricingRuleProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param billingEntity The seller of services provided by AWS , their affiliates, or third-party
   * providers selling services via AWS Marketplace .
   */
  public fun billingEntity(billingEntity: String) {
    cdkBuilder.billingEntity(billingEntity)
  }

  /**
   * @param description The pricing rule description.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param modifierPercentage A percentage modifier applied on the public pricing rates.
   */
  public fun modifierPercentage(modifierPercentage: Number) {
    cdkBuilder.modifierPercentage(modifierPercentage)
  }

  /**
   * @param name The name of a pricing rule. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param operation Operation is the specific AWS action covered by this line item.
   * This describes the specific usage of the line item.
   *
   * If the `Scope` attribute is set to `SKU` , this attribute indicates which operation the
   * `PricingRule` is modifying. For example, a value of `RunInstances:0202` indicates the operation of
   * running an Amazon EC2 instance.
   */
  public fun operation(operation: String) {
    cdkBuilder.operation(operation)
  }

  /**
   * @param scope The scope of pricing rule that indicates if it's globally applicable or
   * service-specific. 
   */
  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param service If the `Scope` attribute is `SERVICE` , this attribute indicates which service
   * the `PricingRule` is applicable for.
   */
  public fun service(service: String) {
    cdkBuilder.service(service)
  }

  /**
   * @param tags A map that contains tag keys and tag values that are attached to a pricing rule.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A map that contains tag keys and tag values that are attached to a pricing rule.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param tiering The set of tiering configurations for the pricing rule.
   */
  public fun tiering(tiering: IResolvable) {
    cdkBuilder.tiering(tiering)
  }

  /**
   * @param tiering The set of tiering configurations for the pricing rule.
   */
  public fun tiering(tiering: CfnPricingRule.TieringProperty) {
    cdkBuilder.tiering(tiering)
  }

  /**
   * @param type The type of pricing rule. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param usageType Usage Type is the unit that each service uses to measure the usage of a
   * specific type of resource.
   */
  public fun usageType(usageType: String) {
    cdkBuilder.usageType(usageType)
  }

  public fun build(): CfnPricingRuleProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
