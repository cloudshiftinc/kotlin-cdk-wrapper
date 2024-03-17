@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBillingGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.billingconductor.*;
 * CfnBillingGroupProps cfnBillingGroupProps = CfnBillingGroupProps.builder()
 * .accountGrouping(AccountGroupingProperty.builder()
 * .linkedAccountIds(List.of("linkedAccountIds"))
 * // the properties below are optional
 * .autoAssociate(false)
 * .build())
 * .computationPreference(ComputationPreferenceProperty.builder()
 * .pricingPlanArn("pricingPlanArn")
 * .build())
 * .name("name")
 * .primaryAccountId("primaryAccountId")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html)
 */
public interface CfnBillingGroupProps {
  /**
   * The set of accounts that will be under the billing group.
   *
   * The set of accounts resemble the linked accounts in a consolidated billing family.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-accountgrouping)
   */
  public fun accountGrouping(): Any

  /**
   * The preferences and settings that will be used to compute the AWS charges for a billing group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-computationpreference)
   */
  public fun computationPreference(): Any

  /**
   * The description of the billing group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The billing group's name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-name)
   */
  public fun name(): String

  /**
   * The account ID that serves as the main account in a billing group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-primaryaccountid)
   */
  public fun primaryAccountId(): String

  /**
   * A map that contains tag keys and tag values that are attached to a billing group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnBillingGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountGrouping The set of accounts that will be under the billing group. 
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     */
    public fun accountGrouping(accountGrouping: IResolvable)

    /**
     * @param accountGrouping The set of accounts that will be under the billing group. 
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     */
    public fun accountGrouping(accountGrouping: CfnBillingGroup.AccountGroupingProperty)

    /**
     * @param accountGrouping The set of accounts that will be under the billing group. 
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29ffc74b9b67e19cba2e6a09f1961d11be0ee8441bf899982b6a9faf7657f088")
    public
        fun accountGrouping(accountGrouping: CfnBillingGroup.AccountGroupingProperty.Builder.() -> Unit)

    /**
     * @param computationPreference The preferences and settings that will be used to compute the
     * AWS charges for a billing group. 
     */
    public fun computationPreference(computationPreference: IResolvable)

    /**
     * @param computationPreference The preferences and settings that will be used to compute the
     * AWS charges for a billing group. 
     */
    public
        fun computationPreference(computationPreference: CfnBillingGroup.ComputationPreferenceProperty)

    /**
     * @param computationPreference The preferences and settings that will be used to compute the
     * AWS charges for a billing group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b87a57bc66f314cf440622b5c61261c5b97d7e040e81f4d5ee966089c982b282")
    public
        fun computationPreference(computationPreference: CfnBillingGroup.ComputationPreferenceProperty.Builder.() -> Unit)

    /**
     * @param description The description of the billing group.
     */
    public fun description(description: String)

    /**
     * @param name The billing group's name. 
     */
    public fun name(name: String)

    /**
     * @param primaryAccountId The account ID that serves as the main account in a billing group. 
     */
    public fun primaryAccountId(primaryAccountId: String)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a billing group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a billing group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps.Builder =
        software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps.builder()

    /**
     * @param accountGrouping The set of accounts that will be under the billing group. 
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     */
    override fun accountGrouping(accountGrouping: IResolvable) {
      cdkBuilder.accountGrouping(accountGrouping.let(IResolvable::unwrap))
    }

    /**
     * @param accountGrouping The set of accounts that will be under the billing group. 
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     */
    override fun accountGrouping(accountGrouping: CfnBillingGroup.AccountGroupingProperty) {
      cdkBuilder.accountGrouping(accountGrouping.let(CfnBillingGroup.AccountGroupingProperty::unwrap))
    }

    /**
     * @param accountGrouping The set of accounts that will be under the billing group. 
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29ffc74b9b67e19cba2e6a09f1961d11be0ee8441bf899982b6a9faf7657f088")
    override
        fun accountGrouping(accountGrouping: CfnBillingGroup.AccountGroupingProperty.Builder.() -> Unit):
        Unit = accountGrouping(CfnBillingGroup.AccountGroupingProperty(accountGrouping))

    /**
     * @param computationPreference The preferences and settings that will be used to compute the
     * AWS charges for a billing group. 
     */
    override fun computationPreference(computationPreference: IResolvable) {
      cdkBuilder.computationPreference(computationPreference.let(IResolvable::unwrap))
    }

    /**
     * @param computationPreference The preferences and settings that will be used to compute the
     * AWS charges for a billing group. 
     */
    override
        fun computationPreference(computationPreference: CfnBillingGroup.ComputationPreferenceProperty) {
      cdkBuilder.computationPreference(computationPreference.let(CfnBillingGroup.ComputationPreferenceProperty::unwrap))
    }

    /**
     * @param computationPreference The preferences and settings that will be used to compute the
     * AWS charges for a billing group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b87a57bc66f314cf440622b5c61261c5b97d7e040e81f4d5ee966089c982b282")
    override
        fun computationPreference(computationPreference: CfnBillingGroup.ComputationPreferenceProperty.Builder.() -> Unit):
        Unit =
        computationPreference(CfnBillingGroup.ComputationPreferenceProperty(computationPreference))

    /**
     * @param description The description of the billing group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The billing group's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param primaryAccountId The account ID that serves as the main account in a billing group. 
     */
    override fun primaryAccountId(primaryAccountId: String) {
      cdkBuilder.primaryAccountId(primaryAccountId)
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a billing group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a billing group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps,
  ) : CdkObject(cdkObject), CfnBillingGroupProps {
    /**
     * The set of accounts that will be under the billing group.
     *
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-accountgrouping)
     */
    override fun accountGrouping(): Any = unwrap(this).getAccountGrouping()

    /**
     * The preferences and settings that will be used to compute the AWS charges for a billing
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-computationpreference)
     */
    override fun computationPreference(): Any = unwrap(this).getComputationPreference()

    /**
     * The description of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The billing group's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The account ID that serves as the main account in a billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-primaryaccountid)
     */
    override fun primaryAccountId(): String = unwrap(this).getPrimaryAccountId()

    /**
     * A map that contains tag keys and tag values that are attached to a billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBillingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps):
        CfnBillingGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBillingGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBillingGroupProps):
        software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps
  }
}
