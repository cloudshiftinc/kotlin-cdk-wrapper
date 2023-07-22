@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule
import software.constructs.Construct

/**
 * Creates a listener rule.
 *
 * Each listener has a default rule for checking connection requests, but you can define additional
 * rules. Each rule consists of a priority, one or more actions, and one or more conditions. For more
 * information, see [Listener
 * rules](https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html#listener-rules) in the
 * *Amazon VPC Lattice User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * CfnRule cfnRule = CfnRule.Builder.create(this, "MyCfnRule")
 * .action(ActionProperty.builder()
 * .fixedResponse(FixedResponseProperty.builder()
 * .statusCode(123)
 * .build())
 * .forward(ForwardProperty.builder()
 * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
 * .targetGroupIdentifier("targetGroupIdentifier")
 * // the properties below are optional
 * .weight(123)
 * .build()))
 * .build())
 * .build())
 * .match(MatchProperty.builder()
 * .httpMatch(HttpMatchProperty.builder()
 * .headerMatches(List.of(HeaderMatchProperty.builder()
 * .match(HeaderMatchTypeProperty.builder()
 * .contains("contains")
 * .exact("exact")
 * .prefix("prefix")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .caseSensitive(false)
 * .build()))
 * .method("method")
 * .pathMatch(PathMatchProperty.builder()
 * .match(PathMatchTypeProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .build())
 * // the properties below are optional
 * .caseSensitive(false)
 * .build())
 * .build())
 * .build())
 * .priority(123)
 * // the properties below are optional
 * .listenerIdentifier("listenerIdentifier")
 * .name("name")
 * .serviceIdentifier("serviceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html)
 */
@CdkDslMarker
public class CfnRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRule.Builder = CfnRule.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Describes the action for a rule.
   *
   * Each rule must include exactly one of the following types of actions: `forward` or
   * `fixed-response` , and it must be the last action to be performed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-action)
   * @param action Describes the action for a rule. 
   */
  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  /**
   * Describes the action for a rule.
   *
   * Each rule must include exactly one of the following types of actions: `forward` or
   * `fixed-response` , and it must be the last action to be performed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-action)
   * @param action Describes the action for a rule. 
   */
  public fun action(action: CfnRule.ActionProperty) {
    cdkBuilder.action(action)
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the listener.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-listeneridentifier)
   * @param listenerIdentifier The ID or Amazon Resource Name (ARN) of the listener. 
   */
  public fun listenerIdentifier(listenerIdentifier: String) {
    cdkBuilder.listenerIdentifier(listenerIdentifier)
  }

  /**
   * The rule match.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-match)
   * @param match The rule match. 
   */
  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  /**
   * The rule match.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-match)
   * @param match The rule match. 
   */
  public fun match(match: CfnRule.MatchProperty) {
    cdkBuilder.match(match)
  }

  /**
   * The name of the rule.
   *
   * The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens
   * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
   *
   * If you don't specify a name, CloudFormation generates one. However, if you specify a name, and
   * later want to replace the resource, you must specify a new name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-name)
   * @param name The name of the rule. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The priority assigned to the rule.
   *
   * Each rule for a specific listener must have a unique priority. The lower the priority number
   * the higher the priority.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-priority)
   * @param priority The priority assigned to the rule. 
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-serviceidentifier)
   * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service. 
   */
  public fun serviceIdentifier(serviceIdentifier: String) {
    cdkBuilder.serviceIdentifier(serviceIdentifier)
  }

  /**
   * The tags for the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-tags)
   * @param tags The tags for the rule. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html#cfn-vpclattice-rule-tags)
   * @param tags The tags for the rule. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnRule {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
