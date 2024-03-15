@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnOrganizationConfigRuleProps {
  public fun excludedAccounts(): List<String> = unwrap(this).getExcludedAccounts() ?: emptyList()

  public fun organizationConfigRuleName(): String

  public fun organizationCustomPolicyRuleMetadata(): Any? =
      unwrap(this).getOrganizationCustomPolicyRuleMetadata()

  public fun organizationCustomRuleMetadata(): Any? =
      unwrap(this).getOrganizationCustomRuleMetadata()

  public fun organizationManagedRuleMetadata(): Any? =
      unwrap(this).getOrganizationManagedRuleMetadata()

  @CdkDslMarker
  public interface Builder {
    public fun excludedAccounts(excludedAccounts: List<String>)

    public fun excludedAccounts(vararg excludedAccounts: String)

    public fun organizationConfigRuleName(organizationConfigRuleName: String)

    public
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: IResolvable)

    public
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1a0e988943eae2bfc904bda66f978abd35df8df62b3af327f461b73b3c381fe")
    public
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.Builder.() -> Unit)

    public fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable)

    public
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("850fcefb60f23d579ef73857665738fc525e01a22608109cc4fac7150b48699b")
    public
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.Builder.() -> Unit)

    public fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable)

    public
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4b35ddfc779a5499619c12578df9a2fb270f1dbc77cb8685d59278d6e3c8697")
    public
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps.Builder =
        software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps.builder()

    override fun excludedAccounts(excludedAccounts: List<String>) {
      cdkBuilder.excludedAccounts(excludedAccounts)
    }

    override fun excludedAccounts(vararg excludedAccounts: String): Unit =
        excludedAccounts(excludedAccounts.toList())

    override fun organizationConfigRuleName(organizationConfigRuleName: String) {
      cdkBuilder.organizationConfigRuleName(organizationConfigRuleName)
    }

    override
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: IResolvable) {
      cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata.let(IResolvable::unwrap))
    }

    override
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty) {
      cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata.let(CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1a0e988943eae2bfc904bda66f978abd35df8df62b3af327f461b73b3c381fe")
    override
        fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.Builder.() -> Unit):
        Unit =
        organizationCustomPolicyRuleMetadata(CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty(organizationCustomPolicyRuleMetadata))

    override fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable) {
      cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata.let(IResolvable::unwrap))
    }

    override
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty) {
      cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata.let(CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("850fcefb60f23d579ef73857665738fc525e01a22608109cc4fac7150b48699b")
    override
        fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.Builder.() -> Unit):
        Unit =
        organizationCustomRuleMetadata(CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty(organizationCustomRuleMetadata))

    override fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable) {
      cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata.let(IResolvable::unwrap))
    }

    override
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty) {
      cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata.let(CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4b35ddfc779a5499619c12578df9a2fb270f1dbc77cb8685d59278d6e3c8697")
    override
        fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.Builder.() -> Unit):
        Unit =
        organizationManagedRuleMetadata(CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty(organizationManagedRuleMetadata))

    public fun build(): software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps,
  ) : CdkObject(cdkObject), CfnOrganizationConfigRuleProps {
    override fun excludedAccounts(): List<String> = unwrap(this).getExcludedAccounts() ?:
        emptyList()

    override fun organizationConfigRuleName(): String = unwrap(this).getOrganizationConfigRuleName()

    override fun organizationCustomPolicyRuleMetadata(): Any? =
        unwrap(this).getOrganizationCustomPolicyRuleMetadata()

    override fun organizationCustomRuleMetadata(): Any? =
        unwrap(this).getOrganizationCustomRuleMetadata()

    override fun organizationManagedRuleMetadata(): Any? =
        unwrap(this).getOrganizationManagedRuleMetadata()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOrganizationConfigRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps):
        CfnOrganizationConfigRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationConfigRuleProps):
        software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps
  }
}
