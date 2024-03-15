@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ce

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnCostCategoryProps {
  public fun defaultValue(): String? = unwrap(this).getDefaultValue()

  public fun name(): String

  public fun ruleVersion(): String

  public fun rules(): String

  public fun splitChargeRules(): String? = unwrap(this).getSplitChargeRules()

  @CdkDslMarker
  public interface Builder {
    public fun defaultValue(defaultValue: String)

    public fun name(name: String)

    public fun ruleVersion(ruleVersion: String)

    public fun rules(rules: String)

    public fun splitChargeRules(splitChargeRules: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ce.CfnCostCategoryProps.Builder =
        software.amazon.awscdk.services.ce.CfnCostCategoryProps.builder()

    override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun ruleVersion(ruleVersion: String) {
      cdkBuilder.ruleVersion(ruleVersion)
    }

    override fun rules(rules: String) {
      cdkBuilder.rules(rules)
    }

    override fun splitChargeRules(splitChargeRules: String) {
      cdkBuilder.splitChargeRules(splitChargeRules)
    }

    public fun build(): software.amazon.awscdk.services.ce.CfnCostCategoryProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ce.CfnCostCategoryProps,
  ) : CdkObject(cdkObject), CfnCostCategoryProps {
    override fun defaultValue(): String? = unwrap(this).getDefaultValue()

    override fun name(): String = unwrap(this).getName()

    override fun ruleVersion(): String = unwrap(this).getRuleVersion()

    override fun rules(): String = unwrap(this).getRules()

    override fun splitChargeRules(): String? = unwrap(this).getSplitChargeRules()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCostCategoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ce.CfnCostCategoryProps):
        CfnCostCategoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCostCategoryProps):
        software.amazon.awscdk.services.ce.CfnCostCategoryProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ce.CfnCostCategoryProps
  }
}
