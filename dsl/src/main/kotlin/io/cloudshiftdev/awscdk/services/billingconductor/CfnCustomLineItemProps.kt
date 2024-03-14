package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCustomLineItemProps {
  /**
   * The AWS account in which this custom line item will be applied to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-accountid)
   */
  public fun accountId(): String? = unwrap(this).getAccountId()

  /**
   * The Amazon Resource Name (ARN) that references the billing group where the custom line item
   * applies to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billinggrouparn)
   */
  public fun billingGroupArn(): String

  /**
   * A time range for which the custom line item is effective.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billingperiodrange)
   */
  public fun billingPeriodRange(): Any? = unwrap(this).getBillingPeriodRange()

  /**
   * The charge details of a custom line item.
   *
   * It should contain only one of `Flat` or `Percentage` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-customlineitemchargedetails)
   */
  public fun customLineItemChargeDetails(): Any? = unwrap(this).getCustomLineItemChargeDetails()

  /**
   * The custom line item's description.
   *
   * This is shown on the Bills page in association with the charge value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The custom line item's name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-name)
   */
  public fun name(): String

  /**
   * A map that contains tag keys and tag values that are attached to a custom line item.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCustomLineItemProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountId The AWS account in which this custom line item will be applied to.
     */
    public fun accountId(accountId: String)

    /**
     * @param billingGroupArn The Amazon Resource Name (ARN) that references the billing group where
     * the custom line item applies to. 
     */
    public fun billingGroupArn(billingGroupArn: String)

    /**
     * @param billingPeriodRange A time range for which the custom line item is effective.
     */
    public fun billingPeriodRange(billingPeriodRange: IResolvable)

    /**
     * @param billingPeriodRange A time range for which the custom line item is effective.
     */
    public fun billingPeriodRange(billingPeriodRange: CfnCustomLineItem.BillingPeriodRangeProperty)

    /**
     * @param billingPeriodRange A time range for which the custom line item is effective.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e2dff255aa73c13b9e5446befbfba4bdd9a4836e0546f85a4a8bd2511347c58")
    public
        fun billingPeriodRange(billingPeriodRange: CfnCustomLineItem.BillingPeriodRangeProperty.Builder.() -> Unit)

    /**
     * @param customLineItemChargeDetails The charge details of a custom line item.
     * It should contain only one of `Flat` or `Percentage` .
     */
    public fun customLineItemChargeDetails(customLineItemChargeDetails: IResolvable)

    /**
     * @param customLineItemChargeDetails The charge details of a custom line item.
     * It should contain only one of `Flat` or `Percentage` .
     */
    public
        fun customLineItemChargeDetails(customLineItemChargeDetails: CfnCustomLineItem.CustomLineItemChargeDetailsProperty)

    /**
     * @param customLineItemChargeDetails The charge details of a custom line item.
     * It should contain only one of `Flat` or `Percentage` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4a770bd44112beaf90dc848381e3e4201a752de8724e0e0e2266c953fb0cc1e")
    public
        fun customLineItemChargeDetails(customLineItemChargeDetails: CfnCustomLineItem.CustomLineItemChargeDetailsProperty.Builder.() -> Unit)

    /**
     * @param description The custom line item's description.
     * This is shown on the Bills page in association with the charge value.
     */
    public fun description(description: String)

    /**
     * @param name The custom line item's name. 
     */
    public fun name(name: String)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a custom line
     * item.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a custom line
     * item.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps.Builder =
        software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps.builder()

    /**
     * @param accountId The AWS account in which this custom line item will be applied to.
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * @param billingGroupArn The Amazon Resource Name (ARN) that references the billing group where
     * the custom line item applies to. 
     */
    override fun billingGroupArn(billingGroupArn: String) {
      cdkBuilder.billingGroupArn(billingGroupArn)
    }

    /**
     * @param billingPeriodRange A time range for which the custom line item is effective.
     */
    override fun billingPeriodRange(billingPeriodRange: IResolvable) {
      cdkBuilder.billingPeriodRange(billingPeriodRange.let(IResolvable::unwrap))
    }

    /**
     * @param billingPeriodRange A time range for which the custom line item is effective.
     */
    override
        fun billingPeriodRange(billingPeriodRange: CfnCustomLineItem.BillingPeriodRangeProperty) {
      cdkBuilder.billingPeriodRange(billingPeriodRange.let(CfnCustomLineItem.BillingPeriodRangeProperty::unwrap))
    }

    /**
     * @param billingPeriodRange A time range for which the custom line item is effective.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e2dff255aa73c13b9e5446befbfba4bdd9a4836e0546f85a4a8bd2511347c58")
    override
        fun billingPeriodRange(billingPeriodRange: CfnCustomLineItem.BillingPeriodRangeProperty.Builder.() -> Unit):
        Unit = billingPeriodRange(CfnCustomLineItem.BillingPeriodRangeProperty(billingPeriodRange))

    /**
     * @param customLineItemChargeDetails The charge details of a custom line item.
     * It should contain only one of `Flat` or `Percentage` .
     */
    override fun customLineItemChargeDetails(customLineItemChargeDetails: IResolvable) {
      cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails.let(IResolvable::unwrap))
    }

    /**
     * @param customLineItemChargeDetails The charge details of a custom line item.
     * It should contain only one of `Flat` or `Percentage` .
     */
    override
        fun customLineItemChargeDetails(customLineItemChargeDetails: CfnCustomLineItem.CustomLineItemChargeDetailsProperty) {
      cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails.let(CfnCustomLineItem.CustomLineItemChargeDetailsProperty::unwrap))
    }

    /**
     * @param customLineItemChargeDetails The charge details of a custom line item.
     * It should contain only one of `Flat` or `Percentage` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4a770bd44112beaf90dc848381e3e4201a752de8724e0e0e2266c953fb0cc1e")
    override
        fun customLineItemChargeDetails(customLineItemChargeDetails: CfnCustomLineItem.CustomLineItemChargeDetailsProperty.Builder.() -> Unit):
        Unit =
        customLineItemChargeDetails(CfnCustomLineItem.CustomLineItemChargeDetailsProperty(customLineItemChargeDetails))

    /**
     * @param description The custom line item's description.
     * This is shown on the Bills page in association with the charge value.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The custom line item's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a custom line
     * item.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a custom line
     * item.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps,
  ) : CdkObject(cdkObject), CfnCustomLineItemProps {
    /**
     * The AWS account in which this custom line item will be applied to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-accountid)
     */
    override fun accountId(): String? = unwrap(this).getAccountId()

    /**
     * The Amazon Resource Name (ARN) that references the billing group where the custom line item
     * applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billinggrouparn)
     */
    override fun billingGroupArn(): String = unwrap(this).getBillingGroupArn()

    /**
     * A time range for which the custom line item is effective.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billingperiodrange)
     */
    override fun billingPeriodRange(): Any? = unwrap(this).getBillingPeriodRange()

    /**
     * The charge details of a custom line item.
     *
     * It should contain only one of `Flat` or `Percentage` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-customlineitemchargedetails)
     */
    override fun customLineItemChargeDetails(): Any? = unwrap(this).getCustomLineItemChargeDetails()

    /**
     * The custom line item's description.
     *
     * This is shown on the Bills page in association with the charge value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The custom line item's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A map that contains tag keys and tag values that are attached to a custom line item.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-tags)
     */
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
