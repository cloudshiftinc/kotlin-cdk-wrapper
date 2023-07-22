@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnRule
import software.constructs.Construct

@CdkDslMarker
public class CfnRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRule.Builder = CfnRule.Builder.create(scope, id)

  private val _predicates: MutableList<Any> = mutableListOf()

  /**
   * The name of the metrics for this `Rule` .
   *
   * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and
   * minimum length one. It can't contain whitespace or metric names reserved for AWS WAF , including
   * "All" and "Default_Action." You can't change `MetricName` after you create the `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-metricname)
   * @param metricName The name of the metrics for this `Rule` . 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * The friendly name or description for the `Rule` .
   *
   * You can't change the name of a `Rule` after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-name)
   * @param name The friendly name or description for the `Rule` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet` object that you want to include in a `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates)
   * @param predicates The `Predicates` object contains one `Predicate` element for each
   * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
   * 
   */
  public fun predicates(vararg predicates: Any) {
    _predicates.addAll(listOf(*predicates))
  }

  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet` object that you want to include in a `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates)
   * @param predicates The `Predicates` object contains one `Predicate` element for each
   * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
   * 
   */
  public fun predicates(predicates: Collection<Any>) {
    _predicates.addAll(predicates)
  }

  /**
   * The `Predicates` object contains one `Predicate` element for each `ByteMatchSet` , `IPSet` , or
   * `SqlInjectionMatchSet` object that you want to include in a `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-rule.html#cfn-waf-rule-predicates)
   * @param predicates The `Predicates` object contains one `Predicate` element for each
   * `ByteMatchSet` , `IPSet` , or `SqlInjectionMatchSet` object that you want to include in a `Rule` .
   * 
   */
  public fun predicates(predicates: IResolvable) {
    cdkBuilder.predicates(predicates)
  }

  public fun build(): CfnRule {
    if(_predicates.isNotEmpty()) cdkBuilder.predicates(_predicates)
    return cdkBuilder.build()
  }
}
