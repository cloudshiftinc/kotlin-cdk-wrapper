@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnUserPoolRiskConfigurationAttachmentProps {
  public fun accountTakeoverRiskConfiguration(): Any? =
      unwrap(this).getAccountTakeoverRiskConfiguration()

  public fun clientId(): String

  public fun compromisedCredentialsRiskConfiguration(): Any? =
      unwrap(this).getCompromisedCredentialsRiskConfiguration()

  public fun riskExceptionConfiguration(): Any? = unwrap(this).getRiskExceptionConfiguration()

  public fun userPoolId(): String

  @CdkDslMarker
  public interface Builder {
    public fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable)

    public
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb271e35416f61b857614270b74ca98b3886d0741f2eff8f638aedbce2ef7ca0")
    public
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit)

    public fun clientId(clientId: String)

    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable)

    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("683ec85a0d5c3a7ccd5caf628278c5d85261b1299fa29aa29cf168b975643e5b")
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit)

    public fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable)

    public
        fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccd370c772a07343b844afc5a971eacca678c609610d5e9cc698a2638888c52e")
    public
        fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder.() -> Unit)

    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps.Builder
        =
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps.builder()

    override fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable) {
      cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.let(IResolvable::unwrap))
    }

    override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty) {
      cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.let(CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb271e35416f61b857614270b74ca98b3886d0741f2eff8f638aedbce2ef7ca0")
    override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        accountTakeoverRiskConfiguration(CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty(accountTakeoverRiskConfiguration))

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable) {
      cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.let(IResolvable::unwrap))
    }

    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty) {
      cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.let(CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("683ec85a0d5c3a7ccd5caf628278c5d85261b1299fa29aa29cf168b975643e5b")
    override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        compromisedCredentialsRiskConfiguration(CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty(compromisedCredentialsRiskConfiguration))

    override fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable) {
      cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty) {
      cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration.let(CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccd370c772a07343b844afc5a971eacca678c609610d5e9cc698a2638888c52e")
    override
        fun riskExceptionConfiguration(riskExceptionConfiguration: CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        riskExceptionConfiguration(CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty(riskExceptionConfiguration))

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps,
  ) : CdkObject(cdkObject), CfnUserPoolRiskConfigurationAttachmentProps {
    override fun accountTakeoverRiskConfiguration(): Any? =
        unwrap(this).getAccountTakeoverRiskConfiguration()

    override fun clientId(): String = unwrap(this).getClientId()

    override fun compromisedCredentialsRiskConfiguration(): Any? =
        unwrap(this).getCompromisedCredentialsRiskConfiguration()

    override fun riskExceptionConfiguration(): Any? = unwrap(this).getRiskExceptionConfiguration()

    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnUserPoolRiskConfigurationAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps):
        CfnUserPoolRiskConfigurationAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolRiskConfigurationAttachmentProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps
  }
}
