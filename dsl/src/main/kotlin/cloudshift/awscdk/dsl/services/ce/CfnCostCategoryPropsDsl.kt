@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ce.CfnCostCategoryProps

/**
 * Properties for defining a `CfnCostCategory`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ce.*;
 * CfnCostCategoryProps cfnCostCategoryProps = CfnCostCategoryProps.builder()
 * .name("name")
 * .rules("rules")
 * .ruleVersion("ruleVersion")
 * // the properties below are optional
 * .defaultValue("defaultValue")
 * .splitChargeRules("splitChargeRules")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html)
 */
@CdkDslMarker
public class CfnCostCategoryPropsDsl {
  private val cdkBuilder: CfnCostCategoryProps.Builder = CfnCostCategoryProps.builder()

  /**
   * @param defaultValue The default value for the cost category.
   */
  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * @param name The unique name of the Cost Category. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param ruleVersion The rule schema version in this particular Cost Category. 
   */
  public fun ruleVersion(ruleVersion: String) {
    cdkBuilder.ruleVersion(ruleVersion)
  }

  /**
   * @param rules The array of CostCategoryRule in JSON array format. 
   *
   * Rules are processed in order. If there are multiple rules that match the line item, then the
   * first rule to match is used to determine that Cost Category value.
   */
  public fun rules(rules: String) {
    cdkBuilder.rules(rules)
  }

  /**
   * @param splitChargeRules The split charge rules that are used to allocate your charges between
   * your Cost Category values.
   */
  public fun splitChargeRules(splitChargeRules: String) {
    cdkBuilder.splitChargeRules(splitChargeRules)
  }

  public fun build(): CfnCostCategoryProps = cdkBuilder.build()
}
