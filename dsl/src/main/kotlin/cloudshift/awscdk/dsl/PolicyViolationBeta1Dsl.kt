@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.PolicyViolatingResourceBeta1
import software.amazon.awscdk.PolicyViolationBeta1

/**
 * Violation produced by the validation plugin.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * PolicyViolationBeta1 policyViolationBeta1 = PolicyViolationBeta1.builder()
 * .description("description")
 * .ruleName("ruleName")
 * .violatingResources(List.of(PolicyViolatingResourceBeta1.builder()
 * .locations(List.of("locations"))
 * .resourceLogicalId("resourceLogicalId")
 * .templatePath("templatePath")
 * .build()))
 * // the properties below are optional
 * .fix("fix")
 * .ruleMetadata(Map.of(
 * "ruleMetadataKey", "ruleMetadata"))
 * .severity("severity")
 * .build();
 * ```
 */
@CdkDslMarker
public class PolicyViolationBeta1Dsl {
  private val cdkBuilder: PolicyViolationBeta1.Builder = PolicyViolationBeta1.builder()

  private val _violatingResources: MutableList<PolicyViolatingResourceBeta1> = mutableListOf()

  /**
   * @param description The description of the violation. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param fix How to fix the violation.
   */
  public fun fix(fix: String) {
    cdkBuilder.fix(fix)
  }

  /**
   * @param ruleMetadata Additional metadata to include with the rule results.
   * This can be used to provide additional information that is
   * plugin specific. The data provided here will be rendered as is.
   */
  public fun ruleMetadata(ruleMetadata: Map<String, String>) {
    cdkBuilder.ruleMetadata(ruleMetadata)
  }

  /**
   * @param ruleName The name of the rule. 
   */
  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  /**
   * @param severity The severity of the violation, only used for reporting purposes.
   * This is useful for helping the user discriminate between warnings,
   * errors, information, etc.
   */
  public fun severity(severity: String) {
    cdkBuilder.severity(severity)
  }

  /**
   * @param violatingResources The resources violating this rule. 
   */
  public fun violatingResources(violatingResources: PolicyViolatingResourceBeta1Dsl.() -> Unit) {
    _violatingResources.add(PolicyViolatingResourceBeta1Dsl().apply(violatingResources).build())
  }

  /**
   * @param violatingResources The resources violating this rule. 
   */
  public fun violatingResources(violatingResources: Collection<PolicyViolatingResourceBeta1>) {
    _violatingResources.addAll(violatingResources)
  }

  public fun build(): PolicyViolationBeta1 {
    if(_violatingResources.isNotEmpty()) cdkBuilder.violatingResources(_violatingResources)
    return cdkBuilder.build()
  }
}
