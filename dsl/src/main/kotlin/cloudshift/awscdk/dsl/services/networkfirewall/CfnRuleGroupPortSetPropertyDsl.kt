@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * A set of port ranges for use in the rules in a rule group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * PortSetProperty portSetProperty = PortSetProperty.builder()
 * .definition(List.of("definition"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-portset.html)
 */
@CdkDslMarker
public class CfnRuleGroupPortSetPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.PortSetProperty.Builder =
      CfnRuleGroup.PortSetProperty.builder()

  private val _definition: MutableList<String> = mutableListOf()

  /**
   * @param definition The set of port ranges.
   */
  public fun definition(vararg definition: String) {
    _definition.addAll(listOf(*definition))
  }

  /**
   * @param definition The set of port ranges.
   */
  public fun definition(definition: Collection<String>) {
    _definition.addAll(definition)
  }

  public fun build(): CfnRuleGroup.PortSetProperty {
    if(_definition.isNotEmpty()) cdkBuilder.definition(_definition)
    return cdkBuilder.build()
  }
}
