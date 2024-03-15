@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPricingPlanProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun pricingRuleArns(): List<String> = unwrap(this).getPricingRuleArns() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun pricingRuleArns(pricingRuleArns: List<String>)

    public fun pricingRuleArns(vararg pricingRuleArns: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps.Builder =
        software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun pricingRuleArns(pricingRuleArns: List<String>) {
      cdkBuilder.pricingRuleArns(pricingRuleArns)
    }

    override fun pricingRuleArns(vararg pricingRuleArns: String): Unit =
        pricingRuleArns(pricingRuleArns.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps,
  ) : CdkObject(cdkObject), CfnPricingPlanProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun pricingRuleArns(): List<String> = unwrap(this).getPricingRuleArns() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPricingPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps):
        CfnPricingPlanProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPricingPlanProps):
        software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps
  }
}
