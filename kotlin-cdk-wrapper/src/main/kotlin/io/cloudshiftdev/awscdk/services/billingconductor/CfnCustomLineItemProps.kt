@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCustomLineItemProps {
  public fun accountId(): String? = unwrap(this).getAccountId()

  public fun billingGroupArn(): String

  public fun billingPeriodRange(): Any? = unwrap(this).getBillingPeriodRange()

  public fun customLineItemChargeDetails(): Any? = unwrap(this).getCustomLineItemChargeDetails()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accountId(accountId: String)

    public fun billingGroupArn(billingGroupArn: String)

    public fun billingPeriodRange(billingPeriodRange: IResolvable)

    public fun billingPeriodRange(billingPeriodRange: CfnCustomLineItem.BillingPeriodRangeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e2dff255aa73c13b9e5446befbfba4bdd9a4836e0546f85a4a8bd2511347c58")
    public
        fun billingPeriodRange(billingPeriodRange: CfnCustomLineItem.BillingPeriodRangeProperty.Builder.() -> Unit)

    public fun customLineItemChargeDetails(customLineItemChargeDetails: IResolvable)

    public
        fun customLineItemChargeDetails(customLineItemChargeDetails: CfnCustomLineItem.CustomLineItemChargeDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4a770bd44112beaf90dc848381e3e4201a752de8724e0e0e2266c953fb0cc1e")
    public
        fun customLineItemChargeDetails(customLineItemChargeDetails: CfnCustomLineItem.CustomLineItemChargeDetailsProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps.Builder =
        software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps.builder()

    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    override fun billingGroupArn(billingGroupArn: String) {
      cdkBuilder.billingGroupArn(billingGroupArn)
    }

    override fun billingPeriodRange(billingPeriodRange: IResolvable) {
      cdkBuilder.billingPeriodRange(billingPeriodRange.let(IResolvable::unwrap))
    }

    override
        fun billingPeriodRange(billingPeriodRange: CfnCustomLineItem.BillingPeriodRangeProperty) {
      cdkBuilder.billingPeriodRange(billingPeriodRange.let(CfnCustomLineItem.BillingPeriodRangeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e2dff255aa73c13b9e5446befbfba4bdd9a4836e0546f85a4a8bd2511347c58")
    override
        fun billingPeriodRange(billingPeriodRange: CfnCustomLineItem.BillingPeriodRangeProperty.Builder.() -> Unit):
        Unit = billingPeriodRange(CfnCustomLineItem.BillingPeriodRangeProperty(billingPeriodRange))

    override fun customLineItemChargeDetails(customLineItemChargeDetails: IResolvable) {
      cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails.let(IResolvable::unwrap))
    }

    override
        fun customLineItemChargeDetails(customLineItemChargeDetails: CfnCustomLineItem.CustomLineItemChargeDetailsProperty) {
      cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails.let(CfnCustomLineItem.CustomLineItemChargeDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4a770bd44112beaf90dc848381e3e4201a752de8724e0e0e2266c953fb0cc1e")
    override
        fun customLineItemChargeDetails(customLineItemChargeDetails: CfnCustomLineItem.CustomLineItemChargeDetailsProperty.Builder.() -> Unit):
        Unit =
        customLineItemChargeDetails(CfnCustomLineItem.CustomLineItemChargeDetailsProperty(customLineItemChargeDetails))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps,
  ) : CdkObject(cdkObject), CfnCustomLineItemProps {
    override fun accountId(): String? = unwrap(this).getAccountId()

    override fun billingGroupArn(): String = unwrap(this).getBillingGroupArn()

    override fun billingPeriodRange(): Any? = unwrap(this).getBillingPeriodRange()

    override fun customLineItemChargeDetails(): Any? = unwrap(this).getCustomLineItemChargeDetails()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomLineItemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps):
        CfnCustomLineItemProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomLineItemProps):
        software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps
  }
}
