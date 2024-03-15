@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAccountAuditConfigurationProps {
  public fun accountId(): String

  public fun auditCheckConfigurations(): Any

  public fun auditNotificationTargetConfigurations(): Any? =
      unwrap(this).getAuditNotificationTargetConfigurations()

  public fun roleArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun accountId(accountId: String)

    public fun auditCheckConfigurations(auditCheckConfigurations: IResolvable)

    public
        fun auditCheckConfigurations(auditCheckConfigurations: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d3a8c65f85f9ed1073bebfb38a5847044483192fa35776864f8697c2fc4e9ed")
    public
        fun auditCheckConfigurations(auditCheckConfigurations: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.Builder.() -> Unit)

    public
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: IResolvable)

    public
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9f9a6517f7292df5052a5fa2bdc7b03b143f656ffd0362dcbdffb91a2501244")
    public
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps.Builder =
        software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps.builder()

    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    override fun auditCheckConfigurations(auditCheckConfigurations: IResolvable) {
      cdkBuilder.auditCheckConfigurations(auditCheckConfigurations.let(IResolvable::unwrap))
    }

    override
        fun auditCheckConfigurations(auditCheckConfigurations: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty) {
      cdkBuilder.auditCheckConfigurations(auditCheckConfigurations.let(CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d3a8c65f85f9ed1073bebfb38a5847044483192fa35776864f8697c2fc4e9ed")
    override
        fun auditCheckConfigurations(auditCheckConfigurations: CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty.Builder.() -> Unit):
        Unit =
        auditCheckConfigurations(CfnAccountAuditConfiguration.AuditCheckConfigurationsProperty(auditCheckConfigurations))

    override
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: IResolvable) {
      cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations.let(IResolvable::unwrap))
    }

    override
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty) {
      cdkBuilder.auditNotificationTargetConfigurations(auditNotificationTargetConfigurations.let(CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9f9a6517f7292df5052a5fa2bdc7b03b143f656ffd0362dcbdffb91a2501244")
    override
        fun auditNotificationTargetConfigurations(auditNotificationTargetConfigurations: CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty.Builder.() -> Unit):
        Unit =
        auditNotificationTargetConfigurations(CfnAccountAuditConfiguration.AuditNotificationTargetConfigurationsProperty(auditNotificationTargetConfigurations))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps,
  ) : CdkObject(cdkObject), CfnAccountAuditConfigurationProps {
    override fun accountId(): String = unwrap(this).getAccountId()

    override fun auditCheckConfigurations(): Any = unwrap(this).getAuditCheckConfigurations()

    override fun auditNotificationTargetConfigurations(): Any? =
        unwrap(this).getAuditNotificationTargetConfigurations()

    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccountAuditConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps):
        CfnAccountAuditConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccountAuditConfigurationProps):
        software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnAccountAuditConfigurationProps
  }
}
