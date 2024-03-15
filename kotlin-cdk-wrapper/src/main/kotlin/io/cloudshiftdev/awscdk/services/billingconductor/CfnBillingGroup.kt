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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a billing group that resembles a consolidated billing family that AWS charges, based off
 * of the predefined pricing plan computation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.billingconductor.*;
 * CfnBillingGroup cfnBillingGroup = CfnBillingGroup.Builder.create(this, "MyCfnBillingGroup")
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
public open class CfnBillingGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.billingconductor.CfnBillingGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The set of accounts that will be under the billing group.
   */
  public open fun accountGrouping(): Any = unwrap(this).getAccountGrouping()

  /**
   * The set of accounts that will be under the billing group.
   */
  public open fun accountGrouping(`value`: IResolvable) {
    unwrap(this).setAccountGrouping(`value`.let(IResolvable::unwrap))
  }

  /**
   * The set of accounts that will be under the billing group.
   */
  public open fun accountGrouping(`value`: AccountGroupingProperty) {
    unwrap(this).setAccountGrouping(`value`.let(AccountGroupingProperty::unwrap))
  }

  /**
   * The set of accounts that will be under the billing group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5fb00bef09835f4ab9c4d58187094e256ac340da7b7dbf318882d4bc71bec2b6")
  public open fun accountGrouping(`value`: AccountGroupingProperty.Builder.() -> Unit): Unit =
      accountGrouping(AccountGroupingProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the created billing group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time the billing group was created.
   */
  public open fun attrCreationTime(): Number = unwrap(this).getAttrCreationTime()

  /**
   * The most recent time the billing group was modified.
   */
  public open fun attrLastModifiedTime(): Number = unwrap(this).getAttrLastModifiedTime()

  /**
   * The number of accounts in the particular billing group.
   */
  public open fun attrSize(): Number = unwrap(this).getAttrSize()

  /**
   * The billing group status.
   *
   * Only one of the valid values can be used.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The reason why the billing group is in its current status.
   */
  public open fun attrStatusReason(): String = unwrap(this).getAttrStatusReason()

  /**
   * The preferences and settings that will be used to compute the AWS charges for a billing group.
   */
  public open fun computationPreference(): Any = unwrap(this).getComputationPreference()

  /**
   * The preferences and settings that will be used to compute the AWS charges for a billing group.
   */
  public open fun computationPreference(`value`: IResolvable) {
    unwrap(this).setComputationPreference(`value`.let(IResolvable::unwrap))
  }

  /**
   * The preferences and settings that will be used to compute the AWS charges for a billing group.
   */
  public open fun computationPreference(`value`: ComputationPreferenceProperty) {
    unwrap(this).setComputationPreference(`value`.let(ComputationPreferenceProperty::unwrap))
  }

  /**
   * The preferences and settings that will be used to compute the AWS charges for a billing group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28cc6df75eb1a8f86ded8e8b6dbad2ecb33286aba3294de98350ea65a935ce7a")
  public open fun computationPreference(`value`: ComputationPreferenceProperty.Builder.() -> Unit):
      Unit = computationPreference(ComputationPreferenceProperty(`value`))

  /**
   * The description of the billing group.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the billing group.
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
   * The billing group's name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The billing group's name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The account ID that serves as the main account in a billing group.
   */
  public open fun primaryAccountId(): String = unwrap(this).getPrimaryAccountId()

  /**
   * The account ID that serves as the main account in a billing group.
   */
  public open fun primaryAccountId(`value`: String) {
    unwrap(this).setPrimaryAccountId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A map that contains tag keys and tag values that are attached to a billing group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A map that contains tag keys and tag values that are attached to a billing group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A map that contains tag keys and tag values that are attached to a billing group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.billingconductor.CfnBillingGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The set of accounts that will be under the billing group.
     *
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-accountgrouping)
     * @param accountGrouping The set of accounts that will be under the billing group. 
     */
    public fun accountGrouping(accountGrouping: IResolvable)

    /**
     * The set of accounts that will be under the billing group.
     *
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-accountgrouping)
     * @param accountGrouping The set of accounts that will be under the billing group. 
     */
    public fun accountGrouping(accountGrouping: AccountGroupingProperty)

    /**
     * The set of accounts that will be under the billing group.
     *
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-accountgrouping)
     * @param accountGrouping The set of accounts that will be under the billing group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6561db1e7d55a9da29df832f6a8a7d91bb963600da3dcad22a13f5636bd3135b")
    public fun accountGrouping(accountGrouping: AccountGroupingProperty.Builder.() -> Unit)

    /**
     * The preferences and settings that will be used to compute the AWS charges for a billing
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-computationpreference)
     * @param computationPreference The preferences and settings that will be used to compute the
     * AWS charges for a billing group. 
     */
    public fun computationPreference(computationPreference: IResolvable)

    /**
     * The preferences and settings that will be used to compute the AWS charges for a billing
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-computationpreference)
     * @param computationPreference The preferences and settings that will be used to compute the
     * AWS charges for a billing group. 
     */
    public fun computationPreference(computationPreference: ComputationPreferenceProperty)

    /**
     * The preferences and settings that will be used to compute the AWS charges for a billing
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-computationpreference)
     * @param computationPreference The preferences and settings that will be used to compute the
     * AWS charges for a billing group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71ad21af2f035a47eb191d558da20b163e51414aed1d111c4a8aa68982c6b191")
    public
        fun computationPreference(computationPreference: ComputationPreferenceProperty.Builder.() -> Unit)

    /**
     * The description of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-description)
     * @param description The description of the billing group. 
     */
    public fun description(description: String)

    /**
     * The billing group's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-name)
     * @param name The billing group's name. 
     */
    public fun name(name: String)

    /**
     * The account ID that serves as the main account in a billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-primaryaccountid)
     * @param primaryAccountId The account ID that serves as the main account in a billing group. 
     */
    public fun primaryAccountId(primaryAccountId: String)

    /**
     * A map that contains tag keys and tag values that are attached to a billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a billing group.
     * 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A map that contains tag keys and tag values that are attached to a billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a billing group.
     * 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.billingconductor.CfnBillingGroup.Builder
        = software.amazon.awscdk.services.billingconductor.CfnBillingGroup.Builder.create(scope, id)

    /**
     * The set of accounts that will be under the billing group.
     *
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-accountgrouping)
     * @param accountGrouping The set of accounts that will be under the billing group. 
     */
    override fun accountGrouping(accountGrouping: IResolvable) {
      cdkBuilder.accountGrouping(accountGrouping.let(IResolvable::unwrap))
    }

    /**
     * The set of accounts that will be under the billing group.
     *
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-accountgrouping)
     * @param accountGrouping The set of accounts that will be under the billing group. 
     */
    override fun accountGrouping(accountGrouping: AccountGroupingProperty) {
      cdkBuilder.accountGrouping(accountGrouping.let(AccountGroupingProperty::unwrap))
    }

    /**
     * The set of accounts that will be under the billing group.
     *
     * The set of accounts resemble the linked accounts in a consolidated billing family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-accountgrouping)
     * @param accountGrouping The set of accounts that will be under the billing group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6561db1e7d55a9da29df832f6a8a7d91bb963600da3dcad22a13f5636bd3135b")
    override fun accountGrouping(accountGrouping: AccountGroupingProperty.Builder.() -> Unit): Unit
        = accountGrouping(AccountGroupingProperty(accountGrouping))

    /**
     * The preferences and settings that will be used to compute the AWS charges for a billing
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-computationpreference)
     * @param computationPreference The preferences and settings that will be used to compute the
     * AWS charges for a billing group. 
     */
    override fun computationPreference(computationPreference: IResolvable) {
      cdkBuilder.computationPreference(computationPreference.let(IResolvable::unwrap))
    }

    /**
     * The preferences and settings that will be used to compute the AWS charges for a billing
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-computationpreference)
     * @param computationPreference The preferences and settings that will be used to compute the
     * AWS charges for a billing group. 
     */
    override fun computationPreference(computationPreference: ComputationPreferenceProperty) {
      cdkBuilder.computationPreference(computationPreference.let(ComputationPreferenceProperty::unwrap))
    }

    /**
     * The preferences and settings that will be used to compute the AWS charges for a billing
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-computationpreference)
     * @param computationPreference The preferences and settings that will be used to compute the
     * AWS charges for a billing group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71ad21af2f035a47eb191d558da20b163e51414aed1d111c4a8aa68982c6b191")
    override
        fun computationPreference(computationPreference: ComputationPreferenceProperty.Builder.() -> Unit):
        Unit = computationPreference(ComputationPreferenceProperty(computationPreference))

    /**
     * The description of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-description)
     * @param description The description of the billing group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The billing group's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-name)
     * @param name The billing group's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The account ID that serves as the main account in a billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-primaryaccountid)
     * @param primaryAccountId The account ID that serves as the main account in a billing group. 
     */
    override fun primaryAccountId(primaryAccountId: String) {
      cdkBuilder.primaryAccountId(primaryAccountId)
    }

    /**
     * A map that contains tag keys and tag values that are attached to a billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a billing group.
     * 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A map that contains tag keys and tag values that are attached to a billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-billinggroup.html#cfn-billingconductor-billinggroup-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a billing group.
     * 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnBillingGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.billingconductor.CfnBillingGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBillingGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBillingGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnBillingGroup):
        CfnBillingGroup = CfnBillingGroup(cdkObject)

    internal fun unwrap(wrapped: CfnBillingGroup):
        software.amazon.awscdk.services.billingconductor.CfnBillingGroup = wrapped.cdkObject
  }

  /**
   * The set of accounts that will be under the billing group.
   *
   * The set of accounts resemble the linked accounts in a consolidated billing family.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.billingconductor.*;
   * AccountGroupingProperty accountGroupingProperty = AccountGroupingProperty.builder()
   * .linkedAccountIds(List.of("linkedAccountIds"))
   * // the properties below are optional
   * .autoAssociate(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-billinggroup-accountgrouping.html)
   */
  public interface AccountGroupingProperty {
    /**
     * Specifies if this billing group will automatically associate newly added AWS accounts that
     * join your consolidated billing family.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-billinggroup-accountgrouping.html#cfn-billingconductor-billinggroup-accountgrouping-autoassociate)
     */
    public fun autoAssociate(): Any? = unwrap(this).getAutoAssociate()

    /**
     * The account IDs that make up the billing group.
     *
     * Account IDs must be a part of the consolidated billing family, and not associated with
     * another billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-billinggroup-accountgrouping.html#cfn-billingconductor-billinggroup-accountgrouping-linkedaccountids)
     */
    public fun linkedAccountIds(): List<String>

    /**
     * A builder for [AccountGroupingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoAssociate Specifies if this billing group will automatically associate newly
       * added AWS accounts that join your consolidated billing family.
       */
      public fun autoAssociate(autoAssociate: Boolean)

      /**
       * @param autoAssociate Specifies if this billing group will automatically associate newly
       * added AWS accounts that join your consolidated billing family.
       */
      public fun autoAssociate(autoAssociate: IResolvable)

      /**
       * @param linkedAccountIds The account IDs that make up the billing group. 
       * Account IDs must be a part of the consolidated billing family, and not associated with
       * another billing group.
       */
      public fun linkedAccountIds(linkedAccountIds: List<String>)

      /**
       * @param linkedAccountIds The account IDs that make up the billing group. 
       * Account IDs must be a part of the consolidated billing family, and not associated with
       * another billing group.
       */
      public fun linkedAccountIds(vararg linkedAccountIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty.builder()

      /**
       * @param autoAssociate Specifies if this billing group will automatically associate newly
       * added AWS accounts that join your consolidated billing family.
       */
      override fun autoAssociate(autoAssociate: Boolean) {
        cdkBuilder.autoAssociate(autoAssociate)
      }

      /**
       * @param autoAssociate Specifies if this billing group will automatically associate newly
       * added AWS accounts that join your consolidated billing family.
       */
      override fun autoAssociate(autoAssociate: IResolvable) {
        cdkBuilder.autoAssociate(autoAssociate.let(IResolvable::unwrap))
      }

      /**
       * @param linkedAccountIds The account IDs that make up the billing group. 
       * Account IDs must be a part of the consolidated billing family, and not associated with
       * another billing group.
       */
      override fun linkedAccountIds(linkedAccountIds: List<String>) {
        cdkBuilder.linkedAccountIds(linkedAccountIds)
      }

      /**
       * @param linkedAccountIds The account IDs that make up the billing group. 
       * Account IDs must be a part of the consolidated billing family, and not associated with
       * another billing group.
       */
      override fun linkedAccountIds(vararg linkedAccountIds: String): Unit =
          linkedAccountIds(linkedAccountIds.toList())

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty,
    ) : CdkObject(cdkObject), AccountGroupingProperty {
      /**
       * Specifies if this billing group will automatically associate newly added AWS accounts that
       * join your consolidated billing family.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-billinggroup-accountgrouping.html#cfn-billingconductor-billinggroup-accountgrouping-autoassociate)
       */
      override fun autoAssociate(): Any? = unwrap(this).getAutoAssociate()

      /**
       * The account IDs that make up the billing group.
       *
       * Account IDs must be a part of the consolidated billing family, and not associated with
       * another billing group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-billinggroup-accountgrouping.html#cfn-billingconductor-billinggroup-accountgrouping-linkedaccountids)
       */
      override fun linkedAccountIds(): List<String> = unwrap(this).getLinkedAccountIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccountGroupingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty):
          AccountGroupingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountGroupingProperty):
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty
    }
  }

  /**
   * The preferences and settings that will be used to compute the AWS charges for a billing group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.billingconductor.*;
   * ComputationPreferenceProperty computationPreferenceProperty =
   * ComputationPreferenceProperty.builder()
   * .pricingPlanArn("pricingPlanArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-billinggroup-computationpreference.html)
   */
  public interface ComputationPreferenceProperty {
    /**
     * The Amazon Resource Name (ARN) of the pricing plan used to compute the AWS charges for a
     * billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-billinggroup-computationpreference.html#cfn-billingconductor-billinggroup-computationpreference-pricingplanarn)
     */
    public fun pricingPlanArn(): String

    /**
     * A builder for [ComputationPreferenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pricingPlanArn The Amazon Resource Name (ARN) of the pricing plan used to compute
       * the AWS charges for a billing group. 
       */
      public fun pricingPlanArn(pricingPlanArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty.builder()

      /**
       * @param pricingPlanArn The Amazon Resource Name (ARN) of the pricing plan used to compute
       * the AWS charges for a billing group. 
       */
      override fun pricingPlanArn(pricingPlanArn: String) {
        cdkBuilder.pricingPlanArn(pricingPlanArn)
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty,
    ) : CdkObject(cdkObject), ComputationPreferenceProperty {
      /**
       * The Amazon Resource Name (ARN) of the pricing plan used to compute the AWS charges for a
       * billing group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-billinggroup-computationpreference.html#cfn-billingconductor-billinggroup-computationpreference-pricingplanarn)
       */
      override fun pricingPlanArn(): String = unwrap(this).getPricingPlanArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComputationPreferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty):
          ComputationPreferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputationPreferenceProperty):
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty
    }
  }
}
