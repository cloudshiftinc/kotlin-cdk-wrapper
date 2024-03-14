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

public open class CfnBillingGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.billingconductor.CfnBillingGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accountGrouping(): Any = unwrap(this).getAccountGrouping()

  public open fun accountGrouping(`value`: IResolvable) {
    unwrap(this).setAccountGrouping(`value`.let(IResolvable::unwrap))
  }

  public open fun accountGrouping(`value`: AccountGroupingProperty) {
    unwrap(this).setAccountGrouping(`value`.let(AccountGroupingProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5fb00bef09835f4ab9c4d58187094e256ac340da7b7dbf318882d4bc71bec2b6")
  public open fun accountGrouping(`value`: AccountGroupingProperty.Builder.() -> Unit): Unit =
      accountGrouping(AccountGroupingProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): Number = unwrap(this).getAttrCreationTime()

  public open fun attrLastModifiedTime(): Number = unwrap(this).getAttrLastModifiedTime()

  public open fun attrSize(): Number = unwrap(this).getAttrSize()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrStatusReason(): String = unwrap(this).getAttrStatusReason()

  public open fun computationPreference(): Any = unwrap(this).getComputationPreference()

  public open fun computationPreference(`value`: IResolvable) {
    unwrap(this).setComputationPreference(`value`.let(IResolvable::unwrap))
  }

  public open fun computationPreference(`value`: ComputationPreferenceProperty) {
    unwrap(this).setComputationPreference(`value`.let(ComputationPreferenceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28cc6df75eb1a8f86ded8e8b6dbad2ecb33286aba3294de98350ea65a935ce7a")
  public open fun computationPreference(`value`: ComputationPreferenceProperty.Builder.() -> Unit):
      Unit = computationPreference(ComputationPreferenceProperty(`value`))

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

  public open fun primaryAccountId(): String = unwrap(this).getPrimaryAccountId()

  public open fun primaryAccountId(`value`: String) {
    unwrap(this).setPrimaryAccountId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun accountGrouping(accountGrouping: IResolvable)

    public fun accountGrouping(accountGrouping: AccountGroupingProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6561db1e7d55a9da29df832f6a8a7d91bb963600da3dcad22a13f5636bd3135b")
    public fun accountGrouping(accountGrouping: AccountGroupingProperty.Builder.() -> Unit)

    public fun computationPreference(computationPreference: IResolvable)

    public fun computationPreference(computationPreference: ComputationPreferenceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71ad21af2f035a47eb191d558da20b163e51414aed1d111c4a8aa68982c6b191")
    public
        fun computationPreference(computationPreference: ComputationPreferenceProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)

    public fun primaryAccountId(primaryAccountId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.billingconductor.CfnBillingGroup.Builder
        = software.amazon.awscdk.services.billingconductor.CfnBillingGroup.Builder.create(scope, id)

    override fun accountGrouping(accountGrouping: IResolvable) {
      cdkBuilder.accountGrouping(accountGrouping.let(IResolvable::unwrap))
    }

    override fun accountGrouping(accountGrouping: AccountGroupingProperty) {
      cdkBuilder.accountGrouping(accountGrouping.let(AccountGroupingProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6561db1e7d55a9da29df832f6a8a7d91bb963600da3dcad22a13f5636bd3135b")
    override fun accountGrouping(accountGrouping: AccountGroupingProperty.Builder.() -> Unit): Unit
        = accountGrouping(AccountGroupingProperty(accountGrouping))

    override fun computationPreference(computationPreference: IResolvable) {
      cdkBuilder.computationPreference(computationPreference.let(IResolvable::unwrap))
    }

    override fun computationPreference(computationPreference: ComputationPreferenceProperty) {
      cdkBuilder.computationPreference(computationPreference.let(ComputationPreferenceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71ad21af2f035a47eb191d558da20b163e51414aed1d111c4a8aa68982c6b191")
    override
        fun computationPreference(computationPreference: ComputationPreferenceProperty.Builder.() -> Unit):
        Unit = computationPreference(ComputationPreferenceProperty(computationPreference))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun primaryAccountId(primaryAccountId: String) {
      cdkBuilder.primaryAccountId(primaryAccountId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnBillingGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

  public interface AccountGroupingProperty {
    public fun autoAssociate(): Any? = unwrap(this).getAutoAssociate()

    public fun linkedAccountIds(): List<String>

    public interface Builder {
      public fun autoAssociate(autoAssociate: Boolean)

      public fun autoAssociate(autoAssociate: IResolvable)

      public fun linkedAccountIds(linkedAccountIds: List<String>)

      public fun linkedAccountIds(vararg linkedAccountIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty.builder()

      override fun autoAssociate(autoAssociate: Boolean) {
        cdkBuilder.autoAssociate(autoAssociate)
      }

      override fun autoAssociate(autoAssociate: IResolvable) {
        cdkBuilder.autoAssociate(autoAssociate.let(IResolvable::unwrap))
      }

      override fun linkedAccountIds(linkedAccountIds: List<String>) {
        cdkBuilder.linkedAccountIds(linkedAccountIds)
      }

      override fun linkedAccountIds(vararg linkedAccountIds: String): Unit =
          linkedAccountIds(linkedAccountIds.toList())

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty,
    ) : AccountGroupingProperty {
      override fun autoAssociate(): Any? = unwrap(this).getAutoAssociate()

      override fun linkedAccountIds(): List<String> = unwrap(this).getLinkedAccountIds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccountGroupingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty):
          AccountGroupingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountGroupingProperty):
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.AccountGroupingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComputationPreferenceProperty {
    public fun pricingPlanArn(): String

    public interface Builder {
      public fun pricingPlanArn(pricingPlanArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty.Builder
          =
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty.builder()

      override fun pricingPlanArn(pricingPlanArn: String) {
        cdkBuilder.pricingPlanArn(pricingPlanArn)
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty,
    ) : ComputationPreferenceProperty {
      override fun pricingPlanArn(): String = unwrap(this).getPricingPlanArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComputationPreferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty):
          ComputationPreferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputationPreferenceProperty):
          software.amazon.awscdk.services.billingconductor.CfnBillingGroup.ComputationPreferenceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
