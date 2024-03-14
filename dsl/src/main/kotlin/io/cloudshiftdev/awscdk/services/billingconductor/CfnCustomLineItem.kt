package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCustomLineItem internal constructor(
  private val cdkObject: software.amazon.awscdk.services.billingconductor.CfnCustomLineItem,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accountId(): String? = unwrap(this).getAccountId()

  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrAssociationSize(): Number = unwrap(this).getAttrAssociationSize()

  public open fun attrCreationTime(): Number = unwrap(this).getAttrCreationTime()

  public open fun attrCurrencyCode(): String = unwrap(this).getAttrCurrencyCode()

  public open fun attrLastModifiedTime(): Number = unwrap(this).getAttrLastModifiedTime()

  public open fun attrProductCode(): String = unwrap(this).getAttrProductCode()

  public open fun billingGroupArn(): String = unwrap(this).getBillingGroupArn()

  public open fun billingGroupArn(`value`: String) {
    unwrap(this).setBillingGroupArn(`value`)
  }

  public open fun billingPeriodRange(): Any? = unwrap(this).getBillingPeriodRange()

  public open fun billingPeriodRange(`value`: IResolvable) {
    unwrap(this).setBillingPeriodRange(`value`.let(IResolvable::unwrap))
  }

  public open fun billingPeriodRange(`value`: BillingPeriodRangeProperty) {
    unwrap(this).setBillingPeriodRange(`value`.let(BillingPeriodRangeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0dab49a2afe675545e03cde0149415727f1c615400ab031caf7b40d705cb57d7")
  public open fun billingPeriodRange(`value`: BillingPeriodRangeProperty.Builder.() -> Unit): Unit =
      billingPeriodRange(BillingPeriodRangeProperty(`value`))

  public open fun customLineItemChargeDetails(): Any? =
      unwrap(this).getCustomLineItemChargeDetails()

  public open fun customLineItemChargeDetails(`value`: IResolvable) {
    unwrap(this).setCustomLineItemChargeDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun customLineItemChargeDetails(`value`: CustomLineItemChargeDetailsProperty) {
    unwrap(this).setCustomLineItemChargeDetails(`value`.let(CustomLineItemChargeDetailsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8ef4b3c2a2d68f33025d81faca1b809294efd37a5e97d69e997e129e7a8f4aa1")
  public open
      fun customLineItemChargeDetails(`value`: CustomLineItemChargeDetailsProperty.Builder.() -> Unit):
      Unit = customLineItemChargeDetails(CustomLineItemChargeDetailsProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun accountId(accountId: String) {
    }

    public fun billingGroupArn(billingGroupArn: String) {
    }

    public fun billingPeriodRange(billingPeriodRange: IResolvable) {
    }

    public fun billingPeriodRange(billingPeriodRange: BillingPeriodRangeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19ace5344de6c360a357deb5fda8b02710864d6b1e70ccd7557683e7c24529f7")
    public
        fun billingPeriodRange(billingPeriodRange: BillingPeriodRangeProperty.Builder.() -> Unit) {
    }

    public fun customLineItemChargeDetails(customLineItemChargeDetails: IResolvable) {
    }

    public
        fun customLineItemChargeDetails(customLineItemChargeDetails: CustomLineItemChargeDetailsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8de4dc9dc0e408c08a38c210e0f8ea2c1d0a726c5d14b84fd1c438e995c31e6")
    public
        fun customLineItemChargeDetails(customLineItemChargeDetails: CustomLineItemChargeDetailsProperty.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.Builder =
        software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.Builder.create(scope, id)

    public override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    public override fun billingGroupArn(billingGroupArn: String) {
      cdkBuilder.billingGroupArn(billingGroupArn)
    }

    public override fun billingPeriodRange(billingPeriodRange: IResolvable) {
      cdkBuilder.billingPeriodRange(billingPeriodRange.let(IResolvable::unwrap))
    }

    public override fun billingPeriodRange(billingPeriodRange: BillingPeriodRangeProperty) {
      cdkBuilder.billingPeriodRange(billingPeriodRange.let(BillingPeriodRangeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19ace5344de6c360a357deb5fda8b02710864d6b1e70ccd7557683e7c24529f7")
    public override
        fun billingPeriodRange(billingPeriodRange: BillingPeriodRangeProperty.Builder.() -> Unit):
        Unit = billingPeriodRange(BillingPeriodRangeProperty(billingPeriodRange))

    public override fun customLineItemChargeDetails(customLineItemChargeDetails: IResolvable) {
      cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails.let(IResolvable::unwrap))
    }

    public override
        fun customLineItemChargeDetails(customLineItemChargeDetails: CustomLineItemChargeDetailsProperty) {
      cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails.let(CustomLineItemChargeDetailsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8de4dc9dc0e408c08a38c210e0f8ea2c1d0a726c5d14b84fd1c438e995c31e6")
    public override
        fun customLineItemChargeDetails(customLineItemChargeDetails: CustomLineItemChargeDetailsProperty.Builder.() -> Unit):
        Unit =
        customLineItemChargeDetails(CustomLineItemChargeDetailsProperty(customLineItemChargeDetails))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnCustomLineItem =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomLineItem {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomLineItem(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnCustomLineItem):
        CfnCustomLineItem = CfnCustomLineItem(cdkObject)

    internal fun unwrap(wrapped: CfnCustomLineItem):
        software.amazon.awscdk.services.billingconductor.CfnCustomLineItem = wrapped.cdkObject
  }

  public interface LineItemFilterProperty {
    public fun attribute(): String

    public fun matchOption(): String

    public fun values(): List<String>

    public interface Builder {
      public fun attribute(attribute: String) {
      }

      public fun matchOption(matchOption: String) {
      }

      public fun values(values: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty.builder()

      public override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public override fun matchOption(matchOption: String) {
        cdkBuilder.matchOption(matchOption)
      }

      public override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty,
    ) : LineItemFilterProperty {
      public override fun attribute(): String = unwrap(this).getAttribute()

      public override fun matchOption(): String = unwrap(this).getMatchOption()

      public override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LineItemFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty):
          LineItemFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LineItemFilterProperty):
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomLineItemFlatChargeDetailsProperty {
    public fun chargeValue(): Number

    public interface Builder {
      public fun chargeValue(chargeValue: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty.builder()

      public override fun chargeValue(chargeValue: Number) {
        cdkBuilder.chargeValue(chargeValue)
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty,
    ) : CustomLineItemFlatChargeDetailsProperty {
      public override fun chargeValue(): Number = unwrap(this).getChargeValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomLineItemFlatChargeDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty):
          CustomLineItemFlatChargeDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomLineItemFlatChargeDetailsProperty):
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomLineItemChargeDetailsProperty {
    public fun flat(): Any? = unwrap(this).getFlat()

    public fun lineItemFilters(): Any? = unwrap(this).getLineItemFilters()

    public fun percentage(): Any? = unwrap(this).getPercentage()

    public fun type(): String

    public interface Builder {
      public fun flat(flat: IResolvable) {
      }

      public fun flat(flat: CustomLineItemFlatChargeDetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3694dda8f7a271affa2fd567c61d74095c408451b6c1953385f3186d3e086a4")
      public fun flat(flat: CustomLineItemFlatChargeDetailsProperty.Builder.() -> Unit) {
      }

      public fun lineItemFilters(lineItemFilters: IResolvable) {
      }

      public fun lineItemFilters(lineItemFilters: List<Any>) {
      }

      public fun percentage(percentage: IResolvable) {
      }

      public fun percentage(percentage: CustomLineItemPercentageChargeDetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81db3b88c31327860e6ced945ee7fd10385d0cdca0ad38a477ace43a545f2010")
      public
          fun percentage(percentage: CustomLineItemPercentageChargeDetailsProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemChargeDetailsProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemChargeDetailsProperty.builder()

      public override fun flat(flat: IResolvable) {
        cdkBuilder.flat(flat.let(IResolvable::unwrap))
      }

      public override fun flat(flat: CustomLineItemFlatChargeDetailsProperty) {
        cdkBuilder.flat(flat.let(CustomLineItemFlatChargeDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3694dda8f7a271affa2fd567c61d74095c408451b6c1953385f3186d3e086a4")
      public override fun flat(flat: CustomLineItemFlatChargeDetailsProperty.Builder.() -> Unit):
          Unit = flat(CustomLineItemFlatChargeDetailsProperty(flat))

      public override fun lineItemFilters(lineItemFilters: IResolvable) {
        cdkBuilder.lineItemFilters(lineItemFilters.let(IResolvable::unwrap))
      }

      public override fun lineItemFilters(lineItemFilters: List<Any>) {
        cdkBuilder.lineItemFilters(lineItemFilters)
      }

      public override fun percentage(percentage: IResolvable) {
        cdkBuilder.percentage(percentage.let(IResolvable::unwrap))
      }

      public override fun percentage(percentage: CustomLineItemPercentageChargeDetailsProperty) {
        cdkBuilder.percentage(percentage.let(CustomLineItemPercentageChargeDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81db3b88c31327860e6ced945ee7fd10385d0cdca0ad38a477ace43a545f2010")
      public override
          fun percentage(percentage: CustomLineItemPercentageChargeDetailsProperty.Builder.() -> Unit):
          Unit = percentage(CustomLineItemPercentageChargeDetailsProperty(percentage))

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemChargeDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemChargeDetailsProperty,
    ) : CustomLineItemChargeDetailsProperty {
      public override fun flat(): Any? = unwrap(this).getFlat()

      public override fun lineItemFilters(): Any? = unwrap(this).getLineItemFilters()

      public override fun percentage(): Any? = unwrap(this).getPercentage()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomLineItemChargeDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemChargeDetailsProperty):
          CustomLineItemChargeDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomLineItemChargeDetailsProperty):
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemChargeDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BillingPeriodRangeProperty {
    public fun exclusiveEndBillingPeriod(): String? = unwrap(this).getExclusiveEndBillingPeriod()

    public fun inclusiveStartBillingPeriod(): String? =
        unwrap(this).getInclusiveStartBillingPeriod()

    public interface Builder {
      public fun exclusiveEndBillingPeriod(exclusiveEndBillingPeriod: String) {
      }

      public fun inclusiveStartBillingPeriod(inclusiveStartBillingPeriod: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty.builder()

      public override fun exclusiveEndBillingPeriod(exclusiveEndBillingPeriod: String) {
        cdkBuilder.exclusiveEndBillingPeriod(exclusiveEndBillingPeriod)
      }

      public override fun inclusiveStartBillingPeriod(inclusiveStartBillingPeriod: String) {
        cdkBuilder.inclusiveStartBillingPeriod(inclusiveStartBillingPeriod)
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty,
    ) : BillingPeriodRangeProperty {
      public override fun exclusiveEndBillingPeriod(): String? =
          unwrap(this).getExclusiveEndBillingPeriod()

      public override fun inclusiveStartBillingPeriod(): String? =
          unwrap(this).getInclusiveStartBillingPeriod()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BillingPeriodRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty):
          BillingPeriodRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BillingPeriodRangeProperty):
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomLineItemPercentageChargeDetailsProperty {
    public fun childAssociatedResources(): List<String> = unwrap(this).getChildAssociatedResources()
        ?: emptyList()

    public fun percentageValue(): Number

    public interface Builder {
      public fun childAssociatedResources(childAssociatedResources: List<String>) {
      }

      public fun percentageValue(percentageValue: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty.builder()

      public override fun childAssociatedResources(childAssociatedResources: List<String>) {
        cdkBuilder.childAssociatedResources(childAssociatedResources)
      }

      public override fun percentageValue(percentageValue: Number) {
        cdkBuilder.percentageValue(percentageValue)
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty,
    ) : CustomLineItemPercentageChargeDetailsProperty {
      public override fun childAssociatedResources(): List<String> =
          unwrap(this).getChildAssociatedResources() ?: emptyList()

      public override fun percentageValue(): Number = unwrap(this).getPercentageValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomLineItemPercentageChargeDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty):
          CustomLineItemPercentageChargeDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomLineItemPercentageChargeDetailsProperty):
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
