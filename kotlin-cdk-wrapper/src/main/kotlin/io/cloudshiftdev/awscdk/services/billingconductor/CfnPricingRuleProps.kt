@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPricingRuleProps {
  public fun billingEntity(): String? = unwrap(this).getBillingEntity()

  public fun description(): String? = unwrap(this).getDescription()

  public fun modifierPercentage(): Number? = unwrap(this).getModifierPercentage()

  public fun name(): String

  public fun operation(): String? = unwrap(this).getOperation()

  public fun scope(): String

  public fun service(): String? = unwrap(this).getService()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun tiering(): Any? = unwrap(this).getTiering()

  public fun type(): String

  public fun usageType(): String? = unwrap(this).getUsageType()

  @CdkDslMarker
  public interface Builder {
    public fun billingEntity(billingEntity: String)

    public fun description(description: String)

    public fun modifierPercentage(modifierPercentage: Number)

    public fun name(name: String)

    public fun operation(operation: String)

    public fun scope(scope: String)

    public fun service(service: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tiering(tiering: IResolvable)

    public fun tiering(tiering: CfnPricingRule.TieringProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4998999d5817a1e5871ac0eb1bd28e4d0f8930f78aade0a6ffd6880a900a3102")
    public fun tiering(tiering: CfnPricingRule.TieringProperty.Builder.() -> Unit)

    public fun type(type: String)

    public fun usageType(usageType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps.Builder =
        software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps.builder()

    override fun billingEntity(billingEntity: String) {
      cdkBuilder.billingEntity(billingEntity)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun modifierPercentage(modifierPercentage: Number) {
      cdkBuilder.modifierPercentage(modifierPercentage)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun operation(operation: String) {
      cdkBuilder.operation(operation)
    }

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tiering(tiering: IResolvable) {
      cdkBuilder.tiering(tiering.let(IResolvable::unwrap))
    }

    override fun tiering(tiering: CfnPricingRule.TieringProperty) {
      cdkBuilder.tiering(tiering.let(CfnPricingRule.TieringProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4998999d5817a1e5871ac0eb1bd28e4d0f8930f78aade0a6ffd6880a900a3102")
    override fun tiering(tiering: CfnPricingRule.TieringProperty.Builder.() -> Unit): Unit =
        tiering(CfnPricingRule.TieringProperty(tiering))

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun usageType(usageType: String) {
      cdkBuilder.usageType(usageType)
    }

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps,
  ) : CdkObject(cdkObject), CfnPricingRuleProps {
    override fun billingEntity(): String? = unwrap(this).getBillingEntity()

    override fun description(): String? = unwrap(this).getDescription()

    override fun modifierPercentage(): Number? = unwrap(this).getModifierPercentage()

    override fun name(): String = unwrap(this).getName()

    override fun operation(): String? = unwrap(this).getOperation()

    override fun scope(): String = unwrap(this).getScope()

    override fun service(): String? = unwrap(this).getService()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun tiering(): Any? = unwrap(this).getTiering()

    override fun type(): String = unwrap(this).getType()

    override fun usageType(): String? = unwrap(this).getUsageType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPricingRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps):
        CfnPricingRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPricingRuleProps):
        software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps
  }
}
