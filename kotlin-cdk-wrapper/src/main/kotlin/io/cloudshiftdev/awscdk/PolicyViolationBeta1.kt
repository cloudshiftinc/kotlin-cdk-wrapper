@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface PolicyViolationBeta1 {
  public fun description(): String

  public fun fix(): String? = unwrap(this).getFix()

  public fun ruleMetadata(): Map<String, String> = unwrap(this).getRuleMetadata() ?: emptyMap()

  public fun ruleName(): String

  public fun severity(): String? = unwrap(this).getSeverity()

  public fun violatingResources(): List<PolicyViolatingResourceBeta1>

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun fix(fix: String)

    public fun ruleMetadata(ruleMetadata: Map<String, String>)

    public fun ruleName(ruleName: String)

    public fun severity(severity: String)

    public fun violatingResources(violatingResources: List<PolicyViolatingResourceBeta1>)

    public fun violatingResources(vararg violatingResources: PolicyViolatingResourceBeta1)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.PolicyViolationBeta1.Builder =
        software.amazon.awscdk.PolicyViolationBeta1.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun fix(fix: String) {
      cdkBuilder.fix(fix)
    }

    override fun ruleMetadata(ruleMetadata: Map<String, String>) {
      cdkBuilder.ruleMetadata(ruleMetadata)
    }

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun severity(severity: String) {
      cdkBuilder.severity(severity)
    }

    override fun violatingResources(violatingResources: List<PolicyViolatingResourceBeta1>) {
      cdkBuilder.violatingResources(violatingResources.map(PolicyViolatingResourceBeta1::unwrap))
    }

    override fun violatingResources(vararg violatingResources: PolicyViolatingResourceBeta1): Unit =
        violatingResources(violatingResources.toList())

    public fun build(): software.amazon.awscdk.PolicyViolationBeta1 = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.PolicyViolationBeta1,
  ) : CdkObject(cdkObject), PolicyViolationBeta1 {
    override fun description(): String = unwrap(this).getDescription()

    override fun fix(): String? = unwrap(this).getFix()

    override fun ruleMetadata(): Map<String, String> = unwrap(this).getRuleMetadata() ?: emptyMap()

    override fun ruleName(): String = unwrap(this).getRuleName()

    override fun severity(): String? = unwrap(this).getSeverity()

    override fun violatingResources(): List<PolicyViolatingResourceBeta1> =
        unwrap(this).getViolatingResources().map(PolicyViolatingResourceBeta1::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyViolationBeta1 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.PolicyViolationBeta1): PolicyViolationBeta1
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyViolationBeta1): software.amazon.awscdk.PolicyViolationBeta1
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.PolicyViolationBeta1
  }
}
