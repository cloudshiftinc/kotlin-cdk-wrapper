package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPricingRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrAssociatedPricingPlanCount(): Number =
      unwrap(this).getAttrAssociatedPricingPlanCount()

  public open fun attrCreationTime(): Number = unwrap(this).getAttrCreationTime()

  public open fun attrLastModifiedTime(): Number = unwrap(this).getAttrLastModifiedTime()

  public open fun billingEntity(): String? = unwrap(this).getBillingEntity()

  public open fun billingEntity(`value`: String) {
    unwrap(this).setBillingEntity(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun modifierPercentage(): Number? = unwrap(this).getModifierPercentage()

  public open fun modifierPercentage(`value`: Number) {
    unwrap(this).setModifierPercentage(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun operation(): String? = unwrap(this).getOperation()

  public open fun operation(`value`: String) {
    unwrap(this).setOperation(`value`)
  }

  public open fun scope(): String = unwrap(this).getScope()

  public open fun scope(`value`: String) {
    unwrap(this).setScope(`value`)
  }

  public open fun service(): String? = unwrap(this).getService()

  public open fun service(`value`: String) {
    unwrap(this).setService(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tiering(): Any? = unwrap(this).getTiering()

  public open fun tiering(`value`: IResolvable) {
    unwrap(this).setTiering(`value`.let(IResolvable::unwrap))
  }

  public open fun tiering(`value`: TieringProperty) {
    unwrap(this).setTiering(`value`.let(TieringProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2daf26b6f15b100a4acffbd0dab7471fb1944d1d6a18cf1eba5dc10e5209ec83")
  public open fun tiering(`value`: TieringProperty.Builder.() -> Unit): Unit =
      tiering(TieringProperty(`value`))

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun usageType(): String? = unwrap(this).getUsageType()

  public open fun usageType(`value`: String) {
    unwrap(this).setUsageType(`value`)
  }

  public interface Builder {
    public fun billingEntity(billingEntity: String) {
    }

    public fun description(description: String) {
    }

    public fun modifierPercentage(modifierPercentage: Number) {
    }

    public fun name(name: String) {
    }

    public fun operation(operation: String) {
    }

    public fun scope(scope: String) {
    }

    public fun service(service: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun tiering(tiering: IResolvable) {
    }

    public fun tiering(tiering: TieringProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39c4d567580d2fcfd35bf97cd19eb8b6199b758d5fb2766cf70606df78d6df2f")
    public fun tiering(tiering: TieringProperty.Builder.() -> Unit) {
    }

    public fun type(type: String) {
    }

    public fun usageType(usageType: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.billingconductor.CfnPricingRule.Builder
        = software.amazon.awscdk.services.billingconductor.CfnPricingRule.Builder.create(scope, id)

    public override fun billingEntity(billingEntity: String) {
      cdkBuilder.billingEntity(billingEntity)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun modifierPercentage(modifierPercentage: Number) {
      cdkBuilder.modifierPercentage(modifierPercentage)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun operation(operation: String) {
      cdkBuilder.operation(operation)
    }

    public override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    public override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun tiering(tiering: IResolvable) {
      cdkBuilder.tiering(tiering.let(IResolvable::unwrap))
    }

    public override fun tiering(tiering: TieringProperty) {
      cdkBuilder.tiering(tiering.let(TieringProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39c4d567580d2fcfd35bf97cd19eb8b6199b758d5fb2766cf70606df78d6df2f")
    public override fun tiering(tiering: TieringProperty.Builder.() -> Unit): Unit =
        tiering(TieringProperty(tiering))

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public override fun usageType(usageType: String) {
      cdkBuilder.usageType(usageType)
    }

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnPricingRule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPricingRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPricingRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRule):
        CfnPricingRule = CfnPricingRule(cdkObject)

    internal fun unwrap(wrapped: CfnPricingRule):
        software.amazon.awscdk.services.billingconductor.CfnPricingRule = wrapped.cdkObject
  }

  public interface FreeTierProperty {
    public fun activated(): Any

    public interface Builder {
      public fun activated(activated: Boolean) {
      }

      public fun activated(activated: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty.Builder =
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty.builder()

      public override fun activated(activated: Boolean) {
        cdkBuilder.activated(activated)
      }

      public override fun activated(activated: IResolvable) {
        cdkBuilder.activated(activated.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty,
    ) : FreeTierProperty {
      public override fun activated(): Any = unwrap(this).getActivated()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FreeTierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty):
          FreeTierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FreeTierProperty):
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TieringProperty {
    public fun freeTier(): Any? = unwrap(this).getFreeTier()

    public interface Builder {
      public fun freeTier(freeTier: IResolvable) {
      }

      public fun freeTier(freeTier: FreeTierProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b769e8df57b6486c6a4fd8d9d82cd8fe24425f18e2d4bf345ce5ef1f57878dd3")
      public fun freeTier(freeTier: FreeTierProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty.Builder =
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty.builder()

      public override fun freeTier(freeTier: IResolvable) {
        cdkBuilder.freeTier(freeTier.let(IResolvable::unwrap))
      }

      public override fun freeTier(freeTier: FreeTierProperty) {
        cdkBuilder.freeTier(freeTier.let(FreeTierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b769e8df57b6486c6a4fd8d9d82cd8fe24425f18e2d4bf345ce5ef1f57878dd3")
      public override fun freeTier(freeTier: FreeTierProperty.Builder.() -> Unit): Unit =
          freeTier(FreeTierProperty(freeTier))

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty,
    ) : TieringProperty {
      public override fun freeTier(): Any? = unwrap(this).getFreeTier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TieringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty):
          TieringProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TieringProperty):
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
