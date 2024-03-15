@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a custom line item that can be used to create a one-time or recurring, fixed or
 * percentage-based charge that you can apply to a single billing group.
 *
 * You can apply custom line items to the current or previous billing period. You can create either
 * a fee or a discount custom line item.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.billingconductor.*;
 * CfnCustomLineItem cfnCustomLineItem = CfnCustomLineItem.Builder.create(this,
 * "MyCfnCustomLineItem")
 * .billingGroupArn("billingGroupArn")
 * .name("name")
 * // the properties below are optional
 * .accountId("accountId")
 * .billingPeriodRange(BillingPeriodRangeProperty.builder()
 * .exclusiveEndBillingPeriod("exclusiveEndBillingPeriod")
 * .inclusiveStartBillingPeriod("inclusiveStartBillingPeriod")
 * .build())
 * .customLineItemChargeDetails(CustomLineItemChargeDetailsProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .flat(CustomLineItemFlatChargeDetailsProperty.builder()
 * .chargeValue(123)
 * .build())
 * .lineItemFilters(List.of(LineItemFilterProperty.builder()
 * .attribute("attribute")
 * .matchOption("matchOption")
 * .values(List.of("values"))
 * .build()))
 * .percentage(CustomLineItemPercentageChargeDetailsProperty.builder()
 * .percentageValue(123)
 * // the properties below are optional
 * .childAssociatedResources(List.of("childAssociatedResources"))
 * .build())
 * .build())
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html)
 */
public open class CfnCustomLineItem internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.billingconductor.CfnCustomLineItem,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The AWS account in which this custom line item will be applied to.
   */
  public open fun accountId(): String? = unwrap(this).getAccountId()

  /**
   * The AWS account in which this custom line item will be applied to.
   */
  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) that references the billing group where the custom line item
   * applies to.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The number of resources that are associated to the custom line item.
   */
  public open fun attrAssociationSize(): Number = unwrap(this).getAttrAssociationSize()

  /**
   * The time created.
   */
  public open fun attrCreationTime(): Number = unwrap(this).getAttrCreationTime()

  /**
   * The custom line item's charge value currency.
   *
   * Only one of the valid values can be used.
   */
  public open fun attrCurrencyCode(): String = unwrap(this).getAttrCurrencyCode()

  /**
   * The most recent time the custom line item was modified.
   */
  public open fun attrLastModifiedTime(): Number = unwrap(this).getAttrLastModifiedTime()

  /**
   * The product code associated with the custom line item.
   */
  public open fun attrProductCode(): String = unwrap(this).getAttrProductCode()

  /**
   * The Amazon Resource Name (ARN) that references the billing group where the custom line item
   * applies to.
   */
  public open fun billingGroupArn(): String = unwrap(this).getBillingGroupArn()

  /**
   * The Amazon Resource Name (ARN) that references the billing group where the custom line item
   * applies to.
   */
  public open fun billingGroupArn(`value`: String) {
    unwrap(this).setBillingGroupArn(`value`)
  }

  /**
   * A time range for which the custom line item is effective.
   */
  public open fun billingPeriodRange(): Any? = unwrap(this).getBillingPeriodRange()

  /**
   * A time range for which the custom line item is effective.
   */
  public open fun billingPeriodRange(`value`: IResolvable) {
    unwrap(this).setBillingPeriodRange(`value`.let(IResolvable::unwrap))
  }

  /**
   * A time range for which the custom line item is effective.
   */
  public open fun billingPeriodRange(`value`: BillingPeriodRangeProperty) {
    unwrap(this).setBillingPeriodRange(`value`.let(BillingPeriodRangeProperty::unwrap))
  }

  /**
   * A time range for which the custom line item is effective.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0dab49a2afe675545e03cde0149415727f1c615400ab031caf7b40d705cb57d7")
  public open fun billingPeriodRange(`value`: BillingPeriodRangeProperty.Builder.() -> Unit): Unit =
      billingPeriodRange(BillingPeriodRangeProperty(`value`))

  /**
   * The charge details of a custom line item.
   */
  public open fun customLineItemChargeDetails(): Any? =
      unwrap(this).getCustomLineItemChargeDetails()

  /**
   * The charge details of a custom line item.
   */
  public open fun customLineItemChargeDetails(`value`: IResolvable) {
    unwrap(this).setCustomLineItemChargeDetails(`value`.let(IResolvable::unwrap))
  }

  /**
   * The charge details of a custom line item.
   */
  public open fun customLineItemChargeDetails(`value`: CustomLineItemChargeDetailsProperty) {
    unwrap(this).setCustomLineItemChargeDetails(`value`.let(CustomLineItemChargeDetailsProperty::unwrap))
  }

  /**
   * The charge details of a custom line item.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8ef4b3c2a2d68f33025d81faca1b809294efd37a5e97d69e997e129e7a8f4aa1")
  public open
      fun customLineItemChargeDetails(`value`: CustomLineItemChargeDetailsProperty.Builder.() -> Unit):
      Unit = customLineItemChargeDetails(CustomLineItemChargeDetailsProperty(`value`))

  /**
   * The custom line item's description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The custom line item's description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The custom line item's name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The custom line item's name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A map that contains tag keys and tag values that are attached to a custom line item.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A map that contains tag keys and tag values that are attached to a custom line item.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A map that contains tag keys and tag values that are attached to a custom line item.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.billingconductor.CfnCustomLineItem].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account in which this custom line item will be applied to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-accountid)
     * @param accountId The AWS account in which this custom line item will be applied to. 
     */
    public fun accountId(accountId: String)

    /**
     * The Amazon Resource Name (ARN) that references the billing group where the custom line item
     * applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billinggrouparn)
     * @param billingGroupArn The Amazon Resource Name (ARN) that references the billing group where
     * the custom line item applies to. 
     */
    public fun billingGroupArn(billingGroupArn: String)

    /**
     * A time range for which the custom line item is effective.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billingperiodrange)
     * @param billingPeriodRange A time range for which the custom line item is effective. 
     */
    public fun billingPeriodRange(billingPeriodRange: IResolvable)

    /**
     * A time range for which the custom line item is effective.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billingperiodrange)
     * @param billingPeriodRange A time range for which the custom line item is effective. 
     */
    public fun billingPeriodRange(billingPeriodRange: BillingPeriodRangeProperty)

    /**
     * A time range for which the custom line item is effective.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billingperiodrange)
     * @param billingPeriodRange A time range for which the custom line item is effective. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19ace5344de6c360a357deb5fda8b02710864d6b1e70ccd7557683e7c24529f7")
    public fun billingPeriodRange(billingPeriodRange: BillingPeriodRangeProperty.Builder.() -> Unit)

    /**
     * The charge details of a custom line item.
     *
     * It should contain only one of `Flat` or `Percentage` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-customlineitemchargedetails)
     * @param customLineItemChargeDetails The charge details of a custom line item. 
     */
    public fun customLineItemChargeDetails(customLineItemChargeDetails: IResolvable)

    /**
     * The charge details of a custom line item.
     *
     * It should contain only one of `Flat` or `Percentage` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-customlineitemchargedetails)
     * @param customLineItemChargeDetails The charge details of a custom line item. 
     */
    public
        fun customLineItemChargeDetails(customLineItemChargeDetails: CustomLineItemChargeDetailsProperty)

    /**
     * The charge details of a custom line item.
     *
     * It should contain only one of `Flat` or `Percentage` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-customlineitemchargedetails)
     * @param customLineItemChargeDetails The charge details of a custom line item. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8de4dc9dc0e408c08a38c210e0f8ea2c1d0a726c5d14b84fd1c438e995c31e6")
    public
        fun customLineItemChargeDetails(customLineItemChargeDetails: CustomLineItemChargeDetailsProperty.Builder.() -> Unit)

    /**
     * The custom line item's description.
     *
     * This is shown on the Bills page in association with the charge value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-description)
     * @param description The custom line item's description. 
     */
    public fun description(description: String)

    /**
     * The custom line item's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-name)
     * @param name The custom line item's name. 
     */
    public fun name(name: String)

    /**
     * A map that contains tag keys and tag values that are attached to a custom line item.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a custom line
     * item. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A map that contains tag keys and tag values that are attached to a custom line item.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a custom line
     * item. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.Builder =
        software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.Builder.create(scope, id)

    /**
     * The AWS account in which this custom line item will be applied to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-accountid)
     * @param accountId The AWS account in which this custom line item will be applied to. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * The Amazon Resource Name (ARN) that references the billing group where the custom line item
     * applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billinggrouparn)
     * @param billingGroupArn The Amazon Resource Name (ARN) that references the billing group where
     * the custom line item applies to. 
     */
    override fun billingGroupArn(billingGroupArn: String) {
      cdkBuilder.billingGroupArn(billingGroupArn)
    }

    /**
     * A time range for which the custom line item is effective.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billingperiodrange)
     * @param billingPeriodRange A time range for which the custom line item is effective. 
     */
    override fun billingPeriodRange(billingPeriodRange: IResolvable) {
      cdkBuilder.billingPeriodRange(billingPeriodRange.let(IResolvable::unwrap))
    }

    /**
     * A time range for which the custom line item is effective.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billingperiodrange)
     * @param billingPeriodRange A time range for which the custom line item is effective. 
     */
    override fun billingPeriodRange(billingPeriodRange: BillingPeriodRangeProperty) {
      cdkBuilder.billingPeriodRange(billingPeriodRange.let(BillingPeriodRangeProperty::unwrap))
    }

    /**
     * A time range for which the custom line item is effective.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billingperiodrange)
     * @param billingPeriodRange A time range for which the custom line item is effective. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19ace5344de6c360a357deb5fda8b02710864d6b1e70ccd7557683e7c24529f7")
    override
        fun billingPeriodRange(billingPeriodRange: BillingPeriodRangeProperty.Builder.() -> Unit):
        Unit = billingPeriodRange(BillingPeriodRangeProperty(billingPeriodRange))

    /**
     * The charge details of a custom line item.
     *
     * It should contain only one of `Flat` or `Percentage` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-customlineitemchargedetails)
     * @param customLineItemChargeDetails The charge details of a custom line item. 
     */
    override fun customLineItemChargeDetails(customLineItemChargeDetails: IResolvable) {
      cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails.let(IResolvable::unwrap))
    }

    /**
     * The charge details of a custom line item.
     *
     * It should contain only one of `Flat` or `Percentage` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-customlineitemchargedetails)
     * @param customLineItemChargeDetails The charge details of a custom line item. 
     */
    override
        fun customLineItemChargeDetails(customLineItemChargeDetails: CustomLineItemChargeDetailsProperty) {
      cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails.let(CustomLineItemChargeDetailsProperty::unwrap))
    }

    /**
     * The charge details of a custom line item.
     *
     * It should contain only one of `Flat` or `Percentage` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-customlineitemchargedetails)
     * @param customLineItemChargeDetails The charge details of a custom line item. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8de4dc9dc0e408c08a38c210e0f8ea2c1d0a726c5d14b84fd1c438e995c31e6")
    override
        fun customLineItemChargeDetails(customLineItemChargeDetails: CustomLineItemChargeDetailsProperty.Builder.() -> Unit):
        Unit =
        customLineItemChargeDetails(CustomLineItemChargeDetailsProperty(customLineItemChargeDetails))

    /**
     * The custom line item's description.
     *
     * This is shown on the Bills page in association with the charge value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-description)
     * @param description The custom line item's description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The custom line item's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-name)
     * @param name The custom line item's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A map that contains tag keys and tag values that are attached to a custom line item.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a custom line
     * item. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A map that contains tag keys and tag values that are attached to a custom line item.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a custom line
     * item. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnCustomLineItem =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CFN_RESOURCE_TYPE_NAME

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

  /**
   * A representation of the line item filter for your custom line item.
   *
   * You can use line item filters to include or exclude specific resource values from the billing
   * group's total cost. For example, if you create a custom line item and you want to filter out a
   * value, such as Savings Plan discounts, you can update `LineItemFilter` to exclude it.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.billingconductor.*;
   * LineItemFilterProperty lineItemFilterProperty = LineItemFilterProperty.builder()
   * .attribute("attribute")
   * .matchOption("matchOption")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-lineitemfilter.html)
   */
  public interface LineItemFilterProperty {
    /**
     * The attribute of the line item filter.
     *
     * This specifies what attribute that you can filter on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-lineitemfilter.html#cfn-billingconductor-customlineitem-lineitemfilter-attribute)
     */
    public fun attribute(): String

    /**
     * The match criteria of the line item filter.
     *
     * This parameter specifies whether not to include the resource value from the billing group
     * total cost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-lineitemfilter.html#cfn-billingconductor-customlineitem-lineitemfilter-matchoption)
     */
    public fun matchOption(): String

    /**
     * The values of the line item filter.
     *
     * This specifies the values to filter on. Currently, you can only exclude Savings Plan
     * discounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-lineitemfilter.html#cfn-billingconductor-customlineitem-lineitemfilter-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [LineItemFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attribute The attribute of the line item filter. 
       * This specifies what attribute that you can filter on.
       */
      public fun attribute(attribute: String)

      /**
       * @param matchOption The match criteria of the line item filter. 
       * This parameter specifies whether not to include the resource value from the billing group
       * total cost.
       */
      public fun matchOption(matchOption: String)

      /**
       * @param values The values of the line item filter. 
       * This specifies the values to filter on. Currently, you can only exclude Savings Plan
       * discounts.
       */
      public fun values(values: List<String>)

      /**
       * @param values The values of the line item filter. 
       * This specifies the values to filter on. Currently, you can only exclude Savings Plan
       * discounts.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty.builder()

      /**
       * @param attribute The attribute of the line item filter. 
       * This specifies what attribute that you can filter on.
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      /**
       * @param matchOption The match criteria of the line item filter. 
       * This parameter specifies whether not to include the resource value from the billing group
       * total cost.
       */
      override fun matchOption(matchOption: String) {
        cdkBuilder.matchOption(matchOption)
      }

      /**
       * @param values The values of the line item filter. 
       * This specifies the values to filter on. Currently, you can only exclude Savings Plan
       * discounts.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The values of the line item filter. 
       * This specifies the values to filter on. Currently, you can only exclude Savings Plan
       * discounts.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty,
    ) : CdkObject(cdkObject), LineItemFilterProperty {
      /**
       * The attribute of the line item filter.
       *
       * This specifies what attribute that you can filter on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-lineitemfilter.html#cfn-billingconductor-customlineitem-lineitemfilter-attribute)
       */
      override fun attribute(): String = unwrap(this).getAttribute()

      /**
       * The match criteria of the line item filter.
       *
       * This parameter specifies whether not to include the resource value from the billing group
       * total cost.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-lineitemfilter.html#cfn-billingconductor-customlineitem-lineitemfilter-matchoption)
       */
      override fun matchOption(): String = unwrap(this).getMatchOption()

      /**
       * The values of the line item filter.
       *
       * This specifies the values to filter on. Currently, you can only exclude Savings Plan
       * discounts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-lineitemfilter.html#cfn-billingconductor-customlineitem-lineitemfilter-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LineItemFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty):
          LineItemFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LineItemFilterProperty):
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.LineItemFilterProperty
    }
  }

  /**
   * The charge details of a custom line item.
   *
   * It should contain only one of `Flat` or `Percentage` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.billingconductor.*;
   * CustomLineItemFlatChargeDetailsProperty customLineItemFlatChargeDetailsProperty =
   * CustomLineItemFlatChargeDetailsProperty.builder()
   * .chargeValue(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemflatchargedetails.html)
   */
  public interface CustomLineItemFlatChargeDetailsProperty {
    /**
     * The custom line item's fixed charge value in USD.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemflatchargedetails.html#cfn-billingconductor-customlineitem-customlineitemflatchargedetails-chargevalue)
     */
    public fun chargeValue(): Number

    /**
     * A builder for [CustomLineItemFlatChargeDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param chargeValue The custom line item's fixed charge value in USD. 
       */
      public fun chargeValue(chargeValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty.builder()

      /**
       * @param chargeValue The custom line item's fixed charge value in USD. 
       */
      override fun chargeValue(chargeValue: Number) {
        cdkBuilder.chargeValue(chargeValue)
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty,
    ) : CdkObject(cdkObject), CustomLineItemFlatChargeDetailsProperty {
      /**
       * The custom line item's fixed charge value in USD.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemflatchargedetails.html#cfn-billingconductor-customlineitem-customlineitemflatchargedetails-chargevalue)
       */
      override fun chargeValue(): Number = unwrap(this).getChargeValue()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty
    }
  }

  /**
   * The charge details of a custom line item.
   *
   * It should contain only one of `Flat` or `Percentage` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.billingconductor.*;
   * CustomLineItemChargeDetailsProperty customLineItemChargeDetailsProperty =
   * CustomLineItemChargeDetailsProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .flat(CustomLineItemFlatChargeDetailsProperty.builder()
   * .chargeValue(123)
   * .build())
   * .lineItemFilters(List.of(LineItemFilterProperty.builder()
   * .attribute("attribute")
   * .matchOption("matchOption")
   * .values(List.of("values"))
   * .build()))
   * .percentage(CustomLineItemPercentageChargeDetailsProperty.builder()
   * .percentageValue(123)
   * // the properties below are optional
   * .childAssociatedResources(List.of("childAssociatedResources"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemchargedetails.html)
   */
  public interface CustomLineItemChargeDetailsProperty {
    /**
     * A `CustomLineItemFlatChargeDetails` that describes the charge details of a flat custom line
     * item.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemchargedetails.html#cfn-billingconductor-customlineitem-customlineitemchargedetails-flat)
     */
    public fun flat(): Any? = unwrap(this).getFlat()

    /**
     * A representation of the line item filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemchargedetails.html#cfn-billingconductor-customlineitem-customlineitemchargedetails-lineitemfilters)
     */
    public fun lineItemFilters(): Any? = unwrap(this).getLineItemFilters()

    /**
     * A `CustomLineItemPercentageChargeDetails` that describes the charge details of a percentage
     * custom line item.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemchargedetails.html#cfn-billingconductor-customlineitem-customlineitemchargedetails-percentage)
     */
    public fun percentage(): Any? = unwrap(this).getPercentage()

    /**
     * The type of the custom line item that indicates whether the charge is a fee or credit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemchargedetails.html#cfn-billingconductor-customlineitem-customlineitemchargedetails-type)
     */
    public fun type(): String

    /**
     * A builder for [CustomLineItemChargeDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param flat A `CustomLineItemFlatChargeDetails` that describes the charge details of a flat
       * custom line item.
       */
      public fun flat(flat: IResolvable)

      /**
       * @param flat A `CustomLineItemFlatChargeDetails` that describes the charge details of a flat
       * custom line item.
       */
      public fun flat(flat: CustomLineItemFlatChargeDetailsProperty)

      /**
       * @param flat A `CustomLineItemFlatChargeDetails` that describes the charge details of a flat
       * custom line item.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3694dda8f7a271affa2fd567c61d74095c408451b6c1953385f3186d3e086a4")
      public fun flat(flat: CustomLineItemFlatChargeDetailsProperty.Builder.() -> Unit)

      /**
       * @param lineItemFilters A representation of the line item filter.
       */
      public fun lineItemFilters(lineItemFilters: IResolvable)

      /**
       * @param lineItemFilters A representation of the line item filter.
       */
      public fun lineItemFilters(lineItemFilters: List<Any>)

      /**
       * @param lineItemFilters A representation of the line item filter.
       */
      public fun lineItemFilters(vararg lineItemFilters: Any)

      /**
       * @param percentage A `CustomLineItemPercentageChargeDetails` that describes the charge
       * details of a percentage custom line item.
       */
      public fun percentage(percentage: IResolvable)

      /**
       * @param percentage A `CustomLineItemPercentageChargeDetails` that describes the charge
       * details of a percentage custom line item.
       */
      public fun percentage(percentage: CustomLineItemPercentageChargeDetailsProperty)

      /**
       * @param percentage A `CustomLineItemPercentageChargeDetails` that describes the charge
       * details of a percentage custom line item.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81db3b88c31327860e6ced945ee7fd10385d0cdca0ad38a477ace43a545f2010")
      public
          fun percentage(percentage: CustomLineItemPercentageChargeDetailsProperty.Builder.() -> Unit)

      /**
       * @param type The type of the custom line item that indicates whether the charge is a fee or
       * credit. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemChargeDetailsProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemChargeDetailsProperty.builder()

      /**
       * @param flat A `CustomLineItemFlatChargeDetails` that describes the charge details of a flat
       * custom line item.
       */
      override fun flat(flat: IResolvable) {
        cdkBuilder.flat(flat.let(IResolvable::unwrap))
      }

      /**
       * @param flat A `CustomLineItemFlatChargeDetails` that describes the charge details of a flat
       * custom line item.
       */
      override fun flat(flat: CustomLineItemFlatChargeDetailsProperty) {
        cdkBuilder.flat(flat.let(CustomLineItemFlatChargeDetailsProperty::unwrap))
      }

      /**
       * @param flat A `CustomLineItemFlatChargeDetails` that describes the charge details of a flat
       * custom line item.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3694dda8f7a271affa2fd567c61d74095c408451b6c1953385f3186d3e086a4")
      override fun flat(flat: CustomLineItemFlatChargeDetailsProperty.Builder.() -> Unit): Unit =
          flat(CustomLineItemFlatChargeDetailsProperty(flat))

      /**
       * @param lineItemFilters A representation of the line item filter.
       */
      override fun lineItemFilters(lineItemFilters: IResolvable) {
        cdkBuilder.lineItemFilters(lineItemFilters.let(IResolvable::unwrap))
      }

      /**
       * @param lineItemFilters A representation of the line item filter.
       */
      override fun lineItemFilters(lineItemFilters: List<Any>) {
        cdkBuilder.lineItemFilters(lineItemFilters)
      }

      /**
       * @param lineItemFilters A representation of the line item filter.
       */
      override fun lineItemFilters(vararg lineItemFilters: Any): Unit =
          lineItemFilters(lineItemFilters.toList())

      /**
       * @param percentage A `CustomLineItemPercentageChargeDetails` that describes the charge
       * details of a percentage custom line item.
       */
      override fun percentage(percentage: IResolvable) {
        cdkBuilder.percentage(percentage.let(IResolvable::unwrap))
      }

      /**
       * @param percentage A `CustomLineItemPercentageChargeDetails` that describes the charge
       * details of a percentage custom line item.
       */
      override fun percentage(percentage: CustomLineItemPercentageChargeDetailsProperty) {
        cdkBuilder.percentage(percentage.let(CustomLineItemPercentageChargeDetailsProperty::unwrap))
      }

      /**
       * @param percentage A `CustomLineItemPercentageChargeDetails` that describes the charge
       * details of a percentage custom line item.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81db3b88c31327860e6ced945ee7fd10385d0cdca0ad38a477ace43a545f2010")
      override
          fun percentage(percentage: CustomLineItemPercentageChargeDetailsProperty.Builder.() -> Unit):
          Unit = percentage(CustomLineItemPercentageChargeDetailsProperty(percentage))

      /**
       * @param type The type of the custom line item that indicates whether the charge is a fee or
       * credit. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemChargeDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemChargeDetailsProperty,
    ) : CdkObject(cdkObject), CustomLineItemChargeDetailsProperty {
      /**
       * A `CustomLineItemFlatChargeDetails` that describes the charge details of a flat custom line
       * item.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemchargedetails.html#cfn-billingconductor-customlineitem-customlineitemchargedetails-flat)
       */
      override fun flat(): Any? = unwrap(this).getFlat()

      /**
       * A representation of the line item filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemchargedetails.html#cfn-billingconductor-customlineitem-customlineitemchargedetails-lineitemfilters)
       */
      override fun lineItemFilters(): Any? = unwrap(this).getLineItemFilters()

      /**
       * A `CustomLineItemPercentageChargeDetails` that describes the charge details of a percentage
       * custom line item.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemchargedetails.html#cfn-billingconductor-customlineitem-customlineitemchargedetails-percentage)
       */
      override fun percentage(): Any? = unwrap(this).getPercentage()

      /**
       * The type of the custom line item that indicates whether the charge is a fee or credit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitemchargedetails.html#cfn-billingconductor-customlineitem-customlineitemchargedetails-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemChargeDetailsProperty
    }
  }

  /**
   * The billing period range in which the custom line item request will be applied.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.billingconductor.*;
   * BillingPeriodRangeProperty billingPeriodRangeProperty = BillingPeriodRangeProperty.builder()
   * .exclusiveEndBillingPeriod("exclusiveEndBillingPeriod")
   * .inclusiveStartBillingPeriod("inclusiveStartBillingPeriod")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-billingperiodrange.html)
   */
  public interface BillingPeriodRangeProperty {
    /**
     * The exclusive end billing period that defines a billing period range where a custom line is
     * applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-billingperiodrange.html#cfn-billingconductor-customlineitem-billingperiodrange-exclusiveendbillingperiod)
     */
    public fun exclusiveEndBillingPeriod(): String? = unwrap(this).getExclusiveEndBillingPeriod()

    /**
     * The inclusive start billing period that defines a billing period range where a custom line is
     * applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-billingperiodrange.html#cfn-billingconductor-customlineitem-billingperiodrange-inclusivestartbillingperiod)
     */
    public fun inclusiveStartBillingPeriod(): String? =
        unwrap(this).getInclusiveStartBillingPeriod()

    /**
     * A builder for [BillingPeriodRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exclusiveEndBillingPeriod The exclusive end billing period that defines a billing
       * period range where a custom line is applied.
       */
      public fun exclusiveEndBillingPeriod(exclusiveEndBillingPeriod: String)

      /**
       * @param inclusiveStartBillingPeriod The inclusive start billing period that defines a
       * billing period range where a custom line is applied.
       */
      public fun inclusiveStartBillingPeriod(inclusiveStartBillingPeriod: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty.builder()

      /**
       * @param exclusiveEndBillingPeriod The exclusive end billing period that defines a billing
       * period range where a custom line is applied.
       */
      override fun exclusiveEndBillingPeriod(exclusiveEndBillingPeriod: String) {
        cdkBuilder.exclusiveEndBillingPeriod(exclusiveEndBillingPeriod)
      }

      /**
       * @param inclusiveStartBillingPeriod The inclusive start billing period that defines a
       * billing period range where a custom line is applied.
       */
      override fun inclusiveStartBillingPeriod(inclusiveStartBillingPeriod: String) {
        cdkBuilder.inclusiveStartBillingPeriod(inclusiveStartBillingPeriod)
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty,
    ) : CdkObject(cdkObject), BillingPeriodRangeProperty {
      /**
       * The exclusive end billing period that defines a billing period range where a custom line is
       * applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-billingperiodrange.html#cfn-billingconductor-customlineitem-billingperiodrange-exclusiveendbillingperiod)
       */
      override fun exclusiveEndBillingPeriod(): String? =
          unwrap(this).getExclusiveEndBillingPeriod()

      /**
       * The inclusive start billing period that defines a billing period range where a custom line
       * is applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-billingperiodrange.html#cfn-billingconductor-customlineitem-billingperiodrange-inclusivestartbillingperiod)
       */
      override fun inclusiveStartBillingPeriod(): String? =
          unwrap(this).getInclusiveStartBillingPeriod()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BillingPeriodRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty):
          BillingPeriodRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BillingPeriodRangeProperty):
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.BillingPeriodRangeProperty
    }
  }

  /**
   * A representation of the charge details associated with a percentage custom line item.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.billingconductor.*;
   * CustomLineItemPercentageChargeDetailsProperty customLineItemPercentageChargeDetailsProperty =
   * CustomLineItemPercentageChargeDetailsProperty.builder()
   * .percentageValue(123)
   * // the properties below are optional
   * .childAssociatedResources(List.of("childAssociatedResources"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitempercentagechargedetails.html)
   */
  public interface CustomLineItemPercentageChargeDetailsProperty {
    /**
     * A list of resource ARNs to associate to the percentage custom line item.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitempercentagechargedetails.html#cfn-billingconductor-customlineitem-customlineitempercentagechargedetails-childassociatedresources)
     */
    public fun childAssociatedResources(): List<String> = unwrap(this).getChildAssociatedResources()
        ?: emptyList()

    /**
     * The custom line item's percentage value.
     *
     * This will be multiplied against the combined value of its associated resources to determine
     * its charge value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitempercentagechargedetails.html#cfn-billingconductor-customlineitem-customlineitempercentagechargedetails-percentagevalue)
     */
    public fun percentageValue(): Number

    /**
     * A builder for [CustomLineItemPercentageChargeDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param childAssociatedResources A list of resource ARNs to associate to the percentage
       * custom line item.
       */
      public fun childAssociatedResources(childAssociatedResources: List<String>)

      /**
       * @param childAssociatedResources A list of resource ARNs to associate to the percentage
       * custom line item.
       */
      public fun childAssociatedResources(vararg childAssociatedResources: String)

      /**
       * @param percentageValue The custom line item's percentage value. 
       * This will be multiplied against the combined value of its associated resources to determine
       * its charge value.
       */
      public fun percentageValue(percentageValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty.builder()

      /**
       * @param childAssociatedResources A list of resource ARNs to associate to the percentage
       * custom line item.
       */
      override fun childAssociatedResources(childAssociatedResources: List<String>) {
        cdkBuilder.childAssociatedResources(childAssociatedResources)
      }

      /**
       * @param childAssociatedResources A list of resource ARNs to associate to the percentage
       * custom line item.
       */
      override fun childAssociatedResources(vararg childAssociatedResources: String): Unit =
          childAssociatedResources(childAssociatedResources.toList())

      /**
       * @param percentageValue The custom line item's percentage value. 
       * This will be multiplied against the combined value of its associated resources to determine
       * its charge value.
       */
      override fun percentageValue(percentageValue: Number) {
        cdkBuilder.percentageValue(percentageValue)
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty,
    ) : CdkObject(cdkObject), CustomLineItemPercentageChargeDetailsProperty {
      /**
       * A list of resource ARNs to associate to the percentage custom line item.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitempercentagechargedetails.html#cfn-billingconductor-customlineitem-customlineitempercentagechargedetails-childassociatedresources)
       */
      override fun childAssociatedResources(): List<String> =
          unwrap(this).getChildAssociatedResources() ?: emptyList()

      /**
       * The custom line item's percentage value.
       *
       * This will be multiplied against the combined value of its associated resources to determine
       * its charge value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-customlineitem-customlineitempercentagechargedetails.html#cfn-billingconductor-customlineitem-customlineitempercentagechargedetails-percentagevalue)
       */
      override fun percentageValue(): Number = unwrap(this).getPercentageValue()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.billingconductor.CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty
    }
  }
}
