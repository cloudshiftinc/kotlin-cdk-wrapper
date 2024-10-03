@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Violation produced by the validation plugin.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
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
public interface PolicyViolationBeta1 {
  /**
   * The description of the violation.
   */
  public fun description(): String

  /**
   * How to fix the violation.
   *
   * Default: - no fix is provided
   */
  public fun fix(): String? = unwrap(this).getFix()

  /**
   * Additional metadata to include with the rule results.
   *
   * This can be used to provide additional information that is
   * plugin specific. The data provided here will be rendered as is.
   *
   * Default: - no rule metadata
   */
  public fun ruleMetadata(): Map<String, String> = unwrap(this).getRuleMetadata() ?: emptyMap()

  /**
   * The name of the rule.
   */
  public fun ruleName(): String

  /**
   * The severity of the violation, only used for reporting purposes.
   *
   * This is useful for helping the user discriminate between warnings,
   * errors, information, etc.
   *
   * Default: - no severity
   */
  public fun severity(): String? = unwrap(this).getSeverity()

  /**
   * The resources violating this rule.
   */
  public fun violatingResources(): List<PolicyViolatingResourceBeta1>

  /**
   * A builder for [PolicyViolationBeta1]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the violation. 
     */
    public fun description(description: String)

    /**
     * @param fix How to fix the violation.
     */
    public fun fix(fix: String)

    /**
     * @param ruleMetadata Additional metadata to include with the rule results.
     * This can be used to provide additional information that is
     * plugin specific. The data provided here will be rendered as is.
     */
    public fun ruleMetadata(ruleMetadata: Map<String, String>)

    /**
     * @param ruleName The name of the rule. 
     */
    public fun ruleName(ruleName: String)

    /**
     * @param severity The severity of the violation, only used for reporting purposes.
     * This is useful for helping the user discriminate between warnings,
     * errors, information, etc.
     */
    public fun severity(severity: String)

    /**
     * @param violatingResources The resources violating this rule. 
     */
    public fun violatingResources(violatingResources: List<PolicyViolatingResourceBeta1>)

    /**
     * @param violatingResources The resources violating this rule. 
     */
    public fun violatingResources(vararg violatingResources: PolicyViolatingResourceBeta1)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.PolicyViolationBeta1.Builder =
        software.amazon.awscdk.PolicyViolationBeta1.builder()

    /**
     * @param description The description of the violation. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param fix How to fix the violation.
     */
    override fun fix(fix: String) {
      cdkBuilder.fix(fix)
    }

    /**
     * @param ruleMetadata Additional metadata to include with the rule results.
     * This can be used to provide additional information that is
     * plugin specific. The data provided here will be rendered as is.
     */
    override fun ruleMetadata(ruleMetadata: Map<String, String>) {
      cdkBuilder.ruleMetadata(ruleMetadata)
    }

    /**
     * @param ruleName The name of the rule. 
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param severity The severity of the violation, only used for reporting purposes.
     * This is useful for helping the user discriminate between warnings,
     * errors, information, etc.
     */
    override fun severity(severity: String) {
      cdkBuilder.severity(severity)
    }

    /**
     * @param violatingResources The resources violating this rule. 
     */
    override fun violatingResources(violatingResources: List<PolicyViolatingResourceBeta1>) {
      cdkBuilder.violatingResources(violatingResources.map(PolicyViolatingResourceBeta1.Companion::unwrap))
    }

    /**
     * @param violatingResources The resources violating this rule. 
     */
    override fun violatingResources(vararg violatingResources: PolicyViolatingResourceBeta1): Unit =
        violatingResources(violatingResources.toList())

    public fun build(): software.amazon.awscdk.PolicyViolationBeta1 = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.PolicyViolationBeta1,
  ) : CdkObject(cdkObject),
      PolicyViolationBeta1 {
    /**
     * The description of the violation.
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * How to fix the violation.
     *
     * Default: - no fix is provided
     */
    override fun fix(): String? = unwrap(this).getFix()

    /**
     * Additional metadata to include with the rule results.
     *
     * This can be used to provide additional information that is
     * plugin specific. The data provided here will be rendered as is.
     *
     * Default: - no rule metadata
     */
    override fun ruleMetadata(): Map<String, String> = unwrap(this).getRuleMetadata() ?: emptyMap()

    /**
     * The name of the rule.
     */
    override fun ruleName(): String = unwrap(this).getRuleName()

    /**
     * The severity of the violation, only used for reporting purposes.
     *
     * This is useful for helping the user discriminate between warnings,
     * errors, information, etc.
     *
     * Default: - no severity
     */
    override fun severity(): String? = unwrap(this).getSeverity()

    /**
     * The resources violating this rule.
     */
    override fun violatingResources(): List<PolicyViolatingResourceBeta1> =
        unwrap(this).getViolatingResources().map(PolicyViolatingResourceBeta1::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyViolationBeta1 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.PolicyViolationBeta1): PolicyViolationBeta1
        = CdkObjectWrappers.wrap(cdkObject) as? PolicyViolationBeta1 ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyViolationBeta1): software.amazon.awscdk.PolicyViolationBeta1
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.PolicyViolationBeta1
  }
}
