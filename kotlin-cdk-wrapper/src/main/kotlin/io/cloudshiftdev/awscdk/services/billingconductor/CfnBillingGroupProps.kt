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

public interface CfnBillingGroupProps {
  public fun accountGrouping(): Any

  public fun computationPreference(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun primaryAccountId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accountGrouping(accountGrouping: IResolvable)

    public fun accountGrouping(accountGrouping: CfnBillingGroup.AccountGroupingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29ffc74b9b67e19cba2e6a09f1961d11be0ee8441bf899982b6a9faf7657f088")
    public
        fun accountGrouping(accountGrouping: CfnBillingGroup.AccountGroupingProperty.Builder.() -> Unit)

    public fun computationPreference(computationPreference: IResolvable)

    public
        fun computationPreference(computationPreference: CfnBillingGroup.ComputationPreferenceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b87a57bc66f314cf440622b5c61261c5b97d7e040e81f4d5ee966089c982b282")
    public
        fun computationPreference(computationPreference: CfnBillingGroup.ComputationPreferenceProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)

    public fun primaryAccountId(primaryAccountId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps.Builder =
        software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps.builder()

    override fun accountGrouping(accountGrouping: IResolvable) {
      cdkBuilder.accountGrouping(accountGrouping.let(IResolvable::unwrap))
    }

    override fun accountGrouping(accountGrouping: CfnBillingGroup.AccountGroupingProperty) {
      cdkBuilder.accountGrouping(accountGrouping.let(CfnBillingGroup.AccountGroupingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29ffc74b9b67e19cba2e6a09f1961d11be0ee8441bf899982b6a9faf7657f088")
    override
        fun accountGrouping(accountGrouping: CfnBillingGroup.AccountGroupingProperty.Builder.() -> Unit):
        Unit = accountGrouping(CfnBillingGroup.AccountGroupingProperty(accountGrouping))

    override fun computationPreference(computationPreference: IResolvable) {
      cdkBuilder.computationPreference(computationPreference.let(IResolvable::unwrap))
    }

    override
        fun computationPreference(computationPreference: CfnBillingGroup.ComputationPreferenceProperty) {
      cdkBuilder.computationPreference(computationPreference.let(CfnBillingGroup.ComputationPreferenceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b87a57bc66f314cf440622b5c61261c5b97d7e040e81f4d5ee966089c982b282")
    override
        fun computationPreference(computationPreference: CfnBillingGroup.ComputationPreferenceProperty.Builder.() -> Unit):
        Unit =
        computationPreference(CfnBillingGroup.ComputationPreferenceProperty(computationPreference))

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

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps,
  ) : CdkObject(cdkObject), CfnBillingGroupProps {
    override fun accountGrouping(): Any = unwrap(this).getAccountGrouping()

    override fun computationPreference(): Any = unwrap(this).getComputationPreference()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun primaryAccountId(): String = unwrap(this).getPrimaryAccountId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBillingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps):
        CfnBillingGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBillingGroupProps):
        software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps
  }
}
