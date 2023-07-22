@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ce.CfnCostCategory
import software.constructs.Construct

@CdkDslMarker
public class CfnCostCategoryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCostCategory.Builder = CfnCostCategory.Builder.create(scope, id)

  /**
   * The default value for the cost category.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-defaultvalue)
   * @param defaultValue The default value for the cost category. 
   */
  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * The unique name of the Cost Category.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-name)
   * @param name The unique name of the Cost Category. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The rule schema version in this particular Cost Category.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-ruleversion)
   * @param ruleVersion The rule schema version in this particular Cost Category. 
   */
  public fun ruleVersion(ruleVersion: String) {
    cdkBuilder.ruleVersion(ruleVersion)
  }

  /**
   * The array of CostCategoryRule in JSON array format.
   *
   *
   * Rules are processed in order. If there are multiple rules that match the line item, then the
   * first rule to match is used to determine that Cost Category value.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-rules)
   * @param rules The array of CostCategoryRule in JSON array format. 
   */
  public fun rules(rules: String) {
    cdkBuilder.rules(rules)
  }

  /**
   * The split charge rules that are used to allocate your charges between your Cost Category
   * values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ce-costcategory.html#cfn-ce-costcategory-splitchargerules)
   * @param splitChargeRules The split charge rules that are used to allocate your charges between
   * your Cost Category values. 
   */
  public fun splitChargeRules(splitChargeRules: String) {
    cdkBuilder.splitChargeRules(splitChargeRules)
  }

  public fun build(): CfnCostCategory = cdkBuilder.build()
}
