@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMembershipProps {
  public fun collaborationIdentifier(): String

  public fun defaultResultConfiguration(): Any? = unwrap(this).getDefaultResultConfiguration()

  public fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()

  public fun queryLogStatus(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun collaborationIdentifier(collaborationIdentifier: String)

    public fun defaultResultConfiguration(defaultResultConfiguration: IResolvable)

    public
        fun defaultResultConfiguration(defaultResultConfiguration: CfnMembership.MembershipProtectedQueryResultConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("012db4d184f0a697c1ea154824cad0a173b6cb0e21adb37afcb6d7d25a436166")
    public
        fun defaultResultConfiguration(defaultResultConfiguration: CfnMembership.MembershipProtectedQueryResultConfigurationProperty.Builder.() -> Unit)

    public fun paymentConfiguration(paymentConfiguration: IResolvable)

    public
        fun paymentConfiguration(paymentConfiguration: CfnMembership.MembershipPaymentConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb7529328879513aabfb11b672a54ed19c59afcb6a9b90a17fed8bc2502a15e7")
    public
        fun paymentConfiguration(paymentConfiguration: CfnMembership.MembershipPaymentConfigurationProperty.Builder.() -> Unit)

    public fun queryLogStatus(queryLogStatus: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnMembershipProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnMembershipProps.builder()

    override fun collaborationIdentifier(collaborationIdentifier: String) {
      cdkBuilder.collaborationIdentifier(collaborationIdentifier)
    }

    override fun defaultResultConfiguration(defaultResultConfiguration: IResolvable) {
      cdkBuilder.defaultResultConfiguration(defaultResultConfiguration.let(IResolvable::unwrap))
    }

    override
        fun defaultResultConfiguration(defaultResultConfiguration: CfnMembership.MembershipProtectedQueryResultConfigurationProperty) {
      cdkBuilder.defaultResultConfiguration(defaultResultConfiguration.let(CfnMembership.MembershipProtectedQueryResultConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("012db4d184f0a697c1ea154824cad0a173b6cb0e21adb37afcb6d7d25a436166")
    override
        fun defaultResultConfiguration(defaultResultConfiguration: CfnMembership.MembershipProtectedQueryResultConfigurationProperty.Builder.() -> Unit):
        Unit =
        defaultResultConfiguration(CfnMembership.MembershipProtectedQueryResultConfigurationProperty(defaultResultConfiguration))

    override fun paymentConfiguration(paymentConfiguration: IResolvable) {
      cdkBuilder.paymentConfiguration(paymentConfiguration.let(IResolvable::unwrap))
    }

    override
        fun paymentConfiguration(paymentConfiguration: CfnMembership.MembershipPaymentConfigurationProperty) {
      cdkBuilder.paymentConfiguration(paymentConfiguration.let(CfnMembership.MembershipPaymentConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb7529328879513aabfb11b672a54ed19c59afcb6a9b90a17fed8bc2502a15e7")
    override
        fun paymentConfiguration(paymentConfiguration: CfnMembership.MembershipPaymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        paymentConfiguration(CfnMembership.MembershipPaymentConfigurationProperty(paymentConfiguration))

    override fun queryLogStatus(queryLogStatus: String) {
      cdkBuilder.queryLogStatus(queryLogStatus)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnMembershipProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembershipProps,
  ) : CdkObject(cdkObject), CfnMembershipProps {
    override fun collaborationIdentifier(): String = unwrap(this).getCollaborationIdentifier()

    override fun defaultResultConfiguration(): Any? = unwrap(this).getDefaultResultConfiguration()

    override fun paymentConfiguration(): Any? = unwrap(this).getPaymentConfiguration()

    override fun queryLogStatus(): String = unwrap(this).getQueryLogStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMembershipProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnMembershipProps):
        CfnMembershipProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMembershipProps):
        software.amazon.awscdk.services.cleanrooms.CfnMembershipProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cleanrooms.CfnMembershipProps
  }
}
