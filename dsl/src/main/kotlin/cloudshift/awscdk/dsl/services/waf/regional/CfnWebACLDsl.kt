@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnWebACL
import software.constructs.Construct

/**
 * This is *AWS WAF Classic* documentation.
 *
 * For more information, see [AWS WAF
 * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
 * developer guide.
 *
 *
 * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
 * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
 * version, AWS WAF has a single set of endpoints for regional and global use.
 *
 *
 * Contains the `Rules` that identify the requests that you want to allow, block, or count. In a
 * `WebACL` , you also specify a default action ( `ALLOW` or `BLOCK` ), and the action for each `Rule`
 * that you add to a `WebACL` , for example, block requests from specified IP addresses or block
 * requests from specified referrers. If you add more than one `Rule` to a `WebACL` , a request needs
 * to match only one of the specifications to be allowed, blocked, or counted.
 *
 * To identify the requests that you want AWS WAF to filter, you associate the `WebACL` with an API
 * Gateway API or an Application Load Balancer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * CfnWebACL cfnWebACL = CfnWebACL.Builder.create(this, "MyCfnWebACL")
 * .defaultAction(ActionProperty.builder()
 * .type("type")
 * .build())
 * .metricName("metricName")
 * .name("name")
 * // the properties below are optional
 * .rules(List.of(RuleProperty.builder()
 * .action(ActionProperty.builder()
 * .type("type")
 * .build())
 * .priority(123)
 * .ruleId("ruleId")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html)
 */
@CdkDslMarker
public class CfnWebACLDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWebACL.Builder = CfnWebACL.Builder.create(scope, id)

  private val _rules: MutableList<Any> = mutableListOf()

  /**
   * The action to perform if none of the `Rules` contained in the `WebACL` match.
   *
   * The action is specified by the `WafAction` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
   * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
   * match. 
   */
  public fun defaultAction(defaultAction: IResolvable) {
    cdkBuilder.defaultAction(defaultAction)
  }

  /**
   * The action to perform if none of the `Rules` contained in the `WebACL` match.
   *
   * The action is specified by the `WafAction` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-defaultaction)
   * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
   * match. 
   */
  public fun defaultAction(defaultAction: CfnWebACL.ActionProperty) {
    cdkBuilder.defaultAction(defaultAction)
  }

  /**
   * A name for the metrics for this `WebACL` .
   *
   * The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and
   * minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including
   * "All" and "Default_Action." You can't change `MetricName` after you create the `WebACL` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-metricname)
   * @param metricName A name for the metrics for this `WebACL` . 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * A friendly name or description of the `WebACL` .
   *
   * You can't change the name of a `WebACL` after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-name)
   * @param name A friendly name or description of the `WebACL` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule` ,
   * and the ID of the `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
   * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority of
   * the `Rule` , and the ID of the `Rule` . 
   */
  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  /**
   * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule` ,
   * and the ID of the `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
   * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority of
   * the `Rule` , and the ID of the `Rule` . 
   */
  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  /**
   * An array that contains the action for each `Rule` in a `WebACL` , the priority of the `Rule` ,
   * and the ID of the `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-webacl.html#cfn-wafregional-webacl-rules)
   * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority of
   * the `Rule` , and the ID of the `Rule` . 
   */
  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnWebACL {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
